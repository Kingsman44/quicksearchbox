package com.google.assistant.p3825an.p3830c.p3831a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62947c;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.assistant.an.c.a.bk */
/* compiled from: PG */
public final class C49292bk extends C62934bn implements C63001dt {
    public C49292bk() {
        super(C49293bl.f127401b);
    }

    /* renamed from: a */
    public final void mo53227a(Iterable iterable) {
        copyOnWrite();
        C49293bl blVar = (C49293bl) this.instance;
        C49293bl blVar2 = C49293bl.f127401b;
        blVar.mo53230a();
        C62947c.addAll(iterable, (List) blVar.f127403a);
    }

    /* renamed from: b */
    public final void mo53228b(C49266al alVar) {
        copyOnWrite();
        C49293bl blVar = (C49293bl) this.instance;
        C49267am amVar = (C49267am) alVar.build();
        C49293bl blVar2 = C49293bl.f127401b;
        amVar.getClass();
        blVar.mo53230a();
        blVar.f127403a.add(amVar);
    }

    /* renamed from: c */
    public final void mo53229c(C49267am amVar) {
        copyOnWrite();
        C49293bl blVar = (C49293bl) this.instance;
        C49293bl blVar2 = C49293bl.f127401b;
        amVar.getClass();
        blVar.mo53230a();
        blVar.f127403a.add(amVar);
    }
}
