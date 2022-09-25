package com.google.android.apps.search.assistant.platform.p9080f.p9125m.p9132c.p9133a;

import com.google.android.apps.search.assistant.platform.p9080f.p9125m.C120816a;
import com.google.common.p4526f.C59052c;
import com.google.speech.p5218j.C67087ko;

/* renamed from: com.google.android.apps.search.assistant.platform.f.m.c.a.d */
/* compiled from: PG */
final class C120896d implements C120816a {

    /* renamed from: a */
    final /* synthetic */ C120816a f336118a;

    /* renamed from: b */
    final /* synthetic */ C120897e f336119b;

    public C120896d(C120897e eVar, C120816a aVar) {
        this.f336119b = eVar;
        this.f336118a = aVar;
    }

    /* renamed from: a */
    public final void mo104868a(C67087ko koVar) {
        if ((koVar.f182368a & 2) != 0 && !this.f336119b.f336122c.getAndSet(true)) {
            ((C59052c) ((C59052c) C120897e.f336120a.mo56224b()).mo56372aa(35643)).mo56386p("Received first recognition event from online asr.");
        }
        this.f336118a.mo104868a(koVar);
    }
}
