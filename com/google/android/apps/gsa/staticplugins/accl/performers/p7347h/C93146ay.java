package com.google.android.apps.gsa.staticplugins.accl.performers.p7347h;

import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.h.ay */
/* compiled from: PG */
final class C93146ay extends C90888av {

    /* renamed from: a */
    final /* synthetic */ SettableFuture f259793a;

    /* renamed from: b */
    final /* synthetic */ boolean f259794b;

    /* renamed from: c */
    final /* synthetic */ C93150bb f259795c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C93146ay(C93150bb bbVar, SettableFuture settableFuture, boolean z) {
        super("TTS completes", 2, 0);
        this.f259795c = bbVar;
        this.f259793a = settableFuture;
        this.f259794b = z;
    }

    public final void run() {
        C59071e eVar = C93150bb.f259800a;
        C58976aa aaVar = C58975e.f156826a;
        this.f259793a.mo57356n(this.f259794b ? C22402a.f61894b : C22402a.f61893a);
        this.f259795c.mo87559j(C88244um.TTS_PLAYBACK_DONE);
    }
}
