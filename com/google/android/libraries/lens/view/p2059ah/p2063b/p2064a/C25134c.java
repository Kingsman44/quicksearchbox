package com.google.android.libraries.lens.view.p2059ah.p2063b.p2064a;

import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24453h;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24469x;
import com.google.android.libraries.lens.view.p2059ah.p2063b.C25131a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: com.google.android.libraries.lens.view.ah.b.a.c */
/* compiled from: PG */
final class C25134c implements C60845bz {

    /* renamed from: a */
    private final WeakReference f68439a;

    /* renamed from: b */
    private final String f68440b;

    public C25134c(C25131a aVar, String str) {
        this.f68439a = new WeakReference(aVar);
        this.f68440b = str;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C25131a aVar = (C25131a) this.f68439a.get();
        C59104x d = C25136e.f68442a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "MddWrapperTranslateModelsManager");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(49821)).mo56389s("failed to complete deletion event %s", aVar);
        if (aVar != null) {
            aVar.mo30276h(this.f68440b, th.getMessage());
        }
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        List<C24469x> list = (List) obj;
        C25131a aVar = (C25131a) this.f68439a.get();
        C58976aa aaVar = C58975e.f156826a;
        if (aVar != null) {
            for (C24469x xVar : list) {
                int a = C24453h.m45537a(xVar.f66979c);
                if (a != 0 && a == 2) {
                    aVar.mo30271c(this.f68440b);
                } else {
                    aVar.mo30276h(this.f68440b, "Deletion failed");
                }
            }
        }
    }
}
