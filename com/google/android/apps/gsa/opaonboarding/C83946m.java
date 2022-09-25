package com.google.android.apps.gsa.opaonboarding;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;

/* renamed from: com.google.android.apps.gsa.opaonboarding.m */
/* compiled from: PG */
public final class C83946m extends C83898bd {

    /* renamed from: a */
    public C58495hd f228663a;

    /* renamed from: b */
    private boolean f228664b;

    /* renamed from: c */
    private boolean f228665c;

    /* renamed from: d */
    private C58485gu f228666d;

    /* renamed from: e */
    private boolean f228667e;

    /* renamed from: f */
    private boolean f228668f;

    /* renamed from: g */
    private boolean f228669g;

    /* renamed from: h */
    private boolean f228670h;

    /* renamed from: i */
    private int f228671i;

    /* renamed from: j */
    private byte f228672j;

    /* renamed from: a */
    public final C83899be mo77284a() {
        C58495hd hdVar;
        C58485gu guVar;
        if (this.f228672j == Byte.MAX_VALUE && (hdVar = this.f228663a) != null && (guVar = this.f228666d) != null) {
            return new C83947n(this.f228664b, this.f228665c, hdVar, guVar, this.f228667e, this.f228668f, this.f228669g, this.f228670h, this.f228671i);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f228672j & 1) == 0) {
            sb.append(" showPopupWindow");
        }
        if ((this.f228672j & 2) == 0) {
            sb.append(" showPopupWindowVoicematchNotSupported");
        }
        if (this.f228663a == null) {
            sb.append(" deviceIdToType");
        }
        if (this.f228666d == null) {
            sb.append(" deviceIds");
        }
        if ((this.f228672j & 4) == 0) {
            sb.append(" isVoiceMatchSucceeded");
        }
        if ((this.f228672j & 8) == 0) {
            sb.append(" isAvocadoSucceeded");
        }
        if ((this.f228672j & 16) == 0) {
            sb.append(" isAvocadoCapable");
        }
        if ((this.f228672j & 32) == 0) {
            sb.append(" isUnicornFlow");
        }
        if ((this.f228672j & 64) == 0) {
            sb.append(" flowType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo77285b(C58495hd hdVar) {
        this.f228663a = hdVar;
    }

    /* renamed from: c */
    public final void mo77286c(C58485gu guVar) {
        if (guVar != null) {
            this.f228666d = guVar;
            return;
        }
        throw new NullPointerException("Null deviceIds");
    }

    /* renamed from: d */
    public final void mo77287d(int i) {
        this.f228671i = i;
        this.f228672j = (byte) (this.f228672j | 64);
    }

    /* renamed from: e */
    public final void mo77288e(boolean z) {
        this.f228669g = z;
        this.f228672j = (byte) (this.f228672j | 16);
    }

    /* renamed from: f */
    public final void mo77289f(boolean z) {
        this.f228668f = z;
        this.f228672j = (byte) (this.f228672j | 8);
    }

    /* renamed from: g */
    public final void mo77290g(boolean z) {
        this.f228670h = z;
        this.f228672j = (byte) (this.f228672j | 32);
    }

    /* renamed from: h */
    public final void mo77291h(boolean z) {
        this.f228667e = z;
        this.f228672j = (byte) (this.f228672j | 4);
    }

    /* renamed from: i */
    public final void mo77292i(boolean z) {
        this.f228664b = z;
        this.f228672j = (byte) (this.f228672j | 1);
    }

    /* renamed from: j */
    public final void mo77293j(boolean z) {
        this.f228665c = z;
        this.f228672j = (byte) (this.f228672j | 2);
    }
}
