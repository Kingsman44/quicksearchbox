package com.google.android.libraries.elements.p1708c.p1709a;

import android.os.Looper;
import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21312s;
import com.google.android.libraries.elements.p1708c.C20698a;
import com.google.protobuf.C62917ay;
import com.google.protos.youtube.elements.C66059au;
import com.google.protos.youtube.elements.p5167c.C66152d;
import p3186j$.util.Objects;
import p5488io.p5490b.C69794a;
import p5488io.p5490b.C70128t;
import p5488io.p5490b.p5491a.p5492a.C69795a;
import p5488io.p5490b.p5491a.p5493b.C69797b;
import p5488io.p5490b.p5496d.C69822d;
import p5488io.p5490b.p5497e.p5502e.p5503a.C69874i;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: com.google.android.libraries.elements.c.a.r */
/* compiled from: PG */
public final class C20737r implements C21312s {

    /* renamed from: a */
    private final C20698a f58057a;

    public C20737r(C20698a aVar) {
        this.f58057a = aVar;
    }

    /* renamed from: a */
    public final C62917ay mo25802a() {
        return C66152d.f179872b;
    }

    /* renamed from: b */
    public final /* synthetic */ C66059au mo25803b() {
        return null;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C69794a mo25804c(Object obj, C21311r rVar) {
        C66152d dVar = (C66152d) obj;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.f58057a.mo25793a();
            C69794a aVar = C69874i.f186267a;
            C69822d dVar2 = C70101a.f186847o;
            return aVar;
        }
        C20698a aVar2 = this.f58057a;
        Objects.requireNonNull(aVar2);
        C69794a g = C69794a.m101255g(new C20736q(aVar2));
        C70128t tVar = C69797b.f186184a;
        C69795a.m101266a(tVar);
        return g.mo61452j(tVar);
    }
}
