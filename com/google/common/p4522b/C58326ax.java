package com.google.common.p4522b;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.common.b.ax */
/* compiled from: PG */
final class C58326ax extends AbstractSet {

    /* renamed from: a */
    final /* synthetic */ C58328az f155897a;

    public C58326ax(C58328az azVar) {
        this.f155897a = azVar;
    }

    public final void clear() {
        this.f155897a.mo55019i();
    }

    public final boolean contains(Object obj) {
        if (obj instanceof C58784rw) {
            C58784rw rwVar = (C58784rw) obj;
            Map map = (Map) C58662ni.m90348g(this.f155897a.mo55202t(), rwVar.mo55972b());
            if (map == null || !C58374cr.m89412d(map.entrySet(), new C58472gh(rwVar.mo55971a(), rwVar.mo55973c()))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final Iterator iterator() {
        return this.f155897a.mo55013e();
    }

    public final boolean remove(Object obj) {
        if (obj instanceof C58784rw) {
            C58784rw rwVar = (C58784rw) obj;
            Map map = (Map) C58662ni.m90348g(this.f155897a.mo55202t(), rwVar.mo55972b());
            if (map == null || !C58374cr.m89413e(map.entrySet(), new C58472gh(rwVar.mo55971a(), rwVar.mo55973c()))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int size() {
        return this.f155897a.mo55196n();
    }
}
