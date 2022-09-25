package com.google.android.libraries.p1963i;

/* renamed from: com.google.android.libraries.i.bg */
/* compiled from: PG */
public final /* synthetic */ class C23866bg implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C23870bk f65310a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f65311b;

    public /* synthetic */ C23866bg(C23870bk bkVar, Runnable runnable) {
        this.f65310a = bkVar;
        this.f65311b = runnable;
    }

    public final void run() {
        C23870bk bkVar = this.f65310a;
        bkVar.f65325b.removeCallbacks(this.f65311b);
    }
}
