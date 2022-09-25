package com.google.android.apps.p489g.p493c;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62947c;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.apps.g.c.a */
/* compiled from: PG */
public final class C9128a extends C62934bn implements C63001dt {
    public C9128a() {
        super(C9129b.f31416f);
    }

    /* renamed from: a */
    public final C9133f mo17429a(int i) {
        return (C9133f) ((C9129b) this.instance).f31419b.get(i);
    }

    /* renamed from: b */
    public final void mo17430b(Iterable iterable) {
        copyOnWrite();
        C9129b bVar = (C9129b) this.instance;
        C9129b bVar2 = C9129b.f31416f;
        bVar.mo17434a();
        C62947c.addAll(iterable, (List) bVar.f31419b);
    }

    /* renamed from: c */
    public final void mo17431c(Iterable iterable) {
        copyOnWrite();
        C9129b bVar = (C9129b) this.instance;
        C9129b bVar2 = C9129b.f31416f;
        bVar.mo17435b();
        C62947c.addAll(iterable, (List) bVar.f31420c);
    }

    /* renamed from: d */
    public final void mo17432d(C9133f fVar) {
        copyOnWrite();
        C9129b bVar = (C9129b) this.instance;
        C9129b bVar2 = C9129b.f31416f;
        fVar.getClass();
        bVar.mo17434a();
        bVar.f31419b.add(fVar);
    }

    /* renamed from: e */
    public final void mo17433e(int i, C9132e eVar) {
        copyOnWrite();
        C9129b bVar = (C9129b) this.instance;
        C9133f fVar = (C9133f) eVar.build();
        C9129b bVar2 = C9129b.f31416f;
        fVar.getClass();
        bVar.mo17434a();
        bVar.f31419b.set(i, fVar);
    }
}
