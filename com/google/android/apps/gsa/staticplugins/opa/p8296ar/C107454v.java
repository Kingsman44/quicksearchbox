package com.google.android.apps.gsa.staticplugins.opa.p8296ar;

import com.google.android.apps.gsa.opa.p6443g.p6445b.C83682a;
import com.google.android.apps.gsa.opa.p6443g.p6445b.C83683b;
import com.google.android.apps.gsa.opa.p6443g.p6446c.C83693b;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.staticplugins.opa.p8296ar.p8299c.C107421a;
import com.google.android.apps.gsa.staticplugins.opa.p8296ar.p8299c.C107431k;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3803ag.p3804a.C48851br;
import com.google.assistant.p3803ag.p3804a.C48855bv;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ar.v */
/* compiled from: PG */
public final /* synthetic */ class C107454v implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C107458z f299013a;

    /* renamed from: b */
    public final /* synthetic */ C48851br f299014b;

    public /* synthetic */ C107454v(C107458z zVar, C48851br brVar) {
        this.f299013a = zVar;
        this.f299014b = brVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C107458z zVar = this.f299013a;
        C48851br brVar = this.f299014b;
        C58833ax axVar = (C58833ax) obj;
        C107421a aVar = zVar.f299026i;
        if (!C107431k.m178347e(axVar)) {
            if (!axVar.mo56113h()) {
                C48855bv bvVar = brVar.f126417d;
                if (bvVar == null) {
                    bvVar = C48855bv.f126424b;
                }
                String c = C107421a.m178338c(bvVar);
                aVar.f298955a.mo41690e(c, C107421a.m178336a(c, brVar), false);
            } else {
                C48851br brVar2 = ((C83683b) axVar.mo56107c()).f228110d;
                if (brVar2 == null) {
                    brVar2 = C48851br.f126412f;
                }
                C48855bv bvVar2 = brVar2.f126417d;
                if (bvVar2 == null) {
                    bvVar2 = C48855bv.f126424b;
                }
                String c2 = C107421a.m178338c(bvVar2);
                aVar.f298955a.mo41690e(c2, C107421a.m178336a(c2, brVar), C107431k.m178346d(axVar));
            }
        }
        if (!axVar.mo56113h()) {
            return C118826c.f331423b;
        }
        C83682a aVar2 = (C83682a) ((C83683b) axVar.mo56107c()).toBuilder();
        aVar2.copyOnWrite();
        C83683b bVar = (C83683b) aVar2.instance;
        bVar.f228108b = 3;
        bVar.f228107a |= 1;
        C83683b bVar2 = (C83683b) aVar2.build();
        C83693b bVar3 = zVar.f299023f;
        C48851br brVar3 = bVar2.f228110d;
        if (brVar3 == null) {
            brVar3 = C48851br.f126412f;
        }
        return bVar3.mo77019e(brVar3.toByteString(), bVar2);
    }
}
