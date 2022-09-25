package com.android.launcher3;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import java.util.LinkedList;

/* compiled from: PG */
public final class DeferredHandler {
    private final Impl mHandler = new Impl();
    private final MessageQueue mMessageQueue = Looper.myQueue();
    final LinkedList mQueue = new LinkedList();

    /* compiled from: PG */
    final class IdleRunnable implements Runnable {
        final Runnable mRunnable;

        public IdleRunnable(Runnable runnable) {
            this.mRunnable = runnable;
        }

        public final void run() {
            this.mRunnable.run();
        }
    }

    /* compiled from: PG */
    final class Impl extends Handler implements MessageQueue.IdleHandler {
        public Impl() {
        }

        public final void handleMessage(Message message) {
            synchronized (DeferredHandler.this.mQueue) {
                if (DeferredHandler.this.mQueue.size() != 0) {
                    Runnable runnable = (Runnable) DeferredHandler.this.mQueue.removeFirst();
                    runnable.run();
                    synchronized (DeferredHandler.this.mQueue) {
                        DeferredHandler.this.scheduleNextLocked();
                    }
                }
            }
        }

        public final boolean queueIdle() {
            handleMessage((Message) null);
            return false;
        }
    }

    public final void post(Runnable runnable) {
        synchronized (this.mQueue) {
            this.mQueue.add(runnable);
            if (this.mQueue.size() == 1) {
                scheduleNextLocked();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void scheduleNextLocked() {
        if (this.mQueue.size() <= 0) {
            return;
        }
        if (((Runnable) this.mQueue.getFirst()) instanceof IdleRunnable) {
            this.mMessageQueue.addIdleHandler(this.mHandler);
        } else {
            this.mHandler.sendEmptyMessage(1);
        }
    }
}
