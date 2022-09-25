package com.google.android.libraries.gsa.p1833c.p1834a.p1835a;

import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.libraries.gsa.c.a.a.d */
/* compiled from: PG */
final class C22179d implements C22869e {

    /* renamed from: a */
    final /* synthetic */ C22181f f61227a;

    public C22179d(C22181f fVar) {
        this.f61227a = fVar;
    }

    public final void run() {
        synchronized (this.f61227a) {
            C22181f fVar = this.f61227a;
            long c = fVar.f61233f - fVar.f61229b.mo26871c();
            if (c > 0) {
                this.f61227a.f61230c.mo28213m("UnrequestCellRadio-2", c, this);
            } else {
                this.f61227a.mo27425b();
            }
        }
    }
}
