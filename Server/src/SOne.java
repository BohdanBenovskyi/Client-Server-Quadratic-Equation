import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

class SOne extends Thread {
	private Socket socket;
	private BufferedReader in;
	private PrintWriter out;

	public SOne(Socket s) throws IOException {
		socket = s;
		in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true);
		start();
	}

	public void run() {
		try {
			while (true) {
				String str = in.readLine();

				if (str.equals("Slow")) {
					Thread.currentThread().setPriority(MIN_PRIORITY);
					System.out.println("Set priority of thread " + Thread.currentThread().getId() + " to MIN_PRIORITY");
				}
				if (str.equals("Normal")) {
					Thread.currentThread().setPriority(NORM_PRIORITY);
					System.out.println("Set priority of thread " + Thread.currentThread().getId() + " to NORM_PRIORITY");
				}
				if (str.equals("Fast")) {
					Thread.currentThread().setPriority(MAX_PRIORITY);
					System.out.println("Set priority of thread " + Thread.currentThread().getId() + " to MAX_PRIORITY");
				}

				if (str.equals("Compute")) {
					double a = Double.valueOf(in.readLine());
					double b = Double.valueOf(in.readLine());
					double c = Double.valueOf(in.readLine());

					System.out.println("A: " + a);
					System.out.println("B: " + b);
					System.out.println("C: " + c);

					double d = (Math.pow(b, 2)) - (4 * a * c);
					System.out.println("D: " + d);

					if (d > 0) {
						double x1 = ((-b) - Math.sqrt(d)) / (2 * a);
						double x2 = ((-b) + Math.sqrt(d)) / (2 * a);
						
						System.out.println("X1: " + x1);
						System.out.println("X2: " + x2);

						out.println("Result");
						out.println(x1 + " " + x2);
					}

					if (d == 0) {
						double x1 = (-b) / (2 * a);
						
						System.out.println("X1: " + x1);
						System.out.println("X2: " + x1);
						
						out.println("Result");
						out.println(x1 + " " + x1);
					}

					if (d < 0) {
						out.println("Result");
						out.println("No result!");
					}

				}

				if (str.equals("END"))
					break;
			}
			System.out.println("closing...");
		} catch (IOException e) {
			System.err.println("IO Exception");
		} finally {
			try {
				socket.close();
			} catch (IOException e) {
				System.err.println("Socket not closed");
			}
		}
	}
}