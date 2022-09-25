package com.google.android.youtube.player.p3561b;

import android.os.Parcel;
import com.google.android.youtube.player.C45512h;

/* renamed from: com.google.android.youtube.player.b.q */
public final class C45497q implements C45502v {

    /* renamed from: a */
    final /* synthetic */ C45512h f118928a;

    /* renamed from: b */
    final /* synthetic */ C45503w f118929b;

    public C45497q(C45503w wVar, C45512h hVar) {
        this.f118929b = wVar;
        this.f118928a = hVar;
    }

    /* renamed from: a */
    public final void mo49661a() {
        C45475bg bgVar = this.f118929b.f118943j;
        C45512h hVar = this.f118928a;
        String str = hVar.f118966a;
        int i = hVar.f118967b + -1 != 0 ? 1 : 0;
        Parcel lr = bgVar.mo49586lr();
        lr.writeString(str);
        lr.writeInt(i);
        bgVar.mo49588lt(30, lr);
    }
}
