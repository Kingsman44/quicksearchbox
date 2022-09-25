package com.google.p4591e.p4592a.p4603d;

import com.evernote.android.state.BuildConfig;
import com.google.common.base.C58838bb;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentMap;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.e.a.d.g */
/* compiled from: PG */
public final class C61053g {

    /* renamed from: e */
    private static final ConcurrentMap f165291e = new ConcurrentHashMap();

    /* renamed from: f */
    private static final ConcurrentMap f165292f = new ConcurrentHashMap();

    /* renamed from: a */
    public final Class f165293a;

    /* renamed from: b */
    public final boolean f165294b;

    /* renamed from: c */
    public final IdentityHashMap f165295c = new IdentityHashMap();

    /* renamed from: d */
    final List f165296d;

    private C61053g(Class cls, boolean z) {
        List list;
        Field field;
        this.f165293a = cls;
        this.f165294b = z;
        boolean z2 = !z || !cls.isEnum();
        new StringBuilder("cannot ignore case on an enum: ").append(cls);
        C58838bb.m90869d(z2, "cannot ignore case on an enum: ".concat(cls.toString()));
        TreeSet treeSet = new TreeSet(new C61052f());
        for (Field field2 : cls.getDeclaredFields()) {
            C61060n b = C61060n.m93424b(field2);
            if (b != null) {
                String str = b.f165331c;
                str = z ? str.toLowerCase(Locale.US).intern() : str;
                C61060n nVar = (C61060n) this.f165295c.get(str);
                boolean z3 = nVar == null;
                Object[] objArr = new Object[4];
                objArr[0] = true != z ? BuildConfig.FLAVOR : "case-insensitive ";
                objArr[1] = str;
                objArr[2] = field2;
                if (nVar == null) {
                    field = null;
                } else {
                    field = nVar.f165330b;
                }
                objArr[3] = field;
                C58838bb.m90874i(z3, "two fields have the same %sname <%s>: %s and %s", objArr);
                this.f165295c.put(str, b);
                treeSet.add(str);
            }
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null) {
            C61053g a = m93405a(superclass, z);
            treeSet.addAll(a.f165296d);
            for (Map.Entry entry : a.f165295c.entrySet()) {
                String str2 = (String) entry.getKey();
                if (!this.f165295c.containsKey(str2)) {
                    this.f165295c.put(str2, (C61060n) entry.getValue());
                }
            }
        }
        if (treeSet.isEmpty()) {
            list = Collections.emptyList();
        } else {
            list = Collections.unmodifiableList(new ArrayList(treeSet));
        }
        this.f165296d = list;
    }

    /* renamed from: a */
    public static C61053g m93405a(Class cls, boolean z) {
        ConcurrentMap concurrentMap;
        if (cls == null) {
            return null;
        }
        if (z) {
            concurrentMap = f165292f;
        } else {
            concurrentMap = f165291e;
        }
        C61053g gVar = (C61053g) concurrentMap.get(cls);
        if (gVar != null) {
            return gVar;
        }
        C61053g gVar2 = new C61053g(cls, z);
        C61053g gVar3 = (C61053g) concurrentMap.putIfAbsent(cls, gVar2);
        return gVar3 == null ? gVar2 : gVar3;
    }

    /* renamed from: b */
    public final C61060n mo57610b(String str) {
        if (str != null) {
            if (this.f165294b) {
                str = str.toLowerCase(Locale.US);
            }
            str = str.intern();
        }
        return (C61060n) this.f165295c.get(str);
    }
}
