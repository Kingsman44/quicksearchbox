package com.google.android.apps.search.googleapp.stampviewer;

import com.google.android.apps.search.googleapp.stampviewer.p10494f.C139392b;
import com.google.common.p4522b.C58485gu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.ac */
/* compiled from: PG */
public final class C139317ac {

    /* renamed from: a */
    public final List f378902a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b */
    public final List f378903b = Collections.synchronizedList(new ArrayList());

    /* renamed from: a */
    public final int mo114890a() {
        return this.f378902a.size();
    }

    /* renamed from: b */
    public final C139392b mo114891b(int i) {
        return (C139392b) this.f378902a.get(i);
    }

    /* renamed from: c */
    public final C58485gu mo114892c() {
        C58485gu j;
        synchronized (this.f378902a) {
            j = C58485gu.m89842j(this.f378902a);
        }
        return j;
    }

    /* renamed from: d */
    public final void mo114893d(List list) {
        synchronized (this.f378902a) {
            HashSet hashSet = new HashSet();
            this.f378902a.addAll((List) Collection.EL.stream(list).filter(new C139670y((Set) Collection.EL.stream(this.f378902a).map(C139489v.f379272a).map(C139504w.f379310a).collect(Collectors.toCollection(C139669x.f379647a)))).filter(new C139671z(hashSet)).collect(Collectors.toCollection(C139488u.f379271a)));
        }
        Collection.EL.stream(this.f378903b).forEach(C139315aa.f378901a);
    }
}
