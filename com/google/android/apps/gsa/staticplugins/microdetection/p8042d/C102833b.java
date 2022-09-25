package com.google.android.apps.gsa.staticplugins.microdetection.p8042d;

import com.google.android.apps.gsa.shared.speech.p7142d.C90536a;
import com.google.android.apps.gsa.speech.audio.C92157ac;
import com.google.android.apps.gsa.speech.p7269b.C92216a;
import com.google.common.base.C58833ax;
import com.google.speech.micro.GoogleHotwordData;
import java.util.Arrays;

/* renamed from: com.google.android.apps.gsa.staticplugins.microdetection.d.b */
/* compiled from: PG */
final class C102833b extends C102844m {

    /* renamed from: a */
    private final C92216a f287162a;

    /* renamed from: b */
    private final GoogleHotwordData f287163b;

    /* renamed from: c */
    private final C90536a f287164c;

    /* renamed from: d */
    private final String f287165d;

    /* renamed from: e */
    private final int f287166e;

    /* renamed from: f */
    private final int f287167f;

    /* renamed from: g */
    private final int f287168g;

    /* renamed from: h */
    private final boolean f287169h;

    /* renamed from: i */
    private final boolean f287170i;

    /* renamed from: j */
    private final String f287171j;

    /* renamed from: k */
    private final byte[] f287172k;

    /* renamed from: l */
    private final C92157ac f287173l;

    /* renamed from: m */
    private final boolean f287174m;

    /* renamed from: n */
    private final boolean f287175n;

    /* renamed from: o */
    private final boolean f287176o;

    /* renamed from: p */
    private final C58833ax f287177p;

    public C102833b(C92216a aVar, GoogleHotwordData googleHotwordData, C90536a aVar2, String str, int i, int i2, int i3, boolean z, boolean z2, String str2, byte[] bArr, C92157ac acVar, boolean z3, boolean z4, boolean z5, C58833ax axVar) {
        this.f287162a = aVar;
        this.f287163b = googleHotwordData;
        this.f287164c = aVar2;
        this.f287165d = str;
        this.f287166e = i;
        this.f287167f = i2;
        this.f287168g = i3;
        this.f287169h = z;
        this.f287170i = z2;
        this.f287171j = str2;
        this.f287172k = bArr;
        this.f287173l = acVar;
        this.f287174m = z3;
        this.f287175n = z4;
        this.f287176o = z5;
        this.f287177p = axVar;
    }

    /* renamed from: a */
    public final int mo93482a() {
        return this.f287167f;
    }

    /* renamed from: b */
    public final int mo93483b() {
        return this.f287166e;
    }

    /* renamed from: c */
    public final int mo93484c() {
        return this.f287168g;
    }

    /* renamed from: d */
    public final C90536a mo93485d() {
        return this.f287164c;
    }

    /* renamed from: e */
    public final C92157ac mo93486e() {
        return this.f287173l;
    }

