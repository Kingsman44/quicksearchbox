package com.google.lens.p4707j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.j.fa */
/* compiled from: PG */
public final class C62532fa extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62532fa f168834c;

    /* renamed from: d */
    private static volatile C63010eb f168835d;

    /* renamed from: a */
    public int f168836a;

    /* renamed from: b */
    public C62517em f168837b;

    static {
        C62532fa faVar = new C62532fa();
        f168834c = faVar;
        C62942bv.registerDefaultInstance(C62532fa.class, faVar);
    }

    private C62532fa() {
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
                return newMessageInfo(f168834c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{"a", "b"});
            case 3:
                return new C62532fa();
            case 4:
                return new C62530ez();
            case 5:
                return f168834c;
            case 6:
                C63010eb ebVar = f168835d;
                if (ebVar == null) {
                    synchronized (C62532fa.class) {
                        ebVar = f168835d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168834c);
                            f168835d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
