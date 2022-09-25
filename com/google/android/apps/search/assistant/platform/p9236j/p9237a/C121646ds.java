package com.google.android.apps.search.assistant.platform.p9236j.p9237a;

import android.service.voice.VisibleActivityInfo;
import android.service.voice.VoiceInteractionSession;
import java.util.Set;
import kotlinx.coroutines.p5574b.C71548cy;
import p5462h.p5463a.C69514bd;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.j.a.ds */
/* compiled from: PG */
public final class C121646ds implements VoiceInteractionSession.VisibleActivityCallback {

    /* renamed from: a */
    final /* synthetic */ C121647dt f337503a;

    public C121646ds(C121647dt dtVar) {
        this.f337503a = dtVar;
    }

    public final void onInvisible(VoiceInteractionSession.ActivityId activityId) {
        Object e;
        C69664n.m101061g(activityId, "activityId");
        C71548cy cyVar = this.f337503a.f337507d;
        do {
            e = cyVar.mo62784e();
        } while (!cyVar.mo62808g(e, C69514bd.m100890d((Set) e, activityId)));
    }

    public final void onVisible(VisibleActivityInfo visibleActivityInfo) {
        Object e;
        VoiceInteractionSession.ActivityId activityId;
        C69664n.m101061g(visibleActivityInfo, "activityInfo");
        C71548cy cyVar = this.f337503a.f337507d;
        do {
            e = cyVar.mo62784e();
            activityId = visibleActivityInfo.getActivityId();
            C69664n.m101060f(activityId, "activityInfo.activityId");
        } while (!cyVar.mo62808g(e, C69514bd.m100892f((Set) e, activityId)));
    }
}
