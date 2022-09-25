package com.google.android.apps.search.assistant.platform.p9080f.p9123l.p9124a;

import com.google.android.libraries.search.assistant.p2570h.p2571a.p2576c.C33453g;
import com.google.android.libraries.search.assistant.p2570h.p2571a.p2576c.C33454h;
import com.google.android.libraries.search.assistant.p2570h.p2571a.p2576c.C33456j;
import com.google.android.libraries.search.assistant.p2570h.p2571a.p2576c.C33457k;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52236kg;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.search.assistant.platform.f.l.a.n */
/* compiled from: PG */
public final /* synthetic */ class C120798n implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C120798n f335939a = new C120798n();

    private /* synthetic */ C120798n() {
    }

    public final Object apply(Object obj) {
        C52070ec ecVar = (C52070ec) obj;
        C52236kg kgVar = ecVar.f136654b;
        if (kgVar == null) {
            kgVar = C52236kg.f137089d;
        }
        C52235kf a = C52235kf.m86549a(kgVar.f137092b);
        if (a == null) {
            a = C52235kf.OK;
        }
        if (a != C52235kf.OK) {
            C52236kg kgVar2 = ecVar.f136654b;
            if (kgVar2 == null) {
                kgVar2 = C52236kg.f137089d;
            }
            C52235kf a2 = C52235kf.m86549a(kgVar2.f137092b);
            if (a2 == null) {
                a2 = C52235kf.OK;
            }
            if (a2 != C52235kf.IGNORE) {
                C33456j jVar = (C33456j) C33457k.f89561b.createBuilder();
                C33453g gVar = (C33453g) C33454h.f89556d.createBuilder();
                gVar.copyOnWrite();
                C33454h hVar = (C33454h) gVar.instance;
                hVar.f89558a |= 1;
                hVar.f89559b = "apa.RETURN_REMOTE";
                gVar.copyOnWrite();
                C33454h hVar2 = (C33454h) gVar.instance;
                ecVar.getClass();
                hVar2.f89560c = ecVar;
                hVar2.f89558a |= 2;
                jVar.mo38868a((C33454h) gVar.build());
                return (C33457k) jVar.build();
            }
        }
        return C33457k.f89561b;
    }
}
