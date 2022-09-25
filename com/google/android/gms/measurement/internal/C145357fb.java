package com.google.android.gms.measurement.internal;

import android.os.Process;
import com.google.android.gms.common.internal.C143919bh;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.google.android.gms.measurement.internal.fb */
/* compiled from: PG */
final class C145357fb extends Thread {

    /* renamed from: a */
    final /* synthetic */ C145358fc f392906a;

    /* renamed from: b */
    private final Object f392907b;

    /* renamed from: c */
    private final BlockingQueue f392908c;

    /* renamed from: d */
    private boolean f392909d = false;

    public C145357fb(C145358fc fcVar, String str, BlockingQueue blockingQueue) {
        this.f392906a = fcVar;
        C143919bh.m233958a(blockingQueue);
        this.f392907b = new Object();
        this.f392908c = blockingQueue;
        setName(str);
    }

    /* renamed from: b */
    private final void m236174b() {
        synchronized (this.f392906a.f392913d) {
            if (!this.f392909d) {
                this.f392906a.f392914e.release();
                this.f392906a.f392913d.notifyAll();
                C145358fc fcVar = this.f392906a;
                if (this == fcVar.f392911b) {
                    fcVar.f392911b = null;
                } else if (this == fcVar.f392912c) {
                    fcVar.f392912c = null;
                } else {
                    fcVar.f393011w.mo120965ar().f392795c.mo120894a("Current scheduler thread is neither worker nor network");
                }
                this.f392909d = true;
            }
        }
    }

    /* renamed from: c */
    private final void m236175c(InterruptedException interruptedException) {
        this.f392906a.f393011w.mo120965ar().f392798f.mo120895b(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    /* renamed from: a */
    public final void mo120954a() {
        synchronized (this.f392907b) {
            this.f392907b.notifyAll();
        }
    }

    public final void run() {
        boolean z = false;
        while (!z) {
            try {
                this.f392906a.f392914e.acquire();
                z = true;
            } catch (InterruptedException e) {
                m236175c(e);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                C145356fa faVar = (C145356fa) this.f392908c.poll();
                if (faVar != null) {
                    Process.setThreadPriority(true != faVar.f392902a ? 10 : threadPriority);
                    faVar.run();
                } else {
                    synchronized (this.f392907b) {
                        if (this.f392908c.peek() == null) {
                            boolean z2 = this.f392906a.f392915f;
                            try {
                                this.f392907b.wait(30000);
                            } catch (InterruptedException e2) {
                                m236175c(e2);
                            }
                        }
                    }
                    synchronized (this.f392906a.f392913d) {
                        if (this.f392908c.peek() == null) {
                            m236174b();
                            m236174b();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            m236174b();
            throw th;
        }
    }
}
