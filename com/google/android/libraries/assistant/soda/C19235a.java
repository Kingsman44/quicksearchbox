package com.google.android.libraries.assistant.soda;

import com.google.android.libraries.assistant.soda.data.C19283a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.speech.p5218j.C66764ae;
import com.google.speech.p5218j.C66964g;
import com.google.speech.p5218j.C66971gg;
import com.google.speech.p5218j.C66996he;
import com.google.speech.p5218j.C67153n;

/* renamed from: com.google.android.libraries.assistant.soda.a */
/* compiled from: PG */
final class C19235a extends C19387w {

    /* renamed from: a */
    public String f53883a;

    /* renamed from: b */
    public String f53884b;

    /* renamed from: c */
    public String f53885c;

    /* renamed from: d */
    public String f53886d;

    /* renamed from: e */
    public short f53887e;

    /* renamed from: f */
    private String f53888f;

    /* renamed from: g */
    private String f53889g;

    /* renamed from: h */
    private boolean f53890h;

    /* renamed from: i */
    private boolean f53891i;

    /* renamed from: j */
    private boolean f53892j;

    /* renamed from: k */
    private boolean f53893k;

    /* renamed from: l */
    private boolean f53894l;

    /* renamed from: m */
    private boolean f53895m;

    /* renamed from: n */
    private boolean f53896n;

    /* renamed from: o */
    private C66996he f53897o;

    /* renamed from: p */
    private boolean f53898p;

    /* renamed from: q */
    private boolean f53899q;

    /* renamed from: r */
    private boolean f53900r;

    /* renamed from: s */
    private C66964g f53901s;

    /* renamed from: t */
    private int f53902t;

    /* renamed from: u */
    private String f53903u;

    /* renamed from: v */
    private C19347o f53904v;

    /* renamed from: w */
    private C19283a f53905w;

    /* renamed from: x */
    private C66764ae f53906x;

    /* renamed from: y */
    private C66971gg f53907y;

    /* renamed from: z */
    private C67153n f53908z;

    /* renamed from: A */
    public final void mo24358A(String str) {
        if (str != null) {
            this.f53885c = str;
            return;
        }
        throw new NullPointerException("Null tisidModelPath");
    }

    /* renamed from: B */
    public final void mo24359B(boolean z) {
        this.f53894l = z;
        this.f53887e = (short) (this.f53887e | 32);
    }

