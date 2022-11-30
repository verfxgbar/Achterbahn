package de.verfxgbar.utils;

public class Queue<ContentType> {
	private QueueNode head;

	private QueueNode tail;

	private class QueueNode {
		private ContentType content = null;

		private QueueNode nextNode = null;

		public QueueNode(ContentType pContent) {
			this.content = pContent;
			this.nextNode = null;
		}

		public void setNext(QueueNode pNext) {
			this.nextNode = pNext;
		}

		public QueueNode getNext() {
			return this.nextNode;
		}

		public ContentType getContent() {
			return this.content;
		}
	}

	public Queue() {
		this.head = null;
		this.tail = null;
	}

	public boolean isEmpty() {
		return (this.head == null);
	}

	public void enqueue(ContentType pContent) {
		if (pContent != null) {
			QueueNode newNode = new QueueNode(pContent);
			if (isEmpty()) {
				this.head = newNode;
				this.tail = newNode;
			} else {
				this.tail.setNext(newNode);
				this.tail = newNode;
			}
		}
	}

	public void dequeue() {
		if (!isEmpty()) {
			this.head = this.head.getNext();
			if (isEmpty()) {
				this.head = null;
				this.tail = null;
			}
		}
	}

	public ContentType front() {
		if (isEmpty())
			return null;
		return this.head.getContent();
	}

	// Removed private class Queue ???
}
