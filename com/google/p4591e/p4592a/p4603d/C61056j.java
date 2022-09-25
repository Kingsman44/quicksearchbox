package com.google.p4591e.p4592a.p4603d;

import com.google.common.base.C58838bb;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.e.a.d.j */
/* compiled from: PG */
final class C61056j implements Iterator, p3186j$.util.Iterator {

    /* renamed from: a */
    final /* synthetic */ C61058l f165313a;

    /* renamed from: b */
    private int f165314b = -1;

    /* renamed from: c */
    private C61060n f165315c;

    /* renamed from: d */
    private Object f165316d;

    /* renamed from: e */
    private boolean f165317e;

    /* renamed from: f */
    private boolean f165318f;

    /* renamed from: g */
    private C61060n f165319g;

    public C61056j(C61058l lVar) {
        this.f165313a = lVar;
    }

    /* renamed from: a */
    public final Map.Entry next() {
        if (hasNext()) {
            this.f165319g = this.f165315c;
            Object obj = this.f165316d;
            this.f165318f = false;
            this.f165317e = false;
            this.f165315c = null;
            this.f165316d = null;
            return new C61055i(this.f165313a, this.f165319g, obj);
        }
        throw new NoSuchElementException();
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        if (!this.f165318f) {
            this.f165318f = true;
            this.f165316d = null;
            while (this.f165316d == null) {
                int i = this.f165314b + 1;
                this.f165314b = i;
                if (i >= this.f165313a.f165322b.f165296d.size()) {
                    break;
                }
                C61053g gVar = this.f165313a.f165322b;
                C61060n b = gVar.mo57610b((String) gVar.f165296d.get(this.f165314b));
                this.f165315c = b;
                this.f165316d = C61060n.m93425d(b.f165330b, this.f165313a.f165321a);
            }
        }
        if (this.f165316d != null) {
            return true;
        }
        return false;
    }

    public final void remove() {
        boolean z = false;
        if (this.f165319g != null && !this.f165317e) {
            z = true;
        }
        C58838bb.m90883r(z);
        this.f165317e = true;
        C61060n nVar = this.f165319g;
        C61060n.m93426e(nVar.f165330b, this.f165313a.f165321a, (Object) null);
    }
}
