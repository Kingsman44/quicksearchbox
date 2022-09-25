package com.google.android.youtube.player.p3561b;

import android.os.Parcel;

/* renamed from: com.google.android.youtube.player.b.k */
final class C45491k implements C45502v {

    /* renamed from: a */
    final /* synthetic */ int f118917a;

    /* renamed from: b */
    final /* synthetic */ C45503w f118918b;

    public C45491k(C45503w wVar, int i) {
        this.f118918b = wVar;
        this.f118917a = i;
    }

    /* renamed from: a */
    public final void mo49661a() {
        C45475bg bgVar = this.f118918b.f118943j;
        int i = this.f118917a;
        Parcel lr = bgVar.mo49586lr();
        lr.writeInt(i);
        bgVar.mo49588lt(8, lr);
    }
}
