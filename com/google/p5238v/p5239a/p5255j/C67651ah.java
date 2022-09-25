package com.google.p5238v.p5239a.p5255j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.v.a.j.ah */
/* compiled from: PG */
public final class C67651ah extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C67651ah f183603d;

    /* renamed from: e */
    private static volatile C63010eb f183604e;

    /* renamed from: a */
    public int f183605a;

    /* renamed from: b */
    public int f183606b;

    /* renamed from: c */
    public int f183607c;

    static {
        C67651ah ahVar = new C67651ah();
        f183603d = ahVar;
        C62942bv.registerDefaultInstance(C67651ah.class, ahVar);
    }

    private C67651ah() {
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
                return newMessageInfo(f183603d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\f", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C67651ah();
            case 4:
                return new C67650ag();
            case 5:
                return f183603d;
            case 6:
                C63010eb ebVar = f183604e;
                if (ebVar == null) {
                    synchronized (C67651ah.class) {
                        ebVar = f183604e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183603d);
                            f183604e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
