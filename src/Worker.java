
public class Worker {
	private OnTaskDoneListener callback;
	private OnTaskErrorListener errorCallback;

	public Worker(OnTaskDoneListener callback) {
		super();
		this.callback = callback;
	}

	public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
		super();
		this.callback = callback;
		this.errorCallback = errorCallback;
	}

	public void start() {
		for (int i = 1; i <= 100; i++) {
			if (i == 33)
				errorCallback.onError("Задание " + i + " не выполнено");
			else
				callback.onDone("Задание " + i + " выполнено");

		}
	}

}
