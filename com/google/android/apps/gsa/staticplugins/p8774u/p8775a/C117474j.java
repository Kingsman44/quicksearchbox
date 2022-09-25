package com.google.android.apps.gsa.staticplugins.p8774u.p8775a;

import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e.C87320c;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e.C87321d;
import java.util.Comparator;

/* renamed from: com.google.android.apps.gsa.staticplugins.u.a.j */
/* compiled from: PG */
public final /* synthetic */ class C117474j implements Comparator {
    public final int compare(Object obj, Object obj2) {
        int a;
        int a2;
        C117473i iVar = (C117473i) obj;
        C117473i iVar2 = (C117473i) obj2;
        C87321d dVar = iVar.f326062c;
        C87321d dVar2 = iVar2.f326062c;
        if (dVar.mo80956b() != dVar2.mo80956b()) {
            C87320c b = dVar.mo80956b();
            C87320c b2 = dVar2.mo80956b();
            a = b.f235826d;
            a2 = b2.f235826d;
        } else if (dVar.mo80967a() == dVar2.mo80967a()) {
            return iVar.f326061b < iVar2.f326061b ? -1 : 1;
        } else {
            a = dVar.mo80967a();
            a2 = dVar2.mo80967a();
        }
        return a - a2;
    }
}
