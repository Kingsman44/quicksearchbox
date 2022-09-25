package com.google.android.apps.gsa.speech.helper.crossprofile;

import android.os.Bundle;
import com.google.android.enterprise.connectedapps.C142549ai;
import com.google.android.enterprise.connectedapps.C142551ak;

/* renamed from: com.google.android.apps.gsa.speech.helper.crossprofile.t */
/* compiled from: PG */
final class C92335t extends C142551ak {

    /* renamed from: a */
    final /* synthetic */ GsaCrossProfileConnector_Service f257437a;

    /* renamed from: b */
    private final C92336u f257438b = new C92336u();

    public C92335t(GsaCrossProfileConnector_Service gsaCrossProfileConnector_Service) {
        this.f257437a = gsaCrossProfileConnector_Service;
    }

    /* renamed from: a */
    public final void mo77085a(long j, int i, int i2, byte[] bArr) {
        C92336u uVar = this.f257438b;
        this.f257437a.getApplicationContext();
        uVar.f257439a.mo117193a(j, i, i2, bArr);
    }

    /* renamed from: b */
    public final byte[] mo77086b(long j, int i, long j2, int i2, byte[] bArr, C142549ai aiVar) {
        return this.f257438b.mo86989a(this.f257437a.getApplicationContext(), j, i, j2, i2, bArr, aiVar);
    }

    /* renamed from: c */
    public final byte[] mo77087c(long j, int i) {
        C92336u uVar = this.f257438b;
        this.f257437a.getApplicationContext();
        return uVar.f257439a.mo117194c(j, i);
    }

    /* renamed from: d */
    public final Bundle mo77088d(long j) {
        C92336u uVar = this.f257438b;
        this.f257437a.getApplicationContext();
        return uVar.f257439a.mo117195d(j);
    }

    /* renamed from: e */
    public final void mo77089e(long j, Bundle bundle) {
        C92336u uVar = this.f257438b;
        this.f257437a.getApplicationContext();
        uVar.f257439a.mo117196e(j, bundle);
    }
}
