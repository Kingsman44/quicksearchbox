package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.aw */
/* compiled from: PG */
public final class C51695aw extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C51695aw f135619c;

    /* renamed from: d */
    private static volatile C63010eb f135620d;

    /* renamed from: a */
    public int f135621a;

    /* renamed from: b */
    public int f135622b;

    static {
        C51695aw awVar = new C51695aw();
        f135619c = awVar;
        C62942bv.registerDefaultInstance(C51695aw.class, awVar);
    }

    private C51695aw() {
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
                return newMessageInfo(f135619c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဌ\u0000", new Object[]{"a", "b", C51769cv.f135822a});
            case 3:
                return new C51695aw();
            case 4:
                return new C51694av();
            case 5:
                return f135619c;
            case 6:
                C63010eb ebVar = f135620d;
                if (ebVar == null) {
                    synchronized (C51695aw.class) {
                        ebVar = f135620d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135619c);
                            f135620d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
