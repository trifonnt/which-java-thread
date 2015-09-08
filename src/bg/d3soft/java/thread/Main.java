package bg.d3soft.java.thread;

public class Main {

	public static void main(String[] args) {
		new Thread(new IdleRunnable(), "Idle").start();
		new Thread(new BusyRunnable(), "Busy").start();

		System.out.println("Threads started.");
	}

/*

# Show Java process
$ top -n1 | grep -m1 java


# Extract PID
$ top -n1 | grep -m1 java | perl -pe 's/\e\[?.*?[\@-~] ?//g' | cut -f1 -d' '
21752


# Prints a list of all threads
$ top -n1 -H | grep -m1 java
$ top -n1 -H | grep -m1 java | perl -pe 's/\e\[?.*?[\@-~] ?//g' | cut -f1 -d' '
21775


# Show threads with jstack(available in JDK)
$ jstack 21752
"Busy" prio=10 tid=0x00007fafe4108800 nid=0x550f runnable [0x00007fafac18d000]
   java.lang.Thread.State: RUNNABLE
	at java.util.regex.Pattern.atom(Pattern.java:2192)
	at java.util.regex.Pattern.sequence(Pattern.java:2097)
	at java.util.regex.Pattern.expr(Pattern.java:1964)
	at java.util.regex.Pattern.compile(Pattern.java:1665)
	at java.util.regex.Pattern.<init>(Pattern.java:1337)
	at java.util.regex.Pattern.compile(Pattern.java:1022)
	at java.util.regex.Pattern.matches(Pattern.java:1128)
	at java.lang.String.matches(String.java:2063)
	at bg.d3soft.java.thread.BusyRunnable.run(BusyRunnable.java:9)
	at java.lang.Thread.run(Thread.java:745)

"Idle" prio=10 tid=0x00007fafe4106000 nid=0x550e waiting on condition [0x00007fafac28e000]
   java.lang.Thread.State: TIMED_WAITING (sleeping)
	at java.lang.Thread.sleep(Native Method)
	at java.lang.Thread.sleep(Thread.java:340)
	at java.util.concurrent.TimeUnit.sleep(TimeUnit.java:360)
	at bg.d3soft.java.thread.IdleRunnable.run(IdleRunnable.java:11)
	at java.lang.Thread.run(Thread.java:745)


 */
}