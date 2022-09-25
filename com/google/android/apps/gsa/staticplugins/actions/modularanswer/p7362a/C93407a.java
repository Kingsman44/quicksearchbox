package com.google.android.apps.gsa.staticplugins.actions.modularanswer.p7362a;

import com.google.android.apps.gsa.search.shared.actions.modular.arguments.C87449m;
import com.google.android.apps.gsa.search.shared.actions.modular.p6922a.C87429c;
import com.google.android.apps.gsa.staticplugins.actions.modularanswer.ModularAnswerImpl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p4152bb.p4153a.C55136he;
import com.google.p4152bb.p4153a.C55365pr;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.modularanswer.a.a */
/* compiled from: PG */
public final class C93407a {

    /* renamed from: a */
    public static final C59071e f260529a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.actions.modularanswer.a.a");

    /* renamed from: b */
    public static final C55365pr m153678b(List list, int i) {
        Iterator it = list.iterator();
        C55365pr prVar = null;
        while (it.hasNext()) {
            C55365pr prVar2 = (C55365pr) it.next();
            int i2 = prVar2.f145885h;
            if (i2 <= i && (prVar == null || i2 > prVar.f145885h)) {
                prVar = prVar2;
            }
        }
        return prVar == null ? (C55365pr) list.get(0) : prVar;
    }

    /* renamed from: a */
    public static final C87429c m153677a(C55365pr prVar, C87449m mVar, ModularAnswerImpl modularAnswerImpl) {
        if ((prVar.f145878a & 2) != 0) {
            C55136he heVar = prVar.f145880c;
            if (heVar == null) {
                heVar = C55136he.f145130j;
            }
            C87429c a = mVar.mo81378a(heVar, modularAnswerImpl, false);
            if (!a.mo81247f()) {
                return null;
            }
            return a;
        }
        ((C59052c) ((C59052c) f260529a.mo56226d()).mo56372aa(13582)).mo56386p("createVocalizedPrompt. Cannot find vocalized prompt from answer prompt.");
        return null;
    }
}
