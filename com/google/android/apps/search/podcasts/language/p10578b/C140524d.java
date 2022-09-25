package com.google.android.apps.search.podcasts.language.p10578b;

import com.google.android.apps.search.podcasts.language.p10577a.C140516a;
import com.google.android.apps.search.podcasts.language.p10577a.C140517b;
import com.google.android.apps.search.podcasts.language.p10577a.C140518c;
import com.google.android.apps.search.podcasts.p10600q.C140952k;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58817ah;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4017at.p4082j.p4083a.C54315as;
import com.google.p4017at.p4082j.p4083a.C54359bl;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Future;
import p5462h.p5463a.C69496am;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69648ae;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.language.b.d */
/* compiled from: PG */
final class C140524d implements C58817ah {

    /* renamed from: a */
    final /* synthetic */ C140532l f381662a;

    /* renamed from: b */
    final /* synthetic */ C60870cx f381663b;

    /* renamed from: c */
    final /* synthetic */ C69648ae f381664c;

    /* renamed from: d */
    final /* synthetic */ C69648ae f381665d;

    public C140524d(C140532l lVar, C60870cx cxVar, C69648ae aeVar, C69648ae aeVar2) {
        this.f381662a = lVar;
        this.f381663b = cxVar;
        this.f381664c = aeVar;
        this.f381665d = aeVar2;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C54315as asVar = (C54315as) obj;
        C140532l lVar = this.f381662a;
        Object r = C60856cj.m92909r(this.f381663b);
        C69664n.m101060f(r, "getDone(oldPreferredLanguageFuture)");
        List list = (List) r;
        Object r2 = C60856cj.m92909r((Future) this.f381664c.f186027a);
        C69664n.m101060f(r2, "getDone(newPreferredLanguageFuture)");
        Set set = (Set) r2;
        Object r3 = C60856cj.m92909r((Future) this.f381665d.f186027a);
        C69664n.m101060f(r3, "getDone(filterConstraintFuture)");
        C140516a aVar = (C140516a) r3;
        ArrayList arrayList = new ArrayList();
        int i = null;
        List list2 = asVar != null ? asVar.f142687b : null;
        if (list2 == null) {
            list2 = C69496am.f185918a;
        }
        Iterable iterable = asVar != null ? asVar.f142686a : null;
        if (iterable == null) {
            iterable = C69496am.f185918a;
        }
        if (aVar.f381651a.length() == 0) {
            if (!list2.isEmpty()) {
                String string = lVar.f381680c.getString(R.string.podcasts_language_settings_suggested_languages_header);
                C69664n.m101060f(string, "context.getString(R.stri…ggested_languages_header)");
                arrayList.add(new C140518c(string));
                ArrayList<C54359bl> arrayList2 = new ArrayList<>();
                for (Object next : iterable) {
                    if (list2.contains(((C54359bl) next).f142797a)) {
                        arrayList2.add(next);
                    }
                }
                ArrayList arrayList3 = new ArrayList(C69540x.m100804k(arrayList2, 10));
                for (C54359bl blVar : arrayList2) {
                    C69664n.m101060f(blVar, "it");
                    arrayList3.add(C140532l.m228238c(blVar, true, set));
                }
                arrayList.addAll(arrayList3);
            }
            String string2 = lVar.f381680c.getString(R.string.podcasts_language_settings_all_languages_header);
            C69664n.m101060f(string2, "context.getString(R.stri…ngs_all_languages_header)");
            arrayList.add(new C140518c(string2));
        }
        ArrayList<C54359bl> arrayList4 = new ArrayList<>();
        for (Object next2 : iterable) {
            C54359bl blVar2 = (C54359bl) next2;
            C69664n.m101060f(blVar2, "it");
            if (C140532l.m228239d(blVar2, list) && lVar.mo115718b(blVar2, aVar.f381651a)) {
                arrayList4.add(next2);
            }
        }
        ArrayList arrayList5 = new ArrayList(C69540x.m100804k(arrayList4, 10));
        for (C54359bl blVar3 : arrayList4) {
            C69664n.m101060f(blVar3, "it");
            arrayList5.add(C140532l.m228238c(blVar3, false, set));
        }
        arrayList.addAll(arrayList5);
        ArrayList<C54359bl> arrayList6 = new ArrayList<>();
        for (Object next3 : iterable) {
            C54359bl blVar4 = (C54359bl) next3;
            C69664n.m101060f(blVar4, "it");
            if (!C140532l.m228239d(blVar4, list) && lVar.mo115718b(blVar4, aVar.f381651a)) {
                arrayList6.add(next3);
            }
        }
        ArrayList arrayList7 = new ArrayList(C69540x.m100804k(arrayList6, 10));
        for (C54359bl blVar5 : arrayList6) {
            C69664n.m101060f(blVar5, "it");
            arrayList7.add(C140532l.m228238c(blVar5, false, set));
        }
        arrayList.addAll(arrayList7);
        if (aVar.f381652b) {
            i = 0;
        }
        return new C140517b(new C140952k(arrayList, i), !set.isEmpty());
    }
}
