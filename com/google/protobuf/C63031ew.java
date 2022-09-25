package com.google.protobuf;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: com.google.protobuf.ew */
/* compiled from: PG */
class C63031ew extends AbstractMap {

    /* renamed from: a */
    public List f170133a = Collections.emptyList();

    /* renamed from: b */
    public Map f170134b = Collections.emptyMap();

    /* renamed from: c */
    public boolean f170135c;

    /* renamed from: d */
    public Map f170136d = Collections.emptyMap();

    /* renamed from: e */
    private final int f170137e;

    /* renamed from: f */
    private volatile C63030ev f170138f;

    public C63031ew(int i) {
        this.f170137e = i;
    }

    /* renamed from: g */
    private final int m95851g(Comparable comparable) {
        int size = this.f170133a.size() - 1;
        int i = 0;
        if (size >= 0) {
            int compareTo = comparable.compareTo(((C63028et) this.f170133a.get(size)).f170125a);
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = comparable.compareTo(((C63028et) this.f170133a.get(i2)).f170125a);
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    /* renamed from: h */
    private final SortedMap m95852h() {
        mo59073f();
        if (this.f170134b.isEmpty() && !(this.f170134b instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f170134b = treeMap;
            TreeMap treeMap2 = treeMap;
            this.f170136d = treeMap.descendingMap();
        }
        return (SortedMap) this.f170134b;
    }

    /* renamed from: a */
    public final int mo59064a() {
        return this.f170133a.size();
    }

    /* renamed from: b */
    public final Iterable mo59065b() {
        if (this.f170134b.isEmpty()) {
            return C63027es.f170124b;
        }
        return this.f170134b.entrySet();
    }

    /* renamed from: c */
    public final Object put(Comparable comparable, Object obj) {
        mo59073f();
        int g = m95851g(comparable);
        if (g >= 0) {
            return ((C63028et) this.f170133a.get(g)).setValue(obj);
        }
        mo59073f();
        if (this.f170133a.isEmpty() && !(this.f170133a instanceof ArrayList)) {
            this.f170133a = new ArrayList(this.f170137e);
        }
        int i = -(g + 1);
        if (i >= this.f170137e) {
            return m95852h().put(comparable, obj);
        }
        int size = this.f170133a.size();
        int i2 = this.f170137e;
        if (size == i2) {
            C63028et etVar = (C63028et) this.f170133a.remove(i2 - 1);
            m95852h().put(etVar.f170125a, etVar.f170126b);
        }
        this.f170133a.add(i, new C63028et(this, comparable, obj));
        return null;
    }

    public final void clear() {
        mo59073f();
        if (!this.f170133a.isEmpty()) {
            this.f170133a.clear();
        }
        if (!this.f170134b.isEmpty()) {
            this.f170134b.clear();
        }
    }

    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m95851g(comparable) >= 0 || this.f170134b.containsKey(comparable);
    }

    /* renamed from: d */
    public final Object mo59069d(int i) {
        mo59073f();
        Object obj = ((C63028et) this.f170133a.remove(i)).f170126b;
        if (!this.f170134b.isEmpty()) {
            Iterator it = m95852h().entrySet().iterator();
            List list = this.f170133a;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C63028et(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    /* renamed from: e */
    public final Map.Entry mo59070e(int i) {
        return (Map.Entry) this.f170133a.get(i);
    }

    public final Set entrySet() {
        if (this.f170138f == null) {
            this.f170138f = new C63030ev(this);
        }
        return this.f170138f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C63031ew)) {
            return super.equals(obj);
        }
        C63031ew ewVar = (C63031ew) obj;
        int size = size();
        if (size != ewVar.size()) {
            return false;
        }
        int a = mo59064a();
        if (a != ewVar.mo59064a()) {
            return entrySet().equals(ewVar.entrySet());
        }
        for (int i = 0; i < a; i++) {
            if (!mo59070e(i).equals(ewVar.mo59070e(i))) {
                return false;
            }
        }
        if (a != size) {
            return this.f170134b.equals(ewVar.f170134b);
        }
        return true;
    }

    /* renamed from: f */
    public final void mo59073f() {
        if (this.f170135c) {
            throw new UnsupportedOperationException();
        }
    }

    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int g = m95851g(comparable);
        if (g >= 0) {
            return ((C63028et) this.f170133a.get(g)).f170126b;
        }
        return this.f170134b.get(comparable);
    }

    public final int hashCode() {
        int a = mo59064a();
        int i = 0;
        for (int i2 = 0; i2 < a; i2++) {
            i += ((C63028et) this.f170133a.get(i2)).hashCode();
        }
        return this.f170134b.size() > 0 ? i + this.f170134b.hashCode() : i;
    }

    public final Object remove(Object obj) {
        mo59073f();
        Comparable comparable = (Comparable) obj;
        int g = m95851g(comparable);
        if (g >= 0) {
            return mo59069d(g);
        }
        if (this.f170134b.isEmpty()) {
            return null;
        }
        return this.f170134b.remove(comparable);
    }

    public final int size() {
        return this.f170133a.size() + this.f170134b.size();
    }
}
