package com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a;

import com.google.android.libraries.gsa.actionusermodel.p1830c.C22104g;
import com.google.protobuf.C62934bn;
import com.google.protobuf.C62947c;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.e.a.ay */
/* compiled from: PG */
public final class C80303ay extends C62934bn implements C63001dt {
    public C80303ay() {
        super(C80307bb.f220382e);
    }

    /* renamed from: a */
    public final void mo74302a(Iterable iterable) {
        copyOnWrite();
        C80307bb bbVar = (C80307bb) this.instance;
        C80307bb bbVar2 = C80307bb.f220382e;
        bbVar.mo74304a();
        C62947c.addAll(iterable, (List) bbVar.f220387d);
    }

    /* renamed from: b */
    public final void mo74303b(C22104g gVar) {
        copyOnWrite();
        C80307bb bbVar = (C80307bb) this.instance;
        C80307bb bbVar2 = C80307bb.f220382e;
        gVar.getClass();
        bbVar.mo74304a();
        bbVar.f220387d.add(gVar);
    }
}
