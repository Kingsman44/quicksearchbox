package com.google.ads.interactivemedia.p367v3.internal;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ij */
/* compiled from: PG */
public final class C7011ij extends C7226qi implements adw {

    /* renamed from: b */
    private final Context f22414b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C6982hh f22415c;

    /* renamed from: d */
    private final C6988hn f22416d;

    /* renamed from: e */
    private int f22417e;

    /* renamed from: f */
    private boolean f22418f;

    /* renamed from: g */
    private boolean f22419g;

    /* renamed from: h */
    private C6864cy f22420h;

    /* renamed from: i */
    private long f22421i;

    /* renamed from: j */
    private boolean f22422j;

    /* renamed from: k */
    private boolean f22423k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C6896ec f22424l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7011ij(Context context, C7228qk qkVar, Handler handler, C6983hi hiVar) {
        super(1, qkVar, 44100.0f);
        C7006ie ieVar = new C7006ie((C6967gt) null, new C6998hx(new C6971gx[0]));
        this.f22414b = context.getApplicationContext();
        this.f22416d = ieVar;
        this.f22415c = new C6982hh(handler, hiVar);
        ieVar.mo15931a(new C7010ii(this));
    }

    /* renamed from: aB */
    private final int m20730aB(C7224qg qgVar, C6864cy cyVar) {
        if (!"OMX.google.raw.decoder".equals(qgVar.f23577a) || aeu.f20466a >= 24 || (aeu.f20466a == 23 && aeu.m18516ag(this.f22414b))) {
            return cyVar.f21813m;
        }
        return -1;
    }

    /* renamed from: aC */
    private final void m20731aC() {
        long d = this.f22416d.mo15934d(mo15783N());
        if (d != Long.MIN_VALUE) {
            if (!this.f22423k) {
                d = Math.max(this.f22421i, d);
            }
            this.f22421i = d;
            this.f22423k = false;
        }
    }

    /* renamed from: K */
    public final String mo14620K() {
        return "MediaCodecAudioRenderer";
    }

    /* renamed from: M */
    public final boolean mo14621M() {
        return this.f22416d.mo15940j() || super.mo14621M();
    }

