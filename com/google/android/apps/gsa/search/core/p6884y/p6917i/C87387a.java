package com.google.android.apps.gsa.search.core.p6884y.p6917i;

import com.google.android.apps.gsa.search.core.service.p6848e.p6849a.C86677b;
import com.google.android.apps.gsa.search.core.service.p6848e.p6849a.C86678c;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.libraries.gsa.monet.internal.service.C23028x;
import com.google.android.libraries.gsa.monet.service.C23054e;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.search.core.y.i.a */
/* compiled from: PG */
final class C87387a implements C23054e {

    /* renamed from: a */
    final /* synthetic */ C88244um f235969a;

    /* renamed from: b */
    final /* synthetic */ C86677b f235970b;

    /* renamed from: c */
    final /* synthetic */ C87388b f235971c;

    public C87387a(C87388b bVar, C88244um umVar, C86677b bVar2) {
        this.f235971c = bVar;
        this.f235969a = umVar;
        this.f235970b = bVar2;
    }

    /* renamed from: b */
    public final /* synthetic */ void mo28489b(C23028x xVar) {
    }

    /* renamed from: c */
    public final /* synthetic */ void mo28490c() {
    }

    /* renamed from: g */
    public final void mo28491g() {
        C86678c cVar = this.f235971c.f235972a;
        C88244um umVar = this.f235969a;
        C86677b bVar = this.f235970b;
        synchronized (cVar.f234152a) {
            List list = (List) cVar.f234153b.get(umVar);
            if (list != null) {
                list.remove(bVar);
                if (list.isEmpty()) {
                    cVar.f234153b.remove(umVar);
                }
            }
        }
    }
}
