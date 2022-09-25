package com.google.android.libraries.gsa.conversation.p1855h;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.gsa.conversation.h.n */
/* compiled from: PG */
public final class C22710n extends C22691ad {

    /* renamed from: a */
    public C58833ax f62511a = C58836b.f156633a;

    /* renamed from: b */
    private boolean f62512b;

    /* renamed from: c */
    private boolean f62513c;

    /* renamed from: d */
    private boolean f62514d;

    /* renamed from: e */
    private boolean f62515e;

    /* renamed from: f */
    private boolean f62516f;

    /* renamed from: g */
    private boolean f62517g;

    /* renamed from: h */
    private byte f62518h;

    /* renamed from: a */
    public final C22692ae mo27793a() {
        if (this.f62518h == 63) {
            return new C22711o(this.f62511a, this.f62512b, this.f62513c, this.f62514d, this.f62515e, this.f62516f, this.f62517g);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f62518h & 1) == 0) {
            sb.append(" isIrisFulfillmentEnabled");
        }
        if ((this.f62518h & 2) == 0) {
            sb.append(" isTtsPerformerOnDeviceSynthesisEnabled");
        }
        if ((this.f62518h & 4) == 0) {
            sb.append(" sendClientOpResultsForFollowOnDirectly");
        }
        if ((this.f62518h & 8) == 0) {
            sb.append(" isPrefetchStreamingEnabled");
        }
        if ((this.f62518h & 16) == 0) {
            sb.append(" isEagerCloudHandoverExecutionEnabled");
        }
        if ((this.f62518h & 32) == 0) {
            sb.append(" isResolveActivityBeforeProviderOpenEnabled");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo27794b(boolean z) {
        this.f62516f = z;
        this.f62518h = (byte) (this.f62518h | 16);
    }

    /* renamed from: c */
    public final void mo27795c(boolean z) {
        this.f62512b = z;
        this.f62518h = (byte) (this.f62518h | 1);
    }

    /* renamed from: d */
    public final void mo27796d(boolean z) {
        this.f62515e = z;
        this.f62518h = (byte) (this.f62518h | 8);
    }

    /* renamed from: e */
    public final void mo27797e(boolean z) {
        this.f62517g = z;
        this.f62518h = (byte) (this.f62518h | 32);
    }

    /* renamed from: f */
    public final void mo27798f(boolean z) {
        this.f62513c = z;
        this.f62518h = (byte) (this.f62518h | 2);
    }

    /* renamed from: g */
    public final void mo27799g(boolean z) {
        this.f62514d = z;
        this.f62518h = (byte) (this.f62518h | 4);
    }
}
