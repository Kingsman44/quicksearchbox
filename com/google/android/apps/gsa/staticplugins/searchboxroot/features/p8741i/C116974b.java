package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8741i;

import android.content.Context;
import com.google.android.apps.gsa.nowoverlayservice.p6424c.C83484a;
import com.google.android.apps.gsa.search.core.C85651bb;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.searchbox.p6944c.C88613q;
import com.google.android.apps.gsa.searchbox.shared.component.Elector;
import com.google.android.apps.gsa.staticplugins.searchboxroot.C117025g;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.i.b */
/* compiled from: PG */
public final class C116974b implements Elector {

    /* renamed from: a */
    private final Context f324734a;

    /* renamed from: b */
    private final C85651bb f324735b;

    /* renamed from: c */
    private final C117025g f324736c;

    /* renamed from: d */
    private final C86124t f324737d;

    /* renamed from: e */
    private final C83484a f324738e;

    public C116974b(Context context, C85651bb bbVar, C117025g gVar, C86124t tVar, C83484a aVar) {
        this.f324734a = context;
        this.f324735b = bbVar;
        this.f324736c = gVar;
        this.f324737d = tVar;
        this.f324738e = aVar;
    }

    /* renamed from: a */
    public final void setElections(C88613q qVar) {
        qVar.mo82282k(new C116975c(this.f324734a, this.f324735b, this.f324736c, this.f324737d, this.f324738e));
        qVar.mo82284m(new C116973a(this.f324734a));
    }
}
