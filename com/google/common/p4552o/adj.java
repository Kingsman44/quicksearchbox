package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.adj */
/* compiled from: PG */
public final class adj extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final adj f158371e;

    /* renamed from: f */
    private static volatile C63010eb f158372f;

    /* renamed from: a */
    public int f158373a;

    /* renamed from: b */
    public long f158374b;

    /* renamed from: c */
    public int f158375c;

    /* renamed from: d */
    public int f158376d;

    static {
        adj adj = new adj();
        f158371e = adj;
        C62942bv.registerDefaultInstance(adj.class, adj);
    }

    private adj() {
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
                return newMessageInfo(f158371e, "\u0001\u0003\u0000\u0001\u0005\b\u0003\u0000\u0000\u0000\u0005ဂ\u0004\u0007ဌ\u0005\bဌ\u0006", new Object[]{"a", "b", C45240c.f118157a, adh.m92372b(), "d", adi.f158370a});
            case 3:
                return new adj();
            case 4:
                return new adf();
            case 5:
                return f158371e;
            case 6:
                C63010eb ebVar = f158372f;
                if (ebVar == null) {
                    synchronized (adj.class) {
                        ebVar = f158372f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158371e);
                            f158372f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
