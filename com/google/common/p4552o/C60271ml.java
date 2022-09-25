package com.google.common.p4552o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.ml */
/* compiled from: PG */
public final class C60271ml extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C60271ml f163063c;

    /* renamed from: d */
    private static volatile C63010eb f163064d;

    /* renamed from: a */
    public int f163065a;

    /* renamed from: b */
    public C60305nr f163066b;

    static {
        C60271ml mlVar = new C60271ml();
        f163063c = mlVar;
        C62942bv.registerDefaultInstance(C60271ml.class, mlVar);
    }

    private C60271ml() {
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
                return newMessageInfo(f163063c, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဉ\u0002", new Object[]{"a", "b"});
            case 3:
                return new C60271ml();
            case 4:
                return new C60270mk();
            case 5:
                return f163063c;
            case 6:
                C63010eb ebVar = f163064d;
                if (ebVar == null) {
                    synchronized (C60271ml.class) {
                        ebVar = f163064d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163063c);
                            f163064d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
