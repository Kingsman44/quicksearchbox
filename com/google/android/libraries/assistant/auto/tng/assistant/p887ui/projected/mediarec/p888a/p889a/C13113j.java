package com.google.android.libraries.assistant.auto.tng.assistant.p887ui.projected.mediarec.p888a.p889a;

import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13048j;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13049k;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13050l;
import com.google.apps.tiktok.cache.C46370ah;
import com.google.apps.tiktok.cache.C46407v;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C63033ey;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.ui.projected.mediarec.a.a.j */
/* compiled from: PG */
public final /* synthetic */ class C13113j implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C13114k f40650a;

    /* renamed from: b */
    public final /* synthetic */ int f40651b;

    public /* synthetic */ C13113j(C13114k kVar, int i) {
        this.f40650a = kVar;
        this.f40651b = i;
    }

    public final C60870cx apply(Object obj) {
        C13114k kVar = this.f40650a;
        int i = this.f40651b;
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            return C60866ct.f164955a;
        }
        C13050l lVar = (C13050l) ((C46370ah) axVar.mo56107c()).f121384a;
        C13048j jVar = lVar.f40512b;
        if (jVar == null) {
            jVar = C13048j.f40502e;
        }
        int i2 = jVar.f40507d + i;
        if (i2 <= lVar.f40513c) {
            C58976aa aaVar = C58975e.f156826a;
            return C60866ct.f164955a;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        C46407v vVar = kVar.f40659h;
        C63033ey g = kVar.mo20908g();
        C13049k kVar2 = (C13049k) lVar.toBuilder();
        kVar2.copyOnWrite();
        C13050l lVar2 = (C13050l) kVar2.instance;
        lVar2.f40511a |= 2;
        lVar2.f40513c = i2;
        return C47633f.m84733g(vVar.mo50346f(g, C60856cj.m92900i((C13050l) kVar2.build()))).mo51516i(C13110g.f40647a, kVar.f40661j);
    }
}
