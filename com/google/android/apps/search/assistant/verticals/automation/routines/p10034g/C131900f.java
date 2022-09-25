package com.google.android.apps.search.assistant.verticals.automation.routines.p10034g;

import com.google.assistant.p3879aw.p3881b.C50601d;
import com.google.assistant.p3879aw.p3881b.C50602e;
import com.google.assistant.p3879aw.p3881b.C50603f;
import com.google.assistant.p3879aw.p3881b.C50605h;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.assistant.verticals.automation.routines.g.f */
/* compiled from: PG */
public final class C131900f {

    /* renamed from: a */
    public static final C59071e f360171a = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.automation.routines.g.f");

    /* renamed from: a */
    public static void m214364a(C50605h hVar) {
        C50602e eVar;
        C50603f fVar = hVar.f131670b;
        if (fVar == null) {
            fVar = C50603f.f131661e;
        }
        if (fVar.f131664b == 3) {
            eVar = (C50602e) fVar.f131665c;
        } else {
            eVar = C50602e.f131657b;
        }
        int a = C50601d.m85859a(eVar.f131659a);
        if (a == 0 || a == 1) {
            throw new IllegalArgumentException("Invalid location change type");
        }
    }
}
