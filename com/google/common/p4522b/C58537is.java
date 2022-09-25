package com.google.common.p4522b;

import com.google.common.base.C58838bb;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import p3186j$.util.Map;

/* renamed from: com.google.common.b.is */
/* compiled from: PG */
public final class C58537is extends C58538it implements NavigableMap, Map {

    /* renamed from: c */
    private static final C58537is f156188c = new C58537is(C58541iw.m90070U(C58701ou.f156429a), C58485gu.m89845m(), (C58537is) null);
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    public final transient C58735qa f156189a;

    /* renamed from: b */
    public final transient C58485gu f156190b;

    /* renamed from: d */
    private final transient C58537is f156191d;

    public C58537is(C58735qa qaVar, C58485gu guVar, C58537is isVar) {
        this.f156189a = qaVar;
        this.f156190b = guVar;
        this.f156191d = isVar;
    }

    /* renamed from: A */
    private final C58537is m90048A(int i, int i2) {
        if (i == 0) {
            if (i2 == this.f156190b.size()) {
                return this;
            }
            i = 0;
        }
        if (i == i2) {
            return m90050e(this.f156189a.f156195b);
        }
        return new C58537is(this.f156189a.mo55847g(i, i2), this.f156190b.subList(i, i2), (C58537is) null);
    }

    /* renamed from: b */
    public static C58535iq m90049b() {
        return new C58535iq(C58701ou.f156429a);
    }

    /* renamed from: e */
    static C58537is m90050e(Comparator comparator) {
        if (C58701ou.f156429a.equals(comparator)) {
            return f156188c;
        }
        return new C58537is(C58541iw.m90070U(comparator), C58485gu.m89845m(), (C58537is) null);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* renamed from: c */
    public final boolean mo55193c() {
        return this.f156189a.f156507e.mo55032a() || this.f156190b.mo55032a();
    }

    public final Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    public final Object ceilingKey(Object obj) {
        return C58662ni.m90347f(ceilingEntry(obj));
    }

    public final Comparator comparator() {
        return this.f156189a.f156195b;
    }

    /* renamed from: d */
    public final C58528ij mo55194d() {
        throw new AssertionError("should never be called");
    }

    public final /* synthetic */ NavigableSet descendingKeySet() {
        return this.f156189a.descendingSet();
    }

    public final /* bridge */ /* synthetic */ NavigableMap descendingMap() {
        C58537is isVar = this.f156191d;
        if (isVar != null) {
            return isVar;
        }
        if (isEmpty()) {
            return m90050e(C58710pc.m90487d(this.f156189a.f156195b).mo55783c());
        }
        return new C58537is((C58735qa) this.f156189a.descendingSet(), this.f156190b.mo55401lD(), this);
    }

    public final /* bridge */ /* synthetic */ Set entrySet() {
        return entrySet();
    }

    /* renamed from: f */
    public final C58471gg mo55368f() {
        throw new AssertionError("should never be called");
    }

    public final Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().mo55229u().get(0);
    }

    public final Object firstKey() {
        return this.f156189a.first();
    }

    public final Map.Entry floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    public final Object floorKey(Object obj) {
        return C58662ni.m90347f(floorEntry(obj));
    }

    /* renamed from: g */
    public final C58471gg mo55369g() {
        return this.f156190b;
    }

    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    public final Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    public final Object higherKey(Object obj) {
        return C58662ni.m90347f(higherEntry(obj));
    }

    public final /* synthetic */ Set keySet() {
        return this.f156189a;
    }

    /* renamed from: lE */
    public final C58528ij mo55439lE() {
        if (isEmpty()) {
            return C58733pz.f156496a;
        }
        return new C58534ip(this);
    }

    public final Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().mo55229u().get(this.f156190b.size() - 1);
    }

    public final Object lastKey() {
        return this.f156189a.last();
    }

    public final Map.Entry lowerEntry(Object obj) {
        return headMap(obj, false).lastEntry();
    }

    public final Object lowerKey(Object obj) {
        return C58662ni.m90347f(lowerEntry(obj));
    }

    public final /* synthetic */ NavigableSet navigableKeySet() {
        return this.f156189a;
    }

    @Deprecated
    public final Map.Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Map.Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    public final int size() {
        return this.f156190b.size();
    }

    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    public final /* synthetic */ Collection values() {
        return this.f156190b;
    }

    /* renamed from: w */
    public final /* synthetic */ C58528ij mo55443w() {
        return this.f156189a;
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new C58536ir(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        if (r4 < 0) goto L_0x0005;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object get(java.lang.Object r4) {
        /*
            r3 = this;
            com.google.common.b.qa r0 = r3.f156189a
            r1 = -1
            if (r4 != 0) goto L_0x0007
        L_0x0005:
            r4 = -1
            goto L_0x0014
        L_0x0007:
            com.google.common.b.gu r2 = r0.f156507e     // Catch:{ ClassCastException -> 0x0012 }
            java.util.Comparator r0 = r0.f156195b     // Catch:{ ClassCastException -> 0x0012 }
            int r4 = java.util.Collections.binarySearch(r2, r4, r0)     // Catch:{ ClassCastException -> 0x0012 }
            if (r4 >= 0) goto L_0x0014
            goto L_0x0005
        L_0x0012:
            goto L_0x0005
        L_0x0014:
            if (r4 != r1) goto L_0x0018
            r4 = 0
            return r4
        L_0x0018:
            com.google.common.b.gu r0 = r3.f156190b
            java.lang.Object r4 = r0.get(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.p4522b.C58537is.get(java.lang.Object):java.lang.Object");
    }

    /* renamed from: x */
    public final C58537is headMap(Object obj, boolean z) {
        C58735qa qaVar = this.f156189a;
        obj.getClass();
        return m90048A(0, qaVar.mo55845e(obj, z));
    }

    /* renamed from: z */
    public final C58537is tailMap(Object obj, boolean z) {
        C58735qa qaVar = this.f156189a;
        obj.getClass();
        return m90048A(qaVar.mo55846f(obj, z), this.f156190b.size());
    }

    /* renamed from: y */
    public final C58537is subMap(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        C58838bb.m90879n(this.f156189a.f156195b.compare(obj, obj2) <= 0, "expected fromKey <= toKey but %s > %s", obj, obj2);
        return headMap(obj2, z2).tailMap(obj, z);
    }
}
