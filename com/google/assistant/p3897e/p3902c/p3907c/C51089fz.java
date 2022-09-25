package com.google.assistant.p3897e.p3902c.p3907c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.fz */
/* compiled from: PG */
public final class C51089fz extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C51089fz f133001a;

    /* renamed from: b */
    private static volatile C63010eb f133002b;

    static {
        C51089fz fzVar = new C51089fz();
        f133001a = fzVar;
        C62942bv.registerDefaultInstance(C51089fz.class, fzVar);
    }

    private C51089fz() {
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
                return newMessageInfo(f133001a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C51089fz();
            case 4:
                return new C51088fy();
            case 5:
                return f133001a;
            case 6:
                C63010eb ebVar = f133002b;
                if (ebVar == null) {
                    synchronized (C51089fz.class) {
                        ebVar = f133002b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133001a);
                            f133002b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
