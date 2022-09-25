package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c;

import com.google.android.apps.gsa.assistant.shared.C73840bc;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80103ar;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80136bn;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80275dd;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80905at;
import com.google.android.apps.gsa.nga.shared.p6368u.C81515c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p6976ag.p6980d.p6981a.C89124e;
import com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c.p8086a.C103651a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.c.bj */
/* compiled from: PG */
public final class C103688bj implements C103651a {

    /* renamed from: a */
    public final C86124t f288793a;

    /* renamed from: b */
    public final C81515c f288794b;

    /* renamed from: c */
    private final C89124e f288795c;

    /* renamed from: d */
    private final C22871g f288796d;

    /* renamed from: e */
    private final C73840bc f288797e;

    public C103688bj(C89124e eVar, C22871g gVar, C73840bc bcVar, C86124t tVar, C81515c cVar) {
        this.f288795c = eVar;
        this.f288796d = gVar;
        this.f288797e = bcVar;
        this.f288793a = tVar;
        this.f288794b = cVar;
    }

    /* renamed from: a */
    public final C60870cx mo93582a(C80136bn bnVar) {
        C80103ar arVar;
        C80103ar arVar2;
        if (bnVar.f219917a != 17) {
            return C60856cj.m92900i(C80275dd.f220288c);
        }
        C22871g gVar = this.f288796d;
        C60870cx a = this.f288797e.mo65320a();
        C89124e eVar = this.f288795c;
        if (bnVar.f219917a == 17) {
            arVar = (C80103ar) bnVar.f219918b;
        } else {
            arVar = C80103ar.f219810d;
        }
        Locale forLanguageTag = Locale.forLanguageTag(arVar.f219813b);
        if (bnVar.f219917a == 17) {
            arVar2 = (C80103ar) bnVar.f219918b;
        } else {
            arVar2 = C80103ar.f219810d;
        }
        e a2 = e.a(arVar2.f219814c);
        if (a2 == null) {
            a2 = e.a;
        }
        return C80905at.m128758b(gVar, "[NGA] QueryFinishSetupBarStatusHandler.getActiveFinishSetupBarTypes", a, eVar.mo83112b(forLanguageTag, a2), new C103687bi(this));
    }
}
