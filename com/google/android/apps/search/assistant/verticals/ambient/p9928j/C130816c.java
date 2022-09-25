package com.google.android.apps.search.assistant.verticals.ambient.p9928j;

import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.j.c */
/* compiled from: PG */
public final /* synthetic */ class C130816c implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C58485gu f358057a;

    public /* synthetic */ C130816c(C58485gu guVar) {
        this.f358057a = guVar;
    }

    public final Object call() {
        C58485gu guVar = this.f358057a;
        C58480gp e = C58485gu.m89837e();
        for (int i = 0; i < guVar.size(); i++) {
            try {
                e.mo55396h((Iterable) C60856cj.m92909r((Future) guVar.get(i)));
            } catch (ExecutionException e2) {
                ((C59052c) ((C59052c) ((C59052c) C130820g.f358061a.mo56225c()).mo56382g(e2)).mo56372aa(38978)).mo56386p("Failed to fetch data from Icing.");
            }
        }
        return e.mo55394f();
    }
}
