package com.google.android.apps.search.transcription.p10670f;

import com.google.common.p4522b.C58485gu;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.transcription.f.i */
/* compiled from: PG */
public final class C141915i extends C141850br {

    /* renamed from: a */
    public String f385048a;

    /* renamed from: b */
    public String f385049b;

    /* renamed from: c */
    public Optional f385050c = Optional.empty();

    /* renamed from: d */
    public Optional f385051d = Optional.empty();

    /* renamed from: e */
    public String f385052e;

    /* renamed from: f */
    public int f385053f;

    /* renamed from: g */
    private int f385054g;

    /* renamed from: h */
    private C58485gu f385055h;

    /* renamed from: i */
    private Optional f385056i = Optional.empty();

    /* renamed from: j */
    private boolean f385057j;

    /* renamed from: k */
    private boolean f385058k;

    /* renamed from: l */
    private int f385059l;

    /* renamed from: m */
    private int f385060m;

    /* renamed from: n */
    private boolean f385061n;

    /* renamed from: o */
    private boolean f385062o;

    /* renamed from: p */
    private boolean f385063p;

    /* renamed from: q */
    private boolean f385064q;

    /* renamed from: r */
    private Optional f385065r = Optional.empty();

    /* renamed from: s */
    private boolean f385066s;

    /* renamed from: t */
    private boolean f385067t;

    /* renamed from: u */
    private Optional f385068u = Optional.empty();

    /* renamed from: v */
    private Optional f385069v = Optional.empty();

    /* renamed from: w */
    private C58485gu f385070w;

    /* renamed from: x */
    private boolean f385071x;

    /* renamed from: y */
    private short f385072y;

    /* renamed from: a */
    public final int mo116796a() {
        if ((this.f385072y & 1) != 0) {
            return this.f385054g;
        }
        throw new IllegalStateException("Property \"maxResults\" has not been set");
    }

