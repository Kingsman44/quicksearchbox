package com.google.android.apps.gsa.sidekick.main.entry;

import android.content.Context;
import com.google.android.apps.gsa.search.core.C85651bb;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.util.debug.C91022f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C90994c;
import com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C90998g;
import com.google.android.apps.gsa.sidekick.shared.p7238g.C91737g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58881cr;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.sidekick.main.entry.ae */
/* compiled from: PG */
public final class C91300ae {

    /* renamed from: a */
    public static final long f254816a = TimeUnit.HOURS.toMinutes(24);

    /* renamed from: a */
    static C91314as m149234a(Context context, C90998g gVar, C91022f fVar, C22871g gVar2, Set set) {
        C91314as asVar = new C91314as(context, gVar, gVar2);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            asVar.registerObserver((C91737g) it.next());
        }
        fVar.mo85301a(asVar);
        return asVar;
    }

    /* renamed from: b */
    static C91319ax m149235b(C21370a aVar, C91022f fVar, C91305aj ajVar) {
        C91319ax axVar = new C91319ax(ajVar, aVar);
        fVar.mo85301a(axVar);
        return axVar;
    }

    /* renamed from: c */
    static C91319ax m149236c(C21370a aVar, C91022f fVar, C91330bh bhVar) {
        C91319ax axVar = new C91319ax(bhVar, aVar);
        fVar.mo85301a(axVar);
        return axVar;
    }

    /* renamed from: d */
    public static C58881cr m149237d(C86124t tVar, C85651bb bbVar) {
        return new C91299ad(bbVar, tVar);
    }

    /* renamed from: e */
    static C90998g m149238e(C21370a aVar) {
        return new C90994c(aVar, 10);
    }
}
