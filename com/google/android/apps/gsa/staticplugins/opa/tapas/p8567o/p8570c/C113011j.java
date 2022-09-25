package com.google.android.apps.gsa.staticplugins.opa.tapas.p8567o.p8570c;

import com.google.android.apps.gsa.staticplugins.opa.tapas.framework.C111884bv;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113409et;
import com.google.android.libraries.assistant.p1594s.p1597b.C19167ba;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.protobuf.C62963cj;
import java.util.HashSet;
import java.util.concurrent.Callable;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.o.c.j */
/* compiled from: PG */
public final /* synthetic */ class C113011j implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C113012k f313191a;

    /* renamed from: b */
    public final /* synthetic */ C19167ba f313192b;

    public /* synthetic */ C113011j(C113012k kVar, C19167ba baVar) {
        this.f313191a = kVar;
        this.f313192b = baVar;
    }

    public final Object call() {
        C113012k kVar = this.f313191a;
        C19167ba baVar = this.f313192b;
        C111884bv bvVar = (C111884bv) kVar.f313194a.mo27525b();
        HashSet<C48672ag> hashSet = new HashSet<>();
        hashSet.addAll(new C62963cj(baVar.f53676b, C19167ba.f53671c));
        if ((baVar.f53675a & 4) != 0 && baVar.f53680h) {
            hashSet.addAll(new C62963cj(baVar.f53677d, C19167ba.f53672e));
        }
        for (C48672ag agVar : hashSet) {
            C69464a aVar = (C69464a) bvVar.f310885a.get(agVar);
            if (aVar != null) {
                C113409et etVar = (C113409et) aVar.mo17428b();
            }
        }
        return Boolean.TRUE;
    }
}
