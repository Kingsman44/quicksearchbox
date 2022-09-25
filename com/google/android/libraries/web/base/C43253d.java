package com.google.android.libraries.web.base;

import com.google.android.libraries.web.p3353c.C43323b;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;

/* renamed from: com.google.android.libraries.web.base.d */
/* compiled from: PG */
public final class C43253d extends C43255f {

    /* renamed from: a */
    public C43256g f113028a;

    /* renamed from: c */
    private String f113029c;

    /* renamed from: d */
    private C58495hd f113030d;

    /* renamed from: e */
    private C43323b f113031e;

    /* renamed from: f */
    private boolean f113032f;

    /* renamed from: g */
    private boolean f113033g;

    /* renamed from: h */
    private boolean f113034h;

    /* renamed from: i */
    private boolean f113035i;

    /* renamed from: j */
    private boolean f113036j;

    /* renamed from: k */
    private C58528ij f113037k;

    /* renamed from: l */
    private boolean f113038l;

    /* renamed from: m */
    private byte f113039m;

    public C43253d() {
    }

    /* renamed from: a */
    public final C43257h mo46340a() {
        String str;
        C58495hd hdVar;
        C43323b bVar;
        if (this.f113037k == null) {
            this.f113037k = C58733pz.f156496a;
        }
        if (this.f113039m == 63 && (str = this.f113029c) != null && (hdVar = this.f113030d) != null && (bVar = this.f113031e) != null) {
            return new C43254e(str, hdVar, bVar, this.f113032f, this.f113033g, this.f113034h, this.f113035i, this.f113036j, this.f113037k, this.f113028a, this.f113038l);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f113029c == null) {
            sb.append(" url");
        }
        if (this.f113030d == null) {
            sb.append(" additionalHttpHeaders");
        }
        if (this.f113031e == null) {
            sb.append(" clientData");
        }
        if ((this.f113039m & 1) == 0) {
            sb.append(" replaceCurrentEntry");
        }
        if ((this.f113039m & 2) == 0) {
            sb.append(" isAutoplayEnabled");
        }
        if ((this.f113039m & 4) == 0) {
            sb.append(" isWebLayerIntentProcessingDisabled");
        }
        if ((this.f113039m & 8) == 0) {
            sb.append(" allowIntentLaunchesInBackground");
        }
        if ((this.f113039m & 16) == 0) {
            sb.append(" isUserTyped");
        }
        if ((this.f113039m & 32) == 0) {
            sb.append(" triggerRequestBlockCallbacks");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo46341b(C58495hd hdVar) {
        this.f113030d = hdVar;
    }

    /* renamed from: c */
    public final void mo46342c(boolean z) {
        this.f113035i = z;
        this.f113039m = (byte) (this.f113039m | 8);
    }

    /* renamed from: d */
    public final void mo46343d(C43323b bVar) {
        if (bVar != null) {
            this.f113031e = bVar;
            return;
        }
        throw new NullPointerException("Null clientData");
    }

    /* renamed from: e */
    public final void mo46344e(boolean z) {
        this.f113033g = z;
        this.f113039m = (byte) (this.f113039m | 2);
    }

    /* renamed from: f */
    public final void mo46345f(boolean z) {
        this.f113036j = z;
        this.f113039m = (byte) (this.f113039m | 16);
    }

    /* renamed from: g */
    public final void mo46346g(boolean z) {
        this.f113034h = z;
        this.f113039m = (byte) (this.f113039m | 4);
    }

    /* renamed from: h */
    public final void mo46347h(boolean z) {
        this.f113032f = z;
        this.f113039m = (byte) (this.f113039m | 1);
    }

    /* renamed from: i */
    public final void mo46348i(boolean z) {
        this.f113038l = z;
        this.f113039m = (byte) (this.f113039m | 32);
    }

    /* renamed from: j */
    public final void mo46349j(String str) {
        if (str != null) {
            this.f113029c = str;
            return;
        }
        throw new NullPointerException("Null url");
    }

    public C43253d(C43257h hVar) {
        C43254e eVar = (C43254e) hVar;
        this.f113029c = eVar.f113040a;
        this.f113030d = eVar.f113041b;
        this.f113031e = eVar.f113042c;
        this.f113032f = eVar.f113043d;
        this.f113033g = eVar.f113044e;
        this.f113034h = eVar.f113045f;
        this.f113035i = eVar.f113046g;
        this.f113036j = eVar.f113047h;
        this.f113037k = eVar.f113048i;
        this.f113028a = eVar.f113049j;
        this.f113038l = eVar.f113050k;
        this.f113039m = 63;
    }
}
