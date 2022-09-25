package com.google.android.apps.gsa.nga.shared.p6345h;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62964ck;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.x */
/* compiled from: PG */
public final class C81328x extends C62934bn implements C63001dt {
    public C81328x() {
        super(C81237ab.f222379B);
    }

    /* renamed from: a */
    public final void mo74996a(Iterable iterable) {
        copyOnWrite();
        C81237ab abVar = (C81237ab) this.instance;
        C81237ab abVar2 = C81237ab.f222379B;
        C62964ck ckVar = abVar.f222391j;
        if (!ckVar.mo58948c()) {
            abVar.f222391j = C62942bv.mutableCopy(ckVar);
        }
        C62947c.addAll(iterable, (List) abVar.f222391j);
    }

    /* renamed from: b */
    public final void mo74997b(String str, C81309e eVar) {
        str.getClass();
        eVar.getClass();
        copyOnWrite();
        C81237ab abVar = (C81237ab) this.instance;
        C81237ab abVar2 = C81237ab.f222379B;
        C62995dn dnVar = abVar.f222385d;
        if (!dnVar.f170058b) {
            abVar.f222385d = dnVar.mo58980a();
        }
        abVar.f222385d.put(str, eVar);
    }

    /* renamed from: c */
    public final void mo74998c(String str, C81297ca caVar) {
        str.getClass();
        caVar.getClass();
        copyOnWrite();
        C81237ab abVar = C81237ab.f222379B;
        ((C81237ab) this.instance).mo74972a().put(str, caVar);
    }
}
