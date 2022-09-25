package com.google.android.apps.gsa.staticplugins.opa.p8296ar.p8297a;

import com.google.android.apps.gsa.opa.p6443g.p6445b.C83683b;
import com.google.android.apps.gsa.opa.p6443g.p6445b.C83685d;
import com.google.android.apps.gsa.opa.p6443g.p6445b.C83688g;
import com.google.android.apps.gsa.opa.p6443g.p6445b.C83689h;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.staticplugins.opa.p8296ar.p8299c.C107431k;
import com.google.assistant.p3803ag.p3804a.C48838be;
import com.google.assistant.p3803ag.p3804a.C48840bg;
import com.google.assistant.p3803ag.p3804a.C48851br;
import com.google.assistant.p3803ag.p3804a.C48855bv;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ar.a.a */
/* compiled from: PG */
public final /* synthetic */ class C107387a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f298879a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f298880b;

    public /* synthetic */ C107387a(C60870cx cxVar, C60870cx cxVar2) {
        this.f298879a = cxVar;
        this.f298880b = cxVar2;
    }

    public final Object call() {
        C48855bv bvVar;
        C48840bg bgVar;
        C60870cx cxVar = this.f298879a;
        C60870cx cxVar2 = this.f298880b;
        ArrayList arrayList = new ArrayList();
        List<C83683b> list = (List) C90877ak.m148472f(cxVar);
        for (C83685d dVar : (List) C90877ak.m148472f(cxVar2)) {
            C83688g gVar = (C83688g) C83689h.f228122d.createBuilder();
            gVar.copyOnWrite();
            C83689h hVar = (C83689h) gVar.instance;
            dVar.getClass();
            hVar.f228125b = dVar;
            hVar.f228124a |= 1;
            int i = dVar.f228116b;
            if (i == 1) {
                bvVar = ((C48838be) dVar.f228117c).f126382a;
                if (bvVar == null) {
                    bvVar = C48855bv.f126424b;
                }
            } else {
                if (i == 4) {
                    bgVar = (C48840bg) dVar.f228117c;
                } else {
                    bgVar = C48840bg.f126386b;
                }
                bvVar = bgVar.f126389a;
                if (bvVar == null) {
                    bvVar = C48855bv.f126424b;
                }
            }
            for (C83683b bVar : list) {
                C48851br brVar = bVar.f228110d;
                if (brVar == null) {
                    brVar = C48851br.f126412f;
                }
                if (C107431k.m178345c(brVar, bvVar)) {
                    gVar.copyOnWrite();
                    C83689h hVar2 = (C83689h) gVar.instance;
                    bVar.getClass();
                    C62971cq cqVar = hVar2.f228126c;
                    if (!cqVar.mo58948c()) {
                        hVar2.f228126c = C62942bv.mutableCopy(cqVar);
                    }
                    hVar2.f228126c.add(bVar);
                }
            }
            arrayList.add((C83689h) gVar.build());
        }
        return arrayList;
    }
}
