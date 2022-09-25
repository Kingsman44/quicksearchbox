package com.google.android.libraries.assistant.assistantactions.p621c.p623b.p624a;

import com.google.assistant.p3897e.p3921j.C52613yf;
import com.google.assistant.p3897e.p3921j.C52633yz;
import com.google.common.base.C58833ax;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.b.a.al */
/* compiled from: PG */
public final /* synthetic */ class C11076al implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C58833ax f36357a;

    public /* synthetic */ C11076al(C58833ax axVar) {
        this.f36357a = axVar;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate.CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    /* renamed from: or */
    public final /* synthetic */ Predicate mo17950or(Predicate predicate) {
        return Predicate.CC.$default$or(this, predicate);
    }

    public final boolean test(Object obj) {
        C58833ax axVar = this.f36357a;
        C52633yz yzVar = (C52633yz) obj;
        C52613yf yfVar = yzVar.f138197d;
        if (yfVar == null) {
            yfVar = C52613yf.f138138f;
        }
        return yfVar.f138141b.equals(axVar.mo56107c()) && (yzVar.f138194a & 8) != 0;
    }
}