    /* renamed from: a */
    public final C19388x mo24360a() {
        String str;
        String str2;
        String str3;
        C66964g gVar;
        String str4;
        String str5;
        String str6;
        if (this.f53887e != 8191 || (str = this.f53888f) == null || (str2 = this.f53883a) == null || (str3 = this.f53889g) == null || (gVar = this.f53901s) == null || (str4 = this.f53884b) == null || (str5 = this.f53885c) == null || (str6 = this.f53886d) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.f53888f == null) {
                sb.append(" sodaResourcesDir");
            }
            if (this.f53883a == null) {
                sb.append(" sodaCacheDir");
            }
            if (this.f53889g == null) {
                sb.append(" hotwordModelPath");
            }
            if ((this.f53887e & 1) == 0) {
                sb.append(" expectAsrAfterHotword");
            }
            if ((this.f53887e & 2) == 0) {
                sb.append(" requireHotword");
            }
            if ((this.f53887e & 4) == 0) {
                sb.append(" addHotwordBuffer");
            }
            if ((this.f53887e & 8) == 0) {
                sb.append(" resetOnFinalResult");
            }
            if ((this.f53887e & 16) == 0) {
                sb.append(" attachQueryAudio");
            }
            if ((this.f53887e & 32) == 0) {
                sb.append(" uploadAudiosToServer");
            }
            if ((this.f53887e & 64) == 0) {
                sb.append(" maskOffensiveWords");
            }
            if ((this.f53887e & 128) == 0) {
                sb.append(" enableLongform");
            }
            if ((this.f53887e & 256) == 0) {
                sb.append(" hidePartialTrailingPunctuation");
            }
            if ((this.f53887e & 512) == 0) {
                sb.append(" forceDisableOpenMic");
            }
            if ((this.f53887e & 1024) == 0) {
                sb.append(" forceDisableSpeakerVerification");
            }
            if (this.f53901s == null) {
                sb.append(" applicationDomain");
            }
            if ((this.f53887e & 2048) == 0) {
                sb.append(" channelCount");
            }
            if ((this.f53887e & 4096) == 0) {
                sb.append(" boostRecognizerPriority");
            }
            if (this.f53884b == null) {
                sb.append(" languageModel");
            }
            if (this.f53885c == null) {
                sb.append(" tisidModelPath");
            }
            if (this.f53886d == null) {
                sb.append(" personalizedResourcesDir");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new C19247b(str, str2, str3, this.f53890h, this.f53891i, this.f53892j, this.f53893k, this.f53894l, this.f53895m, this.f53896n, this.f53897o, this.f53898p, this.f53899q, this.f53900r, gVar, this.f53902t, this.f53903u, this.f53904v, this.f53905w, this.f53906x, this.f53907y, this.f53908z, str4, str5, str6);
    }

    /* renamed from: b */
    public final C58833ax mo24361b() {
        String str = this.f53889g;
        return str == null ? C58836b.f156633a : C58833ax.m90834k(str);
    }

    /* renamed from: c */
    public final boolean mo24362c() {
        if ((this.f53887e & 2) != 0) {
            return this.f53891i;
        }
        throw new IllegalStateException("Property \"requireHotword\" has not been set");
    }

    /* renamed from: d */
    public final void mo24363d(boolean z) {
        this.f53892j = z;
        this.f53887e = (short) (this.f53887e | 4);
    }

    /* renamed from: e */
    public final void mo24364e(C66964g gVar) {
        if (gVar != null) {
            this.f53901s = gVar;
            return;
        }
        throw new NullPointerException("Null applicationDomain");
    }

    /* renamed from: f */
    public final void mo24365f(boolean z) {
        this.f53893k = z;
        this.f53887e = (short) (this.f53887e | 16);
    }

    /* renamed from: g */
    public final void mo24366g(C67153n nVar) {
        this.f53908z = nVar;
    }

    /* renamed from: h */
    public final void mo24367h(int i) {
        this.f53902t = i;
        this.f53887e = (short) (this.f53887e | 2048);
    }

    /* renamed from: i */
    public final void mo24368i(C66764ae aeVar) {
        this.f53906x = aeVar;
    }

    /* renamed from: j */
    public final void mo24369j(C66971gg ggVar) {
        this.f53907y = ggVar;
    }

    /* renamed from: k */
    public final void mo24370k(C66996he heVar) {
        this.f53897o = heVar;
    }

    /* renamed from: l */
    public final void mo24371l(boolean z) {
        this.f53896n = z;
        this.f53887e = (short) (this.f53887e | 128);
    }

    /* renamed from: m */
    public final void mo24372m(boolean z) {
        this.f53890h = z;
        this.f53887e = (short) (this.f53887e | 1);
    }

    /* renamed from: n */
    public final void mo24373n(boolean z) {
        this.f53899q = z;
        this.f53887e = (short) (this.f53887e | 512);
    }

    /* renamed from: o */
    public final void mo24374o(boolean z) {
        this.f53900r = z;
        this.f53887e = (short) (this.f53887e | 1024);
    }

    /* renamed from: p */
    public final void mo24375p(boolean z) {
        this.f53898p = z;
        this.f53887e = (short) (this.f53887e | 256);
    }

    /* renamed from: q */
    public final void mo24376q(String str) {
        if (str != null) {
            this.f53889g = str;
            return;
        }
        throw new NullPointerException("Null hotwordModelPath");
    }

    /* renamed from: r */
    public final void mo24377r(String str) {
        if (str != null) {
            this.f53884b = str;
            return;
        }
        throw new NullPointerException("Null languageModel");
    }

    /* renamed from: s */
    public final void mo24378s(String str) {
        this.f53903u = str;
    }

    /* renamed from: t */
    public final void mo24379t(boolean z) {
        this.f53895m = z;
        this.f53887e = (short) (this.f53887e | 64);
    }

    /* renamed from: u */
    public final void mo24380u(String str) {
        if (str != null) {
            this.f53886d = str;
            return;
        }
        throw new NullPointerException("Null personalizedResourcesDir");
    }

    /* renamed from: v */
    public final void mo24381v(boolean z) {
        this.f53891i = z;
        this.f53887e = (short) (this.f53887e | 2);
    }

    /* renamed from: w */
    public final void mo24382w(String str) {
        this.f53883a = str;
    }

    /* renamed from: x */
    public final void mo24383x(C19347o oVar) {
        this.f53904v = oVar;
    }

    /* renamed from: y */
    public final void mo24384y(C19283a aVar) {
        this.f53905w = aVar;
    }

    /* renamed from: z */
    public final void mo24385z(String str) {
        if (str != null) {
            this.f53888f = str;
            return;
        }
        throw new NullPointerException("Null sodaResourcesDir");
    }
}
