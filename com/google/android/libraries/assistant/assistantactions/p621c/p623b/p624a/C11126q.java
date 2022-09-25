package com.google.android.libraries.assistant.assistantactions.p621c.p623b.p624a;

import com.google.android.libraries.assistant.assistantactions.p621c.p631d.C11242c;
import com.google.assistant.p3897e.p3921j.C52621yn;
import com.google.assistant.p3897e.p3921j.C52623yp;
import com.google.common.p4526f.C59071e;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.b.a.q */
/* compiled from: PG */
public final /* synthetic */ class C11126q implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C11242c f36462a;

    public /* synthetic */ C11126q(C11242c cVar) {
        this.f36462a = cVar;
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
        C11242c cVar = this.f36462a;
        C59071e eVar = C11129t.f36469a;
        return ((C52621yn) ((C52623yp) obj).f138166c.get(0)).f138158c.equals(cVar.mo19664a());
    }
}
