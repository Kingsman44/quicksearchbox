package com.google.android.libraries.search.assistant.p2828y.p2854o.p2855a;

import com.google.android.libraries.search.assistant.p2828y.p2854o.p2855a.p2856a.C37026b;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58424en;
import com.google.common.p4522b.C58464g;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4526f.C59052c;
import com.google.p4117aw.p4118a.p4119a.C54624b;
import com.google.p4117aw.p4118a.p4119a.C54630h;
import com.google.p4117aw.p4118a.p4119a.C54639q;
import com.google.p4117aw.p4118a.p4119a.C54640r;
import p3186j$.util.Map;

/* renamed from: com.google.android.libraries.search.assistant.y.o.a.c */
/* compiled from: PG */
public final /* synthetic */ class C37032c implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C37032c f96468a = new C37032c();

    private /* synthetic */ C37032c() {
    }

    public final Object apply(Object obj) {
        C58490gz gzVar = new C58490gz(4);
        for (C54639q qVar : ((C54640r) obj).f143460a) {
            C58424en enVar = C37033d.f96470b;
            C54624b a = C54624b.m87507a(qVar.f143456b);
            if (a == null) {
                a = C54624b.UNSPECIFIED;
            }
            if (!enVar.f156090b.containsKey(a)) {
                ((C59052c) ((C59052c) C37033d.f96469a.mo56226d()).mo56372aa(52494)).mo56386p("Unexpected PkgListLabel in PkgTopNamedEntitiesResponse.");
            } else {
                C58464g gVar = C37033d.f96470b.f156090b;
                C54624b a2 = C54624b.m87507a(qVar.f143456b);
                if (a2 == null) {
                    a2 = C54624b.UNSPECIFIED;
                }
                C37026b bVar = (C37026b) Map.EL.getOrDefault(gVar, a2, C37026b.PKG_UNSPECIFIED);
                C54630h hVar = qVar.f143457c;
                if (hVar == null) {
                    hVar = C54630h.f143438b;
                }
                gzVar.mo55429h(bVar, hVar.f143440a);
            }
        }
        return gzVar.mo55427f(false);
    }
}
