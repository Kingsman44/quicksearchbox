package com.google.android.libraries.assistant.auto.tng.suggestions.p1256i.p1259b;

import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16090ap;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16169m;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1168a.p1171b.C15777d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.i.b.c */
/* compiled from: PG */
public final /* synthetic */ class C16287c implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C16300p f47941a;

    public /* synthetic */ C16287c(C16300p pVar) {
        this.f47941a = pVar;
    }

    public final C60870cx apply(Object obj) {
        C16300p pVar = this.f47941a;
        C15777d dVar = (C15777d) obj;
        C16090ap g = dVar.mo22544b().mo22733g();
        C16090ap apVar = C16090ap.HOME_SCREEN;
        int ordinal = g.ordinal();
        if (ordinal == 1 || ordinal == 4 || ordinal == 5 || ordinal == 6) {
            C58976aa aaVar = C58975e.f156826a;
            dVar.mo22544b().mo22733g().name();
            return C60856cj.m92900i(new ArrayList());
        }
        C60870cx a = pVar.f47971e.mo22849a(C58485gu.m89846n(C16169m.SHORTCUT), dVar);
        C16296l lVar = new C16296l(pVar, dVar);
        return C60922j.m93045h(a, C47810es.m84966f(lVar), pVar.f47968b);
    }
}
