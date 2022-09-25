package com.google.android.libraries.assistant.auto.tng.p1028l.p1032c;

import com.google.android.libraries.assistant.auto.ondevice.p713e.C11902r;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p760a.p761a.C12182h;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p767b.p773b.p774a.p775a.C12226a;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.auto.tng.l.c.s */
/* compiled from: PG */
public final /* synthetic */ class C13794s implements C60931s {

    /* renamed from: a */
    public static final /* synthetic */ C13794s f41987a = new C13794s();

    private /* synthetic */ C13794s() {
    }

    public final C60870cx apply(Object obj) {
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            return C60866ct.f164955a;
        }
        C58833ax a = C11902r.m27718a(((C12182h) axVar.mo56107c()).mo20475a());
        if (!a.mo56113h() || !((List) a.mo56107c()).contains(23202)) {
            return C60866ct.f164955a;
        }
        return C60856cj.m92899h(new C12226a("No fulfillment built."));
    }
}
