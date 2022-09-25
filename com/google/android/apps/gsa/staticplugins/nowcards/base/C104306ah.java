package com.google.android.apps.gsa.staticplugins.nowcards.base;

import com.google.android.libraries.p1730f.C21385h;
import com.google.common.base.C58839bc;
import java.util.ArrayList;
import java.util.ListIterator;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.base.ah */
/* compiled from: PG */
final class C104306ah implements C21385h {

    /* renamed from: a */
    final /* synthetic */ C104307ai f290128a;

    public C104306ah(C104307ai aiVar) {
        this.f290128a = aiVar;
    }

    /* renamed from: a */
    public final void mo25386a() {
        C104307ai aiVar = this.f290128a;
        C58839bc bcVar = C104307ai.f290129a;
        ListIterator listIterator = aiVar.f290133d.listIterator();
        while (listIterator.hasNext()) {
            listIterator.nextIndex();
            if (bcVar.mo5941a((C104348l) listIterator.next())) {
                throw null;
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = aiVar.f290133d;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            C104348l lVar = (C104348l) arrayList2.get(i);
            if (!lVar.f290310e.f32175I) {
                arrayList.addAll(lVar.mo94030d());
                i++;
            } else {
                throw null;
            }
        }
        if (arrayList.isEmpty()) {
            throw null;
        }
        throw null;
    }
}
