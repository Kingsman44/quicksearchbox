package com.google.android.apps.search.googleapp.p10117aa;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62947c;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.apps.search.googleapp.aa.k */
/* compiled from: PG */
public final class C133126k extends C62934bn implements C63001dt {
    public C133126k() {
        super(C133127l.f362932d);
    }

    /* renamed from: a */
    public final void mo110985a(Iterable iterable) {
        copyOnWrite();
        C133127l lVar = (C133127l) this.instance;
        C133127l lVar2 = C133127l.f362932d;
        lVar.mo110990a();
        C62947c.addAll(iterable, (List) lVar.f362935b);
    }

    /* renamed from: b */
    public final void mo110986b(C133124i iVar) {
        copyOnWrite();
        C133127l lVar = (C133127l) this.instance;
        C133125j jVar = (C133125j) iVar.build();
        C133127l lVar2 = C133127l.f362932d;
        jVar.getClass();
        lVar.mo110990a();
        lVar.f362935b.add(jVar);
    }

    /* renamed from: c */
    public final void mo110987c(int i) {
        copyOnWrite();
        C133127l lVar = (C133127l) this.instance;
        C133127l lVar2 = C133127l.f362932d;
        lVar.mo110990a();
        lVar.f362935b.remove(i);
    }

    /* renamed from: d */
    public final void mo110988d(int i, C133124i iVar) {
        copyOnWrite();
        C133127l lVar = (C133127l) this.instance;
        C133125j jVar = (C133125j) iVar.build();
        C133127l lVar2 = C133127l.f362932d;
        jVar.getClass();
        lVar.mo110990a();
        lVar.f362935b.set(i, jVar);
    }

    /* renamed from: e */
    public final void mo110989e(int i, C133125j jVar) {
        copyOnWrite();
        C133127l lVar = (C133127l) this.instance;
        C133127l lVar2 = C133127l.f362932d;
        jVar.getClass();
        lVar.mo110990a();
        lVar.f362935b.set(i, jVar);
    }
}
