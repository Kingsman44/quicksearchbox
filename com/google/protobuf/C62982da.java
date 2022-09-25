package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.da */
/* compiled from: PG */
public final class C62982da extends C63035f implements RandomAccess, C62983db {

    /* renamed from: c */
    private static final C62982da f170038c;

    /* renamed from: b */
    public final List f170039b;

    static {
        C62982da daVar = new C62982da(10);
        f170038c = daVar;
        daVar.f170142a = false;
    }

    public C62982da() {
        this(10);
    }

    /* renamed from: j */
    private static String m95566j(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C63088z) {
            return ((C63088z) obj).mo59170I(C62972cr.f170009a);
        }
        return C62972cr.m95546f((byte[]) obj);
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        mo59080lH();
        this.f170039b.add(i, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection collection) {
        mo59080lH();
        if (collection instanceof C62983db) {
            collection = ((C62983db) collection).mo58968h();
        }
        boolean addAll = this.f170039b.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final void clear() {
        mo59080lH();
        this.f170039b.clear();
        this.modCount++;
    }

    /* renamed from: d */
    public final C62983db mo58964d() {
        return this.f170142a ? new C63049fn(this) : this;
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C62971cq mo58798e(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f170039b);
            return new C62982da(arrayList);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: f */
    public final Object mo58965f(int i) {
        return this.f170039b.get(i);
    }

    /* renamed from: g */
    public final String get(int i) {
        Object obj = this.f170039b.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C63088z) {
            C63088z zVar = (C63088z) obj;
            String I = zVar.mo59170I(C62972cr.f170009a);
            if (zVar.mo59047s()) {
                this.f170039b.set(i, I);
            }
            return I;
        }
        byte[] bArr = (byte[]) obj;
        String f = C62972cr.m95546f(bArr);
        if (C62972cr.m95547g(bArr)) {
            this.f170039b.set(i, f);
        }
        return f;
    }

    /* renamed from: h */
    public final List mo58968h() {
        return Collections.unmodifiableList(this.f170039b);
    }

    /* renamed from: i */
    public final void mo58969i(C63088z zVar) {
        mo59080lH();
        this.f170039b.add(zVar);
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo59080lH();
        Object remove = this.f170039b.remove(i);
        this.modCount++;
        return m95566j(remove);
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        mo59080lH();
        return m95566j(this.f170039b.set(i, (String) obj));
    }

    public final int size() {
        return this.f170039b.size();
    }

    public C62982da(int i) {
        this.f170039b = new ArrayList(i);
    }

    private C62982da(ArrayList arrayList) {
        this.f170039b = arrayList;
    }

    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
