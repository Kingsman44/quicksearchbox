package com.google.android.apps.gsa.shared.speech.hotword;

import android.net.Uri;
import com.google.android.apps.gsa.shared.speech.speakerid.SpeakerIdModel;
import com.google.common.base.C58833ax;
import com.google.speech.p5208h.C66626cx;
import com.google.speech.p5224k.p5225a.C67229g;

/* compiled from: PG */
final class AutoValue_HotwordResult extends HotwordResult {

    /* renamed from: A */
    public final C58833ax f253175A;

    /* renamed from: B */
    public final C58833ax f253176B;

    /* renamed from: C */
    public final C58833ax f253177C;

    /* renamed from: D */
    public final C58833ax f253178D;

    /* renamed from: a */
    public final int f253179a;

    /* renamed from: b */
    public final C66626cx f253180b;

    /* renamed from: c */
    public final boolean f253181c;

    /* renamed from: d */
    public final boolean f253182d;

    /* renamed from: e */
    public final float f253183e;

    /* renamed from: f */
    public final String f253184f;

    /* renamed from: g */
    public final float f253185g;

    /* renamed from: h */
    public final float f253186h;

    /* renamed from: i */
    public final float f253187i;

    /* renamed from: j */
    public final C58833ax f253188j;

    /* renamed from: k */
    public final int f253189k;

    /* renamed from: l */
    public final int f253190l;

    /* renamed from: m */
    public final C58833ax f253191m;

    /* renamed from: n */
    public final int f253192n;

    /* renamed from: o */
    public final int f253193o;

    /* renamed from: p */
    public final C67229g f253194p;

    /* renamed from: q */
    public final boolean f253195q;

    /* renamed from: r */
    public final boolean f253196r;

    /* renamed from: s */
    public final SpeakerIdModel f253197s;

    /* renamed from: t */
    public final boolean f253198t;

    /* renamed from: u */
    public final String f253199u;

    /* renamed from: v */
    public final int f253200v;

    /* renamed from: w */
    public final boolean f253201w;

    /* renamed from: x */
    public final long f253202x;

    /* renamed from: y */
    public final long f253203y;

    /* renamed from: z */
    public final Uri f253204z;

    public AutoValue_HotwordResult(int i, C66626cx cxVar, boolean z, boolean z2, float f, String str, float f2, float f3, float f4, C58833ax axVar, int i2, int i3, C58833ax axVar2, int i4, int i5, C67229g gVar, boolean z3, boolean z4, SpeakerIdModel speakerIdModel, boolean z5, String str2, int i6, boolean z6, long j, long j2, Uri uri, C58833ax axVar3, C58833ax axVar4, C58833ax axVar5, C58833ax axVar6) {
        this.f253179a = i;
        this.f253180b = cxVar;
        this.f253181c = z;
        this.f253182d = z2;
        this.f253183e = f;
        this.f253184f = str;
        this.f253185g = f2;
        this.f253186h = f3;
        this.f253187i = f4;
        this.f253188j = axVar;
        this.f253189k = i2;
        this.f253190l = i3;
        this.f253191m = axVar2;
        this.f253192n = i4;
        this.f253193o = i5;
        this.f253194p = gVar;
        this.f253195q = z3;
        this.f253196r = z4;
        this.f253197s = speakerIdModel;
        this.f253198t = z5;
        this.f253199u = str2;
        this.f253200v = i6;
        this.f253201w = z6;
        this.f253202x = j;
        this.f253203y = j2;
        this.f253204z = uri;
        this.f253175A = axVar3;
        this.f253176B = axVar4;
        this.f253177C = axVar5;
        this.f253178D = axVar6;
    }

    /* renamed from: A */
    public final boolean mo84676A() {
        return this.f253181c;
    }

    /* renamed from: B */
    public final boolean mo84677B() {
        return this.f253182d;
    }

    /* renamed from: C */
    public final boolean mo84678C() {
        return this.f253195q;
    }

    /* renamed from: D */
    public final boolean mo84679D() {
        return this.f253198t;
    }

    /* renamed from: E */
    public final boolean mo84680E() {
        return this.f253196r;
    }

    /* renamed from: a */
    public final float mo84681a() {
        return this.f253187i;
    }

    /* renamed from: b */
    public final float mo84682b() {
        return this.f253186h;
    }

    /* renamed from: c */
    public final float mo84683c() {
        return this.f253183e;
    }

