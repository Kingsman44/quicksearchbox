package com.google.android.libraries.search.p2904c.p2952o.p2957d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.o.d.e */
/* compiled from: PG */
public final class C37932e extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C37932e f100542b;

    /* renamed from: c */
    private static volatile C63010eb f100543c;

    /* renamed from: a */
    public C62971cq f100544a = emptyProtobufList();

    static {
        C37932e eVar = new C37932e();
        f100542b = eVar;
        C62942bv.registerDefaultInstance(C37932e.class, eVar);
    }

    private C37932e() {
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
                return newMessageInfo(f100542b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C37930c.class});
            case 3:
                return new C37932e();
            case 4:
                return new C37931d();
            case 5:
                return f100542b;
            case 6:
                C63010eb ebVar = f100543c;
                if (ebVar == null) {
                    synchronized (C37932e.class) {
                        ebVar = f100543c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f100542b);
                            f100543c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
