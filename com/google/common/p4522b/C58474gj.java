package com.google.common.p4522b;

import com.google.common.base.C58838bb;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.EnumMap;

/* renamed from: com.google.common.b.gj */
/* compiled from: PG */
final class C58474gj extends C58493hb {

    /* renamed from: a */
    private final transient EnumMap f156101a;

    public C58474gj(EnumMap enumMap) {
        this.f156101a = enumMap;
        C58838bb.m90868c(!enumMap.isEmpty());
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use EnumSerializedForm");
    }

    /* renamed from: c */
    public final boolean mo55193c() {
        return false;
    }

    public final boolean containsKey(Object obj) {
        return this.f156101a.containsKey(obj);
    }

    /* renamed from: e */
    public final C58800sl mo55195e() {
        return new C58643mq(this.f156101a.entrySet().iterator());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C58474gj) {
            obj = ((C58474gj) obj).f156101a;
        }
        return this.f156101a.equals(obj);
    }

    public final Object get(Object obj) {
        return this.f156101a.get(obj);
    }

    /* renamed from: lB */
    public final C58800sl mo55388lB() {
        return C58570jy.m90153e(this.f156101a.keySet().iterator());
    }

    public final int size() {
        return this.f156101a.size();
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new C58473gi(this.f156101a);
    }
}
