package com.google.android.apps.gsa.nga.engine.recognition.p6110c;

import com.google.android.apps.gsa.nga.engine.b.g.ac;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C83016y;
import com.google.android.libraries.gsa.p1876k.C22869e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.c.d */
/* compiled from: PG */
public final /* synthetic */ class C77585d implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C77595n f213745a;

    public /* synthetic */ C77585d(C77595n nVar) {
        this.f213745a = nVar;
    }

    public final void run() {
        C77595n nVar = this.f213745a;
        if (nVar.f213771a.mo71417a().mo71458b().a()) {
            Optional h = nVar.f213771a.mo71417a().mo71464h();
            if (h.isPresent() && nVar.f213775e.mo72734e((ac) h.get())) {
                nVar.mo72726h((ac) h.get(), C83016y.MANUAL_ENDPOINT);
                return;
            }
        } else if (nVar.f213771a.mo71417a().mo71469o()) {
            return;
        }
        nVar.f213772b.b();
    }
}
