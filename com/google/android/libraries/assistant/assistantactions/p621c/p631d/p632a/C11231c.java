package com.google.android.libraries.assistant.assistantactions.p621c.p631d.p632a;

import com.google.android.libraries.gsa.actionusermodel.C22021a;
import com.google.assistant.p3897e.p3921j.C52621yn;
import com.google.assistant.p3897e.p3921j.C52623yp;
import com.google.common.p4522b.C58485gu;
import com.google.protos.p4985f.p4986a.C64682bi;
import com.google.protos.p4985f.p4986a.C64683bj;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.d.a.c */
/* compiled from: PG */
public final /* synthetic */ class C11231c implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C11231c f36641a = new C11231c();

    private /* synthetic */ C11231c() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        String str = ((C52621yn) ((C52623yp) obj).f138166c.get(0)).f138158c;
        C64682bi biVar = (C64682bi) C64683bj.f175334c.createBuilder();
        biVar.copyOnWrite();
        C64683bj bjVar = (C64683bj) biVar.instance;
        bjVar.f175337b = 0;
        bjVar.f175336a |= 1;
        return C22021a.m41270a(str, false, (C64683bj) biVar.build(), C58485gu.m89845m());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