    /* renamed from: b */
    public final C141851bs mo116797b() {
        String str;
        C58485gu guVar;
        String str2;
        int i;
        String str3;
        C58485gu guVar2;
        if (this.f385072y != 4095 || (str = this.f385048a) == null || (guVar = this.f385055h) == null || (str2 = this.f385049b) == null || (i = this.f385053f) == 0 || (str3 = this.f385052e) == null || (guVar2 = this.f385070w) == null) {
            StringBuilder sb = new StringBuilder();
            if ((this.f385072y & 1) == 0) {
                sb.append(" maxResults");
            }
            if (this.f385048a == null) {
                sb.append(" language");
            }
            if (this.f385055h == null) {
                sb.append(" additionalLanguages");
            }
            if (this.f385049b == null) {
                sb.append(" triggerApplicationId");
            }
            if (this.f385053f == 0) {
                sb.append(" entrypoint");
            }
            if ((this.f385072y & 2) == 0) {
                sb.append(" preferOffline");
            }
            if ((this.f385072y & 4) == 0) {
                sb.append(" enablePartialResults");
            }
            if ((this.f385072y & 8) == 0) {
                sb.append(" minSpeechLengthMs");
            }
            if ((this.f385072y & 16) == 0) {
                sb.append(" speechInputCompleteSilenceLengthMs");
            }
            if ((this.f385072y & 32) == 0) {
                sb.append(" muteMicForTalkBack");
            }
            if ((this.f385072y & 64) == 0) {
                sb.append(" multiSegment");
            }
            if ((this.f385072y & 128) == 0) {
                sb.append(" requestSodaEvent");
            }
            if ((this.f385072y & 256) == 0) {
                sb.append(" profanityFilter");
            }
            if ((this.f385072y & 512) == 0) {
                sb.append(" hidePartialTrailingPunctuation");
            }
            if ((this.f385072y & 1024) == 0) {
                sb.append(" muteAudioBeeps");
            }
            if (this.f385052e == null) {
                sb.append(" languageModel");
            }
            if (this.f385070w == null) {
                sb.append(" biasingStrings");
            }
            if ((this.f385072y & 2048) == 0) {
                sb.append(" enableDeviceContextBiasing");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new C141916j(this.f385054g, str, guVar, str2, i, this.f385056i, this.f385057j, this.f385058k, this.f385059l, this.f385060m, this.f385050c, this.f385061n, this.f385062o, this.f385063p, this.f385064q, this.f385065r, this.f385066s, this.f385067t, this.f385068u, this.f385051d, this.f385069v, str3, guVar2, this.f385071x);
    }

    /* renamed from: c */
    public final void mo116798c(C58485gu guVar) {
        if (guVar != null) {
            this.f385055h = guVar;
            return;
        }
        throw new NullPointerException("Null additionalLanguages");
    }

    /* renamed from: d */
    public final void mo116799d(Optional optional) {
        if (optional != null) {
            this.f385068u = optional;
            return;
        }
        throw new NullPointerException("Null attributionParams");
    }

    /* renamed from: e */
    public final void mo116800e(Optional optional) {
        if (optional != null) {
            this.f385056i = optional;
            return;
        }
        throw new NullPointerException("Null audioRecordingEncoding");
    }

    /* renamed from: f */
    public final void mo116801f(Optional optional) {
        if (optional != null) {
            this.f385050c = optional;
            return;
        }
        throw new NullPointerException("Null audioSource");
    }

    /* renamed from: g */
    public final void mo116802g(C58485gu guVar) {
        if (guVar != null) {
            this.f385070w = guVar;
            return;
        }
        throw new NullPointerException("Null biasingStrings");
    }

    /* renamed from: h */
    public final void mo116803h(Optional optional) {
        if (optional != null) {
            this.f385069v = optional;
            return;
        }
        throw new NullPointerException("Null diarizationConfig");
    }

    /* renamed from: i */
    public final void mo116804i(boolean z) {
        this.f385071x = z;
        this.f385072y = (short) (this.f385072y | 2048);
    }

    /* renamed from: j */
    public final void mo116805j(Optional optional) {
        if (optional != null) {
            this.f385065r = optional;
            return;
        }
        throw new NullPointerException("Null enableFormatting");
    }

    /* renamed from: k */
    public final void mo116806k(boolean z) {
        this.f385058k = z;
        this.f385072y = (short) (this.f385072y | 4);
    }

    /* renamed from: l */
    public final void mo116807l(boolean z) {
        this.f385066s = z;
        this.f385072y = (short) (this.f385072y | 512);
    }

    /* renamed from: m */
    public final void mo116808m(String str) {
        if (str != null) {
            this.f385048a = str;
            return;
        }
        throw new NullPointerException("Null language");
    }

    /* renamed from: n */
    public final void mo116809n(int i) {
        this.f385054g = i;
        this.f385072y = (short) (this.f385072y | 1);
    }

    /* renamed from: o */
    public final void mo116810o(int i) {
        this.f385059l = i;
        this.f385072y = (short) (this.f385072y | 8);
    }

    /* renamed from: p */
    public final void mo116811p(boolean z) {
        this.f385062o = z;
        this.f385072y = (short) (this.f385072y | 64);
    }

    /* renamed from: q */
    public final void mo116812q(boolean z) {
        this.f385067t = z;
        this.f385072y = (short) (this.f385072y | 1024);
    }

    /* renamed from: r */
    public final void mo116813r(boolean z) {
        this.f385061n = z;
        this.f385072y = (short) (this.f385072y | 32);
    }

    /* renamed from: s */
    public final void mo116814s(boolean z) {
        this.f385057j = z;
        this.f385072y = (short) (this.f385072y | 2);
    }

    /* renamed from: t */
    public final void mo116815t(boolean z) {
        this.f385064q = z;
        this.f385072y = (short) (this.f385072y | 256);
    }

    /* renamed from: u */
    public final void mo116816u(boolean z) {
        this.f385063p = z;
        this.f385072y = (short) (this.f385072y | 128);
    }

    /* renamed from: v */
    public final void mo116817v(int i) {
        this.f385060m = i;
        this.f385072y = (short) (this.f385072y | 16);
    }
}
