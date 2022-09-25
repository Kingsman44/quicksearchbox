package com.google.android.apps.gsa.staticplugins.nga.p8065h;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6287i.C80465m;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.HashSet;
import p3186j$.util.Iterator;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.h.l */
/* compiled from: PG */
public final /* synthetic */ class C103283l implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C103262ca f288077a;

    public /* synthetic */ C103283l(C103262ca caVar) {
        this.f288077a = caVar;
    }

    public final C60870cx apply(Object obj) {
        C103262ca caVar = this.f288077a;
        C103244bj bjVar = (C103244bj) obj;
        HashSet hashSet = new HashSet();
        Iterator.EL.forEachRemaining(bjVar.iterator(), new C103250bp(hashSet));
        int size = hashSet.size();
        if (size == 0) {
            return C60856cj.m92900i(C80465m.f220842e);
        }
        return caVar.f288045g.mo28209i(caVar.f288044f.mo37974b(), "[NGA] Got account, processing web results", new C103251bq(size, bjVar));
    }
}
