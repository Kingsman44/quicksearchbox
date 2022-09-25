package com.google.assistant.p3897e.p3921j.p3926e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.e.ij */
/* compiled from: PG */
public final class C52038ij extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C52038ij f136583a;

    /* renamed from: b */
    private static volatile C63010eb f136584b;

    static {
        C52038ij ijVar = new C52038ij();
        f136583a = ijVar;
        C62942bv.registerDefaultInstance(C52038ij.class, ijVar);
    }

    private C52038ij() {
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
                return newMessageInfo(f136583a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C52038ij();
            case 4:
                return new C52037ii();
            case 5:
                return f136583a;
            case 6:
                C63010eb ebVar = f136584b;
                if (ebVar == null) {
                    synchronized (C52038ij.class) {
                        ebVar = f136584b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136583a);
                            f136584b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
