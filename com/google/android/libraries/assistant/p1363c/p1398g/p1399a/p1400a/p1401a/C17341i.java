package com.google.android.libraries.assistant.p1363c.p1398g.p1399a.p1400a.p1401a;

import android.net.Uri;
import androidx.media3.common.C2590aq;
import androidx.media3.exoplayer.C2758ac;
import androidx.media3.exoplayer.C2759ad;
import androidx.media3.exoplayer.p145h.C3086bx;
import androidx.media3.exoplayer.p145h.C3087by;
import com.google.android.libraries.assistant.p1363c.p1398g.p1399a.C17332a;
import com.google.android.libraries.assistant.p1363c.p1398g.p1399a.C17359d;
import com.google.apps.tiktok.concurrent.C46428ao;
import com.google.common.util.concurrent.C60803ak;
import com.google.common.util.concurrent.C60812at;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.assistant.c.g.a.a.a.i */
/* compiled from: PG */
public final /* synthetic */ class C17341i implements C60803ak {

    /* renamed from: a */
    public final /* synthetic */ C17342j f50182a;

    /* renamed from: b */
    public final /* synthetic */ C17332a f50183b;

    public /* synthetic */ C17341i(C17342j jVar, C17332a aVar) {
        this.f50182a = jVar;
        this.f50183b = aVar;
    }

    /* renamed from: a */
    public final Object mo23284a(C60812at atVar) {
        C17342j jVar = this.f50182a;
        C17332a aVar = this.f50183b;
        C17333a aVar2 = new C17333a();
        C17340h hVar = jVar.f50186c;
        C2758ac acVar = new C2758ac(hVar.f50180a, new C17334b(hVar));
        acVar.mo6457d(hVar.f50181b.getLooper());
        C2759ad a = acVar.mo6454a();
        C3087by a2 = new C3086bx(new C17335c(aVar2), C17336d.f50175a).mo6760b(C2590aq.m6794a(new Uri.Builder().scheme("bytes").authority("audio").build()));
        if (((C17359d) aVar).f50213a) {
            hVar.f50181b.post(new C17337e(a));
        }
        hVar.f50181b.post(new C17338f(a, a2));
        C46428ao aoVar = hVar.f50181b;
        Objects.requireNonNull(a);
        aoVar.post(new C17339g(a));
        C17356x xVar = jVar.f50185b;
        Executor executor = (Executor) xVar.f50209a.mo17428b();
        executor.getClass();
        C46428ao aoVar2 = (C46428ao) xVar.f50210b.mo17428b();
        aoVar2.getClass();
        aVar.getClass();
        C17355w wVar = new C17355w(executor, aoVar2, aVar, aVar2, a);
        atVar.mo57268a(wVar, jVar.f50184a);
        return wVar;
    }
}
