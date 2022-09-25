package com.google.android.youtube.player.p3561b;

import android.os.Parcel;

/* renamed from: com.google.android.youtube.player.b.p */
public final class C45496p implements C45502v {

    /* renamed from: a */
    final /* synthetic */ String f118925a;

    /* renamed from: b */
    final /* synthetic */ C45463av f118926b;

    /* renamed from: c */
    final /* synthetic */ C45503w f118927c;

    public C45496p(C45503w wVar, String str, C45463av avVar) {
        this.f118927c = wVar;
        this.f118925a = str;
        this.f118926b = avVar;
    }

    /* renamed from: a */
    public final void mo49661a() {
        C45475bg bgVar = this.f118927c.f118943j;
        String str = this.f118925a;
        C45463av avVar = this.f118926b;
        Parcel lr = bgVar.mo49586lr();
        lr.writeString(str);
        C45460as.m81140d(lr, avVar);
        bgVar.mo49588lt(24, lr);
    }
}
