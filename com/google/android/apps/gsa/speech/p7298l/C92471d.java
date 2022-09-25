package com.google.android.apps.gsa.speech.p7298l;

import android.net.Uri;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90582d;
import com.google.android.apps.gsa.speech.p7261a.p7262a.C92137d;
import com.google.speech.p5224k.p5225a.C67242t;
import com.google.speech.recognizer.p5233a.C67451at;
import java.util.Arrays;

/* renamed from: com.google.android.apps.gsa.speech.l.d */
/* compiled from: PG */
final class C92471d extends C92460b {

    /* renamed from: A */
    public final boolean f257933A;

    /* renamed from: B */
    public final int f257934B;

    /* renamed from: C */
    public final int f257935C;

    /* renamed from: a */
    public final boolean f257936a;

    /* renamed from: b */
    public final boolean f257937b;

    /* renamed from: c */
    public final boolean f257938c;

    /* renamed from: d */
    public final boolean f257939d;

    /* renamed from: e */
    public final boolean f257940e;

    /* renamed from: f */
    public final C67451at f257941f;

    /* renamed from: g */
    public final C67451at f257942g;

    /* renamed from: h */
    public final C67242t f257943h;

    /* renamed from: i */
    public final int f257944i;

    /* renamed from: j */
    public final int f257945j;

    /* renamed from: k */
    public final int f257946k;

    /* renamed from: l */
    public final boolean f257947l;

    /* renamed from: m */
    public final Uri f257948m;

    /* renamed from: n */
    public final byte[] f257949n;

    /* renamed from: o */
    public final byte[] f257950o;

    /* renamed from: p */
    public final int f257951p;

    /* renamed from: q */
    public final boolean f257952q;

    /* renamed from: r */
    public final C92137d f257953r;

    /* renamed from: s */
    public final long f257954s;

    /* renamed from: t */
    public final long f257955t;

    /* renamed from: u */
    public final boolean f257956u;

    /* renamed from: v */
    public final boolean f257957v;

    /* renamed from: w */
    public final boolean f257958w;

    /* renamed from: x */
    public final C90582d f257959x;

    /* renamed from: y */
    public final boolean f257960y;

    /* renamed from: z */
    public final boolean f257961z;

    public C92471d(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, C67451at atVar, C67451at atVar2, C67242t tVar, int i, int i2, int i3, boolean z6, Uri uri, byte[] bArr, byte[] bArr2, int i4, boolean z7, C92137d dVar, long j, long j2, boolean z8, boolean z9, int i5, boolean z10, C90582d dVar2, boolean z11, boolean z12, boolean z13, int i6) {
        this.f257936a = z;
        this.f257937b = z2;
        this.f257938c = z3;
        this.f257939d = z4;
        this.f257940e = z5;
        this.f257941f = atVar;
        this.f257942g = atVar2;
        this.f257943h = tVar;
        this.f257944i = i;
        this.f257945j = i2;
        this.f257946k = i3;
        this.f257947l = z6;
        this.f257948m = uri;
        this.f257949n = bArr;
        this.f257950o = bArr2;
        this.f257951p = i4;
        this.f257952q = z7;
        this.f257953r = dVar;
        this.f257954s = j;
        this.f257955t = j2;
        this.f257956u = z8;
        this.f257957v = z9;
        this.f257935C = i5;
        this.f257958w = z10;
        this.f257959x = dVar2;
        this.f257960y = z11;
        this.f257961z = z12;
        this.f257933A = z13;
        this.f257934B = i6;
    }

    /* renamed from: A */
    public final boolean mo87183A() {
        return this.f257960y;
    }

    /* renamed from: B */
    public final boolean mo87184B() {
        return this.f257957v;
    }

    /* renamed from: C */
    public final boolean mo87185C() {
        return this.f257939d;
    }

    /* renamed from: D */
    public final boolean mo87186D() {
        return this.f257956u;
    }

    /* renamed from: E */
    public final byte[] mo87187E() {
        return this.f257949n;
    }

    /* renamed from: F */
    public final byte[] mo87188F() {
        return this.f257950o;
    }

    /* renamed from: G */
    public final int mo87189G() {
        return this.f257935C;
    }

    /* renamed from: a */
    public final int mo87190a() {
        return this.f257944i;
    }

    /* renamed from: b */
    public final int mo87191b() {
        return 0;
    }

    /* renamed from: c */
    public final int mo87192c() {
        return this.f257951p;
    }

