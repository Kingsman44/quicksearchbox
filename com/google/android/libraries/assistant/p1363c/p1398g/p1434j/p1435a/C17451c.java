package com.google.android.libraries.assistant.p1363c.p1398g.p1434j.p1435a;

import android.content.Context;
import android.net.Uri;
import androidx.media3.common.C2590aq;
import androidx.media3.exoplayer.C2758ac;
import androidx.media3.exoplayer.C2759ad;
import androidx.media3.exoplayer.p145h.C3086bx;
import androidx.media3.p132b.C2505i;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17522y;
import com.google.apps.tiktok.concurrent.C46428ao;
import com.google.common.base.C58881cr;

/* renamed from: com.google.android.libraries.assistant.c.g.j.a.c */
/* compiled from: PG */
public final /* synthetic */ class C17451c implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ Context f50399a;

    /* renamed from: b */
    public final /* synthetic */ C2505i f50400b;

    /* renamed from: c */
    public final /* synthetic */ C46428ao f50401c;

    /* renamed from: d */
    public final /* synthetic */ C17522y f50402d;

    public /* synthetic */ C17451c(Context context, C2505i iVar, C46428ao aoVar, C17522y yVar) {
        this.f50399a = context;
        this.f50400b = iVar;
        this.f50401c = aoVar;
        this.f50402d = yVar;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        Context context = this.f50399a;
        C2505i iVar = this.f50400b;
        C46428ao aoVar = this.f50401c;
        C17522y yVar = this.f50402d;
        C2758ac acVar = new C2758ac(context, new C17454f(context));
        acVar.mo6457d(aoVar.getLooper());
        C2759ad a = acVar.mo6454a();
        aoVar.post(new C17453e(yVar, a, new C3086bx(new C17452d(iVar)).mo6760b(C2590aq.m6794a(new Uri.Builder().scheme("bytes").authority("audio").build()))));
        return a;
    }
}
