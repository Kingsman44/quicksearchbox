package com.google.android.apps.gsa.sidekick.shared.monet.util;

import com.google.android.apps.p489g.p494d.C9141ad;
import com.google.android.apps.p489g.p494d.C9277u;
import com.google.p375ai.p378b.C7526an;
import com.google.p375ai.p378b.C8142xb;
import com.google.p375ai.p378b.C8178yk;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.monet.util.a */
/* compiled from: PG */
public final class C91853a extends C91855c {

    /* renamed from: a */
    public C9141ad f256166a;

    /* renamed from: b */
    public C7526an f256167b;

    /* renamed from: c */
    public C9277u f256168c;

    /* renamed from: d */
    public C8178yk f256169d;

    /* renamed from: e */
    private C8142xb f256170e;

    /* renamed from: a */
    public final ClientControllerAction mo86354a() {
        C8142xb xbVar = this.f256170e;
        if (xbVar != null) {
            return new AutoValue_ClientControllerAction(this.f256166a, this.f256167b, xbVar, this.f256168c, this.f256169d);
        }
        throw new IllegalStateException("Missing required properties: surfaceType");
    }

    /* renamed from: b */
    public final void mo86355b(C8142xb xbVar) {
        if (xbVar != null) {
            this.f256170e = xbVar;
            return;
        }
        throw new NullPointerException("Null surfaceType");
    }
}
