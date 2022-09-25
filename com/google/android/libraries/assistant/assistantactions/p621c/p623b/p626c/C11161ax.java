package com.google.android.libraries.assistant.assistantactions.p621c.p623b.p626c;

import com.google.assistant.p3897e.p3902c.p3907c.C51016dg;
import com.google.assistant.p3897e.p3902c.p3907c.C51027dr;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.b.c.ax */
/* compiled from: PG */
public final /* synthetic */ class C11161ax implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f36535a;

    public /* synthetic */ C11161ax(String str) {
        this.f36535a = str;
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
        C51016dg dgVar;
        String str = this.f36535a;
        C51027dr drVar = (C51027dr) obj;
        int i = C11169be.f36543a;
        if (drVar.f132857d == 4) {
            dgVar = (C51016dg) drVar.f132858e;
        } else {
            dgVar = C51016dg.f132827g;
        }
        return dgVar.f132830b.equals(str);
    }
}
