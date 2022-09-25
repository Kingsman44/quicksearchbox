package com.google.android.apps.search.googleapp.search.suggest;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62947c;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.u */
/* compiled from: PG */
public final class C138543u extends C62934bn implements C63001dt {
    public C138543u() {
        super(C138678v.f377195e);
    }

    /* renamed from: a */
    public final void mo114309a(Iterable iterable) {
        copyOnWrite();
        C138678v vVar = (C138678v) this.instance;
        C138678v vVar2 = C138678v.f377195e;
        vVar.mo114465a();
        C62947c.addAll(iterable, (List) vVar.f377199c);
    }

    /* renamed from: b */
    public final void mo114310b(C138027as asVar) {
        copyOnWrite();
        C138678v vVar = (C138678v) this.instance;
        C138030av avVar = (C138030av) asVar.build();
        C138678v vVar2 = C138678v.f377195e;
        avVar.getClass();
        vVar.mo114465a();
        vVar.f377199c.add(avVar);
    }

    /* renamed from: c */
    public final void mo114311c(C138030av avVar) {
        copyOnWrite();
        C138678v vVar = (C138678v) this.instance;
        C138678v vVar2 = C138678v.f377195e;
        avVar.getClass();
        vVar.mo114465a();
        vVar.f377199c.add(avVar);
    }
}
