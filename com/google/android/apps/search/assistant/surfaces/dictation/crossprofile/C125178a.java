package com.google.android.apps.search.assistant.surfaces.dictation.crossprofile;

import android.os.Bundle;
import com.google.android.enterprise.connectedapps.C142549ai;
import com.google.android.enterprise.connectedapps.C142551ak;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.crossprofile.a */
/* compiled from: PG */
final class C125178a extends C142551ak {

    /* renamed from: a */
    final /* synthetic */ DictationCrossProfileConnector_Service f345326a;

    /* renamed from: b */
    private final C125179b f345327b = new C125179b();

    public C125178a(DictationCrossProfileConnector_Service dictationCrossProfileConnector_Service) {
        this.f345326a = dictationCrossProfileConnector_Service;
    }

    /* renamed from: a */
    public final void mo77085a(long j, int i, int i2, byte[] bArr) {
        C125179b bVar = this.f345327b;
        this.f345326a.getApplicationContext();
        bVar.f345328a.mo117193a(j, i, i2, bArr);
    }

    /* renamed from: b */
    public final byte[] mo77086b(long j, int i, long j2, int i2, byte[] bArr, C142549ai aiVar) {
        return this.f345327b.mo106822a(this.f345326a.getApplicationContext(), j, i, j2, i2, bArr, aiVar);
    }

    /* renamed from: c */
    public final byte[] mo77087c(long j, int i) {
        C125179b bVar = this.f345327b;
        this.f345326a.getApplicationContext();
        return bVar.f345328a.mo117194c(j, i);
    }

    /* renamed from: d */
    public final Bundle mo77088d(long j) {
        C125179b bVar = this.f345327b;
        this.f345326a.getApplicationContext();
        return bVar.f345328a.mo117195d(j);
    }

    /* renamed from: e */
    public final void mo77089e(long j, Bundle bundle) {
        C125179b bVar = this.f345327b;
        this.f345326a.getApplicationContext();
        bVar.f345328a.mo117196e(j, bundle);
    }
}
