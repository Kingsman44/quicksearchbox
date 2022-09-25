package com.google.android.apps.gsa.staticplugins.opa.tapas.p8567o;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8562f.C112426g;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8562f.C112427h;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m.C112908gz;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113407er;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.o.i */
/* compiled from: PG */
public final class C113023i {

    /* renamed from: a */
    public static final C59071e f313208a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.o.i");

    /* renamed from: b */
    private final C68214a f313209b;

    /* renamed from: c */
    private final C68214a f313210c;

    /* renamed from: d */
    private final C86124t f313211d;

    public C113023i(C68214a aVar, C68214a aVar2, C86124t tVar) {
        this.f313209b = aVar;
        this.f313210c = aVar2;
        this.f313211d = tVar;
    }

    /* renamed from: a */
    public final C58485gu mo99819a(C113408es esVar) {
        C58485gu guVar;
        C58485gu guVar2 = (C58485gu) Collection.EL.stream(C58485gu.m89836F(Comparator.EL.reversed(Comparator.CC.comparing(((C112427h) this.f313209b.mo27525b()).mo99518b())), esVar.mo100120c().values())).filter(new C113001c(this)).collect(C58370cn.f155946a);
        Long valueOf = Long.valueOf(this.f313211d.mo79743a(C90063do.f249612gn));
        if (((long) guVar2.size()) > valueOf.longValue()) {
            guVar2 = guVar2.subList(0, valueOf.intValue());
        }
        C113407er b = esVar.mo100119b();
        b.mo100096f((C58495hd) Collection.EL.stream(guVar2).collect(C58370cn.m89403c(C113018d.f313202a, Function.CC.identity(), C113019e.f313203a)));
        C113408es a = b.mo100091a();
        if (this.f313211d.mo79746e(C90063do.f249391ce)) {
            guVar = ((C112427h) this.f313209b.mo27525b()).mo99517a(a.mo100118a().mo100024h(), a.mo100120c());
        } else {
            C112427h hVar = (C112427h) this.f313209b.mo27525b();
            guVar = C58485gu.m89836F(new C112426g(hVar, hVar.mo99518b()), a.mo100120c().values());
        }
        return (C58485gu) Collection.EL.stream(guVar).map(new C113021g(this, a)).filter(C113022h.f313207a).collect(C58370cn.f155946a);
    }

    /* renamed from: b */
    public final boolean mo99820b(C113415ez ezVar) {
        return ((C112908gz) this.f313210c.mo27525b()).mo99778a(ezVar.mo100206f()).isPresent();
    }
}
