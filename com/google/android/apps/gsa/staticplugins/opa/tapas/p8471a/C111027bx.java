package com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a;

import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113126ak;
import com.google.common.base.C58835az;
import java.util.Map;
import java.util.Set;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.a.bx */
/* compiled from: PG */
public final /* synthetic */ class C111027bx implements Function {

    /* renamed from: a */
    public final /* synthetic */ C111029bz f309210a;

    /* renamed from: b */
    public final /* synthetic */ String f309211b;

    /* renamed from: c */
    public final /* synthetic */ int f309212c;

    public /* synthetic */ C111027bx(C111029bz bzVar, String str, int i) {
        this.f309210a = bzVar;
        this.f309211b = str;
        this.f309212c = i;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C111029bz bzVar = this.f309210a;
        String str = this.f309211b;
        Map.Entry entry = (Map.Entry) obj;
        return new C58835az((Set) entry.getValue(), Double.valueOf(bzVar.f309221h.mo99888b((String) entry.getKey(), Collection.EL.stream(C113126ak.f313427a.mo56155i(str)), this.f309212c)));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
