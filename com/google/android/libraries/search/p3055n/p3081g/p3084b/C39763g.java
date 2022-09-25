package com.google.android.libraries.search.p3055n.p3081g.p3084b;

import com.google.android.libraries.search.p3055n.C39812p;
import com.google.android.libraries.search.p3055n.C39816t;
import com.google.android.libraries.search.p3055n.C39817u;
import com.google.common.p4526f.C59052c;
import p3186j$.util.function.BiPredicate;

/* renamed from: com.google.android.libraries.search.n.g.b.g */
/* compiled from: PG */
public final /* synthetic */ class C39763g implements BiPredicate {

    /* renamed from: a */
    public static final /* synthetic */ C39763g f104592a = new C39763g();

    private /* synthetic */ C39763g() {
    }

    public final /* synthetic */ BiPredicate and(BiPredicate biPredicate) {
        return BiPredicate.CC.$default$and(this, biPredicate);
    }

    public final /* synthetic */ BiPredicate negate() {
        return BiPredicate.CC.$default$negate(this);
    }

    /* renamed from: or */
    public final /* synthetic */ BiPredicate mo19296or(BiPredicate biPredicate) {
        return BiPredicate.CC.$default$or(this, biPredicate);
    }

    public final boolean test(Object obj, Object obj2) {
        String str = (String) obj;
        C39817u uVar = ((C39812p) obj2).f104696c;
        if (uVar == null) {
            uVar = C39817u.f104702d;
        }
        int a = C39816t.m69227a(uVar.f104706c);
        if (a != 0 && a == 2) {
            return true;
        }
        ((C59052c) ((C59052c) C39765i.f104594a.mo56226d()).mo56372aa(53857)).mo56389s("Non-URL model spec for locale %s", str);
        return false;
    }
}
