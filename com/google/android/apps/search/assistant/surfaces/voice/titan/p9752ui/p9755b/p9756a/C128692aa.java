package com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9755b.p9756a;

import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9755b.C128690a;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9757c.C128831f;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.a.aa */
/* compiled from: PG */
final class C128692aa {

    /* renamed from: a */
    public static final C128804z f353772a = new C128804z();

    /* renamed from: b */
    public final C128690a f353773b;

    /* renamed from: c */
    public final C128831f f353774c;

    /* renamed from: d */
    public final boolean f353775d;

    /* renamed from: e */
    public final boolean f353776e;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C128692aa(C128690a aVar, C128831f fVar, boolean z, int i) {
        this(aVar, fVar, z & ((i & 4) == 0), (i & 8) != 0);
    }

    public C128692aa(C128690a aVar, C128831f fVar, boolean z, boolean z2) {
        C69664n.m101061g(aVar, "interactionState");
        this.f353773b = aVar;
        this.f353774c = fVar;
        this.f353775d = z;
        this.f353776e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C128692aa)) {
            return false;
        }
        C128692aa aaVar = (C128692aa) obj;
        return this.f353773b == aaVar.f353773b && C69664n.m101066l(this.f353774c, aaVar.f353774c) && this.f353775d == aaVar.f353775d && this.f353776e == aaVar.f353776e;
    }

    public final int hashCode() {
        return (((((this.f353773b.hashCode() * 31) + this.f353774c.hashCode()) * 31) + (this.f353775d ? 1 : 0)) * 31) + (this.f353776e ? 1 : 0);
    }

    public final String toString() {
        C128690a aVar = this.f353773b;
        C128831f fVar = this.f353774c;
        boolean z = this.f353775d;
        boolean z2 = this.f353776e;
        return "VoicePlateUiState(interactionState=" + aVar + ", contentState=" + fVar + ", intentPlateEnabled=" + z + ", isKeyboardVisible=" + z2 + ")";
    }
}
