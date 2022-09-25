package com.google.android.apps.search.assistant.platform.p9171i.p9217c.p9220b.p9221a;

import android.text.TextUtils;
import com.google.android.apps.search.assistant.platform.p9171i.p9217c.p9220b.C121428c;
import com.google.android.apps.search.assistant.platform.p9171i.p9217c.p9220b.p9224d.C121438d;
import com.google.android.apps.search.assistant.platform.p9171i.p9217c.p9220b.p9224d.C121460z;
import com.google.android.apps.search.assistant.platform.p9171i.p9227d.p9229b.C121484b;
import com.google.android.libraries.assistant.p1594s.p1597b.C19141ab;
import com.google.android.libraries.assistant.p1594s.p1597b.C19149aj;
import com.google.android.libraries.assistant.p1594s.p1597b.C19153an;
import com.google.android.libraries.assistant.p1594s.p1597b.C19157ar;
import com.google.assistant.p3781ad.p3789d.C48580an;
import com.google.assistant.p3781ad.p3789d.p3791b.C48670ae;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.assistant.p3781ad.p3789d.p3791b.C48686au;
import com.google.assistant.p3781ad.p3789d.p3791b.C48708bp;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.search.assistant.platform.i.c.b.a.n */
/* compiled from: PG */
public final class C121425n implements C121412a {

    /* renamed from: a */
    public static final C59071e f337077a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.i.c.b.a.n");

    /* renamed from: a */
    public final C60870cx mo105129a(C48686au auVar, Map map) {
        C19153an anVar;
        C19141ab abVar = auVar.f125960b;
        if (abVar == null) {
            abVar = C19141ab.f53614i;
        }
        C19149aj ajVar = abVar.f53619d;
        if (ajVar == null) {
            ajVar = C19149aj.f53636b;
        }
        C121424m mVar = new C121424m(Collection.EL.stream(ajVar.f53638a).map(C121419h.f337072a));
        C19157ar arVar = abVar.f53618c;
        if (arVar == null) {
            arVar = C19157ar.f53652b;
        }
        C121424m mVar2 = new C121424m(Collection.EL.stream(arVar.f53654a).map(C121417f.f337070a));
        if (TextUtils.isEmpty(C121484b.m200740a(auVar.f125961c))) {
            anVar = abVar.f53621g;
            if (anVar == null) {
                anVar = C19153an.f53644b;
            }
        } else {
            anVar = abVar.f53622h;
            if (anVar == null) {
                anVar = C19153an.f53644b;
            }
        }
        C121424m mVar3 = new C121424m(Collection.EL.stream(anVar.f53646a).map(C121418g.f337071a));
        List<C121460z> list = (List) Collection.EL.stream(map.values()).flatMap(C121420i.f337073a).collect(Collectors.toCollection(C121421j.f337074a));
        Collections.sort(list, C121428c.f337079a);
        for (C121460z zVar : list) {
            C48708bp bpVar = zVar.f337124a.f125943b;
            if (bpVar == null) {
                bpVar = C48708bp.f126010g;
            }
            C48672ag b = C48672ag.m85259b(bpVar.f126013b);
            if (b == null) {
                b = C48672ag.UNKNOWN;
            }
            boolean z = !mVar.mo105135a(b);
            C48580an b2 = C48580an.m85241b(zVar.f337124a.f125945d);
            if (b2 == null) {
                b2 = C48580an.UNKNOWN;
            }
            boolean z2 = !mVar2.mo105135a(b2);
            C48670ae a = C48670ae.m85256a(zVar.f337124a.f125946e);
            if (a == null) {
                a = C48670ae.SUGGESTION_GROUP_FALLBACK;
            }
            boolean z3 = !mVar3.mo105135a(a);
            if (z || z2 || z3) {
                zVar.f337125b.f337123a = true;
            }
        }
        return C60856cj.m92900i(C121438d.f337093a);
    }
}
