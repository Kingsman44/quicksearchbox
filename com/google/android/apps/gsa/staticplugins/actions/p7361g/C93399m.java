package com.google.android.apps.gsa.staticplugins.actions.p7361g;

import android.text.TextUtils;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.C87448l;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.C87449m;
import com.google.android.apps.gsa.search.shared.actions.modular.p6922a.C87429c;
import com.google.android.apps.gsa.search.shared.actions.util.Suggestion;
import com.google.p4152bb.p4153a.C55136he;
import com.google.p4152bb.p4153a.C55365pr;
import com.google.p4152bb.p4153a.C55367pt;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.g.m */
/* compiled from: PG */
public final class C93399m {
    /* renamed from: a */
    public static List m153653a(C55365pr prVar, C87449m mVar, C87448l lVar) {
        ArrayList arrayList = null;
        if (prVar == null) {
            return null;
        }
        C62971cq<C55367pt> cqVar = prVar.f145888k;
        if (!cqVar.isEmpty()) {
            arrayList = new ArrayList();
            for (C55367pt ptVar : cqVar) {
                if ((ptVar.f145892a & 1) != 0) {
                    C55136he heVar = ptVar.f145893b;
                    if (heVar == null) {
                        heVar = C55136he.f145130j;
                    }
                    String str = heVar.f145133b;
                    if (!(mVar == null || lVar == null)) {
                        C87429c a = mVar.mo81378a(heVar, lVar, false);
                        if (a.mo81247f() && !TextUtils.isEmpty(a.mo81245d())) {
                            str = a.mo81245d();
                        }
                    }
                    arrayList.add(new Suggestion(str, ptVar));
                }
            }
        }
        return arrayList;
    }
}
