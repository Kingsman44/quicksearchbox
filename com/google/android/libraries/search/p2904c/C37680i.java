package com.google.android.libraries.search.p2904c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.search.c.i */
/* compiled from: PG */
public final class C37680i extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C37680i f100071c;

    /* renamed from: d */
    private static volatile C63010eb f100072d;

    /* renamed from: a */
    public int f100073a;

    /* renamed from: b */
    public C63088z f100074b = C63088z.f170246b;

    static {
        C37680i iVar = new C37680i();
        f100071c = iVar;
        C62942bv.registerDefaultInstance(C37680i.class, iVar);
    }

    private C37680i() {
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
                return newMessageInfo(f100071c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
            case 3:
                return new C37680i();
            case 4:
                return new C37648h();
            case 5:
                return f100071c;
            case 6:
                C63010eb ebVar = f100072d;
                if (ebVar == null) {
                    synchronized (C37680i.class) {
                        ebVar = f100072d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f100071c);
                            f100072d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
