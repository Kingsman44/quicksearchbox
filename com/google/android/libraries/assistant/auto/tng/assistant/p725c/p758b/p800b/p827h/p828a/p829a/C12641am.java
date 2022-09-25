package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p827h.p828a.p829a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p739d.C12094a;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p827h.C12692e;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16730ar;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.h.a.a.am */
/* compiled from: PG */
public final /* synthetic */ class C12641am implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C12094a f39645a;

    /* renamed from: b */
    public final /* synthetic */ C12692e f39646b;

    public /* synthetic */ C12641am(C12094a aVar, C12692e eVar) {
        this.f39645a = aVar;
        this.f39646b = eVar;
    }

    public final C60870cx apply(Object obj) {
        C12094a aVar = this.f39645a;
        C12692e eVar = this.f39646b;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h() && ((C16730ar) axVar.mo56107c()).equals(C16730ar.OFFLINE)) {
            return C60856cj.m92898g();
        }
        aVar.mo20408a(eVar.mo20720a());
        return C60866ct.f164955a;
    }
}
