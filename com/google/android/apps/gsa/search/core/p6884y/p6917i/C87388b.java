package com.google.android.apps.gsa.search.core.p6884y.p6917i;

import com.google.android.apps.gsa.search.core.service.p6848e.p6849a.C86677b;
import com.google.android.apps.gsa.search.core.service.p6848e.p6849a.C86678c;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.common.base.C58838bb;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.google.android.apps.gsa.search.core.y.i.b */
/* compiled from: PG */
public final class C87388b {

    /* renamed from: a */
    public final C86678c f235972a;

    public C87388b(C86678c cVar) {
        this.f235972a = cVar;
    }

    /* renamed from: a */
    public final void mo81046a(C23052c cVar, C88244um umVar, C86677b bVar) {
        C58838bb.m90869d(!cVar.mo28420E(), "Cannot add a listener for a controller that is already destroyed.");
        C86678c cVar2 = this.f235972a;
        synchronized (cVar2.f234152a) {
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) cVar2.f234153b.get(umVar);
            if (copyOnWriteArrayList == null) {
                copyOnWriteArrayList = new CopyOnWriteArrayList();
                cVar2.f234153b.put(umVar, copyOnWriteArrayList);
            }
            copyOnWriteArrayList.add(bVar);
        }
        cVar.mo28427o(new C87387a(this, umVar, bVar));
    }
}
