package com.google.android.apps.search.googleapp.search.suggest.sources.icing.crossprofile;

import android.os.Bundle;
import com.google.android.enterprise.connectedapps.C142549ai;
import com.google.android.enterprise.connectedapps.C142551ak;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.sources.icing.crossprofile.q */
/* compiled from: PG */
final class C138529q extends C142551ak {

    /* renamed from: a */
    final /* synthetic */ IcingCrossProfileConnector_Service f376783a;

    /* renamed from: b */
    private final C138530r f376784b = new C138530r();

    public C138529q(IcingCrossProfileConnector_Service icingCrossProfileConnector_Service) {
        this.f376783a = icingCrossProfileConnector_Service;
    }

    /* renamed from: a */
    public final void mo77085a(long j, int i, int i2, byte[] bArr) {
        C138530r rVar = this.f376784b;
        this.f376783a.getApplicationContext();
        rVar.f376785a.mo117193a(j, i, i2, bArr);
    }

    /* renamed from: b */
    public final byte[] mo77086b(long j, int i, long j2, int i2, byte[] bArr, C142549ai aiVar) {
        return this.f376784b.mo114308a(this.f376783a.getApplicationContext(), j, i, j2, i2, bArr, aiVar);
    }

    /* renamed from: c */
    public final byte[] mo77087c(long j, int i) {
        C138530r rVar = this.f376784b;
        this.f376783a.getApplicationContext();
        return rVar.f376785a.mo117194c(j, i);
    }

    /* renamed from: d */
    public final Bundle mo77088d(long j) {
        C138530r rVar = this.f376784b;
        this.f376783a.getApplicationContext();
        return rVar.f376785a.mo117195d(j);
    }

    /* renamed from: e */
    public final void mo77089e(long j, Bundle bundle) {
        C138530r rVar = this.f376784b;
        this.f376783a.getApplicationContext();
        rVar.f376785a.mo117196e(j, bundle);
    }
}
