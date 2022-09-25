package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p870d.p871a;

import com.google.android.libraries.assistant.auto.tng.p1351y.p1352a.C16913a;
import com.google.android.libraries.assistant.auto.tng.p893b.C13184b;
import com.google.android.libraries.assistant.auto.tng.p893b.C13187e;
import com.google.android.libraries.assistant.auto.tng.p893b.C13191i;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.util.concurrent.C60870cx;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.d.a.ar */
/* compiled from: PG */
public final /* synthetic */ class C12921ar implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C12926aw f40216a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f40217b;

    public /* synthetic */ C12921ar(C12926aw awVar, C60870cx cxVar) {
        this.f40216a = awVar;
        this.f40217b = cxVar;
    }

    public final void run() {
        C12926aw awVar = this.f40216a;
        C60870cx cxVar = this.f40217b;
        C12925av avVar = awVar.f40243q;
        boolean z = false;
        if (avVar == null || avVar.f40224a != cxVar) {
            C59104x b = C12926aw.f40227a.mo56224b();
            if (awVar.f40243q == null) {
                z = true;
            }
            ((C59052c) ((C59052c) b).mo56372aa(44562)).mo56389s("Not releasing audio focus, current session execution context is null: %b", Boolean.valueOf(z));
            return;
        }
        C46459k.m82829b(avVar.f40226c.mo20351a(), "Failed to release audio focus", new Object[0]);
        C13184b bVar = awVar.f40242p;
        C70876o.m103760a(bVar.f189039a.mo39510a(C13187e.m29437b(), bVar.f189040b), C13191i.f40830a);
        ((C59052c) ((C59052c) C12926aw.f40227a.mo56224b()).mo56372aa(44563)).mo56386p("inAssistantConversation: false");
        awVar.f40243q = null;
        if (awVar.f40237k.mo56113h()) {
            ((C16913a) awVar.f40237k.mo56107c()).mo23082a();
        }
    }
}
