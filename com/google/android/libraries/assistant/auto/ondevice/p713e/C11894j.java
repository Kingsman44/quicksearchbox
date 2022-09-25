package com.google.android.libraries.assistant.auto.ondevice.p713e;

import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.libraries.assistant.auto.ondevice.e.j */
/* compiled from: PG */
public final /* synthetic */ class C11894j implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C11896l f38258a;

    /* renamed from: b */
    public final /* synthetic */ long f38259b;

    public /* synthetic */ C11894j(C11896l lVar, long j) {
        this.f38258a = lVar;
        this.f38259b = j;
    }

    public final void run() {
        C11896l lVar = this.f38258a;
        C11903s b = lVar.mo20279b(this.f38259b);
        synchronized (lVar.f38262a) {
            lVar.f38264c.remove(b);
        }
        if (!b.f38280b) {
            lVar.f38263b.mo20296a(b);
        }
    }
}
