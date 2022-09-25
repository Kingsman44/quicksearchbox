package com.google.android.libraries.logging;

import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* renamed from: com.google.android.libraries.logging.k */
/* compiled from: PG */
public abstract class C28293k {

    /* renamed from: c */
    public static final C28293k f76979c = new C28257a((C28292j) null, C58485gu.m89845m());

    /* renamed from: c */
    public static C28293k m52906c(C28292j jVar, Iterable iterable) {
        return new C28257a(jVar, C58485gu.m89841i(iterable));
    }

    /* renamed from: d */
    public static C28293k m52907d(C28292j jVar, List list) {
        C58838bb.m90866a(list, "Children iterable is null.");
        if (!list.isEmpty()) {
            C58838bb.m90869d(!list.contains((Object) null), "null VeTreeNode child in children iterable.");
            return new C28257a(jVar, new ArrayList(list));
        } else if (jVar == null) {
            return f76979c;
        } else {
            return new C28257a(jVar, C58485gu.m89845m());
        }
    }

    /* renamed from: e */
    public static C28293k m52908e(C28292j jVar, C28293k... kVarArr) {
        if (kVarArr.length == 0) {
            return jVar == null ? f76979c : new C28257a(jVar, C58485gu.m89845m());
        }
        return new C28257a(jVar, C58485gu.m89844l(kVarArr));
    }

    /* renamed from: a */
    public abstract C28292j mo33745a();

    /* renamed from: b */
    public abstract List mo33746b();
}
