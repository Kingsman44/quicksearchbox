package com.google.android.apps.search.assistant.surfaces.bisto.p9403d;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62947c;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.d.au */
/* compiled from: PG */
public final class C124628au extends C62934bn implements C63001dt {
    public C124628au() {
        super(C124629av.f343812r);
    }

    /* renamed from: a */
    public final C124650bp mo106566a(int i) {
        return (C124650bp) ((C124629av) this.instance).f343828o.get(i);
    }

    /* renamed from: b */
    public final void mo106567b(Iterable iterable) {
        copyOnWrite();
        C124629av avVar = (C124629av) this.instance;
        C124629av avVar2 = C124629av.f343812r;
        avVar.mo106569a();
        C62947c.addAll(iterable, (List) avVar.f343828o);
    }

    /* renamed from: c */
    public final void mo106568c(int i, C124649bo boVar) {
        copyOnWrite();
        C124629av avVar = (C124629av) this.instance;
        C124650bp bpVar = (C124650bp) boVar.build();
        C124629av avVar2 = C124629av.f343812r;
        bpVar.getClass();
        avVar.mo106569a();
        avVar.f343828o.set(i, bpVar);
    }
}
