package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2675a.p2676a;

import android.content.IntentFilter;
import android.os.Handler;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.a.a.ah */
/* compiled from: PG */
final class C34465ah extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C34467aj f91577a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34465ah(C34467aj ajVar) {
        super(1);
        this.f91577a = ajVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        C69615a aVar = (C69615a) obj;
        C69664n.m101061g(aVar, "listener");
        C34467aj ajVar = this.f91577a;
        C34466ai aiVar = new C34466ai(ajVar, aVar);
        ajVar.f91581b.registerReceiver(aiVar, new IntentFilter("com.google.android.voiceinteraction.NEW_SPEAKER_ID_MODEL_AVAILABLE"), "android.permission.MANAGE_VOICE_KEYPHRASES", (Handler) null);
        return new C34464ag(this.f91577a, aiVar);
    }
}
