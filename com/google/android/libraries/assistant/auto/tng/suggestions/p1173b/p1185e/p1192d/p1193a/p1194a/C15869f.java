package com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1185e.p1192d.p1193a.p1194a;

import com.google.android.libraries.search.assistant.p2786t.p2798c.C36527a;
import com.google.android.libraries.search.assistant.p2786t.p2798c.C36601d;
import com.google.android.libraries.search.assistant.p2786t.p2798c.C36603f;
import com.google.android.libraries.search.assistant.p2786t.p2798c.C36618u;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.b.e.d.a.a.f */
/* compiled from: PG */
public final /* synthetic */ class C15869f implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C15871h f47130a;

    /* renamed from: b */
    public final /* synthetic */ int f47131b;

    public /* synthetic */ C15869f(C15871h hVar, int i) {
        this.f47130a = hVar;
        this.f47131b = i;
    }

    public final C60870cx apply(Object obj) {
        C15871h hVar = this.f47130a;
        int i = this.f47131b;
        C58976aa aaVar = C58975e.f156826a;
        C36618u uVar = hVar.f47134a;
        C36601d dVar = (C36601d) C36603f.f95436c.createBuilder();
        dVar.copyOnWrite();
        C36603f fVar = (C36603f) dVar.instance;
        fVar.f95439b = i - 2;
        fVar.f95438a |= 1;
        return uVar.mo40221a(new C36527a((C36603f) dVar.build(), (C58485gu) obj));
    }
}
