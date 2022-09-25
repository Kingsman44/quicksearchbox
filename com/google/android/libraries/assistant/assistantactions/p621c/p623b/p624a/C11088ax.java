package com.google.android.libraries.assistant.assistantactions.p621c.p623b.p624a;

import com.google.knowledge.p4661a.p4662a.C61746h;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.b.a.ax */
/* compiled from: PG */
public final /* synthetic */ class C11088ax implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C11088ax f36367a = new C11088ax();

    private /* synthetic */ C11088ax() {
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
        return ((C61746h) obj).f166796d.equals("label");
    }
}
