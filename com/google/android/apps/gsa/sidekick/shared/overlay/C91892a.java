package com.google.android.apps.gsa.sidekick.shared.overlay;

import com.google.p375ai.p378b.C8142xb;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.overlay.a */
/* compiled from: PG */
final class C91892a extends C91898g {

    /* renamed from: a */
    public String f256219a;

    /* renamed from: b */
    private C8142xb f256220b;

    /* renamed from: c */
    private boolean f256221c;

    /* renamed from: d */
    private boolean f256222d;

    /* renamed from: e */
    private boolean f256223e;

    /* renamed from: f */
    private boolean f256224f;

    /* renamed from: g */
    private byte f256225g;

    /* renamed from: a */
    public final NowStreamConfig mo86466a() {
        C8142xb xbVar;
        if (this.f256225g == 15 && (xbVar = this.f256220b) != null) {
            return new AutoValue_NowStreamConfig(xbVar, this.f256221c, this.f256222d, this.f256223e, this.f256219a, this.f256224f);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f256220b == null) {
            sb.append(" surfaceType");
        }
        if ((this.f256225g & 1) == 0) {
            sb.append(" supportMultiWindowMode");
        }
        if ((this.f256225g & 2) == 0) {
            sb.append(" useMomoUi");
        }
        if ((this.f256225g & 4) == 0) {
            sb.append(" useAssistHqUi");
        }
        if ((this.f256225g & 8) == 0) {
            sb.append(" horizontalScrollLocking");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo86467b(boolean z) {
        this.f256224f = z;
        this.f256225g = (byte) (this.f256225g | 8);
    }

    /* renamed from: c */
    public final void mo86468c(boolean z) {
        this.f256221c = z;
        this.f256225g = (byte) (this.f256225g | 1);
    }

    /* renamed from: d */
    public final void mo86469d(C8142xb xbVar) {
        if (xbVar != null) {
            this.f256220b = xbVar;
            return;
        }
        throw new NullPointerException("Null surfaceType");
    }

    /* renamed from: e */
    public final void mo86470e(boolean z) {
        this.f256223e = z;
        this.f256225g = (byte) (this.f256225g | 4);
    }

    /* renamed from: f */
    public final void mo86471f(boolean z) {
        this.f256222d = z;
        this.f256225g = (byte) (this.f256225g | 2);
    }
}
