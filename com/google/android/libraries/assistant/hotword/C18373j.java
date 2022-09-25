package com.google.android.libraries.assistant.hotword;

import android.content.Context;
import com.google.android.apps.gsa.shared.speech.speakerid.SpeakerIdModel;
import com.google.speech.micro.GoogleHotwordData;
import com.google.speech.micro.GoogleHotwordRecognizer;

/* renamed from: com.google.android.libraries.assistant.hotword.j */
/* compiled from: PG */
final class C18373j extends C18386w {

    /* renamed from: a */
    private final int f52137a;

    /* renamed from: b */
    private final int f52138b;

    /* renamed from: c */
    private final int f52139c;

    /* renamed from: d */
    private final GoogleHotwordData f52140d;

    /* renamed from: e */
    private final GoogleHotwordRecognizer f52141e;

    /* renamed from: f */
    private final boolean f52142f;

    /* renamed from: g */
    private final SpeakerIdModel f52143g;

    /* renamed from: h */
    private final String f52144h;

    /* renamed from: i */
    private final Context f52145i;

    /* renamed from: j */
    private final boolean f52146j;

    /* renamed from: k */
    private final boolean f52147k;

    /* renamed from: l */
    private final long f52148l;

    public C18373j(int i, int i2, int i3, GoogleHotwordData googleHotwordData, GoogleHotwordRecognizer googleHotwordRecognizer, boolean z, SpeakerIdModel speakerIdModel, String str, Context context, boolean z2, boolean z3, long j) {
        this.f52137a = i;
        this.f52138b = i2;
        this.f52139c = i3;
        this.f52140d = googleHotwordData;
        this.f52141e = googleHotwordRecognizer;
        this.f52142f = z;
        this.f52143g = speakerIdModel;
        this.f52144h = str;
        this.f52145i = context;
        this.f52146j = z2;
        this.f52147k = z3;
        this.f52148l = j;
    }

    /* renamed from: a */
    public final int mo23864a() {
        return this.f52137a;
    }

    /* renamed from: b */
    public final int mo23865b() {
        return this.f52138b;
    }

    /* renamed from: c */
    public final int mo23866c() {
        return this.f52139c;
    }

    /* renamed from: d */
    public final long mo23867d() {
        return this.f52148l;
    }

