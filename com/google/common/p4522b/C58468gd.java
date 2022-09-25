package com.google.common.p4522b;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.Set;
import p3186j$.util.Map;

/* renamed from: com.google.common.b.gd */
/* compiled from: PG */
public abstract class C58468gd extends C58495hd implements Map, C58334be {
    /* renamed from: a */
    public static C58468gd m89779a(java.util.Map map) {
        if (map instanceof C58468gd) {
            C58468gd gdVar = (C58468gd) map;
            if (!gdVar.mo55193c()) {
                return gdVar;
            }
        }
        Set entrySet = map.entrySet();
        C58466gb gbVar = new C58466gb(entrySet instanceof Collection ? entrySet.size() : 4);
        gbVar.mo55365e(entrySet);
        return gbVar.mo55363c();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* renamed from: b */
    public abstract C58468gd mo55367b();

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C58334be mo55027e() {
        throw null;
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C58471gg mo55368f() {
        throw new AssertionError("should never be called");
    }

    /* renamed from: g */
    public final /* synthetic */ C58471gg mo55369g() {
        return mo55367b().keySet();
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ Set mo55028h() {
        throw null;
    }

    public final /* synthetic */ Collection values() {
        return mo55367b().keySet();
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new C58467gc(this);
    }
}
