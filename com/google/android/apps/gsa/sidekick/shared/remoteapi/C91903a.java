package com.google.android.apps.gsa.sidekick.shared.remoteapi;

import com.google.p375ai.p378b.C7526an;
import com.google.p375ai.p378b.C7708h;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7918ou;
import com.google.p375ai.p378b.C8142xb;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.remoteapi.a */
/* compiled from: PG */
public final class C91903a extends C91909g {

    /* renamed from: a */
    public C7708h f256281a;

    /* renamed from: b */
    public Long f256282b;

    /* renamed from: c */
    public Long f256283c;

    /* renamed from: d */
    public Integer f256284d;

    /* renamed from: e */
    public C7718hj f256285e;

    /* renamed from: f */
    public C7526an f256286f;

    /* renamed from: g */
    public StreamRenderData f256287g;

    /* renamed from: h */
    public C8142xb f256288h;

    /* renamed from: i */
    public C7918ou f256289i;

    /* renamed from: j */
    private boolean f256290j;

    /* renamed from: k */
    private boolean f256291k;

    /* renamed from: l */
    private boolean f256292l;

    /* renamed from: m */
    private boolean f256293m;

    /* renamed from: n */
    private Optional f256294n = Optional.empty();

    /* renamed from: o */
    private int f256295o;

    /* renamed from: p */
    private int f256296p;

    /* renamed from: q */
    private int f256297q;

    /* renamed from: r */
    private int f256298r;

    /* renamed from: s */
    private int f256299s;

    /* renamed from: t */
    private int f256300t;

    /* renamed from: u */
    private int f256301u;

    /* renamed from: v */
    private int f256302v;

    /* renamed from: w */
    private short f256303w;

    public C91903a() {
    }

    /* renamed from: a */
    public final LoggingRequest mo86537a() {
        if (this.f256303w == 4095) {
            return new AutoValue_LoggingRequest(this.f256281a, this.f256282b, this.f256283c, this.f256284d, this.f256285e, this.f256286f, this.f256287g, this.f256288h, this.f256290j, this.f256291k, this.f256289i, this.f256292l, this.f256293m, this.f256294n, this.f256295o, this.f256296p, this.f256297q, this.f256298r, this.f256299s, this.f256300t, this.f256301u, this.f256302v);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f256303w & 1) == 0) {
            sb.append(" removeFeedbackQuestionFromEntry");
        }
        if ((this.f256303w & 2) == 0) {
            sb.append(" removeVoiceOfGoogleQuestionFromEntry");
        }
        if ((this.f256303w & 4) == 0) {
            sb.append(" isPortrait");
        }
        if ((this.f256303w & 8) == 0) {
            sb.append(" tagCardAsViewed");
        }
        if ((this.f256303w & 16) == 0) {
            sb.append(" cardTopPixels");
        }
        if ((this.f256303w & 32) == 0) {
            sb.append(" cardHeightPixels");
        }
        if ((this.f256303w & 64) == 0) {
            sb.append(" cardLeftPixels");
        }
        if ((this.f256303w & 128) == 0) {
            sb.append(" cardWidthPixels");
        }
        if ((this.f256303w & 256) == 0) {
            sb.append(" viewportTopPixels");
        }
        if ((this.f256303w & 512) == 0) {
            sb.append(" viewportBottomPixels");
        }
        if ((this.f256303w & 1024) == 0) {
            sb.append(" viewportLeftPixels");
        }
        if ((this.f256303w & 2048) == 0) {
            sb.append(" viewportRightPixels");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo86538b(Optional optional) {
        if (optional != null) {
            this.f256294n = optional;
            return;
        }
        throw new NullPointerException("Null adDismissReason");
    }

    /* renamed from: c */
    public final void mo86539c(int i) {
        this.f256296p = i;
        this.f256303w = (short) (this.f256303w | 32);
    }

    /* renamed from: d */
    public final void mo86540d(int i) {
        this.f256297q = i;
        this.f256303w = (short) (this.f256303w | 64);
    }

    /* renamed from: e */
    public final void mo86541e(int i) {
        this.f256295o = i;
        this.f256303w = (short) (this.f256303w | 16);
    }

    /* renamed from: f */
    public final void mo86542f(int i) {
        this.f256298r = i;
        this.f256303w = (short) (this.f256303w | 128);
    }

    /* renamed from: g */
    public final void mo86543g(C7526an anVar) {
        this.f256286f = anVar;
    }

    /* renamed from: h */
    public final void mo86544h(boolean z) {
        this.f256292l = z;
        this.f256303w = (short) (this.f256303w | 4);
    }

    /* renamed from: i */
    public final void mo86545i(boolean z) {
        this.f256290j = z;
        this.f256303w = (short) (this.f256303w | 1);
    }

    /* renamed from: j */
    public final void mo86546j(boolean z) {
        this.f256291k = z;
        this.f256303w = (short) (this.f256303w | 2);
    }

    /* renamed from: k */
    public final void mo86547k(StreamRenderData streamRenderData) {
        this.f256287g = streamRenderData;
    }

    /* renamed from: l */
    public final void mo86548l(C8142xb xbVar) {
        this.f256288h = xbVar;
    }

    /* renamed from: m */
    public final void mo86549m(boolean z) {
        this.f256293m = z;
        this.f256303w = (short) (this.f256303w | 8);
    }

    /* renamed from: n */
    public final void mo86550n(int i) {
        this.f256300t = i;
        this.f256303w = (short) (this.f256303w | 512);
    }

    /* renamed from: o */
    public final void mo86551o(int i) {
        this.f256301u = i;
        this.f256303w = (short) (this.f256303w | 1024);
    }

    /* renamed from: p */
    public final void mo86552p(int i) {
        this.f256302v = i;
        this.f256303w = (short) (this.f256303w | 2048);
    }

    /* renamed from: q */
    public final void mo86553q(int i) {
        this.f256299s = i;
        this.f256303w = (short) (this.f256303w | 256);
    }

    public C91903a(LoggingRequest loggingRequest) {
        AutoValue_LoggingRequest autoValue_LoggingRequest = (AutoValue_LoggingRequest) loggingRequest;
        this.f256281a = autoValue_LoggingRequest.f256248a;
        this.f256282b = autoValue_LoggingRequest.f256249b;
        this.f256283c = autoValue_LoggingRequest.f256250c;
        this.f256284d = autoValue_LoggingRequest.f256251d;
        this.f256285e = autoValue_LoggingRequest.f256252e;
        this.f256286f = autoValue_LoggingRequest.f256253f;
        this.f256287g = autoValue_LoggingRequest.f256254g;
        this.f256288h = autoValue_LoggingRequest.f256255h;
        this.f256290j = autoValue_LoggingRequest.f256256i;
        this.f256291k = autoValue_LoggingRequest.f256257j;
        this.f256289i = autoValue_LoggingRequest.f256258k;
        this.f256292l = autoValue_LoggingRequest.f256259l;
        this.f256293m = autoValue_LoggingRequest.f256260m;
        this.f256294n = autoValue_LoggingRequest.f256261n;
        this.f256295o = autoValue_LoggingRequest.f256262o;
        this.f256296p = autoValue_LoggingRequest.f256263p;
        this.f256297q = autoValue_LoggingRequest.f256264q;
        this.f256298r = autoValue_LoggingRequest.f256265r;
        this.f256299s = autoValue_LoggingRequest.f256266s;
        this.f256300t = autoValue_LoggingRequest.f256267t;
        this.f256301u = autoValue_LoggingRequest.f256268u;
        this.f256302v = autoValue_LoggingRequest.f256269v;
        this.f256303w = 4095;
    }
}
