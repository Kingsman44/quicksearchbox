package com.google.android.libraries.search.assistant.p2511d.p2512a;

import androidx.p104d.p105a.C2164c;

/* renamed from: com.google.android.libraries.search.assistant.d.a.j */
/* compiled from: PG */
public final /* synthetic */ class C32517j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C32519l f87109a;

    /* renamed from: b */
    public final /* synthetic */ Throwable f87110b;

    public /* synthetic */ C32517j(C32519l lVar, Throwable th) {
        this.f87109a = lVar;
        this.f87110b = th;
    }

    public final void run() {
        C32519l lVar = this.f87109a;
        Throwable th = this.f87110b;
        if (lVar.f87114d == null) {
            lVar.f87114d = th;
            for (C2164c d : lVar.f87115e.values()) {
                d.mo5439d(lVar.f87114d);
            }
            lVar.f87115e.clear();
        }
    }
}
