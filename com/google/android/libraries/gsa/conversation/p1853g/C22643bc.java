package com.google.android.libraries.gsa.conversation.p1853g;

import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import java.util.concurrent.Callable;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.gsa.conversation.g.bc */
/* compiled from: PG */
public final /* synthetic */ class C22643bc implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C22652bl f62374a;

    /* renamed from: b */
    public final /* synthetic */ C22668l f62375b;

    public /* synthetic */ C22643bc(C22652bl blVar, C22668l lVar) {
        this.f62374a = blVar;
        this.f62375b = lVar;
    }

    public final Object call() {
        return (C58485gu) Collection.EL.stream(this.f62375b.f62439c).map(new C22644bd(this.f62374a)).filter(C22645be.f62377a).map(C22646bf.f62378a).collect(C58370cn.f155946a);
    }
}
