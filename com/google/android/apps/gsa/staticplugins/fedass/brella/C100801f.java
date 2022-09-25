package com.google.android.apps.gsa.staticplugins.fedass.brella;

import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100742h;
import com.google.android.apps.gsa.staticplugins.fedass.p7947f.C100848a;
import com.google.android.gms.learning.C144581d;
import com.google.android.gms.learning.internal.C144771c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.brella.f */
/* compiled from: PG */
final class C100801f implements C144581d {

    /* renamed from: a */
    public static final C59071e f281730a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.fedass.brella.f");

    /* renamed from: b */
    public final C100848a f281731b;

    public C100801f(C100848a aVar) {
        this.f281731b = aVar;
    }

    /* renamed from: a */
    public final void mo92061a(int i) {
        C100742h.m166944c(this.f281731b.mo92068c(i)).mo92038i(new C100800e(i));
    }

    /* renamed from: b */
    public final void mo92062b(C144771c cVar) {
        C100742h.m166944c(this.f281731b.mo92067b()).mo92036f(new C100798c(cVar)).mo92038i(new C100799d(cVar));
    }

    public final void close() {
        try {
            this.f281731b.close();
        } catch (Exception e) {
            C59104x c = f281730a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "GsaExampleStoreItr");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(19500)).mo56389s("Failed to close the adapter : %s", this.f281731b);
        }
    }
}
