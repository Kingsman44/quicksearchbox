package com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1177c.p1178a;

import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.C15785a;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.b.c.a.n */
/* compiled from: PG */
final class C15828n implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C15785a f47056a;

    /* renamed from: b */
    final /* synthetic */ C58833ax f47057b;

    /* renamed from: c */
    final /* synthetic */ C15830p f47058c;

    public C15828n(C15830p pVar, C15785a aVar, C58833ax axVar) {
        this.f47058c = pVar;
        this.f47056a = aVar;
        this.f47057b = axVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C15830p.f47061a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ContextManager");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(46435)).mo56386p("Failure in creating new composite context.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        MessageLite messageLite = (MessageLite) obj;
        C15815a aVar = this.f47058c.f47062b;
        aVar.f47041a.put(this.f47056a, messageLite);
        this.f47058c.mo22581d(this.f47056a, this.f47057b, messageLite);
    }
}
