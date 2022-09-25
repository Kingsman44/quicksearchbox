package com.google.android.libraries.search.p2904c.p2933j.p2934a.p2935a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.j.a.a.p */
/* compiled from: PG */
public final class C37722p extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C37722p f100150a;

    /* renamed from: b */
    private static volatile C63010eb f100151b;

    static {
        C37722p pVar = new C37722p();
        f100150a = pVar;
        C62942bv.registerDefaultInstance(C37722p.class, pVar);
    }

    private C37722p() {
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
                return newMessageInfo(f100150a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C37722p();
            case 4:
                return new C37721o();
            case 5:
                return f100150a;
            case 6:
                C63010eb ebVar = f100151b;
                if (ebVar == null) {
                    synchronized (C37722p.class) {
                        ebVar = f100151b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f100150a);
                            f100151b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
