package com.google.android.apps.gsa.staticplugins.bisto.p7489g;

import com.google.android.apps.gsa.staticplugins.bisto.p7510o.C95710aa;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.g.du */
/* compiled from: PG */
final class C95424du implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ int f266987a;

    /* renamed from: b */
    final /* synthetic */ byte[] f266988b;

    /* renamed from: c */
    final /* synthetic */ C95425dv f266989c;

    public C95424du(C95425dv dvVar, int i, byte[] bArr) {
        this.f266989c = dvVar;
        this.f266987a = i;
        this.f266988b = bArr;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C95425dv.f266990b.mo56225c();
        c.mo56378ag(C58975e.f156826a, "WearDeviceSocketImpl");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(15028)).mo56389s("Failed to get device info for %s", this.f266989c.f266998i);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C95710aa.m158491e(this.f266987a, this.f266988b, (C124548d) obj);
    }
}
