package com.google.android.apps.gsa.shared.speech.hotword;

import android.net.Uri;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.speech.speakerid.SpeakerIdModel;
import com.google.android.libraries.search.p2904c.C37672hs;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.speech.p5208h.C66626cx;
import com.google.speech.p5224k.p5225a.C67229g;

/* renamed from: com.google.android.apps.gsa.shared.speech.hotword.a */
/* compiled from: PG */
public final class C90578a extends C90599p {

    /* renamed from: A */
    private long f253206A;

    /* renamed from: B */
    private long f253207B;

    /* renamed from: C */
    private C58833ax f253208C;

    /* renamed from: D */
    private C58833ax f253209D;

    /* renamed from: E */
    private int f253210E;

    /* renamed from: a */
    public String f253211a;

    /* renamed from: b */
    public C58833ax f253212b;

    /* renamed from: c */
    public C58833ax f253213c;

    /* renamed from: d */
    public SpeakerIdModel f253214d;

    /* renamed from: e */
    public String f253215e;

    /* renamed from: f */
    public Uri f253216f;

    /* renamed from: g */
    public C58833ax f253217g;

    /* renamed from: h */
    public C58833ax f253218h;

    /* renamed from: i */
    private int f253219i;

    /* renamed from: j */
    private C66626cx f253220j;

    /* renamed from: k */
    private boolean f253221k;

    /* renamed from: l */
    private boolean f253222l;

    /* renamed from: m */
    private float f253223m;

    /* renamed from: n */
    private float f253224n;

    /* renamed from: o */
    private float f253225o;

    /* renamed from: p */
    private float f253226p;

    /* renamed from: q */
    private int f253227q;

    /* renamed from: r */
    private int f253228r;

    /* renamed from: s */
    private int f253229s;

    /* renamed from: t */
    private int f253230t;

    /* renamed from: u */
    private C67229g f253231u;

    /* renamed from: v */
    private boolean f253232v;

    /* renamed from: w */
    private boolean f253233w;

    /* renamed from: x */
    private boolean f253234x;

    /* renamed from: y */
    private int f253235y;

    /* renamed from: z */
    private boolean f253236z;

    public C90578a() {
        C58836b bVar = C58836b.f156633a;
        this.f253212b = bVar;
        this.f253213c = bVar;
        this.f253208C = bVar;
        this.f253209D = bVar;
        this.f253217g = bVar;
        this.f253218h = bVar;
    }

    public C90578a(HotwordResult hotwordResult) {
        C58836b bVar = C58836b.f156633a;
        this.f253212b = bVar;
        this.f253213c = bVar;
        this.f253208C = bVar;
        this.f253209D = bVar;
        this.f253217g = bVar;
        this.f253218h = bVar;
        AutoValue_HotwordResult autoValue_HotwordResult = (AutoValue_HotwordResult) hotwordResult;
        this.f253219i = autoValue_HotwordResult.f253179a;
        this.f253220j = autoValue_HotwordResult.f253180b;
        this.f253221k = autoValue_HotwordResult.f253181c;
        this.f253222l = autoValue_HotwordResult.f253182d;
        this.f253223m = autoValue_HotwordResult.f253183e;
        this.f253211a = autoValue_HotwordResult.f253184f;
        this.f253224n = autoValue_HotwordResult.f253185g;
        this.f253225o = autoValue_HotwordResult.f253186h;
        this.f253226p = autoValue_HotwordResult.f253187i;
        this.f253212b = autoValue_HotwordResult.f253188j;
        this.f253227q = autoValue_HotwordResult.f253189k;
        this.f253228r = autoValue_HotwordResult.f253190l;
        this.f253213c = autoValue_HotwordResult.f253191m;
        this.f253229s = autoValue_HotwordResult.f253192n;
        this.f253230t = autoValue_HotwordResult.f253193o;
        this.f253231u = autoValue_HotwordResult.f253194p;
        this.f253232v = autoValue_HotwordResult.f253195q;
        this.f253233w = autoValue_HotwordResult.f253196r;
        this.f253214d = autoValue_HotwordResult.f253197s;
        this.f253234x = autoValue_HotwordResult.f253198t;
        this.f253215e = autoValue_HotwordResult.f253199u;
        this.f253235y = autoValue_HotwordResult.f253200v;
        this.f253236z = autoValue_HotwordResult.f253201w;
        this.f253206A = autoValue_HotwordResult.f253202x;
        this.f253207B = autoValue_HotwordResult.f253203y;
        this.f253216f = autoValue_HotwordResult.f253204z;
        this.f253208C = autoValue_HotwordResult.f253175A;
        this.f253209D = autoValue_HotwordResult.f253176B;
        this.f253217g = autoValue_HotwordResult.f253177C;
        this.f253218h = autoValue_HotwordResult.f253178D;
        this.f253210E = 262143;
    }

