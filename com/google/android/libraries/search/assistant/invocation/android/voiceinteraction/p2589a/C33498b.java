package com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.p2589a;

import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.a.b */
/* compiled from: PG */
public final class C33498b {

    /* renamed from: a */
    public final List f89652a;

    public C33498b(List list) {
        C69664n.m101061g(list, "listeners");
        this.f89652a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C33498b) && C69664n.m101066l(this.f89652a, ((C33498b) obj).f89652a);
    }

    public final int hashCode() {
        return this.f89652a.hashCode();
    }

    public final String toString() {
        List list = this.f89652a;
        return "VoiceInteractionServiceLifecycleConfiguration(listeners=" + list + ")";
    }
}