    /* renamed from: e */
    public final Context mo23868e() {
        return this.f52145i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
        r1 = r7.f52143g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0058, code lost:
        r1 = r7.f52144h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof com.google.android.libraries.assistant.hotword.C18386w
            r2 = 0
            if (r1 == 0) goto L_0x0095
            com.google.android.libraries.assistant.hotword.w r8 = (com.google.android.libraries.assistant.hotword.C18386w) r8
            int r1 = r7.f52137a
            int r3 = r8.mo23864a()
            if (r1 != r3) goto L_0x0095
            int r1 = r7.f52138b
            int r3 = r8.mo23865b()
            if (r1 != r3) goto L_0x0095
            int r1 = r7.f52139c
            int r3 = r8.mo23866c()
            if (r1 != r3) goto L_0x0095
            com.google.speech.micro.GoogleHotwordData r1 = r7.f52140d
            com.google.speech.micro.GoogleHotwordData r3 = r8.mo23871g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0095
            com.google.speech.micro.GoogleHotwordRecognizer r1 = r7.f52141e
            com.google.speech.micro.GoogleHotwordRecognizer r3 = r8.mo23872h()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0095
            boolean r1 = r7.f52142f
            boolean r3 = r8.mo23875j()
            if (r1 != r3) goto L_0x0095
            com.google.android.apps.gsa.shared.speech.speakerid.SpeakerIdModel r1 = r7.f52143g
            if (r1 != 0) goto L_0x004e
            com.google.android.apps.gsa.shared.speech.speakerid.SpeakerIdModel r1 = r8.mo23870f()
            if (r1 != 0) goto L_0x0095
            goto L_0x0058
        L_0x004e:
            com.google.android.apps.gsa.shared.speech.speakerid.SpeakerIdModel r3 = r8.mo23870f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0095
        L_0x0058:
            java.lang.String r1 = r7.f52144h
            if (r1 != 0) goto L_0x0063
            java.lang.String r1 = r8.mo23874i()
            if (r1 != 0) goto L_0x0095
            goto L_0x006e
        L_0x0063:
            java.lang.String r3 = r8.mo23874i()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x006e
            goto L_0x0095
        L_0x006e:
            android.content.Context r1 = r7.f52145i
            android.content.Context r3 = r8.mo23868e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0095
            boolean r1 = r7.f52146j
            boolean r3 = r8.mo23876k()
            if (r1 != r3) goto L_0x0095
            boolean r1 = r7.f52147k
            boolean r3 = r8.mo23877l()
            if (r1 != r3) goto L_0x0095
            long r3 = r7.f52148l
            long r5 = r8.mo23867d()
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L_0x0095
            return r0
        L_0x0095:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.hotword.C18373j.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final SpeakerIdModel mo23870f() {
        return this.f52143g;
    }

    /* renamed from: g */
    public final GoogleHotwordData mo23871g() {
        return this.f52140d;
    }

    /* renamed from: h */
    public final GoogleHotwordRecognizer mo23872h() {
        return this.f52141e;
    }

    public final int hashCode() {
        int i;
        int i2 = 1237;
        int hashCode = (((((((((((this.f52137a ^ 1000003) * 1000003) ^ this.f52138b) * 1000003) ^ this.f52139c) * 1000003) ^ this.f52140d.hashCode()) * 1000003) ^ this.f52141e.hashCode()) * 1000003) ^ (true != this.f52142f ? 1237 : 1231)) * 1000003;
        SpeakerIdModel speakerIdModel = this.f52143g;
        int i3 = 0;
        if (speakerIdModel == null) {
            i = 0;
        } else {
            i = speakerIdModel.hashCode();
        }
        int i4 = (hashCode ^ i) * 1000003;
        String str = this.f52144h;
        if (str != null) {
            i3 = str.hashCode();
        }
        int hashCode2 = (((((i4 ^ i3) * 1000003) ^ this.f52145i.hashCode()) * 1000003) ^ (true != this.f52146j ? 1237 : 1231)) * 1000003;
        if (true == this.f52147k) {
            i2 = 1231;
        }
        long j = this.f52148l;
        return ((hashCode2 ^ i2) * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    /* renamed from: i */
    public final String mo23874i() {
        return this.f52144h;
    }

    /* renamed from: j */
    public final boolean mo23875j() {
        return this.f52142f;
    }

    /* renamed from: k */
    public final boolean mo23876k() {
        return this.f52146j;
    }

    /* renamed from: l */
    public final boolean mo23877l() {
        return this.f52147k;
    }

    public final String toString() {
        int i = this.f52137a;
        int i2 = this.f52138b;
        int i3 = this.f52139c;
        String obj = this.f52140d.toString();
        String obj2 = this.f52141e.toString();
        boolean z = this.f52142f;
        String valueOf = String.valueOf(this.f52143g);
        String str = this.f52144h;
        String obj3 = this.f52145i.toString();
        boolean z2 = this.f52146j;
        boolean z3 = this.f52147k;
        long j = this.f52148l;
        return "Params{encodingFormat=" + i + ", sampleRateHz=" + i2 + ", speakerMode=" + i3 + ", hotwordData=" + obj + ", hotwordRecognizer=" + obj2 + ", isDspBased=" + z + ", speakerIdModel=" + valueOf + ", accountName=" + str + ", context=" + obj3 + ", speakerIdAdaptationEnabled=" + z2 + ", speakerIdPostProcessAdaptationEnabled=" + z3 + ", dspHotwordTriggeredTimestamp=" + j + "}";
    }
}
