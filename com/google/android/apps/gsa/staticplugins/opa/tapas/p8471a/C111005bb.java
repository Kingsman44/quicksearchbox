package com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a;

import com.google.assistant.p3825an.p3830c.p3831a.C49301bt;
import com.google.common.base.C58835az;
import com.google.common.p4522b.C58370cn;
import java.util.Locale;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.a.bb */
/* compiled from: PG */
public final /* synthetic */ class C111005bb implements Function {

    /* renamed from: a */
    public final /* synthetic */ C111029bz f309186a;

    /* renamed from: b */
    public final /* synthetic */ String f309187b;

    public /* synthetic */ C111005bb(C111029bz bzVar, String str) {
        this.f309186a = bzVar;
        this.f309187b = str;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C111029bz bzVar = this.f309186a;
        C49301bt btVar = (C49301bt) obj;
        String lowerCase = this.f309187b.trim().toLowerCase(Locale.getDefault());
        Double d = (Double) ((Map) Collection.EL.stream(bzVar.f309220g.entrySet()).filter(new C111006bc(lowerCase)).flatMap(new C111017bn(lowerCase)).collect(C58370cn.m89403c(C111022bs.f309205a, C111023bt.f309206a, C111024bu.f309207a))).get(btVar.f127426b);
        if (d == null) {
            return Stream.CC.m71936of((T[]) new C58835az[0]);
        }
        return Stream.CC.m71935of(new C58835az(btVar, d));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
