package com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.p2593c;

import android.app.assist.AssistContent;
import android.app.assist.AssistStructure;
import android.os.Bundle;
import android.service.voice.VoiceInteractionSession;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.c.a */
/* compiled from: PG */
public final class C33507a {

    /* renamed from: a */
    public final Bundle f89654a;

    /* renamed from: b */
    public final AssistStructure f89655b;

    /* renamed from: c */
    public final AssistContent f89656c;

    /* renamed from: d */
    public final VoiceInteractionSession.ActivityId f89657d;

    /* renamed from: e */
    public final String f89658e;

    /* renamed from: f */
    public final int f89659f;

    /* renamed from: g */
    public final Integer f89660g;

    public C33507a(Bundle bundle, AssistStructure assistStructure, AssistContent assistContent, VoiceInteractionSession.ActivityId activityId, String str, int i, Integer num) {
        this.f89654a = bundle;
        this.f89655b = assistStructure;
        this.f89656c = assistContent;
        this.f89657d = activityId;
        this.f89658e = str;
        this.f89659f = i;
        this.f89660g = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33507a)) {
            return false;
        }
        C33507a aVar = (C33507a) obj;
        return C69664n.m101066l(this.f89654a, aVar.f89654a) && C69664n.m101066l(this.f89655b, aVar.f89655b) && C69664n.m101066l(this.f89656c, aVar.f89656c) && C69664n.m101066l(this.f89657d, aVar.f89657d) && C69664n.m101066l(this.f89658e, aVar.f89658e) && this.f89659f == aVar.f89659f && C69664n.m101066l(this.f89660g, aVar.f89660g);
    }

    public final int hashCode() {
        Bundle bundle = this.f89654a;
        int i = 0;
        int hashCode = (bundle == null ? 0 : bundle.hashCode()) * 31;
        AssistStructure assistStructure = this.f89655b;
        int hashCode2 = (hashCode + (assistStructure == null ? 0 : assistStructure.hashCode())) * 31;
        AssistContent assistContent = this.f89656c;
        int hashCode3 = (hashCode2 + (assistContent == null ? 0 : assistContent.hashCode())) * 31;
        VoiceInteractionSession.ActivityId activityId = this.f89657d;
        int hashCode4 = (hashCode3 + (activityId == null ? 0 : activityId.hashCode())) * 31;
        String str = this.f89658e;
        int hashCode5 = (((hashCode4 + (str == null ? 0 : str.hashCode())) * 31) + this.f89659f) * 31;
        Integer num = this.f89660g;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode5 + i;
    }

    public final String toString() {
        Bundle bundle = this.f89654a;
        AssistStructure assistStructure = this.f89655b;
        AssistContent assistContent = this.f89656c;
        VoiceInteractionSession.ActivityId activityId = this.f89657d;
        String str = this.f89658e;
        int i = this.f89659f;
        Integer num = this.f89660g;
        return "AssistState(assistData=" + bundle + ", assistStructure=" + assistStructure + ", assistContent=" + assistContent + ", activityId=" + activityId + ", mappedActivityId=" + str + ", index=" + i + ", count=" + num + ")";
    }
}
