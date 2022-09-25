package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.research.p5181a.p5187e.C66366p;
import com.google.research.p5181a.p5187e.C66367q;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.bg */
/* compiled from: PG */
public final /* synthetic */ class C112339bg implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C66367q f311726a;

    /* renamed from: b */
    public final /* synthetic */ C58485gu f311727b;

    public /* synthetic */ C112339bg(C66367q qVar, C58485gu guVar) {
        this.f311726a = qVar;
        this.f311727b = guVar;
    }

    public final Object call() {
        int i;
        C66367q qVar = this.f311726a;
        C58485gu guVar = this.f311727b;
        if (!Thread.interrupted()) {
            int i2 = ((C58724pq) guVar).f156474d;
            int i3 = 0;
            while (i3 < i2) {
                Iterator it = ((List) C60856cj.m92909r((C60870cx) guVar.get(i3))).iterator();
                while (true) {
                    i = i3 + 1;
                    if (!it.hasNext()) {
                        break;
                    }
                    qVar.f180459b.add((C66366p) it.next());
                }
                i3 = i;
            }
        }
        return qVar;
    }
}
