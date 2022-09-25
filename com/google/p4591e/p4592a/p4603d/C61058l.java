package com.google.p4591e.p4592a.p4603d;

import com.google.common.base.C58838bb;
import java.util.AbstractMap;
import java.util.Set;

/* renamed from: com.google.e.a.d.l */
/* compiled from: PG */
final class C61058l extends AbstractMap {

    /* renamed from: a */
    final Object f165321a;

    /* renamed from: b */
    final C61053g f165322b;

    public C61058l(Object obj, boolean z) {
        this.f165321a = obj;
        C61053g a = C61053g.m93405a(obj.getClass(), z);
        this.f165322b = a;
        C58838bb.m90868c(!a.f165293a.isEnum());
    }

    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public final /* synthetic */ Set entrySet() {
        return new C61057k(this);
    }

    public final Object get(Object obj) {
        C61060n b;
        if (!(obj instanceof String) || (b = this.f165322b.mo57610b((String) obj)) == null) {
            return null;
        }
        return C61060n.m93425d(b.f165330b, this.f165321a);
    }

    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        String str = (String) obj;
        C61060n b = this.f165322b.mo57610b(str);
        C58838bb.m90866a(b, "no field of key ".concat(String.valueOf(str)));
        Object d = C61060n.m93425d(b.f165330b, this.f165321a);
        Object obj3 = this.f165321a;
        obj2.getClass();
        C61060n.m93426e(b.f165330b, obj3, obj2);
        return d;
    }
}
