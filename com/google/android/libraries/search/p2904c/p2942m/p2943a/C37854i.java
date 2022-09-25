package com.google.android.libraries.search.p2904c.p2942m.p2943a;

import com.google.android.libraries.search.p2904c.C37402bg;
import com.google.android.libraries.search.p2904c.C37403bh;
import com.google.android.libraries.search.p2904c.C37410bo;
import com.google.android.libraries.search.p2904c.C37459ch;
import com.google.android.libraries.search.p2904c.C37460ci;
import com.google.android.libraries.search.p2904c.C37476cy;
import com.google.android.libraries.search.p2904c.C37512ds;
import com.google.android.libraries.search.p2904c.C37519dz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.search.c.m.a.i */
/* compiled from: PG */
final class C37854i implements C37403bh {
    /* renamed from: a */
    public final C37402bg mo40933a(C37410bo boVar) {
        return new C37830ac(C37519dz.FAILED_TO_OPEN_AUDIO_SOURCE_DUE_TO_FAILED_ROUTING, C37512ds.UNKNOWN_CLOSING_FAILURE);
    }

    /* renamed from: b */
    public final C60870cx mo40934b() {
        C37459ch chVar = (C37459ch) C37460ci.f99438c.createBuilder();
        C37476cy cyVar = C37476cy.DISCONNECT_REASON_MISSING_AUDIO_ROUTE_IMPLEMENTATION;
        chVar.copyOnWrite();
        C37460ci ciVar = (C37460ci) chVar.instance;
        ciVar.f99441b = cyVar.f99492t;
        ciVar.f99440a |= 1;
        return C60856cj.m92900i((C37460ci) chVar.build());
    }
}
