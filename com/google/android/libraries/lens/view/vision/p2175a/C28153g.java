package com.google.android.libraries.lens.view.vision.p2175a;

import com.google.android.libraries.lens.C24066b;
import com.google.android.libraries.lens.view.vision.C28177s;
import com.google.android.libraries.lens.view.vision.C28178t;
import com.google.common.base.C58838bb;
import com.google.common.base.C58880cq;
import com.google.common.util.concurrent.SettableFuture;
import com.google.lens.p4707j.C62419aw;
import com.google.lens.p4707j.C62429bf;
import com.google.lens.p4707j.C62552fu;
import com.google.lens.p4707j.C62557fz;
import com.google.lens.p4707j.C62560gb;
import com.google.lens.p4707j.C62561gc;
import com.google.lens.p4707j.C62563ge;
import com.google.lens.p4707j.C62565gg;
import com.google.p4488cj.p4489a.p4490a.p4491a.C58122b;

/* renamed from: com.google.android.libraries.lens.view.vision.a.g */
/* compiled from: PG */
public final /* synthetic */ class C28153g implements C24066b {

    /* renamed from: a */
    public final /* synthetic */ C28156j f76587a;

    public /* synthetic */ C28153g(C28156j jVar) {
        this.f76587a = jVar;
    }

    /* renamed from: a */
    public final void mo29457a(C62419aw awVar) {
        C62563ge geVar;
        C62552fu fuVar;
        C28156j jVar = this.f76587a;
        C28156j.m52467A(awVar);
        if (awVar.f168493a == 3) {
            geVar = (C62563ge) awVar.f168494b;
        } else {
            geVar = C62563ge.f168910d;
        }
        if (geVar.f168912a == 3) {
            fuVar = (C62552fu) geVar.f168913b;
        } else {
            fuVar = C62552fu.f168881c;
        }
        int a = C62429bf.m94773a(awVar.f168496d);
        C58838bb.m90887v(a == 0 || a == 1, "%s-processRA: wrong subsystem", "IST");
        int a2 = C62565gg.m94797a(geVar.f168914c);
        C58838bb.m90887v(a2 != 0 && a2 == 2, "%s-processRA: non-match analysis type", "IST");
        C58838bb.m90889x(fuVar.f168884b.size() == 1, "%s-processRA: unexpected object count: %s", "IST", fuVar.f168884b.size());
        SettableFuture settableFuture = (SettableFuture) jVar.f76600o.remove(Long.valueOf(fuVar.f168883a));
        long j = fuVar.f168883a;
        if (settableFuture != null) {
            C62561gc gcVar = (C62561gc) fuVar.f168884b.get(0);
            int a3 = C62560gb.m94796a(gcVar.f168906d);
            if (a3 != 0 && a3 == 2) {
                settableFuture.mo57356n((Object) null);
                return;
            }
            C58122b bVar = gcVar.f168905c;
            if (bVar == null) {
                bVar = C58122b.f155367p;
            }
            C28178t a4 = C28177s.m52622a(bVar, jVar.f76601p.mo33627d(), jVar.f76601p.mo33626c());
            int a5 = C62557fz.m94795a(gcVar.f168904b);
            if (a5 != 0 && a5 == 4) {
                jVar.mo33597C(gcVar, a4);
            }
            settableFuture.mo57356n(a4);
            return;
        }
        throw new NullPointerException(C58880cq.m90965a("%s-processRA: unexpected id %s", "IST", Long.valueOf(j)));
    }
}
