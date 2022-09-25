package com.google.android.apps.gsa.staticplugins.accl.p7331c;

import com.google.android.apps.gsa.p8889z.p8909e.p8910a.C119065u;
import com.google.android.apps.gsa.shared.p6968aa.C89061q;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.libraries.gsa.conversation.p1852f.C22589p;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.c.au */
/* compiled from: PG */
public final /* synthetic */ class C92783au implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C92792bb f258920a;

    /* renamed from: b */
    public final /* synthetic */ C89356b f258921b;

    /* renamed from: c */
    public final /* synthetic */ C89061q f258922c;

    /* renamed from: d */
    public final /* synthetic */ C22589p f258923d;

    public /* synthetic */ C92783au(C92792bb bbVar, C89356b bVar, C89061q qVar, C22589p pVar) {
        this.f258920a = bbVar;
        this.f258921b = bVar;
        this.f258922c = qVar;
        this.f258923d = pVar;
    }

    public final C60870cx apply(Object obj) {
        C92792bb bbVar = this.f258920a;
        C89356b bVar = this.f258921b;
        C89061q qVar = this.f258922c;
        C22589p pVar = this.f258923d;
        Query query = (Query) obj;
        C60870cx i = bbVar.f258938c.mo78721i(bVar, query, qVar, new C119065u(), C58836b.f156633a);
        C60870cx h = C60922j.m93045h(i, new C92781as(query), C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        bbVar.f258936a.mo28211k(h, "Obtained recognized text event.", new C92791ba(pVar));
        return i;
    }
}
