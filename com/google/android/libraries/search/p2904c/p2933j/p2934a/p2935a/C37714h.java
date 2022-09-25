package com.google.android.libraries.search.p2904c.p2933j.p2934a.p2935a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.j.a.a.h */
/* compiled from: PG */
public final class C37714h extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C37714h f100142a;

    /* renamed from: b */
    private static volatile C63010eb f100143b;

    static {
        C37714h hVar = new C37714h();
        f100142a = hVar;
        C62942bv.registerDefaultInstance(C37714h.class, hVar);
    }

    private C37714h() {
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
                return newMessageInfo(f100142a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C37714h();
            case 4:
                return new C37713g();
            case 5:
                return f100142a;
            case 6:
                C63010eb ebVar = f100143b;
                if (ebVar == null) {
                    synchronized (C37714h.class) {
                        ebVar = f100143b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f100142a);
                            f100143b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
