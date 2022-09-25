package com.google.android.apps.gsa.nga.engine.education.pie.triggering;

import com.google.assistant.p3775ac.p3779d.C48462b;
import com.google.assistant.p3775ac.p3779d.C48468h;
import com.google.common.p4522b.C58528ij;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.triggering.ay */
/* compiled from: PG */
public final /* synthetic */ class C75939ay implements Function {

    /* renamed from: a */
    public final /* synthetic */ C58528ij f210692a;

    public /* synthetic */ C75939ay(C58528ij ijVar) {
        this.f210692a = ijVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C58528ij ijVar = this.f210692a;
        C48468h a = C48468h.m85227a(((C48462b) obj).f125199i);
        if (a == null) {
            a = C48468h.UNKNOWN_MODE;
        }
        return Boolean.valueOf(ijVar.contains(Integer.valueOf(a.f125214h)));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
