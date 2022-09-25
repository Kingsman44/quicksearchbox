package com.google.android.apps.gsa.staticplugins.opa;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.gi */
/* compiled from: PG */
public final /* synthetic */ class C109072gi implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C109258hw f303682a;

    /* renamed from: b */
    public final /* synthetic */ List f303683b;

    public /* synthetic */ C109072gi(C109258hw hwVar, List list) {
        this.f303682a = hwVar;
        this.f303683b = list;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C109258hw hwVar = this.f303682a;
        List list = this.f303683b;
        ((Optional) obj).ifPresent(new C109131gt(hwVar, list));
        hwVar.mo97721k(list);
    }
}
