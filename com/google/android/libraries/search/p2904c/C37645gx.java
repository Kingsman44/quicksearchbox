package com.google.android.libraries.search.p2904c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.gx */
/* compiled from: PG */
public final class C37645gx extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C37645gx f100013a;

    /* renamed from: b */
    private static volatile C63010eb f100014b;

    static {
        C37645gx gxVar = new C37645gx();
        f100013a = gxVar;
        C62942bv.registerDefaultInstance(C37645gx.class, gxVar);
    }

    private C37645gx() {
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
                return newMessageInfo(f100013a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C37645gx();
            case 4:
                return new C37644gw();
            case 5:
                return f100013a;
            case 6:
                C63010eb ebVar = f100014b;
                if (ebVar == null) {
                    synchronized (C37645gx.class) {
                        ebVar = f100014b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f100013a);
                            f100014b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
