package com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9755b.p9756a;

import com.google.assistant.p3897e.p3921j.C51809dy;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.a.bs */
/* compiled from: PG */
final class C128737bs {

    /* renamed from: a */
    public final C128736br f353900a;

    /* renamed from: b */
    public final C51809dy f353901b;

    /* renamed from: c */
    public final boolean f353902c;

    public C128737bs(C128736br brVar, C51809dy dyVar, boolean z) {
        C69664n.m101061g(brVar, "voicePlateConnectionState");
        C69664n.m101061g(dyVar, "intentPlateClientOp");
        this.f353900a = brVar;
        this.f353901b = dyVar;
        this.f353902c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C128737bs)) {
            return false;
        }
        C128737bs bsVar = (C128737bs) obj;
        return C69664n.m101066l(this.f353900a, bsVar.f353900a) && C69664n.m101066l(this.f353901b, bsVar.f353901b) && this.f353902c == bsVar.f353902c;
    }

    public final int hashCode() {
        return (((this.f353900a.hashCode() * 31) + this.f353901b.hashCode()) * 31) + (this.f353902c ? 1 : 0);
    }

    public final String toString() {
        C128736br brVar = this.f353900a;
        C51809dy dyVar = this.f353901b;
        boolean z = this.f353902c;
        return "voicePlateConnectionState: " + brVar + "\nintentPlateClientOp: " + dyVar + "\nisTtsPlaying: " + z;
    }
}
