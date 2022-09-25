package com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9755b.p9756a;

import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9755b.C128690a;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9757c.C128831f;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.a.bu */
/* compiled from: PG */
final class C128739bu {

    /* renamed from: a */
    public final C128690a f353903a;

    /* renamed from: b */
    public final C128831f f353904b;

    /* renamed from: c */
    public final boolean f353905c;

    /* renamed from: d */
    public final boolean f353906d;

    /* renamed from: e */
    public final boolean f353907e;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C128739bu(C128690a aVar, C128831f fVar, boolean z, int i) {
        this(aVar, fVar, ((i & 4) == 0) & z, false, true);
    }

    public C128739bu(C128690a aVar, C128831f fVar, boolean z, boolean z2, boolean z3) {
        C69664n.m101061g(aVar, "interactionState");
        this.f353903a = aVar;
        this.f353904b = fVar;
        this.f353905c = z;
        this.f353906d = z2;
        this.f353907e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C128739bu)) {
            return false;
        }
        C128739bu buVar = (C128739bu) obj;
        return this.f353903a == buVar.f353903a && C69664n.m101066l(this.f353904b, buVar.f353904b) && this.f353905c == buVar.f353905c && this.f353906d == buVar.f353906d && this.f353907e == buVar.f353907e;
    }

    public final int hashCode() {
        return (((((((this.f353903a.hashCode() * 31) + this.f353904b.hashCode()) * 31) + (this.f353905c ? 1 : 0)) * 31) + (this.f353906d ? 1 : 0)) * 31) + (this.f353907e ? 1 : 0);
    }

    public final String toString() {
        C128690a aVar = this.f353903a;
        C128831f fVar = this.f353904b;
        boolean z = this.f353905c;
        boolean z2 = this.f353906d;
        boolean z3 = this.f353907e;
        return "VoicePlateUiState(interactionState=" + aVar + ", contentState=" + fVar + ", intentPlateEnabled=" + z + ", isAvatarEnabled=" + z2 + ", enableAccessibility=" + z3 + ")";
    }
}
