package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b;

import android.media.MediaRouter;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.b */
/* compiled from: PG */
public final /* synthetic */ class C95978b implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ MediaRouter.RouteInfo f268718a;

    /* renamed from: b */
    public final /* synthetic */ boolean f268719b;

    /* renamed from: c */
    public final /* synthetic */ boolean f268720c;

    /* renamed from: d */
    public final /* synthetic */ boolean f268721d;

    public /* synthetic */ C95978b(MediaRouter.RouteInfo routeInfo, boolean z, boolean z2, boolean z3) {
        this.f268718a = routeInfo;
        this.f268719b = z;
        this.f268720c = z2;
        this.f268721d = z3;
    }

    public final void accept(Object obj) {
        ((C96026d) obj).mo89849io(this.f268718a, this.f268719b, this.f268720c, this.f268721d);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
