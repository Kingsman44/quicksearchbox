package com.google.android.libraries.elements.p1708c.p1709a;

import android.os.Looper;
import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21312s;
import com.google.android.libraries.elements.p1708c.C20768d;
import com.google.protobuf.C62917ay;
import com.google.protos.youtube.elements.C66059au;
import com.google.protos.youtube.elements.C66166ck;
import com.google.protos.youtube.p5162a.p5163a.C65987d;
import p5488io.p5490b.C69794a;
import p5488io.p5490b.C70128t;
import p5488io.p5490b.p5491a.p5492a.C69795a;
import p5488io.p5490b.p5491a.p5493b.C69797b;
import p5488io.p5490b.p5496d.C69822d;
import p5488io.p5490b.p5497e.p5502e.p5503a.C69874i;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: com.google.android.libraries.elements.c.a.ah */
/* compiled from: PG */
public final class C20707ah implements C21312s {

    /* renamed from: a */
    public final C20768d f58015a;

    public C20707ah(C20768d dVar) {
        this.f58015a = dVar;
    }

    /* renamed from: a */
    public final C62917ay mo25802a() {
        return C65987d.f179468d;
    }

    /* renamed from: b */
    public final /* synthetic */ C66059au mo25803b() {
        return null;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C69794a mo25804c(Object obj, C21311r rVar) {
        C65987d dVar = (C65987d) obj;
        if ((dVar.f179470a & 1) == 0 || rVar.mo26732b() == null) {
            C69794a aVar = C69874i.f186267a;
            C69822d dVar2 = C70101a.f186847o;
            return aVar;
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            C20768d dVar3 = this.f58015a;
            C66166ck ckVar = dVar.f179471b;
            if (ckVar == null) {
                ckVar = C66166ck.f179921e;
            }
            dVar3.mo25833b(ckVar, rVar.mo26732b());
            C69794a aVar2 = C69874i.f186267a;
            C69822d dVar4 = C70101a.f186847o;
            return aVar2;
        } else {
            C69794a g = C69794a.m101255g(new C20706ag(this, dVar, rVar));
            C70128t tVar = C69797b.f186184a;
            C69795a.m101266a(tVar);
            return g.mo61452j(tVar);
        }
    }
}
