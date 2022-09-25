package com.google.android.libraries.gsa.conversation.p1853g;

import com.google.android.libraries.gsa.conversation.p1855h.C22715s;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.gsa.conversation.g.ar */
/* compiled from: PG */
public final /* synthetic */ class C22631ar implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C22654bn f62339a;

    /* renamed from: b */
    public final /* synthetic */ C58485gu f62340b;

    /* renamed from: c */
    public final /* synthetic */ long f62341c;

    public /* synthetic */ C22631ar(C22654bn bnVar, C58485gu guVar, long j) {
        this.f62339a = bnVar;
        this.f62340b = guVar;
        this.f62341c = j;
    }

    public final Object call() {
        C22654bn bnVar = this.f62339a;
        C58485gu guVar = this.f62340b;
        long j = this.f62341c;
        C58480gp e = C58485gu.m89837e();
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            C58833ax e2 = bnVar.mo27765e((C22666j) guVar.get(i), j);
            if (e2.mo56113h()) {
                e.mo55395g((C22715s) e2.mo56107c());
            }
        }
        return e.mo55394f();
    }
}