    /* renamed from: d */
    public final float mo84684d() {
        return this.f253185g;
    }

    /* renamed from: e */
    public final int mo84685e() {
        return this.f253189k;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003f, code lost:
        r1 = r7.f253184f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d8, code lost:
        r1 = r7.f253197s;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f5, code lost:
        r1 = r7.f253199u;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x012e, code lost:
        r1 = r7.f253204z;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof com.google.android.apps.gsa.shared.speech.hotword.HotwordResult
            r2 = 0
            if (r1 == 0) goto L_0x0175
            com.google.android.apps.gsa.shared.speech.hotword.HotwordResult r8 = (com.google.android.apps.gsa.shared.speech.hotword.HotwordResult) r8
            int r1 = r7.f253179a
            int r3 = r8.mo84692j()
            if (r1 != r3) goto L_0x0175
            com.google.speech.h.cx r1 = r7.f253180b
            com.google.speech.h.cx r3 = r8.mo84705v()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0175
            boolean r1 = r7.f253181c
            boolean r3 = r8.mo84676A()
            if (r1 != r3) goto L_0x0175
            boolean r1 = r7.f253182d
            boolean r3 = r8.mo84677B()
            if (r1 != r3) goto L_0x0175
            float r1 = r7.f253183e
            int r1 = java.lang.Float.floatToIntBits(r1)
            float r3 = r8.mo84683c()
            int r3 = java.lang.Float.floatToIntBits(r3)
            if (r1 != r3) goto L_0x0175
            java.lang.String r1 = r7.f253184f
            if (r1 != 0) goto L_0x004a
            java.lang.String r1 = r8.mo84707x()
            if (r1 != 0) goto L_0x0175
            goto L_0x0054
        L_0x004a:
            java.lang.String r3 = r8.mo84707x()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0175
        L_0x0054:
            float r1 = r7.f253185g
            int r1 = java.lang.Float.floatToIntBits(r1)
            float r3 = r8.mo84684d()
            int r3 = java.lang.Float.floatToIntBits(r3)
            if (r1 != r3) goto L_0x0175
            float r1 = r7.f253186h
            int r1 = java.lang.Float.floatToIntBits(r1)
            float r3 = r8.mo84682b()
            int r3 = java.lang.Float.floatToIntBits(r3)
            if (r1 != r3) goto L_0x0175
            float r1 = r7.f253187i
            int r1 = java.lang.Float.floatToIntBits(r1)
            float r3 = r8.mo84681a()
            int r3 = java.lang.Float.floatToIntBits(r3)
            if (r1 != r3) goto L_0x0175
            com.google.common.base.ax r1 = r7.f253188j
            com.google.common.base.ax r3 = r8.mo84698p()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0175
            int r1 = r7.f253189k
            int r3 = r8.mo84685e()
            if (r1 != r3) goto L_0x0175
            int r1 = r7.f253190l
            int r3 = r8.mo84687f()
            if (r1 != r3) goto L_0x0175
            com.google.common.base.ax r1 = r7.f253191m
            com.google.common.base.ax r3 = r8.mo84700r()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0175
            int r1 = r7.f253192n
            int r3 = r8.mo84691i()
            if (r1 != r3) goto L_0x0175
            int r1 = r7.f253193o
            int r3 = r8.mo84689h()
            if (r1 != r3) goto L_0x0175
            com.google.speech.k.a.g r1 = r7.f253194p
            com.google.speech.k.a.g r3 = r8.mo84706w()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0175
            boolean r1 = r7.f253195q
            boolean r3 = r8.mo84678C()
            if (r1 != r3) goto L_0x0175
            boolean r1 = r7.f253196r
            boolean r3 = r8.mo84680E()
            if (r1 != r3) goto L_0x0175
            com.google.android.apps.gsa.shared.speech.speakerid.SpeakerIdModel r1 = r7.f253197s
            if (r1 != 0) goto L_0x00e3
            com.google.android.apps.gsa.shared.speech.speakerid.SpeakerIdModel r1 = r8.mo84697o()
            if (r1 != 0) goto L_0x0175
            goto L_0x00ed
        L_0x00e3:
            com.google.android.apps.gsa.shared.speech.speakerid.SpeakerIdModel r3 = r8.mo84697o()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0175
        L_0x00ed:
            boolean r1 = r7.f253198t
            boolean r3 = r8.mo84679D()
            if (r1 != r3) goto L_0x0175
            java.lang.String r1 = r7.f253199u
            if (r1 != 0) goto L_0x0100
            java.lang.String r1 = r8.mo84708y()
            if (r1 != 0) goto L_0x0175
            goto L_0x010a
        L_0x0100:
            java.lang.String r3 = r8.mo84708y()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0175
        L_0x010a:
            int r1 = r7.f253200v
            int r3 = r8.mo84688g()
            if (r1 != r3) goto L_0x0175
            boolean r1 = r7.f253201w
            boolean r3 = r8.mo84709z()
            if (r1 != r3) goto L_0x0175
            long r3 = r7.f253202x
            long r5 = r8.mo84694l()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0175
            long r3 = r7.f253203y
            long r5 = r8.mo84693k()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0175
            android.net.Uri r1 = r7.f253204z
            if (r1 != 0) goto L_0x0139
            android.net.Uri r1 = r8.mo84695m()
            if (r1 != 0) goto L_0x0175
            goto L_0x0144
        L_0x0139:
            android.net.Uri r3 = r8.mo84695m()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0144
            goto L_0x0175
        L_0x0144:
            com.google.common.base.ax r1 = r7.f253175A
            com.google.common.base.ax r3 = r8.mo84699q()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0175
            com.google.common.base.ax r1 = r7.f253176B
            com.google.common.base.ax r3 = r8.mo84704u()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0175
            com.google.common.base.ax r1 = r7.f253177C
            com.google.common.base.ax r3 = r8.mo84701s()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0175
            com.google.common.base.ax r1 = r7.f253178D
            com.google.common.base.ax r8 = r8.mo84702t()
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L_0x0175
            return r0
        L_0x0175:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.speech.hotword.AutoValue_HotwordResult.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final int mo84687f() {
        return this.f253190l;
    }

    /* renamed from: g */
    public final int mo84688g() {
        return this.f253200v;
    }

    /* renamed from: h */
    public final int mo84689h() {
        return this.f253193o;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 1237;
        int hashCode = (((((((((this.f253179a ^ 1000003) * 1000003) ^ this.f253180b.hashCode()) * 1000003) ^ (true != this.f253181c ? 1237 : 1231)) * 1000003) ^ (true != this.f253182d ? 1237 : 1231)) * 1000003) ^ Float.floatToIntBits(this.f253183e)) * 1000003;
        String str = this.f253184f;
        int i5 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int floatToIntBits = (((((((((((((((((((((((((hashCode ^ i) * 1000003) ^ Float.floatToIntBits(this.f253185g)) * 1000003) ^ Float.floatToIntBits(this.f253186h)) * 1000003) ^ Float.floatToIntBits(this.f253187i)) * 1000003) ^ this.f253188j.hashCode()) * 1000003) ^ this.f253189k) * 1000003) ^ this.f253190l) * 1000003) ^ this.f253191m.hashCode()) * 1000003) ^ this.f253192n) * 1000003) ^ this.f253193o) * 1000003) ^ this.f253194p.hashCode()) * 1000003) ^ (true != this.f253195q ? 1237 : 1231)) * 1000003) ^ (true != this.f253196r ? 1237 : 1231)) * 1000003;
        SpeakerIdModel speakerIdModel = this.f253197s;
        if (speakerIdModel == null) {
            i2 = 0;
        } else {
            i2 = speakerIdModel.hashCode();
        }
        int i6 = (((floatToIntBits ^ i2) * 1000003) ^ (true != this.f253198t ? 1237 : 1231)) * 1000003;
        String str2 = this.f253199u;
        if (str2 == null) {
            i3 = 0;
        } else {
            i3 = str2.hashCode();
        }
        int i7 = (((i6 ^ i3) * 1000003) ^ this.f253200v) * 1000003;
        if (true == this.f253201w) {
            i4 = 1231;
        }
        long j = this.f253202x;
        long j2 = this.f253203y;
        int i8 = (((((i7 ^ i4) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        Uri uri = this.f253204z;
        if (uri != null) {
            i5 = uri.hashCode();
        }
        return ((((((((i8 ^ i5) * 1000003) ^ this.f253175A.hashCode()) * 1000003) ^ this.f253176B.hashCode()) * 1000003) ^ this.f253177C.hashCode()) * 1000003) ^ this.f253178D.hashCode();
    }

    /* renamed from: i */
    public final int mo84691i() {
        return this.f253192n;
    }

    /* renamed from: j */
    public final int mo84692j() {
        return this.f253179a;
    }

    /* renamed from: k */
    public final long mo84693k() {
        return this.f253203y;
    }

    /* renamed from: l */
    public final long mo84694l() {
        return this.f253202x;
    }

    /* renamed from: m */
    public final Uri mo84695m() {
        return this.f253204z;
    }

    /* renamed from: n */
    public final C90599p mo84696n() {
        return new C90578a(this);
    }

    /* renamed from: o */
    public final SpeakerIdModel mo84697o() {
        return this.f253197s;
    }

    /* renamed from: p */
    public final C58833ax mo84698p() {
        return this.f253188j;
    }

    /* renamed from: q */
    public final C58833ax mo84699q() {
        return this.f253175A;
    }

    /* renamed from: r */
    public final C58833ax mo84700r() {
        return this.f253191m;
    }

    /* renamed from: s */
    public final C58833ax mo84701s() {
        return this.f253177C;
    }

    /* renamed from: t */
    public final C58833ax mo84702t() {
        return this.f253178D;
    }

    public final String toString() {
        int i = this.f253179a;
        String num = Integer.toString(this.f253180b.f181272r);
        boolean z = this.f253181c;
        boolean z2 = this.f253182d;
        float f = this.f253183e;
        String str = this.f253184f;
        float f2 = this.f253185g;
        float f3 = this.f253186h;
        float f4 = this.f253187i;
        String valueOf = String.valueOf(this.f253188j);
        int i2 = this.f253189k;
        int i3 = this.f253190l;
        String valueOf2 = String.valueOf(this.f253191m);
        int i4 = this.f253192n;
        int i5 = this.f253193o;
        String num2 = Integer.toString(this.f253194p.f182718e);
        boolean z3 = this.f253195q;
        boolean z4 = this.f253196r;
        String valueOf3 = String.valueOf(this.f253197s);
        boolean z5 = this.f253198t;
        String str2 = this.f253199u;
        int i6 = this.f253200v;
        int i7 = i4;
        boolean z6 = this.f253201w;
        long j = this.f253202x;
        long j2 = this.f253203y;
        String valueOf4 = String.valueOf(this.f253204z);
        String valueOf5 = String.valueOf(this.f253175A);
        String valueOf6 = String.valueOf(this.f253176B);
        String valueOf7 = String.valueOf(this.f253177C);
        return "HotwordResult{speakerMode=" + i + ", deviceType=" + num + ", speakerTriggered=" + z + ", speakerUnlocked=" + z2 + ", softwareHotwordScore=" + f + ", hotwordModelIdentifier=" + str + ", speakerScore=" + f2 + ", hotwordPower=" + f3 + ", backgroundPower=" + f4 + ", audio=" + valueOf + ", channelCount=" + i2 + ", encodingFormat=" + i3 + ", channelTriggeringInformation=" + valueOf2 + ", sampleRate=" + i7 + ", maxAllowedImposterAttempts=" + i5 + ", alwaysOnHotwordDetectorType=" + num2 + ", dspHotwordTriggered=" + z3 + ", softwareHotwordTriggered=" + z4 + ", speakerIdModel=" + valueOf3 + ", lowThresholdHotwordTriggered=" + z5 + ", hotwordPhrase=" + str2 + ", hotwordTriggeredBufferPosition=" + i6 + ", shouldAdapt=" + z6 + ", lastMissedHotwordTimeStamp=" + j + ", dspHotwordTriggeredTimestamp=" + j2 + ", uri=" + valueOf4 + ", channelConfig=" + valueOf5 + ", seamlessToken=" + valueOf6 + ", invocationToken=" + valueOf7 + ", rohanToken=" + String.valueOf(this.f253178D) + "}";
    }

    /* renamed from: u */
    public final C58833ax mo84704u() {
        return this.f253176B;
    }

    /* renamed from: v */
    public final C66626cx mo84705v() {
        return this.f253180b;
    }

    /* renamed from: w */
    public final C67229g mo84706w() {
        return this.f253194p;
    }

    /* renamed from: x */
    public final String mo84707x() {
        return this.f253184f;
    }

    /* renamed from: y */
    public final String mo84708y() {
        return this.f253199u;
    }

    /* renamed from: z */
    public final boolean mo84709z() {
        return this.f253201w;
    }
}
