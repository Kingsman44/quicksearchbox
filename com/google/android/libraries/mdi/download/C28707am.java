package com.google.android.libraries.mdi.download;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62947c;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.libraries.mdi.download.am */
/* compiled from: PG */
public final class C28707am extends C62934bn implements C63001dt {
    public C28707am() {
        super(C28708an.f77994l);
    }

    /* renamed from: a */
    public final void mo34327a(Iterable iterable) {
        copyOnWrite();
        C28708an anVar = (C28708an) this.instance;
        C28708an anVar2 = C28708an.f77994l;
        anVar.mo34330a();
        C62947c.addAll(iterable, (List) anVar.f78003h);
    }

    /* renamed from: b */
    public final void mo34328b(C28703ai aiVar) {
        copyOnWrite();
        C28708an anVar = (C28708an) this.instance;
        C28706al alVar = (C28706al) aiVar.build();
        C28708an anVar2 = C28708an.f77994l;
        alVar.getClass();
        anVar.mo34330a();
        anVar.f78003h.add(alVar);
    }

    /* renamed from: c */
    public final void mo34329c(C28706al alVar) {
        copyOnWrite();
        C28708an anVar = (C28708an) this.instance;
        C28708an anVar2 = C28708an.f77994l;
        alVar.getClass();
        anVar.mo34330a();
        anVar.f78003h.add(alVar);
    }
}
