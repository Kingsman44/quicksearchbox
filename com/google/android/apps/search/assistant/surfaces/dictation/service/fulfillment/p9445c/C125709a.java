package com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9445c;

import com.google.android.apps.gsa.nga.api.a.af;
import com.google.android.apps.gsa.nga.engine.dictation.C75366d;
import com.google.android.apps.gsa.nga.engine.dictation.e;
import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.C125708c;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9460m.C125932u;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.c.a */
/* compiled from: PG */
public final class C125709a {
    /* renamed from: a */
    public static final boolean m205698a(C125708c cVar) {
        C69664n.m101061g(cVar, "<this>");
        if (m205699b(cVar)) {
            return false;
        }
        e eVar = cVar.f346478c.d;
        if (eVar == null) {
            eVar = e.b;
        }
        int a = C75366d.m121807a(eVar.a);
        if (a == 0 || a != 3) {
            return false;
        }
        af afVar = cVar.f346478c.a;
        if (afVar == null) {
            afVar = af.w;
        }
        if (!C69664n.m101066l(afVar.e, "com.google.android.gm")) {
            return false;
        }
        af afVar2 = cVar.f346478c.a;
        if (afVar2 == null) {
            afVar2 = af.w;
        }
        return C125932u.m205971c(afVar2.d);
    }

    /* renamed from: b */
    public static final boolean m205699b(C125708c cVar) {
        C69664n.m101061g(cVar, "<this>");
        return cVar.f346478c.c > 0;
    }
}
