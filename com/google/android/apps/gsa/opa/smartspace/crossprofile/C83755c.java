package com.google.android.apps.gsa.opa.smartspace.crossprofile;

import android.os.Bundle;
import com.google.android.enterprise.connectedapps.C142549ai;
import com.google.android.enterprise.connectedapps.C142551ak;

/* renamed from: com.google.android.apps.gsa.opa.smartspace.crossprofile.c */
/* compiled from: PG */
final class C83755c extends C142551ak {

    /* renamed from: a */
    final /* synthetic */ SmartspaceCrossProfileConnector_Service f228291a;

    /* renamed from: b */
    private final C83756d f228292b = new C83756d();

    public C83755c(SmartspaceCrossProfileConnector_Service smartspaceCrossProfileConnector_Service) {
        this.f228291a = smartspaceCrossProfileConnector_Service;
    }

    /* renamed from: a */
    public final void mo77085a(long j, int i, int i2, byte[] bArr) {
        C83756d dVar = this.f228292b;
        this.f228291a.getApplicationContext();
        dVar.f228293a.mo117193a(j, i, i2, bArr);
    }

    /* renamed from: b */
    public final byte[] mo77086b(long j, int i, long j2, int i2, byte[] bArr, C142549ai aiVar) {
        return this.f228292b.mo77090a(this.f228291a.getApplicationContext(), j, i, j2, i2, bArr, aiVar);
    }

    /* renamed from: c */
    public final byte[] mo77087c(long j, int i) {
        C83756d dVar = this.f228292b;
        this.f228291a.getApplicationContext();
        return dVar.f228293a.mo117194c(j, i);
    }

    /* renamed from: d */
    public final Bundle mo77088d(long j) {
        C83756d dVar = this.f228292b;
        this.f228291a.getApplicationContext();
        return dVar.f228293a.mo117195d(j);
    }

    /* renamed from: e */
    public final void mo77089e(long j, Bundle bundle) {
        C83756d dVar = this.f228292b;
        this.f228291a.getApplicationContext();
        dVar.f228293a.mo117196e(j, bundle);
    }
}
