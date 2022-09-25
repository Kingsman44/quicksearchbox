package com.google.android.gms.droidguard.internal;

import android.os.SystemClock;
import com.google.android.gms.droidguard.C144112b;
import com.google.android.gms.learning.p10820a.C144548dl;
import java.util.Map;

/* renamed from: com.google.android.gms.droidguard.internal.d */
/* compiled from: PG */
public final class C144124d extends C144133m {

    /* renamed from: a */
    final /* synthetic */ Map f390409a;

    /* renamed from: b */
    final /* synthetic */ C144128h f390410b;

    /* renamed from: c */
    final /* synthetic */ C144548dl f390411c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C144124d(C144128h hVar, String str, Map map, C144548dl dlVar) {
        super(str);
        this.f390410b = hVar;
        this.f390409a = map;
        this.f390411c = dlVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo119673b(C144112b bVar) {
        this.f390410b.f390426b.removeCallbacksAndMessages(this);
        C144128h hVar = this.f390410b;
        C144127g gVar = new C144127g(bVar, hVar.f390426b, this.f390409a, this.f390437e, this.f390438f, hVar.f390425a, this.f390411c);
        long a = (long) gVar.f390420d.mo119651a();
        gVar.f390418b.postAtTime(new C144125e(gVar, a, gVar), gVar, a + SystemClock.uptimeMillis());
        String a2 = gVar.f390417a.mo119658a(gVar.f390419c);
        gVar.f390417a.close();
        gVar.f390418b.removeCallbacksAndMessages(gVar);
        gVar.mo119677a(a2);
    }
}
