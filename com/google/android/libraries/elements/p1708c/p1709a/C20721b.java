package com.google.android.libraries.elements.p1708c.p1709a;

import android.view.View;
import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21312s;
import com.google.protobuf.C62917ay;
import com.google.protos.youtube.elements.C66059au;
import com.google.protos.youtube.elements.p5165a.C66014b;
import p5488io.p5490b.C69794a;
import p5488io.p5490b.p5496d.C69822d;
import p5488io.p5490b.p5497e.p5502e.p5503a.C69874i;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: com.google.android.libraries.elements.c.a.b */
/* compiled from: PG */
public final class C20721b implements C21312s {
    /* renamed from: a */
    public final C62917ay mo25802a() {
        return C66014b.f179528d;
    }

    /* renamed from: b */
    public final /* synthetic */ C66059au mo25803b() {
        return null;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C69794a mo25804c(Object obj, C21311r rVar) {
        C66014b bVar = (C66014b) obj;
        View b = rVar.mo26732b() != null ? rVar.mo26732b() : rVar.mo26731a();
        if (b == null) {
            return C69794a.m101254f(new IllegalStateException("Unable to locate the component's view."));
        }
        if ((bVar.f179530a & 1) != 0 && !bVar.f179531b.isEmpty()) {
            return C69794a.m101255g(new C20699a(b, bVar));
        }
        C69794a aVar = C69874i.f186267a;
        C69822d dVar = C70101a.f186847o;
        return aVar;
    }
}
