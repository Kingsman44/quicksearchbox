package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import com.google.android.apps.gsa.nga.shared.p6274a.C80053ag;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.fa */
/* compiled from: PG */
public final /* synthetic */ class C79299fa implements Function {

    /* renamed from: a */
    public final /* synthetic */ C79308fj f217790a;

    /* renamed from: b */
    public final /* synthetic */ Optional f217791b;

    /* renamed from: c */
    public final /* synthetic */ String f217792c;

    /* renamed from: d */
    public final /* synthetic */ C79326x f217793d;

    public /* synthetic */ C79299fa(C79308fj fjVar, Optional optional, String str, C79326x xVar) {
        this.f217790a = fjVar;
        this.f217791b = optional;
        this.f217792c = str;
        this.f217793d = xVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Optional optional = this.f217791b;
        String str = this.f217792c;
        C80053ag agVar = (C80053ag) obj;
        return Collection.EL.stream(agVar.f219680d).filter(new C79294ew(optional, str)).map(C79295ex.f217784a).map(new C79296ey(str, agVar)).peek(new C79297ez(this.f217793d, str, agVar));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
