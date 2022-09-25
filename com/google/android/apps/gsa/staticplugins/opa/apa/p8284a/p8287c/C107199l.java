package com.google.android.apps.gsa.staticplugins.opa.apa.p8284a.p8287c;

import com.google.android.apps.gsa.staticplugins.opa.apa.p8284a.p8285a.C107158b;
import com.google.android.apps.gsa.staticplugins.opa.apa.p8284a.p8285a.C107160d;
import com.google.assistant.p3897e.p3921j.C51715bm;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62950b;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.apa.a.c.l */
/* compiled from: PG */
public final /* synthetic */ class C107199l implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C107203p f298378a;

    public /* synthetic */ C107199l(C107203p pVar) {
        this.f298378a = pVar;
    }

    public final C60870cx apply(Object obj) {
        C107203p pVar = this.f298378a;
        C107160d dVar = (C107160d) obj;
        if ((dVar.f298286a & 1) != 0) {
            C107158b bVar = dVar.f298287b;
            if (bVar == null) {
                bVar = C107158b.f298279c;
            }
            Instant ofEpochMilli = Instant.ofEpochMilli(pVar.f298385e.mo26870b());
            C63042fg fgVar = bVar.f298281a;
            if (fgVar == null) {
                fgVar = C63042fg.f170152c;
            }
            if (ofEpochMilli.isBefore(C62950b.m95474e(fgVar).plus(C107203p.f298381a))) {
                C107158b bVar2 = dVar.f298287b;
                if (bVar2 == null) {
                    bVar2 = C107158b.f298279c;
                }
                C51715bm bmVar = bVar2.f298282b;
                if (bmVar == null) {
                    bmVar = C51715bm.f135662t;
                }
                return C60856cj.m92900i(C58833ax.m90834k(bmVar));
            }
        }
        return C60856cj.m92901j(pVar.f298386f.mo28202b("[OpaHandover] get device capabilities", new C107201n(pVar)));
    }
}
