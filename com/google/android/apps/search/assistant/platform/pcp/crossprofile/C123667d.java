package com.google.android.apps.search.assistant.platform.pcp.crossprofile;

import android.os.Bundle;
import com.google.android.enterprise.connectedapps.C142549ai;
import com.google.android.enterprise.connectedapps.C142551ak;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.crossprofile.d */
/* compiled from: PG */
final class C123667d extends C142551ak {

    /* renamed from: a */
    final /* synthetic */ PcpCrossProfileConnector_Service f341630a;

    /* renamed from: b */
    private final C123668e f341631b = new C123668e();

    public C123667d(PcpCrossProfileConnector_Service pcpCrossProfileConnector_Service) {
        this.f341630a = pcpCrossProfileConnector_Service;
    }

    /* renamed from: a */
    public final void mo77085a(long j, int i, int i2, byte[] bArr) {
        C123668e eVar = this.f341631b;
        this.f341630a.getApplicationContext();
        eVar.f341632a.mo117193a(j, i, i2, bArr);
    }

    /* renamed from: b */
    public final byte[] mo77086b(long j, int i, long j2, int i2, byte[] bArr, C142549ai aiVar) {
        return this.f341631b.mo106092a(this.f341630a.getApplicationContext(), j, i, j2, i2, bArr, aiVar);
    }

    /* renamed from: c */
    public final byte[] mo77087c(long j, int i) {
        C123668e eVar = this.f341631b;
        this.f341630a.getApplicationContext();
        return eVar.f341632a.mo117194c(j, i);
    }

    /* renamed from: d */
    public final Bundle mo77088d(long j) {
        C123668e eVar = this.f341631b;
        this.f341630a.getApplicationContext();
        return eVar.f341632a.mo117195d(j);
    }

    /* renamed from: e */
    public final void mo77089e(long j, Bundle bundle) {
        C123668e eVar = this.f341631b;
        this.f341630a.getApplicationContext();
        eVar.f341632a.mo117196e(j, bundle);
    }
}
