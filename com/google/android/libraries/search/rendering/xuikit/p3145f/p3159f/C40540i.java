package com.google.android.libraries.search.rendering.xuikit.p3145f.p3159f;

import com.google.android.libraries.elements.C21196h;
import com.google.android.libraries.elements.interfaces.C21255ay;
import com.google.android.libraries.elements.interfaces.C21256az;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.search.rendering.xuikit.p3145f.p3159f.C40541j;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.f.f.i */
/* compiled from: PG */
final class C40540i implements Consumer {

    /* renamed from: a */
    final /* synthetic */ C40541j f106396a;

    /* renamed from: b */
    final /* synthetic */ C40541j.C40542a f106397b;

    public C40540i(C40541j jVar, C40541j.C40542a aVar) {
        this.f106396a = jVar;
        this.f106397b = aVar;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C28439i iVar = (C28439i) obj;
        C69664n.m101061g(iVar, "it");
        C40541j jVar = this.f106396a;
        jVar.f106406i = jVar.f106404g.mo42163a(iVar, jVar.f106405h);
        C21196h hVar = this.f106397b.f106410a;
        C21255ay b = hVar.f59458a.mo26721b();
        b.mo26714b(this.f106396a.f106406i);
        C21256az a = b.mo26713a();
        a.getClass();
        hVar.f59458a = a;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
