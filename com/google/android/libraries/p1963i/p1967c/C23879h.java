package com.google.android.libraries.p1963i.p1967c;

/* renamed from: com.google.android.libraries.i.c.h */
/* compiled from: PG */
public final /* synthetic */ class C23879h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C23880i f65345a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f65346b;

    public /* synthetic */ C23879h(C23880i iVar, Runnable runnable) {
        this.f65345a = iVar;
        this.f65346b = runnable;
    }

    public final void run() {
        C23880i iVar = this.f65345a;
        try {
            this.f65346b.run();
            synchronized (iVar) {
                iVar.f65347a.remove(Thread.currentThread());
            }
        } catch (Throwable th) {
            synchronized (iVar) {
                iVar.f65347a.remove(Thread.currentThread());
                throw th;
            }
        }
    }
}
