package com.google.android.apps.search.googleapp.search.suggest.p10443a;

import com.google.android.apps.search.googleapp.search.suggest.C138030av;
import com.google.android.apps.search.googleapp.search.suggest.C138034az;
import com.google.android.apps.search.googleapp.search.suggest.C138133o;
import com.google.common.base.C58817ah;
import java.util.List;
import java.util.ListIterator;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.a.au */
/* compiled from: PG */
public final /* synthetic */ class C137935au implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C138133o f375275a;

    public /* synthetic */ C137935au(C138133o oVar) {
        this.f375275a = oVar;
    }

    public final Object apply(Object obj) {
        List list = (List) obj;
        if (!this.f375275a.f375825b.isEmpty() && !Collection.EL.stream(list).noneMatch(C137932ar.f375272a)) {
            ListIterator listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                C138034az a = C138034az.m224336a(((C138030av) listIterator.next()).f375545i);
                if (a == null) {
                    a = C138034az.NONE;
                }
                if (a == C138034az.SUGGEST_2G_LITE) {
                    listIterator.remove();
                }
            }
        }
        return list;
    }
}
