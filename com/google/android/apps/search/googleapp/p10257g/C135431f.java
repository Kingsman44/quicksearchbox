package com.google.android.apps.search.googleapp.p10257g;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4479cg.C58070b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.g.f */
/* compiled from: PG */
public final class C135431f extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C135431f f368964f;

    /* renamed from: g */
    private static volatile C63010eb f368965g;

    /* renamed from: a */
    public int f368966a;

    /* renamed from: b */
    public int f368967b;

    /* renamed from: c */
    public boolean f368968c = true;

    /* renamed from: d */
    public C58070b f368969d;

    /* renamed from: e */
    public boolean f368970e;

    static {
        C135431f fVar = new C135431f();
        f368964f = fVar;
        C62942bv.registerDefaultInstance(C135431f.class, fVar);
    }

    private C135431f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f368964f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဉ\u0002\u0005ဇ\u0003", new Object[]{"a", "b", C135430e.m219592b(), C45240c.f118157a, "d", "e"});
            case 3:
                return new C135431f();
            case 4:
                return new C135428c();
            case 5:
                return f368964f;
            case 6:
                C63010eb ebVar = f368965g;
                if (ebVar == null) {
                    synchronized (C135431f.class) {
                        ebVar = f368965g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f368964f);
                            f368965g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
