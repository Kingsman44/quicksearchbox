package com.google.android.libraries.assistant.hotword;

import android.content.Context;
import com.google.android.apps.gsa.shared.speech.speakerid.SpeakerIdModel;
import com.google.speech.micro.GoogleHotwordData;
import com.google.speech.micro.GoogleHotwordRecognizer;

/* renamed from: com.google.android.libraries.assistant.hotword.i */
/* compiled from: PG */
public final class C18372i extends C18385v {

    /* renamed from: a */
    public int f52124a;

    /* renamed from: b */
    public int f52125b;

    /* renamed from: c */
    public int f52126c;

    /* renamed from: d */
    public GoogleHotwordData f52127d;

    /* renamed from: e */
    public GoogleHotwordRecognizer f52128e;

    /* renamed from: f */
    public SpeakerIdModel f52129f;

    /* renamed from: g */
    public String f52130g;

    /* renamed from: h */
    public byte f52131h;

    /* renamed from: i */
    private boolean f52132i;

    /* renamed from: j */
    private Context f52133j;

    /* renamed from: k */
    private boolean f52134k;

    /* renamed from: l */
    private boolean f52135l;

    /* renamed from: m */
    private long f52136m;

    /* renamed from: a */
    public final C18386w mo23858a() {
        GoogleHotwordData googleHotwordData;
        GoogleHotwordRecognizer googleHotwordRecognizer;
        Context context;
        if (this.f52131h == Byte.MAX_VALUE && (googleHotwordData = this.f52127d) != null && (googleHotwordRecognizer = this.f52128e) != null && (context = this.f52133j) != null) {
            return new C18373j(this.f52124a, this.f52125b, this.f52126c, googleHotwordData, googleHotwordRecognizer, this.f52132i, this.f52129f, this.f52130g, context, this.f52134k, this.f52135l, this.f52136m);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f52131h & 1) == 0) {
            sb.append(" encodingFormat");
        }
        if ((this.f52131h & 2) == 0) {
            sb.append(" sampleRateHz");
        }
        if ((this.f52131h & 4) == 0) {
            sb.append(" speakerMode");
        }
        if (this.f52127d == null) {
            sb.append(" hotwordData");
        }
        if (this.f52128e == null) {
            sb.append(" hotwordRecognizer");
        }
        if ((this.f52131h & 8) == 0) {
            sb.append(" isDspBased");
        }
        if (this.f52133j == null) {
            sb.append(" context");
        }
        if ((this.f52131h & 16) == 0) {
            sb.append(" speakerIdAdaptationEnabled");
        }
        if ((this.f52131h & 32) == 0) {
            sb.append(" speakerIdPostProcessAdaptationEnabled");
        }
        if ((this.f52131h & 64) == 0) {
            sb.append(" dspHotwordTriggeredTimestamp");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo23859b(Context context) {
        if (context != null) {
            this.f52133j = context;
            return;
        }
        throw new NullPointerException("Null context");
    }

    /* renamed from: c */
    public final void mo23860c(long j) {
        this.f52136m = j;
        this.f52131h = (byte) (this.f52131h | 64);
    }

    /* renamed from: d */
    public final void mo23861d(boolean z) {
        this.f52132i = z;
        this.f52131h = (byte) (this.f52131h | 8);
    }

    /* renamed from: e */
    public final void mo23862e(boolean z) {
        this.f52134k = z;
        this.f52131h = (byte) (this.f52131h | 16);
    }

    /* renamed from: f */
    public final void mo23863f(boolean z) {
        this.f52135l = z;
        this.f52131h = (byte) (this.f52131h | 32);
    }
}
