package com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a;

import android.content.Context;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.monet.p7114f.C90323a;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8149a.C105391ac;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23053d;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.service.C23059j;
import com.google.android.libraries.gsa.monet.service.C23060k;
import com.google.android.libraries.gsa.monet.shared.C23115k;
import com.google.android.libraries.gsa.p1876k.C22871g;
import java.util.HashMap;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.c.a.dz */
/* compiled from: PG */
public final class C105285dz implements C23053d {

    /* renamed from: a */
    private final C69464a f293755a;

    /* renamed from: b */
    private final C23060k f293756b;

    /* renamed from: c */
    private final C69464a f293757c;

    /* renamed from: d */
    private final C69464a f293758d;

    public C105285dz(C69464a aVar, C23060k kVar, C69464a aVar2, C69464a aVar3) {
        this.f293755a = aVar;
        this.f293756b = kVar;
        this.f293757c = aVar2;
        this.f293758d = aVar3;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C23056g mo28440a(C23052c cVar) {
        C22871g gVar = (C22871g) this.f293756b.mo28502a(cVar, C23059j.f63412a);
        C105194ap apVar = new C105194ap(cVar);
        Context context = (Context) this.f293755a.mo17428b();
        C90323a aVar = (C90323a) this.f293757c.mo17428b();
        C86124t tVar = (C86124t) this.f293758d.mo17428b();
        C105284dy dyVar = new C105284dy(cVar, apVar);
        cVar.mo28426m(new C105391ac(dyVar));
        return dyVar;
    }

    /* renamed from: b */
    public final C23115k mo28441b() {
        return new C23115k(new HashMap());
    }
}
