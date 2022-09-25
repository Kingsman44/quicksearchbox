package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response;

import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9538d.C127170c;
import com.google.protobuf.C63088z;
import java.util.List;
import p3186j$.time.Duration;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.response.b */
/* compiled from: PG */
public final class C130174b {

    /* renamed from: a */
    public final C127170c f356916a;

    /* renamed from: b */
    public final Duration f356917b;

    /* renamed from: c */
    public final C63088z f356918c;

    /* renamed from: d */
    public final List f356919d;

    /* renamed from: e */
    private final long f356920e;

    public C130174b() {
        this((C127170c) null, (Duration) null, (C63088z) null, (List) null);
    }

    public /* synthetic */ C130174b(C127170c cVar, Duration duration, C63088z zVar, List list) {
        this.f356916a = cVar;
        this.f356917b = duration;
        this.f356920e = 0;
        this.f356918c = zVar;
        this.f356919d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C130174b)) {
            return false;
        }
        C130174b bVar = (C130174b) obj;
        if (!C69664n.m101066l(this.f356916a, bVar.f356916a) || !C69664n.m101066l(this.f356917b, bVar.f356917b)) {
            return false;
        }
        long j = bVar.f356920e;
        return C69664n.m101066l(this.f356918c, bVar.f356918c) && C69664n.m101066l(this.f356919d, bVar.f356919d);
    }

    public final int hashCode() {
        C127170c cVar = this.f356916a;
        int i = 0;
        int hashCode = (((cVar == null ? 0 : cVar.hashCode()) * 31) + this.f356917b.hashCode()) * 961;
        C63088z zVar = this.f356918c;
        if (zVar != null) {
            i = zVar.hashCode();
        }
        return ((hashCode + i) * 31) + this.f356919d.hashCode();
    }

    public final String toString() {
        C127170c cVar = this.f356916a;
        Duration duration = this.f356917b;
        C63088z zVar = this.f356918c;
        List list = this.f356919d;
        return "BackNavigationTuple(transcription=" + cVar + ", elapsedRealtime=" + duration + ", queryCommitId=0, queryOpaqueToken=" + zVar + ", suggestionChipList=" + list + ")";
    }
}
