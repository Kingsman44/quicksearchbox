package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p743f.p746b;

import androidx.p104d.p105a.C2164c;
import com.google.p4449cd.p4456g.C57974a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.a.f.b.g */
/* compiled from: PG */
public final /* synthetic */ class C12123g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C12126j f38752a;

    /* renamed from: b */
    public final /* synthetic */ C57974a f38753b;

    /* renamed from: c */
    public final /* synthetic */ Throwable f38754c;

    public /* synthetic */ C12123g(C12126j jVar, C57974a aVar, Throwable th) {
        this.f38752a = jVar;
        this.f38753b = aVar;
        this.f38754c = th;
    }

    public final void run() {
        C12126j jVar = this.f38752a;
        C57974a aVar = this.f38753b;
        Throwable th = this.f38754c;
        C12127k kVar = jVar.f38762c;
        if (!kVar.f38768f) {
            kVar.f38768f = true;
            aVar.mo20340gR(th);
            C2164c cVar = jVar.f38762c.f38767e;
            if (cVar != null) {
                cVar.mo5439d(th);
            }
        }
    }
}
