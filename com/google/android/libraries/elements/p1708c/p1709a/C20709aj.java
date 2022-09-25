package com.google.android.libraries.elements.p1708c.p1709a;

import android.os.Looper;
import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21312s;
import com.google.android.libraries.elements.p1708c.C20698a;
import com.google.common.p4580v.C60944c;
import com.google.protobuf.C62917ay;
import com.google.protos.youtube.elements.C66059au;
import com.google.protos.youtube.elements.C66166ck;
import com.google.protos.youtube.elements.p5167c.C66150b;
import com.google.protos.youtube.elements.p5167c.C66155g;
import p5488io.p5490b.C69794a;
import p5488io.p5490b.C70128t;
import p5488io.p5490b.p5491a.p5492a.C69795a;
import p5488io.p5490b.p5491a.p5493b.C69797b;
import p5488io.p5490b.p5496d.C69822d;
import p5488io.p5490b.p5497e.p5502e.p5503a.C69874i;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: com.google.android.libraries.elements.c.a.aj */
/* compiled from: PG */
public final class C20709aj implements C21312s {

    /* renamed from: a */
    public final C20698a f58019a;

    public C20709aj(C20698a aVar) {
        this.f58019a = aVar;
    }

    /* renamed from: a */
    public final C62917ay mo25802a() {
        return C66155g.f179876h;
    }

    /* renamed from: b */
    public final /* synthetic */ C66059au mo25803b() {
        return null;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C69794a mo25804c(Object obj, C21311r rVar) {
        C66155g gVar = (C66155g) obj;
        int i = gVar.f179878a;
        if ((i & 1) != 0) {
            if ((i & 8) != 0) {
                C60944c.m93093f(gVar.f179881d).toMillis();
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                C20698a aVar = this.f58019a;
                C66166ck ckVar = gVar.f179879b;
                if (ckVar == null) {
                    ckVar = C66166ck.f179921e;
                }
                int a = C66150b.m96836a(gVar.f179880c);
                if (a == 0) {
                    a = 1;
                }
                int i2 = gVar.f179882e;
                int i3 = gVar.f179883f;
                aVar.mo25794b(ckVar, a, rVar);
                C69794a aVar2 = C69874i.f186267a;
                C69822d dVar = C70101a.f186847o;
                return aVar2;
            }
            C69794a g = C69794a.m101255g(new C20708ai(this, gVar, rVar));
            C70128t tVar = C69797b.f186184a;
            C69795a.m101266a(tVar);
            return g.mo61452j(tVar);
        }
        C69794a aVar3 = C69874i.f186267a;
        C69822d dVar2 = C70101a.f186847o;
        return aVar3;
    }
}
