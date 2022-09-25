package com.google.android.libraries.lens.view.vision.p2175a;

import com.google.android.libraries.lens.C24066b;
import com.google.android.libraries.lens.view.p2173u.C28097c;
import com.google.android.libraries.lens.view.vision.C28169k;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.lens.p4698d.C62167f;
import com.google.lens.p4707j.C62419aw;
import com.google.lens.p4707j.C62544fm;
import com.google.lens.p4707j.C62563ge;

/* renamed from: com.google.android.libraries.lens.view.vision.a.h */
/* compiled from: PG */
public final /* synthetic */ class C28154h implements C24066b {

    /* renamed from: a */
    public final /* synthetic */ C28156j f76588a;

    public /* synthetic */ C28154h(C28156j jVar) {
        this.f76588a = jVar;
    }

    /* renamed from: a */
    public final void mo29457a(C62419aw awVar) {
        C62563ge geVar;
        C62544fm fmVar;
        C28097c b;
        C28156j jVar = this.f76588a;
        C28156j.m52467A(awVar);
        if (awVar.f168493a == 3) {
            geVar = (C62563ge) awVar.f168494b;
        } else {
            geVar = C62563ge.f168910d;
        }
        if (geVar.f168912a == 5) {
            fmVar = (C62544fm) geVar.f168913b;
        } else {
            fmVar = C62544fm.f168854b;
        }
        synchronized (jVar.f76596k) {
            C62167f fVar = fmVar.f168856a;
            if (fVar == null) {
                fVar = C62167f.f167824h;
            }
            b = jVar.mo33581b(fVar.f167827b);
        }
        synchronized (jVar.f76595j) {
            b.f76497o = C58833ax.m90834k(fmVar);
            jVar.mo33596B(b);
        }
        if (jVar.f76573a.get() != null) {
            ((C28169k) jVar.f76573a.get()).mo32199a(b);
        } else {
            ((C58970a) ((C58970a) C28156j.f76591f.mo56226d()).mo56372aa(50291)).mo56386p("Frame selection listener is not set, but native signals are received.");
        }
    }
}
