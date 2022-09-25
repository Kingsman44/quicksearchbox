package com.bumptech.glide.load.p293a;

import android.util.Log;
import com.bumptech.glide.load.C5955n;
import com.bumptech.glide.load.p293a.p295b.C5691g;
import com.bumptech.glide.load.p293a.p295b.C5695k;
import com.bumptech.glide.load.p293a.p295b.C5696l;
import com.bumptech.glide.load.p293a.p296c.C5710e;
import com.bumptech.glide.p291h.C5625l;

/* renamed from: com.bumptech.glide.load.a.ae */
/* compiled from: PG */
public final class C5662ae implements C5668ak, C5696l, C5670am {

    /* renamed from: a */
    public static final boolean f17060a = Log.isLoggable("Engine", 2);

    /* renamed from: b */
    public final C5675ar f17061b;

    /* renamed from: c */
    public final C5659ab f17062c;

    /* renamed from: d */
    public final C5683az f17063d;

    /* renamed from: e */
    public final C5660ac f17064e;

    /* renamed from: f */
    public final C5733z f17065f;

    /* renamed from: g */
    public final C5713f f17066g;

    /* renamed from: h */
    public final C5695k f17067h;

    public C5662ae(C5695k kVar, C5691g gVar, C5710e eVar, C5710e eVar2, C5710e eVar3, C5710e eVar4) {
        this.f17067h = kVar;
        C5660ac acVar = new C5660ac(gVar);
        this.f17064e = acVar;
        C5713f fVar = new C5713f();
        this.f17066g = fVar;
        synchronized (this) {
            synchronized (fVar) {
            }
        }
        this.f17061b = new C5675ar();
        this.f17062c = new C5659ab(eVar, eVar2, eVar4, this, this);
        this.f17065f = new C5733z(acVar);
        this.f17063d = new C5683az();
        kVar.f17164a = this;
    }

    /* renamed from: a */
    public static void m14701a(String str, long j, C5955n nVar) {
        double a = C5625l.m14592a(j);
        String obj = nVar.toString();
        Log.v("Engine", str + " in " + a + "ms, key: " + obj);
    }

    /* renamed from: b */
    public final synchronized void mo12138b(C5667aj ajVar, C5955n nVar) {
        this.f17061b.mo12178b(nVar, ajVar);
    }

    /* renamed from: c */
    public final synchronized void mo12139c(C5667aj ajVar, C5955n nVar, C5671an anVar) {
        if (anVar != null) {
            if (anVar.f17105a) {
                this.f17066g.mo12222b(nVar, anVar);
            }
        }
        this.f17061b.mo12178b(nVar, ajVar);
    }
}
