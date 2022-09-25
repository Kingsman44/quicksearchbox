package com.google.android.libraries.search.rendering.xuikit.p3097a.p3114b;

import android.os.Looper;
import com.google.android.apps.gsa.staticplugins.opa.p8410s.p8411a.C109977r;
import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21312s;
import com.google.protobuf.C62917ay;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4928b.C64247d;
import com.google.protos.youtube.elements.C66059au;
import com.google.protos.youtube.elements.C66166ck;
import p3186j$.util.Optional;
import p5488io.p5490b.C69794a;
import p5488io.p5490b.C70128t;
import p5488io.p5490b.p5491a.p5492a.C69795a;
import p5488io.p5490b.p5491a.p5493b.C69797b;
import p5488io.p5490b.p5496d.C69822d;
import p5488io.p5490b.p5497e.p5502e.p5503a.C69874i;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.a.b.e */
/* compiled from: PG */
public final class C39997e implements C21312s {

    /* renamed from: a */
    public final C109977r f105138a;

    /* renamed from: b */
    private final boolean f105139b;

    public C39997e(C109977r rVar, Optional optional) {
        this.f105138a = rVar;
        this.f105139b = ((Boolean) optional.orElse(true)).booleanValue();
    }

    /* renamed from: a */
    public final C62917ay mo25802a() {
        return C64247d.f173715d;
    }

    /* renamed from: b */
    public final /* synthetic */ C66059au mo25803b() {
        return null;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C69794a mo25804c(Object obj, C21311r rVar) {
        C64247d dVar = (C64247d) obj;
        if ((dVar.f173717a & 1) == 0) {
            C69794a aVar = C69874i.f186267a;
            C69822d dVar2 = C70101a.f186847o;
            return aVar;
        } else if (this.f105139b || Looper.myLooper() != Looper.getMainLooper()) {
            C69794a g = C69794a.m101255g(new C39996d(this, dVar));
            C70128t tVar = C69797b.f186184a;
            C69795a.m101266a(tVar);
            return g.mo61452j(tVar);
        } else {
            C109977r rVar2 = this.f105138a;
            C66166ck ckVar = dVar.f173718b;
            if (ckVar == null) {
                ckVar = C66166ck.f179921e;
            }
            rVar2.mo98277b(ckVar);
            C69794a aVar2 = C69874i.f186267a;
            C69822d dVar3 = C70101a.f186847o;
            return aVar2;
        }
    }
}