    public final boolean equals(Object obj) {
        String str;
        C92157ac acVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C102844m) {
            C102844m mVar = (C102844m) obj;
            if (this.f287162a.equals(mVar.mo93488f()) && this.f287163b.equals(mVar.mo93490h()) && this.f287164c.equals(mVar.mo93485d()) && this.f287165d.equals(mVar.mo93493j()) && this.f287166e == mVar.mo93483b() && this.f287167f == mVar.mo93482a() && this.f287168g == mVar.mo93484c() && this.f287169h == mVar.mo93497n() && this.f287170i == mVar.mo93494k() && ((str = this.f287171j) != null ? str.equals(mVar.mo93492i()) : mVar.mo93492i() == null)) {
                return Arrays.equals(this.f287172k, mVar instanceof C102833b ? ((C102833b) mVar).f287172k : mVar.mo93499p()) && ((acVar = this.f287173l) != null ? acVar.equals(mVar.mo93486e()) : mVar.mo93486e() == null) && this.f287174m == mVar.mo93498o() && this.f287175n == mVar.mo93496m() && this.f287176o == mVar.mo93495l() && this.f287177p.equals(mVar.mo93489g());
            }
        }
    }

    /* renamed from: f */
    public final C92216a mo93488f() {
        return this.f287162a;
    }

    /* renamed from: g */
    public final C58833ax mo93489g() {
        return this.f287177p;
    }

    /* renamed from: h */
    public final GoogleHotwordData mo93490h() {
        return this.f287163b;
    }

    public final int hashCode() {
        int i;
        int i2 = 1237;
        int hashCode = (((((((((((((((((this.f287162a.hashCode() ^ 1000003) * 1000003) ^ this.f287163b.hashCode()) * 1000003) ^ this.f287164c.hashCode()) * 1000003) ^ this.f287165d.hashCode()) * 1000003) ^ this.f287166e) * 1000003) ^ this.f287167f) * 1000003) ^ this.f287168g) * 1000003) ^ (true != this.f287169h ? 1237 : 1231)) * 1000003) ^ (true != this.f287170i ? 1237 : 1231)) * 1000003;
        String str = this.f287171j;
        int i3 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int hashCode2 = (((hashCode ^ i) * 1000003) ^ Arrays.hashCode(this.f287172k)) * 1000003;
        C92157ac acVar = this.f287173l;
        if (acVar != null) {
            i3 = acVar.hashCode();
        }
        int i4 = (((((hashCode2 ^ i3) * 1000003) ^ (true != this.f287174m ? 1237 : 1231)) * 1000003) ^ (true != this.f287175n ? 1237 : 1231)) * 1000003;
        if (true == this.f287176o) {
            i2 = 1231;
        }
        return ((i4 ^ i2) * 1000003) ^ this.f287177p.hashCode();
    }

    /* renamed from: i */
    public final String mo93492i() {
        return this.f287171j;
    }

    /* renamed from: j */
    public final String mo93493j() {
        return this.f287165d;
    }

    /* renamed from: k */
    public final boolean mo93494k() {
        return this.f287170i;
    }

    /* renamed from: l */
    public final boolean mo93495l() {
        return this.f287176o;
    }

    /* renamed from: m */
    public final boolean mo93496m() {
        return this.f287175n;
    }

    /* renamed from: n */
    public final boolean mo93497n() {
        return this.f287169h;
    }

    /* renamed from: o */
    public final boolean mo93498o() {
        return this.f287174m;
    }

    /* renamed from: p */
    public final byte[] mo93499p() {
        return this.f287172k;
    }

    public final String toString() {
        String obj = this.f287162a.toString();
        String obj2 = this.f287163b.toString();
        String obj3 = this.f287164c.toString();
        String str = this.f287165d;
        int i = this.f287166e;
        int i2 = this.f287167f;
        int i3 = this.f287168g;
        boolean z = this.f287169h;
        boolean z2 = this.f287170i;
        String str2 = this.f287171j;
        String arrays = Arrays.toString(this.f287172k);
        String valueOf = String.valueOf(this.f287173l);
        boolean z3 = this.f287174m;
        boolean z4 = this.f287175n;
        boolean z5 = this.f287176o;
        return "Params{recognitionEngineCallback=" + obj + ", googleHotwordData=" + obj2 + ", recognitionMode=" + obj3 + ", locale=" + str + ", sampleRateHz=" + i + ", channelCount=" + i2 + ", speakerMode=" + i3 + ", shouldRunBargeIn=" + z + ", isDspBased=" + z2 + ", account=" + str2 + ", encodedTTSAudio=" + arrays + ", speechLevelGenerator=" + valueOf + ", speakerIdAdaptationEnabled=" + z3 + ", shouldGenerateNewModel=" + z4 + ", isGearheadSession=" + z5 + ", audioListeningSessionAdapterOptional=" + String.valueOf(this.f287177p) + "}";
    }
}
