package com.google.android.libraries.assistant.auto.tng.suggestions.p1270m.p1271a;

import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1176b.C15795e;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1177c.C15814a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.m.a.ae */
/* compiled from: PG */
public final /* synthetic */ class C16414ae implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C16416ag f48282a;

    /* renamed from: b */
    public final /* synthetic */ int f48283b;

    public /* synthetic */ C16414ae(C16416ag agVar, int i) {
        this.f48282a = agVar;
        this.f48283b = i;
    }

    public final C60870cx apply(Object obj) {
        C58833ax axVar;
        C16416ag agVar = this.f48282a;
        int i = this.f48283b;
        if (!((Boolean) obj).booleanValue()) {
            C58976aa aaVar = C58975e.f156826a;
            return C60856cj.m92900i(C58485gu.m89845m());
        }
        if (i == 8) {
            axVar = agVar.f48288c.mo22627b();
        } else {
            axVar = agVar.f48288c.mo22628c();
        }
        if (axVar.mo56113h()) {
            C58976aa aaVar2 = C58975e.f156826a;
            return C60856cj.m92900i((List) axVar.mo56107c());
        }
        C60870cx a = ((C15814a) agVar.f48296k.mo27525b()).mo22573a(C15795e.f47027a);
        C16442z zVar = new C16442z(i);
        return C60922j.m93044g(a, C47810es.m84963c(zVar), agVar.f48298m);
    }
}
