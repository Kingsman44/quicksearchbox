package com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9755b.p9756a;

import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128098bt;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128101bw;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128109j;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.a.x */
/* compiled from: PG */
public final class C128802x {

    /* renamed from: a */
    public final C128101bw f354060a;

    /* renamed from: b */
    public final C128109j f354061b;

    /* renamed from: c */
    public final C128801w f354062c;

    /* renamed from: d */
    public final boolean f354063d;

    /* renamed from: e */
    public final boolean f354064e;

    /* renamed from: f */
    private final float f354065f;

    public C128802x(C128101bw bwVar, C128109j jVar, float f, C128801w wVar, boolean z) {
        C69664n.m101061g(bwVar, "voicePlateStateResponse");
        C69664n.m101061g(wVar, "hotwordInvocationState");
        this.f354060a = bwVar;
        this.f354061b = jVar;
        this.f354065f = f;
        this.f354062c = wVar;
        this.f354063d = z;
        this.f354064e = f > 0.3f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C128802x)) {
            return false;
        }
        C128802x xVar = (C128802x) obj;
        return C69664n.m101066l(this.f354060a, xVar.f354060a) && C69664n.m101066l(this.f354061b, xVar.f354061b) && C69664n.m101066l(Float.valueOf(this.f354065f), Float.valueOf(xVar.f354065f)) && C69664n.m101066l(this.f354062c, xVar.f354062c) && this.f354063d == xVar.f354063d;
    }

    public final int hashCode() {
        int hashCode = this.f354060a.hashCode() * 31;
        C128109j jVar = this.f354061b;
        return ((((((hashCode + (jVar == null ? 0 : jVar.hashCode())) * 31) + Float.floatToIntBits(this.f354065f)) * 31) + this.f354062c.hashCode()) * 31) + (this.f354063d ? 1 : 0);
    }

    public final String toString() {
        C128098bt a = C128098bt.m209216a(this.f354060a.f352470b);
        C128109j jVar = this.f354061b;
        float f = this.f354065f;
        C128801w wVar = this.f354062c;
        boolean z = this.f354063d;
        return "voicePlateStateResponse case: " + a + "\nonboardingResponse: " + jVar + "\nrollingSpeechConfidence: " + f + "\nhotwordInvocationState: " + wVar + "\nisResponsePlateVisible: " + z;
    }
}