    /* renamed from: d */
    public final int mo87193d() {
        return this.f257946k;
    }

    /* renamed from: e */
    public final int mo87194e() {
        return this.f257934B;
    }

    public final boolean equals(Object obj) {
        Uri uri;
        C90582d dVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C92460b) {
            C92460b bVar = (C92460b) obj;
            if (this.f257936a == bVar.mo87209u() && this.f257937b == bVar.mo87210v() && this.f257938c == bVar.mo87212x() && this.f257939d == bVar.mo87185C() && this.f257940e == bVar.mo87213y() && this.f257941f.equals(bVar.mo87202n()) && this.f257942g.equals(bVar.mo87203o()) && this.f257943h.equals(bVar.mo87204p()) && this.f257944i == bVar.mo87190a() && bVar.mo87191b() == 0 && this.f257945j == bVar.mo87195f() && this.f257946k == bVar.mo87193d() && this.f257947l == bVar.mo87214z() && ((uri = this.f257948m) != null ? uri.equals(bVar.mo87198i()) : bVar.mo87198i() == null)) {
                boolean z = bVar instanceof C92471d;
                if (Arrays.equals(this.f257949n, z ? ((C92471d) bVar).f257949n : bVar.mo87187E())) {
                    return Arrays.equals(this.f257950o, z ? ((C92471d) bVar).f257950o : bVar.mo87188F()) && this.f257951p == bVar.mo87192c() && this.f257952q == bVar.mo87208t() && !bVar.mo87207s() && this.f257953r.equals(bVar.mo87200k()) && this.f257954s == bVar.mo87196g() && this.f257955t == bVar.mo87197h() && this.f257956u == bVar.mo87186D() && this.f257957v == bVar.mo87184B() && this.f257935C == bVar.mo87189G() && this.f257958w == bVar.mo87205q() && ((dVar = this.f257959x) != null ? dVar.equals(bVar.mo87199j()) : bVar.mo87199j() == null) && this.f257960y == bVar.mo87183A() && this.f257961z == bVar.mo87206r() && this.f257933A == bVar.mo87211w() && this.f257934B == bVar.mo87194e();
                }
            }
        }
    }

    /* renamed from: f */
    public final int mo87195f() {
        return this.f257945j;
    }

    /* renamed from: g */
    public final long mo87196g() {
        return this.f257954s;
    }

    /* renamed from: h */
    public final long mo87197h() {
        return this.f257955t;
    }

    public final int hashCode() {
        int i;
        int i2 = 1231;
        int hashCode = ((((((((((((((((((((((((true != this.f257936a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.f257937b ? 1237 : 1231)) * 1000003) ^ (true != this.f257938c ? 1237 : 1231)) * 1000003) ^ (true != this.f257939d ? 1237 : 1231)) * 1000003) ^ (true != this.f257940e ? 1237 : 1231)) * 1000003) ^ this.f257941f.hashCode()) * 1000003) ^ this.f257942g.hashCode()) * 1000003) ^ this.f257943h.hashCode()) * 1000003) ^ this.f257944i) * -721379959) ^ this.f257945j) * 1000003) ^ this.f257946k) * 1000003) ^ (true != this.f257947l ? 1237 : 1231)) * 1000003;
        Uri uri = this.f257948m;
        int i3 = 0;
        if (uri == null) {
            i = 0;
        } else {
            i = uri.hashCode();
        }
        int hashCode2 = (((((((hashCode ^ i) * 1000003) ^ Arrays.hashCode(this.f257949n)) * 1000003) ^ Arrays.hashCode(this.f257950o)) * 1000003) ^ this.f257951p) * 1000003;
        int i4 = true != this.f257952q ? 1237 : 1231;
        int hashCode3 = this.f257953r.hashCode();
        long j = this.f257954s;
        long j2 = this.f257955t;
        int i5 = (((((((((((((((((hashCode2 ^ i4) * 1000003) ^ 1237) * 1000003) ^ hashCode3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ (true != this.f257956u ? 1237 : 1231)) * 1000003) ^ (true != this.f257957v ? 1237 : 1231)) * 1000003) ^ this.f257935C) * 1000003) ^ (true != this.f257958w ? 1237 : 1231)) * 1000003;
        C90582d dVar = this.f257959x;
        if (dVar != null) {
            i3 = dVar.hashCode();
        }
        int i6 = (((((i5 ^ i3) * 1000003) ^ (true != this.f257960y ? 1237 : 1231)) * 1000003) ^ (true != this.f257961z ? 1237 : 1231)) * 1000003;
        if (true != this.f257933A) {
            i2 = 1237;
        }
        return ((i6 ^ i2) * 1000003) ^ this.f257934B;
    }

    /* renamed from: i */
    public final Uri mo87198i() {
        return this.f257948m;
    }

    /* renamed from: j */
    public final C90582d mo87199j() {
        return this.f257959x;
    }

    /* renamed from: k */
    public final C92137d mo87200k() {
        return this.f257953r;
    }

    /* renamed from: m */
    public final C92456a mo87201m() {
        return new C92462c(this);
    }

    /* renamed from: n */
    public final C67451at mo87202n() {
        return this.f257941f;
    }

    /* renamed from: o */
    public final C67451at mo87203o() {
        return this.f257942g;
    }

    /* renamed from: p */
    public final C67242t mo87204p() {
        return this.f257943h;
    }

    /* renamed from: q */
    public final boolean mo87205q() {
        return this.f257958w;
    }

    /* renamed from: r */
    public final boolean mo87206r() {
        return this.f257961z;
    }

    /* renamed from: s */
    public final boolean mo87207s() {
        return false;
    }

    /* renamed from: t */
    public final boolean mo87208t() {
        return this.f257952q;
    }

    public final String toString() {
        boolean z = this.f257936a;
        boolean z2 = this.f257937b;
        boolean z3 = this.f257938c;
        boolean z4 = this.f257939d;
        boolean z5 = this.f257940e;
        String num = Integer.toString(this.f257941f.f183321p);
        String num2 = Integer.toString(this.f257942g.f183321p);
        String num3 = Integer.toString(this.f257943h.f182766u);
        int i = this.f257944i;
        int i2 = this.f257945j;
        int i3 = this.f257946k;
        boolean z6 = this.f257947l;
        String valueOf = String.valueOf(this.f257948m);
        String arrays = Arrays.toString(this.f257949n);
        String arrays2 = Arrays.toString(this.f257950o);
        int i4 = this.f257951p;
        boolean z7 = this.f257952q;
        String str = arrays;
        String obj = this.f257953r.toString();
        long j = this.f257954s;
        long j2 = this.f257955t;
        boolean z8 = this.f257956u;
        boolean z9 = this.f257957v;
        String num4 = Integer.toString(this.f257935C - 1);
        boolean z10 = this.f257958w;
        String valueOf2 = String.valueOf(this.f257959x);
        boolean z11 = this.f257960y;
        boolean z12 = this.f257961z;
        boolean z13 = this.f257933A;
        return "AudioInputParams{noiseSuppressionEnabled=" + z + ", playBeepEnabled=" + z2 + ", reportSoundLevels=" + z3 + ", usePreemptibleAudioSource=" + z4 + ", requestAudioFocus=" + z5 + ", encoding=" + num + ", preambleEncoding=" + num2 + ", preambleType=" + num3 + ", channelConfig=" + i + ", mainChannel=0, samplingRateHz=" + i2 + ", preambleSamplingRateHz=" + i3 + ", seamlessEnabled=" + z6 + ", audioSourceUri=" + valueOf + ", audio=" + str + ", preambleAudio=" + arrays2 + ", preambleChannelCount=" + i4 + ", isFromOpa=" + z7 + ", downsamplingEnabled=false, bargeInParams=" + obj + ", queryCommitId=" + j + ", queryRequestId=" + j2 + ", usePreviousAudioSource=" + z8 + ", useCurrentAudioSource=" + z9 + ", microphoneType=" + num4 + ", canUseHapticFeedback=" + z10 + ", hotwordSpec=" + valueOf2 + ", speakerIdAdaptationEnabled=" + z11 + ", dontAllowMultiRecognitionsOnAudioStopped=" + z12 + ", recordedAudioFromInteractor=" + z13 + ", preferredAsrAudioChannel=" + this.f257934B + "}";
    }

    /* renamed from: u */
    public final boolean mo87209u() {
        return this.f257936a;
    }

    /* renamed from: v */
    public final boolean mo87210v() {
        return this.f257937b;
    }

    /* renamed from: w */
    public final boolean mo87211w() {
        return this.f257933A;
    }

    /* renamed from: x */
    public final boolean mo87212x() {
        return this.f257938c;
    }

    /* renamed from: y */
    public final boolean mo87213y() {
        return this.f257940e;
    }

    /* renamed from: z */
    public final boolean mo87214z() {
        return this.f257947l;
    }
}
