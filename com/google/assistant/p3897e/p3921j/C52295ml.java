package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.ml */
/* compiled from: PG */
public final class C52295ml extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52295ml f137275c;

    /* renamed from: d */
    private static volatile C63010eb f137276d;

    /* renamed from: a */
    public int f137277a;

    /* renamed from: b */
    public ade f137278b;

    static {
        C52295ml mlVar = new C52295ml();
        f137275c = mlVar;
        C62942bv.registerDefaultInstance(C52295ml.class, mlVar);
    }

    private C52295ml() {
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
                return newMessageInfo(f137275c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new C52295ml();
            case 4:
                return new C52294mk();
            case 5:
                return f137275c;
            case 6:
                C63010eb ebVar = f137276d;
                if (ebVar == null) {
                    synchronized (C52295ml.class) {
                        ebVar = f137276d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137275c);
                            f137276d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
