package com.google.android.apps.search.assistant.platform.p9236j.p9237a;

import android.service.voice.VoiceInteractionSession;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.j.a.cj */
/* compiled from: PG */
final class C121610cj implements Consumer {

    /* renamed from: a */
    final /* synthetic */ C121616cp f337417a;

    public C121610cj(C121616cp cpVar) {
        this.f337417a = cpVar;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        VoiceInteractionSession.ActivityId activityId = (VoiceInteractionSession.ActivityId) obj;
        C69664n.m101061g(activityId, "activityId");
        this.f337417a.f337448e.mo39051c(activityId);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
