package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8744l;

import android.content.Context;
import com.google.android.apps.gsa.search.core.p6519al.p6534ag.C84675a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.searchbox.p6944c.C88613q;
import com.google.android.apps.gsa.searchbox.shared.component.Elector;
import com.google.android.apps.gsa.staticplugins.searchboxroot.C117025g;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.l.b */
/* compiled from: PG */
public final class C116982b implements Elector {

    /* renamed from: a */
    private final C117025g f324755a;

    /* renamed from: b */
    private final Context f324756b;

    /* renamed from: c */
    private final C86124t f324757c;

    /* renamed from: d */
    private final C68214a f324758d;

    /* renamed from: e */
    private final C68214a f324759e;

    /* renamed from: f */
    private final C68214a f324760f;

    /* renamed from: g */
    private final C84675a f324761g;

    public C116982b(C117025g gVar, Context context, C86124t tVar, C68214a aVar, C68214a aVar2, C68214a aVar3, C84675a aVar4) {
        this.f324755a = gVar;
        this.f324756b = context;
        this.f324757c = tVar;
        this.f324758d = aVar;
        this.f324759e = aVar2;
        this.f324760f = aVar3;
        this.f324761g = aVar4;
    }

    /* renamed from: a */
    public final void setElections(C88613q qVar) {
        qVar.mo82282k(new C116985e(this.f324755a, this.f324756b, this.f324757c, this.f324758d));
        qVar.mo82284m(new C116981a(this.f324759e, this.f324760f, this.f324761g));
        qVar.mo82280i(new C116983c(this.f324757c));
    }
}
