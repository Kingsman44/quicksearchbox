package com.google.android.libraries.search.p2904c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.q */
/* compiled from: PG */
public final class C37945q extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C37945q f100557a;

    /* renamed from: b */
    private static volatile C63010eb f100558b;

    static {
        C37945q qVar = new C37945q();
        f100557a = qVar;
        C62942bv.registerDefaultInstance(C37945q.class, qVar);
    }

    private C37945q() {
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
                return newMessageInfo(f100557a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C37945q();
            case 4:
                return new C37936p();
            case 5:
                return f100557a;
            case 6:
                C63010eb ebVar = f100558b;
                if (ebVar == null) {
                    synchronized (C37945q.class) {
                        ebVar = f100558b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f100557a);
                            f100558b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