    /* renamed from: a */
    public final HotwordResult mo84712a() {
        C66626cx cxVar;
        C67229g gVar;
        if (this.f253210E != 262143 || (cxVar = this.f253220j) == null || (gVar = this.f253231u) == null) {
            StringBuilder sb = new StringBuilder();
            if ((this.f253210E & 1) == 0) {
                sb.append(" speakerMode");
            }
            if (this.f253220j == null) {
                sb.append(" deviceType");
            }
            if ((this.f253210E & 2) == 0) {
                sb.append(" speakerTriggered");
            }
            if ((this.f253210E & 4) == 0) {
                sb.append(" speakerUnlocked");
            }
            if ((this.f253210E & 8) == 0) {
                sb.append(" softwareHotwordScore");
            }
            if ((this.f253210E & 16) == 0) {
                sb.append(" speakerScore");
            }
            if ((this.f253210E & 32) == 0) {
                sb.append(" hotwordPower");
            }
            if ((this.f253210E & 64) == 0) {
                sb.append(" backgroundPower");
            }
            if ((this.f253210E & 128) == 0) {
                sb.append(" channelCount");
            }
            if ((this.f253210E & 256) == 0) {
                sb.append(" encodingFormat");
            }
            if ((this.f253210E & 512) == 0) {
                sb.append(" sampleRate");
            }
            if ((this.f253210E & 1024) == 0) {
                sb.append(" maxAllowedImposterAttempts");
            }
            if (this.f253231u == null) {
                sb.append(" alwaysOnHotwordDetectorType");
            }
            if ((this.f253210E & 2048) == 0) {
                sb.append(" dspHotwordTriggered");
            }
            if ((this.f253210E & 4096) == 0) {
                sb.append(" softwareHotwordTriggered");
            }
            if ((this.f253210E & 8192) == 0) {
                sb.append(" lowThresholdHotwordTriggered");
            }
            if ((this.f253210E & 16384) == 0) {
                sb.append(" hotwordTriggeredBufferPosition");
            }
            if ((this.f253210E & 32768) == 0) {
                sb.append(" shouldAdapt");
            }
            if ((this.f253210E & 65536) == 0) {
                sb.append(" lastMissedHotwordTimeStamp");
            }
            if ((this.f253210E & C89885b.S3REQUEST_VALUE) == 0) {
                sb.append(" dspHotwordTriggeredTimestamp");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        AutoValue_HotwordResult autoValue_HotwordResult = r3;
        AutoValue_HotwordResult autoValue_HotwordResult2 = new AutoValue_HotwordResult(this.f253219i, cxVar, this.f253221k, this.f253222l, this.f253223m, this.f253211a, this.f253224n, this.f253225o, this.f253226p, this.f253212b, this.f253227q, this.f253228r, this.f253213c, this.f253229s, this.f253230t, gVar, this.f253232v, this.f253233w, this.f253214d, this.f253234x, this.f253215e, this.f253235y, this.f253236z, this.f253206A, this.f253207B, this.f253216f, this.f253208C, this.f253209D, this.f253217g, this.f253218h);
        return autoValue_HotwordResult;
    }

    /* renamed from: b */
    public final void mo84713b(C67229g gVar) {
        if (gVar != null) {
            this.f253231u = gVar;
            return;
        }
        throw new NullPointerException("Null alwaysOnHotwordDetectorType");
    }

    /* renamed from: c */
    public final void mo84714c(C58833ax axVar) {
        this.f253212b = axVar;
    }

    /* renamed from: d */
    public final void mo84715d(float f) {
        this.f253226p = f;
        this.f253210E |= 64;
    }

    /* renamed from: e */
    public final void mo84716e(int i) {
        this.f253208C = C58833ax.m90834k(Integer.valueOf(i));
    }

    /* renamed from: f */
    public final void mo84717f(int i) {
        this.f253227q = i;
        this.f253210E |= 128;
    }

    /* renamed from: g */
    public final void mo84718g(C66626cx cxVar) {
        if (cxVar != null) {
            this.f253220j = cxVar;
            return;
        }
        throw new NullPointerException("Null deviceType");
    }

    /* renamed from: h */
    public final void mo84719h(boolean z) {
        this.f253232v = z;
        this.f253210E |= 2048;
    }

    /* renamed from: i */
    public final void mo84720i(long j) {
        this.f253207B = j;
        this.f253210E |= C89885b.S3REQUEST_VALUE;
    }

    /* renamed from: j */
    public final void mo84721j(int i) {
        this.f253228r = i;
        this.f253210E |= 256;
    }

    /* renamed from: k */
    public final void mo84722k(float f) {
        this.f253225o = f;
        this.f253210E |= 32;
    }

    /* renamed from: l */
    public final void mo84723l(int i) {
        this.f253235y = i;
        this.f253210E |= 16384;
    }

    /* renamed from: m */
    public final void mo84724m(C37672hs hsVar) {
        this.f253217g = C58833ax.m90834k(hsVar);
    }

    /* renamed from: n */
    public final void mo84725n(long j) {
        this.f253206A = j;
        this.f253210E |= 65536;
    }

    /* renamed from: o */
    public final void mo84726o(boolean z) {
        this.f253234x = z;
        this.f253210E |= 8192;
    }

    /* renamed from: p */
    public final void mo84727p(int i) {
        this.f253230t = i;
        this.f253210E |= 1024;
    }

    /* renamed from: q */
    public final void mo84728q(int i) {
        this.f253229s = i;
        this.f253210E |= 512;
    }

    /* renamed from: r */
    public final void mo84729r(int i) {
        this.f253209D = C58833ax.m90834k(Integer.valueOf(i));
    }

    /* renamed from: s */
    public final void mo84730s(boolean z) {
        this.f253236z = z;
        this.f253210E |= 32768;
    }

    /* renamed from: t */
    public final void mo84731t(float f) {
        this.f253223m = f;
        this.f253210E |= 8;
    }

    /* renamed from: u */
    public final void mo84732u(boolean z) {
        this.f253233w = z;
        this.f253210E |= 4096;
    }

    /* renamed from: v */
    public final void mo84733v(int i) {
        this.f253219i = i;
        this.f253210E |= 1;
    }

    /* renamed from: w */
    public final void mo84734w(float f) {
        this.f253224n = f;
        this.f253210E |= 16;
    }

    /* renamed from: x */
    public final void mo84735x(boolean z) {
        this.f253221k = z;
        this.f253210E |= 2;
    }

    /* renamed from: y */
    public final void mo84736y(boolean z) {
        this.f253222l = z;
        this.f253210E |= 4;
    }

    /* renamed from: z */
    public final void mo84737z(Uri uri) {
        this.f253216f = uri;
    }
}
