package com.google.android.apps.search.assistant.platform.pcp.p9329f;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62947c;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.f.am */
/* compiled from: PG */
public final class C123719am extends C62934bn implements C63001dt {
    public C123719am() {
        super(C123726at.f341743h);
    }

    /* renamed from: a */
    public final void mo106109a(Iterable iterable) {
        copyOnWrite();
        C123726at atVar = (C123726at) this.instance;
        C123726at atVar2 = C123726at.f341743h;
        atVar.mo106111a();
        C62947c.addAll(iterable, (List) atVar.f341747b);
    }

    /* renamed from: b */
    public final void mo106110b(C123722ap apVar) {
        copyOnWrite();
        C123726at atVar = (C123726at) this.instance;
        C123723aq aqVar = (C123723aq) apVar.build();
        C123726at atVar2 = C123726at.f341743h;
        aqVar.getClass();
        atVar.mo106111a();
        atVar.f341747b.add(aqVar);
    }
}
