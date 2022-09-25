package com.google.android.apps.gsa.staticplugins.hotwordenrollment.crossprofile;

import android.os.Bundle;
import com.google.android.enterprise.connectedapps.C142549ai;
import com.google.android.enterprise.connectedapps.C142551ak;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.crossprofile.ae */
/* compiled from: PG */
final class C101723ae extends C142551ak {

    /* renamed from: a */
    final /* synthetic */ EnrollmentCrossProfileConnector_Service f283821a;

    /* renamed from: b */
    private final C101724af f283822b = new C101724af();

    public C101723ae(EnrollmentCrossProfileConnector_Service enrollmentCrossProfileConnector_Service) {
        this.f283821a = enrollmentCrossProfileConnector_Service;
    }

    /* renamed from: a */
    public final void mo77085a(long j, int i, int i2, byte[] bArr) {
        C101724af afVar = this.f283822b;
        this.f283821a.getApplicationContext();
        afVar.f283823a.mo117193a(j, i, i2, bArr);
    }

    /* renamed from: b */
    public final byte[] mo77086b(long j, int i, long j2, int i2, byte[] bArr, C142549ai aiVar) {
        return this.f283822b.mo92528a(this.f283821a.getApplicationContext(), j, i, j2, i2, bArr, aiVar);
    }

    /* renamed from: c */
    public final byte[] mo77087c(long j, int i) {
        C101724af afVar = this.f283822b;
        this.f283821a.getApplicationContext();
        return afVar.f283823a.mo117194c(j, i);
    }

    /* renamed from: d */
    public final Bundle mo77088d(long j) {
        C101724af afVar = this.f283822b;
        this.f283821a.getApplicationContext();
        return afVar.f283823a.mo117195d(j);
    }

    /* renamed from: e */
    public final void mo77089e(long j, Bundle bundle) {
        C101724af afVar = this.f283822b;
        this.f283821a.getApplicationContext();
        afVar.f283823a.mo117196e(j, bundle);
    }
}
