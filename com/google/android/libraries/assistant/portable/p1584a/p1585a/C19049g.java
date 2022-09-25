package com.google.android.libraries.assistant.portable.p1584a.p1585a;

import com.google.assistant.p3897e.p3902c.p3907c.C50949au;
import com.google.assistant.p3897e.p3902c.p3907c.C50954az;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.portable.a.a.g */
/* compiled from: PG */
public final /* synthetic */ class C19049g implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C19049g f53454a = new C19049g();

    private /* synthetic */ C19049g() {
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
        C50954az azVar = (C50954az) obj;
        if (azVar.f132642b == 6) {
            return true;
        }
        int a = C50949au.m85987a(azVar.f132650j);
        return a != 0 && a == 4;
    }
}
