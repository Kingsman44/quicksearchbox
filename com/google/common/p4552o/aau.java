package com.google.common.p4552o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.aau */
/* compiled from: PG */
public final class aau extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final aau f158162a;

    /* renamed from: b */
    private static volatile C63010eb f158163b;

    static {
        aau aau = new aau();
        f158162a = aau;
        C62942bv.registerDefaultInstance(aau.class, aau);
    }

    private aau() {
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
                return newMessageInfo(f158162a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new aau();
            case 4:
                return new aat();
            case 5:
                return f158162a;
            case 6:
                C63010eb ebVar = f158163b;
                if (ebVar == null) {
                    synchronized (aau.class) {
                        ebVar = f158163b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158162a);
                            f158163b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
