package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p677b.p678a;

import com.google.android.gms.car.C143111aw;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12986d;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4543n.p4546c.C59417y;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.b.a.q */
/* compiled from: PG */
public final /* synthetic */ class C11547q implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C11551u f37441a;

    /* renamed from: b */
    public final /* synthetic */ C12986d f37442b;

    /* renamed from: c */
    public final /* synthetic */ C58833ax f37443c;

    /* renamed from: d */
    public final /* synthetic */ int f37444d;

    public /* synthetic */ C11547q(C11551u uVar, C12986d dVar, int i, C58833ax axVar) {
        this.f37441a = uVar;
        this.f37442b = dVar;
        this.f37444d = i;
        this.f37443c = axVar;
    }

    public final C60870cx apply(Object obj) {
        C11551u uVar = this.f37441a;
        C12986d dVar = this.f37442b;
        int i = this.f37444d;
        C58833ax axVar = this.f37443c;
        Void voidR = (Void) obj;
        try {
            uVar.mo20051j(dVar, i, axVar);
            return C60866ct.f164955a;
        } catch (C143111aw e) {
            ((C59052c) ((C59052c) ((C59052c) C11551u.f37447a.mo56225c()).mo56382g(e)).mo56372aa(43367)).mo56386p("Did not connect to car");
            return C59417y.m92320f(new C11535e(uVar, dVar, i, axVar), 5, uVar.f37452f);
        }
    }
}
