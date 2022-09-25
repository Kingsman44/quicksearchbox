package com.google.android.apps.gsa.nga.engine.education.pie.p6020b;

import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81379m;
import p3186j$.time.Instant;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.b.aq */
/* compiled from: PG */
public final /* synthetic */ class C75816aq implements Function {

    /* renamed from: a */
    public final /* synthetic */ C75823ax f210411a;

    /* renamed from: b */
    public final /* synthetic */ boolean f210412b;

    /* renamed from: c */
    public final /* synthetic */ Instant f210413c;

    public /* synthetic */ C75816aq(C75823ax axVar, boolean z, Instant instant) {
        this.f210411a = axVar;
        this.f210412b = z;
        this.f210413c = instant;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C75823ax axVar = this.f210411a;
        boolean z = this.f210412b;
        Instant instant = this.f210413c;
        e eVar = (e) obj;
        C81379m mVar = axVar.f210423b;
        if (z) {
            return mVar.mo75022e(instant, eVar);
        }
        return mVar.mo75023f(instant, eVar);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
