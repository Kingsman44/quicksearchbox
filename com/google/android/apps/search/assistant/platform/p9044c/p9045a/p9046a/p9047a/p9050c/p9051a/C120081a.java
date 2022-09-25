package com.google.android.apps.search.assistant.platform.p9044c.p9045a.p9046a.p9047a.p9050c.p9051a;

import android.content.Intent;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.C33514d;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.assistant.platform.c.a.a.a.c.a.a */
/* compiled from: PG */
public final class C120081a extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C33514d f334284a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120081a(C33514d dVar) {
        super(1);
        this.f334284a = dVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        Intent intent = (Intent) obj;
        C69664n.m101061g(intent, "$this$withExtraVoiceInteractionIntent");
        intent.putExtra("APA_SESSION_ID", this.f334284a.f89676a);
        return C69788q.f186170a;
    }
}
