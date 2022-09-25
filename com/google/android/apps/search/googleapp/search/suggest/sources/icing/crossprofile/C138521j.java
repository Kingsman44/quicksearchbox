package com.google.android.apps.search.googleapp.search.suggest.sources.icing.crossprofile;

import com.google.android.apps.search.googleapp.search.suggest.C138027as;
import com.google.android.apps.search.googleapp.search.suggest.C138030av;
import com.google.android.apps.search.googleapp.search.suggest.C138133o;
import com.google.android.apps.search.googleapp.search.suggest.C138543u;
import com.google.android.apps.search.googleapp.search.suggest.C138678v;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4948ba.p4949a.C64369b;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.sources.icing.crossprofile.j */
/* compiled from: PG */
public final /* synthetic */ class C138521j implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C138523l f376768a;

    /* renamed from: b */
    public final /* synthetic */ C138133o f376769b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f376770c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f376771d;

    public /* synthetic */ C138521j(C138523l lVar, C138133o oVar, C60870cx cxVar, C60870cx cxVar2) {
        this.f376768a = lVar;
        this.f376769b = oVar;
        this.f376770c = cxVar;
        this.f376771d = cxVar2;
    }

    public final Object call() {
        C138523l lVar = this.f376768a;
        C138133o oVar = this.f376769b;
        C60870cx cxVar = this.f376770c;
        C60870cx cxVar2 = this.f376771d;
        C138543u uVar = (C138543u) C138678v.f377195e.createBuilder();
        String str = oVar.f375825b;
        uVar.copyOnWrite();
        C138678v vVar = (C138678v) uVar.instance;
        str.getClass();
        vVar.f377197a |= 1;
        vVar.f377198b = str;
        uVar.mo114309a(((C138678v) C60856cj.m92909r(cxVar)).f377199c);
        C138678v vVar2 = (C138678v) C60856cj.m92909r(cxVar2);
        if (vVar2.f377199c.size() == 0) {
            lVar.f376779e.mo117175b().mo117159k(lVar);
        } else {
            for (C138030av builder : vVar2.f377199c) {
                C138027as asVar = (C138027as) builder.toBuilder();
                asVar.mo114079a(C64369b.SUBTYPE_WORK_PROFILE_APP);
                uVar.mo114310b(asVar);
            }
        }
        return (C138678v) uVar.build();
    }
}
