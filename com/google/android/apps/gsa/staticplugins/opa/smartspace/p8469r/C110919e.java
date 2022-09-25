package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8469r;

import android.widget.RemoteViews;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.base.C58817ah;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.r.e */
/* compiled from: PG */
public final /* synthetic */ class C110919e implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C110925k f308978a;

    /* renamed from: b */
    public final /* synthetic */ RemoteViews f308979b;

    /* renamed from: c */
    public final /* synthetic */ boolean f308980c;

    public /* synthetic */ C110919e(C110925k kVar, RemoteViews remoteViews, boolean z) {
        this.f308978a = kVar;
        this.f308979b = remoteViews;
        this.f308980c = z;
    }

    public final Object apply(Object obj) {
        C110925k kVar = this.f308978a;
        RemoteViews remoteViews = this.f308979b;
        boolean z = this.f308980c;
        Optional optional = (Optional) obj;
        optional.getClass();
        optional.ifPresent(new C110920f(kVar, remoteViews, z));
        return C118826c.f331422a;
    }
}
