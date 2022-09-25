package com.google.common.p4522b;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.common.b.ps */
/* compiled from: PG */
final class C58726ps extends C58528ij {

    /* renamed from: a */
    public final transient Object[] f156476a;

    /* renamed from: b */
    public final transient int f156477b;

    /* renamed from: d */
    public final transient int f156478d;

    /* renamed from: e */
    private final transient C58495hd f156479e;

    public C58726ps(C58495hd hdVar, Object[] objArr, int i, int i2) {
        this.f156479e = hdVar;
        this.f156476a = objArr;
        this.f156477b = i;
        this.f156478d = i2;
    }

    /* renamed from: B */
    public final C58485gu mo55492B() {
        return new C58725pr(this);
    }

    /* renamed from: a */
    public final boolean mo55032a() {
        return true;
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || !value.equals(this.f156479e.get(key))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final /* synthetic */ Iterator iterator() {
        return mo55229u().listIterator(0);
    }

    /* renamed from: lA */
    public final C58800sl mo55210lA() {
        return mo55229u().listIterator(0);
    }

    public final int size() {
        return this.f156478d;
    }

    /* renamed from: w */
    public final int mo55383w(Object[] objArr, int i) {
        return mo55229u().mo55383w(objArr, i);
    }
}
