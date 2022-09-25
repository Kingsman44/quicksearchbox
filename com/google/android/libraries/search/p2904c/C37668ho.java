package com.google.android.libraries.search.p2904c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.ho */
/* compiled from: PG */
public final class C37668ho extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C37668ho f100047c;

    /* renamed from: e */
    private static volatile C63010eb f100048e;

    /* renamed from: a */
    public int f100049a;

    /* renamed from: b */
    public int f100050b;

    /* renamed from: d */
    private int f100051d;

    static {
        C37668ho hoVar = new C37668ho();
        f100047c = hoVar;
        C62942bv.registerDefaultInstance(C37668ho.class, hoVar);
    }

    private C37668ho() {
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
                return newMessageInfo(f100047c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C37668ho();
            case 4:
                return new C37667hn();
            case 5:
                return f100047c;
            case 6:
                C63010eb ebVar = f100048e;
                if (ebVar == null) {
                    synchronized (C37668ho.class) {
                        ebVar = f100048e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f100047c);
                            f100048e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