    /* renamed from: N */
    public final boolean mo15783N() {
        return super.mo15783N() && this.f22416d.mo15939i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public final int mo14622P(C7228qk qkVar, C6864cy cyVar) {
        if (!adz.m18349a(cyVar.f21812l)) {
            return 0;
        }
        int i = aeu.f20466a >= 21 ? 32 : 0;
        Class cls = cyVar.f21799E;
        boolean aA = m21572aA(cyVar);
        if (aA && this.f22416d.mo15932b(cyVar) && (cls == null || C7239qv.m21657a() != null)) {
            return i | 12;
        }
        if (("audio/raw".equals(cyVar.f21812l) && !this.f22416d.mo15932b(cyVar)) || !this.f22416d.mo15932b(aeu.m18504V(2, cyVar.f21825y, cyVar.f21826z))) {
            return 1;
        }
        List Q = mo14623Q(qkVar, cyVar, false);
        if (Q.isEmpty()) {
            return 1;
        }
        if (!aA) {
            return 2;
        }
        C7224qg qgVar = (C7224qg) Q.get(0);
        boolean c = qgVar.mo16308c(cyVar);
        int i2 = 8;
        if (c && qgVar.mo16309d(cyVar)) {
            i2 = 16;
        }
        return (true != c ? 3 : 4) | i2 | i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public final List mo14623Q(C7228qk qkVar, C6864cy cyVar, boolean z) {
        C7224qg a;
        String str = cyVar.f21812l;
        if (str == null) {
            return Collections.emptyList();
        }
        if (this.f22416d.mo15932b(cyVar) && (a = C7239qv.m21657a()) != null) {
            return Collections.singletonList(a);
        }
        List c = C7239qv.m21659c(qkVar.mo16329a(str, z, false), cyVar);
        if ("audio/eac3-joc".equals(str)) {
            ArrayList arrayList = new ArrayList(c);
            arrayList.addAll(qkVar.mo16329a("audio/eac3", z, false));
            c = arrayList;
        }
        return Collections.unmodifiableList(c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public final boolean mo16013R(C6864cy cyVar) {
        return this.f22416d.mo15932b(cyVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public final void mo14624S(C7224qg qgVar, C7222qe qeVar, C6864cy cyVar, MediaCrypto mediaCrypto, float f) {
        C6864cy[] B = mo15501B();
        int aB = m20730aB(qgVar, cyVar);
        if (r2 != 1) {
            for (C6864cy cyVar2 : B) {
                if (qgVar.mo16310e(cyVar, cyVar2, false)) {
                    aB = Math.max(aB, m20730aB(qgVar, cyVar2));
                }
            }
        }
        this.f22417e = aB;
        this.f22418f = aeu.f20466a < 24 && "OMX.SEC.aac.dec".equals(qgVar.f23577a) && "samsung".equals(aeu.f20468c) && (aeu.f20467b.startsWith("zeroflte") || aeu.f20467b.startsWith("herolte") || aeu.f20467b.startsWith("heroqlte"));
        this.f22419g = aeu.f20466a < 21 && "OMX.SEC.mp3.dec".equals(qgVar.f23577a) && "samsung".equals(aeu.f20468c) && (aeu.f20467b.startsWith("baffin") || aeu.f20467b.startsWith("grand") || aeu.f20467b.startsWith("fortuna") || aeu.f20467b.startsWith("gprimelte") || aeu.f20467b.startsWith("j2y18lte") || aeu.f20467b.startsWith("ms01"));
        String str = qgVar.f23579c;
        int i = this.f22417e;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", cyVar.f21825y);
        mediaFormat.setInteger("sample-rate", cyVar.f21826z);
        C7135mz.m21201d(mediaFormat, cyVar.f21814n);
        C7135mz.m21202e(mediaFormat, "max-input-size", i);
        if (aeu.f20466a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f && (aeu.f20466a != 23 || (!"ZTE B2017G".equals(aeu.f20469d) && !"AXON 7 mini".equals(aeu.f20469d)))) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (aeu.f20466a <= 28 && "audio/ac4".equals(cyVar.f21812l)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (aeu.f20466a >= 24 && this.f22416d.mo15933c(aeu.m18504V(4, cyVar.f21825y, cyVar.f21826z)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        qeVar.mo16304g(mediaFormat, (Surface) null, mediaCrypto);
        if (!"audio/raw".equals(qgVar.f23578b) || "audio/raw".equals(cyVar.f21812l)) {
            cyVar = null;
        }
        this.f22420h = cyVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public final void mo14625T(String str, long j, long j2) {
        this.f22415c.mo15911b(str, j, j2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: U */
    public final void mo14626U(C6865cz czVar) {
        super.mo14626U(czVar);
        this.f22415c.mo15912c(czVar.f21827a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: W */
    public final void mo16014W() {
        this.f22423k = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: X */
    public final void mo14629X(C7024iw iwVar) {
        if (this.f22422j && !iwVar.mo16031b()) {
            if (Math.abs(iwVar.f22517d - this.f22421i) > 500000) {
                this.f22421i = iwVar.f22517d;
            }
            this.f22422j = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y */
    public final void mo14630Y() {
        this.f22416d.mo15936f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z */
    public final boolean mo14631Z(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C6864cy cyVar) {
        ary.m19467t(byteBuffer);
        if (mediaCodec != null && this.f22419g && j3 == 0) {
            j3 = ((i2 & 4) == 0 || mo16327ay() == -9223372036854775807L) ? 0 : mo16327ay();
        }
        if (this.f22420h != null && (i2 & 2) != 0) {
            ary.m19467t(mediaCodec);
            mediaCodec.releaseOutputBuffer(i, false);
            return true;
        } else if (z) {
            if (mediaCodec != null) {
                mediaCodec.releaseOutputBuffer(i, false);
            }
            this.f23615a.f22508f += i3;
            this.f22416d.mo15936f();
            return true;
        } else {
            try {
                if (!this.f22416d.mo15937g(byteBuffer, j3, i3)) {
                    return false;
                }
                if (mediaCodec != null) {
                    mediaCodec.releaseOutputBuffer(i, false);
                }
                this.f23615a.f22507e += i3;
                return true;
            } catch (C6985hk e) {
                throw mo15504E(e, cyVar, e.f22266a);
            } catch (C6987hm e2) {
                throw mo15504E(e2, cyVar, e2.f22267a);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: aa */
    public final void mo16015aa() {
        try {
            this.f22416d.mo15938h();
        } catch (C6987hm e) {
            C6864cy al = mo16318al();
            if (al == null) {
                al = mo16317ak();
            }
            throw mo15504E(e, al, e.f22267a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: ad */
    public final int mo14638ad(C7224qg qgVar, C6864cy cyVar, C6864cy cyVar2) {
        if (m20730aB(qgVar, cyVar2) > this.f22417e) {
            return 0;
        }
        if (!qgVar.mo16310e(cyVar, cyVar2, true)) {
            return (!aeu.m18533c(cyVar.f21812l, cyVar2.f21812l) || cyVar.f21825y != cyVar2.f21825y || cyVar.f21826z != cyVar2.f21826z || cyVar.f21795A != cyVar2.f21795A || !cyVar.mo15641e(cyVar2) || "audio/opus".equals(cyVar.f21812l)) ? 0 : 1;
        }
        return 3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ae */
    public final float mo14639ae(float f, C6864cy[] cyVarArr) {
        int i = -1;
        for (C6864cy cyVar : cyVarArr) {
            int i2 = cyVar.f21826z;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return ((float) i) * f;
    }

    /* renamed from: d */
    public final adw mo15515d() {
        return this;
    }

    /* renamed from: g */
    public final long mo14520g() {
        if (mo15516e() == 2) {
            m20731aC();
        }
        return this.f22421i;
    }

    /* renamed from: h */
    public final void mo14521h(C6888dv dvVar) {
        this.f22416d.mo15941k(dvVar);
    }

    /* renamed from: i */
    public final C6888dv mo14522i() {
        return this.f22416d.mo15942l();
    }

    /* renamed from: t */
    public final void mo14646t(int i, Object obj) {
        if (i == 2) {
            this.f22416d.mo15949s(((Float) obj).floatValue());
        } else if (i == 3) {
            this.f22416d.mo15944n((C6966gs) obj);
        } else if (i != 5) {
            switch (i) {
                case 101:
                    this.f22416d.mo15943m(((Boolean) obj).booleanValue());
                    return;
                case 102:
                    this.f22416d.mo15945o(((Integer) obj).intValue());
                    return;
                case 103:
                    this.f22424l = (C6896ec) obj;
                    return;
                default:
                    return;
            }
        } else {
            this.f22416d.mo15946p((C6993hs) obj);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo14647u(boolean z, boolean z2) {
        super.mo14647u(z, z2);
        this.f22415c.mo15910a(this.f23615a);
        int i = mo15502C().f21968b;
        if (i != 0) {
            this.f22416d.mo15947q(i);
        } else {
            this.f22416d.mo15948r();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final void mo14648v(long j, boolean z) {
        super.mo14648v(j, z);
        this.f22416d.mo15951u();
        this.f22421i = j;
        this.f22422j = true;
        this.f22423k = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final void mo14649w() {
        this.f22416d.mo15935e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final void mo14650x() {
        m20731aC();
        this.f22416d.mo15950t();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final void mo14651y() {
        try {
            this.f22416d.mo15951u();
            try {
                super.mo14651y();
            } finally {
                this.f22415c.mo15915f(this.f23615a);
            }
        } catch (Throwable th) {
            super.mo14651y();
            throw th;
        } finally {
            this.f22415c.mo15915f(this.f23615a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final void mo14652z() {
        try {
            super.mo14652z();
        } finally {
            this.f22416d.mo15952v();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public final void mo14627V(C6864cy cyVar, MediaFormat mediaFormat) {
        int i;
        int i2;
        C6864cy cyVar2 = this.f22420h;
        int[] iArr = null;
        if (cyVar2 == null) {
            if (mo16319am() == null) {
                cyVar2 = cyVar;
            } else {
                if ("audio/raw".equals(cyVar.f21812l)) {
                    i = cyVar.f21795A;
                } else if (aeu.f20466a >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                    i = mediaFormat.getInteger("pcm-encoding");
                } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                    i = aeu.m18505W(mediaFormat.getInteger("v-bits-per-sample"));
                } else {
                    i = "audio/raw".equals(cyVar.f21812l) ? cyVar.f21795A : 2;
                }
                C6863cx cxVar = new C6863cx();
                cxVar.mo15630ae("audio/raw");
                cxVar.mo15623Y(i);
                cxVar.mo15611M(cyVar.f21796B);
                cxVar.mo15612N(cyVar.f21797C);
                cxVar.mo15606H(mediaFormat.getInteger("channel-count"));
                cxVar.mo15631af(mediaFormat.getInteger("sample-rate"));
                cyVar2 = cxVar.mo15625a();
                if (this.f22418f && cyVar2.f21825y == 6 && (i2 = cyVar.f21825y) < 6) {
                    iArr = new int[i2];
                    for (int i3 = 0; i3 < cyVar.f21825y; i3++) {
                        iArr[i3] = i3;
                    }
                }
            }
        }
        try {
            this.f22416d.mo15953w(cyVar2, iArr);
        } catch (C6984hj e) {
            throw mo15503D(e, cyVar);
        }
    }
}
