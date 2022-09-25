package com.google.android.libraries.lens.view.p2113h.p2115b.p2119d;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import androidx.media3.common.C2590aq;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.exoplayer.C2758ac;
import androidx.media3.exoplayer.C2759ad;
import androidx.media3.exoplayer.C2848br;
import androidx.media3.exoplayer.C2891ct;
import androidx.media3.exoplayer.dash.C2950s;
import androidx.media3.exoplayer.dash.DashMediaSource;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import androidx.media3.exoplayer.p145h.C3038au;
import androidx.media3.exoplayer.p145h.C3086bx;
import androidx.media3.exoplayer.p151k.C3243i;
import androidx.media3.exoplayer.p151k.C3244j;
import androidx.media3.p132b.C2495an;
import androidx.media3.p132b.C2513q;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26737af;
import com.google.common.base.C58837ba;
import java.util.HashMap;

/* renamed from: com.google.android.libraries.lens.view.h.b.d.a */
/* compiled from: PG */
public final /* synthetic */ class C26707a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C26715i f72820a;

    public /* synthetic */ C26707a(C26715i iVar) {
        this.f72820a = iVar;
    }

    public final void run() {
        C3038au auVar;
        C26715i iVar = this.f72820a;
        iVar.mo32026b();
        Context context = null;
        iVar.f72836g = C26737af.m49428a(C26715i.f72831b, new C26710d(iVar), (Handler) null);
        iVar.f72837h = new Surface(iVar.f72836g);
        C2758ac acVar = new C2758ac(iVar.f72833d);
        C2601a.m6832d(!acVar.f7660w);
        acVar.f7652o = true;
        acVar.mo6457d(iVar.f72833d.getMainLooper());
        iVar.f72838i = acVar.mo6454a();
        iVar.f72838i.mo6462M(new C26713g(iVar));
        C2759ad adVar = iVar.f72838i;
        Surface surface = iVar.f72837h;
        C2848br brVar = (C2848br) adVar;
        brVar.mo6600aQ();
        brVar.mo6590aG();
        brVar.mo6596aM(surface);
        int i = surface == null ? 0 : -1;
        brVar.mo6589aF(i, i);
        C2759ad adVar2 = iVar.f72838i;
        C26711e eVar = new C26711e(iVar);
        C2848br brVar2 = (C2848br) adVar2;
        brVar2.mo6600aQ();
        C2891ct aC = brVar2.mo6586aC(brVar2.f7997i);
        aC.mo6678e(7);
        aC.mo6677d(eVar);
        aC.mo6676c();
        iVar.f72838i.mo5977E(0);
        iVar.f72838i.mo5980H(0.0f);
        iVar.f72838i.mo5974B(true);
        C2759ad adVar3 = iVar.f72838i;
        Context context2 = iVar.f72833d;
        String T = C2612ak.m6937T(context2, "Lens");
        if (context2 != null) {
            context = context2.getApplicationContext();
        }
        int[] h = C3244j.m9456h(C2612ak.m6933P(context2));
        HashMap hashMap = new HashMap(8);
        hashMap.put(0, 1000000L);
        hashMap.put(2, (Long) C3244j.f9745a.get(h[0]));
        hashMap.put(3, (Long) C3244j.f9746b.get(h[1]));
        int i2 = 4;
        hashMap.put(4, (Long) C3244j.f9747c.get(h[2]));
        hashMap.put(5, (Long) C3244j.f9748d.get(h[3]));
        hashMap.put(10, (Long) C3244j.f9749e.get(h[4]));
        hashMap.put(9, (Long) C3244j.f9750f.get(h[5]));
        hashMap.put(7, (Long) C3244j.f9745a.get(h[0]));
        C2513q qVar = new C2513q(context2, T, (C2495an) C3243i.m9454a(context, hashMap));
        Uri uri = iVar.f72835f.f72827a;
        String lastPathSegment = uri.getLastPathSegment();
        if (!C58837ba.m90859h(lastPathSegment)) {
            i2 = C2612ak.m6992q(lastPathSegment);
        }
        C2590aq a = C2590aq.m6794a(uri);
        if (i2 == 0) {
            auVar = new DashMediaSource.Factory(new C2950s(qVar), qVar).mo6760b(a);
        } else if (i2 != 2) {
            auVar = new C3086bx(qVar).mo6760b(a);
        } else {
            auVar = new HlsMediaSource.Factory(qVar).mo6760b(a);
        }
        adVar3.mo6463N(auVar);
        iVar.f72835f.mo32023a(iVar.f72838i);
    }
}
