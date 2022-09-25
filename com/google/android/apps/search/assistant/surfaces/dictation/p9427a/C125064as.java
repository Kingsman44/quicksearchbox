package com.google.android.apps.search.assistant.surfaces.dictation.p9427a;

import com.google.android.apps.gsa.unifiedime.C118605w;
import com.google.android.apps.gsa.unifiedime.C118606x;
import com.google.protobuf.C62934bn;
import com.google.protobuf.C62947c;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.a.as */
/* compiled from: PG */
public final class C125064as extends C62934bn implements C63001dt {
    public C125064as() {
        super(C125065at.f345040b);
    }

    /* renamed from: a */
    public final void mo106793a(Iterable iterable) {
        copyOnWrite();
        C125065at atVar = (C125065at) this.instance;
        C125065at atVar2 = C125065at.f345040b;
        atVar.mo106797a();
        C62947c.addAll(iterable, (List) atVar.f345042a);
    }

    /* renamed from: b */
    public final void mo106794b(C118605w wVar) {
        copyOnWrite();
        C125065at atVar = (C125065at) this.instance;
        C118606x xVar = (C118606x) wVar.build();
        C125065at atVar2 = C125065at.f345040b;
        xVar.getClass();
        atVar.mo106797a();
        atVar.f345042a.add(xVar);
    }

    /* renamed from: c */
    public final void mo106795c(C118606x xVar) {
        copyOnWrite();
        C125065at atVar = (C125065at) this.instance;
        C125065at atVar2 = C125065at.f345040b;
        xVar.getClass();
        atVar.mo106797a();
        atVar.f345042a.add(xVar);
    }

    /* renamed from: d */
    public final void mo106796d(int i) {
        copyOnWrite();
        C125065at atVar = (C125065at) this.instance;
        C125065at atVar2 = C125065at.f345040b;
        atVar.mo106797a();
        atVar.f345042a.remove(i);
    }
}
