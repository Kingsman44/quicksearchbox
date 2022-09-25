package com.google.android.libraries.search.p2904c.p2967t.p2971c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.t.c.m */
/* compiled from: PG */
public final class C38089m extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C38089m f100917b;

    /* renamed from: c */
    private static volatile C63010eb f100918c;

    /* renamed from: a */
    public C62971cq f100919a = emptyProtobufList();

    static {
        C38089m mVar = new C38089m();
        f100917b = mVar;
        C62942bv.registerDefaultInstance(C38089m.class, mVar);
    }

    private C38089m() {
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
                return newMessageInfo(f100917b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C38072b.class});
            case 3:
                return new C38089m();
            case 4:
                return new C38088l();
            case 5:
                return f100917b;
            case 6:
                C63010eb ebVar = f100918c;
                if (ebVar == null) {
                    synchronized (C38089m.class) {
                        ebVar = f100918c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f100917b);
                            f100918c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
