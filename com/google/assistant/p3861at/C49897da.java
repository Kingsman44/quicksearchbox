package com.google.assistant.p3861at;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62947c;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.assistant.at.da */
/* compiled from: PG */
public final class C49897da extends C62934bn implements C63001dt {
    public C49897da() {
        super(C49898db.f129704b);
    }

    /* renamed from: a */
    public final void mo53370a(Iterable iterable) {
        copyOnWrite();
        C49898db dbVar = (C49898db) this.instance;
        C49898db dbVar2 = C49898db.f129704b;
        dbVar.mo53374a();
        C62947c.addAll(iterable, (List) dbVar.f129706a);
    }

    /* renamed from: b */
    public final void mo53371b(C49902df dfVar) {
        copyOnWrite();
        C49898db dbVar = (C49898db) this.instance;
        C49903dg dgVar = (C49903dg) dfVar.build();
        C49898db dbVar2 = C49898db.f129704b;
        dgVar.getClass();
        dbVar.mo53374a();
        dbVar.f129706a.add(dgVar);
    }

    /* renamed from: c */
    public final void mo53372c(C49903dg dgVar) {
        copyOnWrite();
        C49898db dbVar = (C49898db) this.instance;
        C49898db dbVar2 = C49898db.f129704b;
        dgVar.getClass();
        dbVar.mo53374a();
        dbVar.f129706a.add(dgVar);
    }

    /* renamed from: d */
    public final void mo53373d(int i, C49903dg dgVar) {
        copyOnWrite();
        C49898db dbVar = (C49898db) this.instance;
        C49898db dbVar2 = C49898db.f129704b;
        dgVar.getClass();
        dbVar.mo53374a();
        dbVar.f129706a.set(i, dgVar);
    }
}
