package com.google.common.p4522b;

import com.google.common.base.C58838bb;
import p3186j$.util.function.BinaryOperator;
import p3186j$.util.function.Function;
import p3186j$.util.function.ToIntFunction;
import p3186j$.util.stream.Collector;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.common.b.cn */
/* compiled from: PG */
public final class C58370cn {

    /* renamed from: a */
    public static final Collector f155946a = Collector.CC.m71774of(C58345bp.f155917a, C58348bs.f155920a, C58349bt.f155921a, C58350bu.f155922a, new Collector.Characteristics[0]);

    /* renamed from: b */
    public static final Collector f155947b = Collector.CC.m71774of(C58351bv.f155923a, C58352bw.f155924a, C58353bx.f155925a, C58354by.f155926a, new Collector.Characteristics[0]);

    static {
        Collector.CC.m71774of(C58355bz.f155927a, C58357ca.f155930a, C58346bq.f155918a, C58347br.f155919a, new Collector.Characteristics[0]);
    }

    /* renamed from: a */
    public static Collector m89401a(Function function, Function function2) {
        C58838bb.m90866a(function, "keyFunction");
        C58838bb.m90866a(function2, "valueFunction");
        return Collector.CC.m71774of(C58366cj.f155941a, new C58367ck(function, function2), C58368cl.f155944a, C58369cm.f155945a, new Collector.Characteristics[0]);
    }

    /* renamed from: e */
    public static Collector m89405e(Function function, Function function2) {
        C58838bb.m90866a(function, "keyFunction");
        C58838bb.m90866a(function2, "valueFunction");
        return Collector.CC.m71774of(C58358cb.f155931a, new C58359cc(function, function2), C58360cd.f155934a, C58361ce.f155935a, new Collector.Characteristics[0]);
    }

    /* renamed from: b */
    public static Collector m89402b(Function function, Function function2) {
        function.getClass();
        function2.getClass();
        return Collector.CC.m71774of(C58362cf.f155936a, new C58363cg(function, function2), C58364ch.f155939a, C58365ci.f155940a, new Collector.Characteristics[0]);
    }

    /* renamed from: d */
    public static Collector m89404d(Function function, ToIntFunction toIntFunction) {
        function.getClass();
        toIntFunction.getClass();
        return Collector.CC.m71774of(C58341bl.f155913a, new C58342bm(function), C58343bn.f155915a, C58344bo.f155916a, new Collector.Characteristics[0]);
    }

    /* renamed from: c */
    public static Collector m89403c(Function function, Function function2, BinaryOperator binaryOperator) {
        function.getClass();
        function2.getClass();
        binaryOperator.getClass();
        return Collectors.collectingAndThen(Collectors.toMap(function, function2, binaryOperator, C58339bj.f155911a), C58340bk.f155912a);
    }
}
