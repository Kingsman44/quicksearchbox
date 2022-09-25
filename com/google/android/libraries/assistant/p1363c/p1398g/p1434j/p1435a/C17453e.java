package com.google.android.libraries.assistant.p1363c.p1398g.p1434j.p1435a;

import androidx.media3.common.C2663g;
import androidx.media3.exoplayer.C2759ad;
import androidx.media3.exoplayer.p145h.C3038au;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17522y;

/* renamed from: com.google.android.libraries.assistant.c.g.j.a.e */
/* compiled from: PG */
public final /* synthetic */ class C17453e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C17522y f50404a;

    /* renamed from: b */
    public final /* synthetic */ C2759ad f50405b;

    /* renamed from: c */
    public final /* synthetic */ C3038au f50406c;

    public /* synthetic */ C17453e(C17522y yVar, C2759ad adVar, C3038au auVar) {
        this.f50404a = yVar;
        this.f50405b = adVar;
        this.f50406c = auVar;
    }

    public final void run() {
        C17522y yVar = this.f50404a;
        C2759ad adVar = this.f50405b;
        C3038au auVar = this.f50406c;
        if ((yVar.f50537a & 1) != 0) {
            adVar.mo6466Y(C2663g.m7201a(1, yVar.f50538b), false);
        }
        adVar.mo5974B(false);
        adVar.mo6467Z(auVar);
        adVar.mo6017x();
    }
}
