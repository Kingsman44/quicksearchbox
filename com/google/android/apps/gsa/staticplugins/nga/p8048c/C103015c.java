package com.google.android.apps.gsa.staticplugins.nga.p8048c;

import com.google.android.apps.gsa.search.core.p6805i.C86117m;
import com.google.android.apps.gsa.staticplugins.nga.p8067j.C103358h;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4522b.C58800sl;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.c.c */
/* compiled from: PG */
public final /* synthetic */ class C103015c implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C103016d f287604a;

    /* renamed from: b */
    public final /* synthetic */ C86117m f287605b;

    public /* synthetic */ C103015c(C103016d dVar, C86117m mVar) {
        this.f287604a = dVar;
        this.f287605b = mVar;
    }

    public final void run() {
        C103016d dVar = this.f287604a;
        C86117m mVar = this.f287605b;
        ArrayList arrayList = new ArrayList();
        C58800sl lA = dVar.f287607b.mo21395a().iterator();
        while (lA.hasNext()) {
            int intValue = ((Integer) lA.next()).intValue();
            if (mVar.mo79735a(intValue)) {
                arrayList.add(Integer.valueOf(intValue));
            }
        }
        dVar.f287606a.f288119a.mo93770d(new C103358h(arrayList));
    }
}
