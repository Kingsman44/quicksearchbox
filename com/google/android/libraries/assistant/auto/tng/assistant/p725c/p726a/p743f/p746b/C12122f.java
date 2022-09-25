package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p743f.p746b;

import androidx.p104d.p105a.C2164c;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.a.f.b.f */
/* compiled from: PG */
public final /* synthetic */ class C12122f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C12127k f38750a;

    /* renamed from: b */
    public final /* synthetic */ Throwable f38751b;

    public /* synthetic */ C12122f(C12127k kVar, Throwable th) {
        this.f38750a = kVar;
        this.f38751b = th;
    }

    public final void run() {
        C12127k kVar = this.f38750a;
        Throwable th = this.f38751b;
        if (!kVar.f38768f) {
            kVar.f38768f = true;
            kVar.f38765c.mo20428c(th);
            kVar.f38764b.mo20340gR(th);
            C2164c cVar = kVar.f38767e;
            if (cVar != null) {
                cVar.mo5439d(th);
            }
        }
    }
}
