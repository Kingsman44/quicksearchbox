package com.google.assistant.p3838ao.p3839a;

import com.google.assistant.p3838ao.p3839a.p3840a.C49399b;
import com.google.assistant.p3838ao.p3839a.p3840a.C49403f;
import com.google.assistant.p3838ao.p3839a.p3845e.C49621l;
import com.google.assistant.p3838ao.p3839a.p3845e.C49623n;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.util.function.Function;

/* renamed from: com.google.assistant.ao.a.k */
/* compiled from: PG */
public final /* synthetic */ class C49685k implements Function {

    /* renamed from: a */
    public final /* synthetic */ C49689o f128245a;

    /* renamed from: b */
    public final /* synthetic */ C49692r f128246b;

    public /* synthetic */ C49685k(C49689o oVar, C49692r rVar) {
        this.f128245a = oVar;
        this.f128246b = rVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C49689o oVar = this.f128245a;
        C49692r rVar = this.f128246b;
        C49621l lVar = (C49621l) obj;
        C49403f fVar = oVar.f128251b;
        int b = C49623n.m85588b(lVar.f128064a);
        int i = 2;
        if (b == 0) {
            b = 2;
        }
        C49399b a = fVar.mo53261a(b);
        if (a != null) {
            return Boolean.valueOf(a.mo53260a(rVar, lVar));
        }
        C58970a aVar = (C58970a) ((C58970a) C49689o.f128250a.mo56226d()).mo56372aa(54810);
        int b2 = C49623n.m85588b(lVar.f128064a);
        if (b2 != 0) {
            i = b2;
        }
        aVar.mo56389s("Condition function not found: %s", C49623n.m85587a(i));
        return false;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
