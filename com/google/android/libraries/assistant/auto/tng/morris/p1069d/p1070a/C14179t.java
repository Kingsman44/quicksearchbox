package com.google.android.libraries.assistant.auto.tng.morris.p1069d.p1070a;

import com.google.android.libraries.search.assistant.p2786t.p2798c.C36527a;
import com.google.android.libraries.search.assistant.p2786t.p2798c.C36601d;
import com.google.android.libraries.search.assistant.p2786t.p2798c.C36603f;
import com.google.android.libraries.search.assistant.p2786t.p2798c.C36616s;
import com.google.android.libraries.search.assistant.p2786t.p2798c.C36617t;
import com.google.android.libraries.search.assistant.p2786t.p2798c.C36618u;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.d.a.t */
/* compiled from: PG */
public final /* synthetic */ class C14179t implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C14180u f42947a;

    /* renamed from: b */
    public final /* synthetic */ int f42948b;

    public /* synthetic */ C14179t(C14180u uVar, int i) {
        this.f42947a = uVar;
        this.f42948b = i;
    }

    public final C60870cx apply(Object obj) {
        C14180u uVar = this.f42947a;
        int i = this.f42948b;
        C58485gu guVar = (C58485gu) obj;
        if ((i == 3 || i == 4) && guVar.isEmpty()) {
            C58976aa aaVar = C58975e.f156826a;
            C36616s sVar = (C36616s) C36617t.f95460c.createBuilder();
            sVar.copyOnWrite();
            C36617t tVar = (C36617t) sVar.instance;
            tVar.f95463b = 1;
            tVar.f95462a |= 1;
            return C60856cj.m92900i((C36617t) sVar.build());
        }
        C58976aa aaVar2 = C58975e.f156826a;
        C36618u uVar2 = uVar.f42950a;
        C36601d dVar = (C36601d) C36603f.f95436c.createBuilder();
        dVar.copyOnWrite();
        C36603f fVar = (C36603f) dVar.instance;
        fVar.f95439b = i - 2;
        fVar.f95438a |= 1;
        return uVar2.mo40221a(new C36527a((C36603f) dVar.build(), guVar));
    }
}
