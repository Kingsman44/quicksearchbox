package com.google.android.apps.gsa.staticplugins.microdetection.p8042d;

import com.google.android.apps.gsa.shared.speech.p7142d.C90536a;
import com.google.android.apps.gsa.speech.audio.C92157ac;
import com.google.android.apps.gsa.speech.p7269b.C92216a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.speech.micro.GoogleHotwordData;

/* renamed from: com.google.android.apps.gsa.staticplugins.microdetection.d.a */
/* compiled from: PG */
public final class C102832a extends C102843l {

    /* renamed from: a */
    public C92216a f287145a;

    /* renamed from: b */
    public GoogleHotwordData f287146b;

    /* renamed from: c */
    public C90536a f287147c;

    /* renamed from: d */
    public String f287148d;

    /* renamed from: e */
    public int f287149e;

    /* renamed from: f */
    public int f287150f;

    /* renamed from: g */
    public int f287151g;

    /* renamed from: h */
    public String f287152h;

    /* renamed from: i */
    public byte[] f287153i;

    /* renamed from: j */
    public C92157ac f287154j;

    /* renamed from: k */
    public C58833ax f287155k = C58836b.f156633a;

    /* renamed from: l */
    public byte f287156l;

    /* renamed from: m */
    private boolean f287157m;

    /* renamed from: n */
    private boolean f287158n;

    /* renamed from: o */
    private boolean f287159o;

    /* renamed from: p */
    private boolean f287160p;

    /* renamed from: q */
    private boolean f287161q;

    /* renamed from: a */
    public final C102844m mo93476a() {
        C92216a aVar;
        GoogleHotwordData googleHotwordData;
        C90536a aVar2;
        String str;
        if (this.f287156l == -1 && (aVar = this.f287145a) != null && (googleHotwordData = this.f287146b) != null && (aVar2 = this.f287147c) != null && (str = this.f287148d) != null) {
            return new C102833b(aVar, googleHotwordData, aVar2, str, this.f287149e, this.f287150f, this.f287151g, this.f287157m, this.f287158n, this.f287152h, this.f287153i, this.f287154j, this.f287159o, this.f287160p, this.f287161q, this.f287155k);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f287145a == null) {
            sb.append(" recognitionEngineCallback");
        }
        if (this.f287146b == null) {
            sb.append(" googleHotwordData");
        }
        if (this.f287147c == null) {
            sb.append(" recognitionMode");
        }
        if (this.f287148d == null) {
            sb.append(" locale");
        }
        if ((this.f287156l & 1) == 0) {
            sb.append(" sampleRateHz");
        }
        if ((this.f287156l & 2) == 0) {
            sb.append(" channelCount");
        }
        if ((this.f287156l & 4) == 0) {
            sb.append(" speakerMode");
        }
        if ((this.f287156l & 8) == 0) {
            sb.append(" shouldRunBargeIn");
        }
        if ((this.f287156l & 16) == 0) {
            sb.append(" isDspBased");
        }
        if ((this.f287156l & 32) == 0) {
            sb.append(" speakerIdAdaptationEnabled");
        }
        if ((this.f287156l & 64) == 0) {
            sb.append(" shouldGenerateNewModel");
        }
        if ((this.f287156l & 128) == 0) {
            sb.append(" isGearheadSession");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo93477b(boolean z) {
        this.f287158n = z;
        this.f287156l = (byte) (this.f287156l | 16);
    }

    /* renamed from: c */
    public final void mo93478c(boolean z) {
        this.f287161q = z;
        this.f287156l = (byte) (this.f287156l | 128);
    }

    /* renamed from: d */
    public final void mo93479d(boolean z) {
        this.f287160p = z;
        this.f287156l = (byte) (this.f287156l | 64);
    }

    /* renamed from: e */
    public final void mo93480e(boolean z) {
        this.f287157m = z;
        this.f287156l = (byte) (this.f287156l | 8);
    }

    /* renamed from: f */
    public final void mo93481f(boolean z) {
        this.f287159o = z;
        this.f287156l = (byte) (this.f287156l | 32);
    }
}
