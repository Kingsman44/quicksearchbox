package com.google.p4591e.p4592a.p4603d;

import java.util.AbstractSet;

/* renamed from: com.google.e.a.d.k */
/* compiled from: PG */
final class C61057k extends AbstractSet {

    /* renamed from: a */
    final /* synthetic */ C61058l f165320a;

    public C61057k(C61058l lVar) {
        this.f165320a = lVar;
    }

    /* renamed from: a */
    public final C61056j iterator() {
        return new C61056j(this.f165320a);
    }

    public final void clear() {
        for (String b : this.f165320a.f165322b.f165296d) {
            C61060n b2 = this.f165320a.f165322b.mo57610b(b);
            C61060n.m93426e(b2.f165330b, this.f165320a.f165321a, (Object) null);
        }
    }

    public final boolean isEmpty() {
        for (String b : this.f165320a.f165322b.f165296d) {
            C61060n b2 = this.f165320a.f165322b.mo57610b(b);
            if (C61060n.m93425d(b2.f165330b, this.f165320a.f165321a) != null) {
                return false;
            }
        }
        return true;
    }

    public final int size() {
        int i = 0;
        for (String b : this.f165320a.f165322b.f165296d) {
            C61060n b2 = this.f165320a.f165322b.mo57610b(b);
            if (C61060n.m93425d(b2.f165330b, this.f165320a.f165321a) != null) {
                i++;
            }
        }
        return i;
    }
}
