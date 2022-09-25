package com.google.android.apps.gsa.staticplugins.opa.p8296ar.p8298b;

import com.google.android.apps.gsa.opa.p6443g.p6445b.C83683b;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.gsa.p1876k.C22864c;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ar.b.p */
/* compiled from: PG */
public final /* synthetic */ class C107417p implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C107419r f298940a;

    /* renamed from: b */
    public final /* synthetic */ C83683b f298941b;

    /* renamed from: c */
    public final /* synthetic */ int f298942c;

    public /* synthetic */ C107417p(C107419r rVar, C83683b bVar, int i) {
        this.f298940a = rVar;
        this.f298941b = bVar;
        this.f298942c = i;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C107419r rVar = this.f298940a;
        C83683b bVar = this.f298941b;
        int i = this.f298942c;
        List list = (List) obj;
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.addFirst(bVar);
        while (!arrayDeque.isEmpty()) {
            Collection.EL.stream((List) Collection.EL.stream(list).filter(new C107418q((C83683b) arrayDeque.removeFirst())).collect(Collectors.toList())).forEach(new C107416o(rVar, arrayList, i, list, arrayDeque));
        }
        return C118826c.m197212b(arrayList);
    }
}
