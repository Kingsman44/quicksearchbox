package com.google.android.libraries.assistant.assistantactions.p621c.p623b.p624a;

import com.google.assistant.p3897e.p3921j.C52619yl;
import com.google.common.p4526f.C59071e;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.b.a.p */
/* compiled from: PG */
public final /* synthetic */ class C11125p implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f36461a;

    public /* synthetic */ C11125p(String str) {
        this.f36461a = str;
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
        String str = this.f36461a;
        C59071e eVar = C11129t.f36469a;
        return str.equals(((C52619yl) obj).f138153c);
    }
}
