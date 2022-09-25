package com.google.lens.p4707j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.j.z */
/* compiled from: PG */
public final class C62592z extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62592z f168985c;

    /* renamed from: d */
    private static volatile C63010eb f168986d;

    /* renamed from: a */
    public int f168987a;

    /* renamed from: b */
    public C62478da f168988b;

    static {
        C62592z zVar = new C62592z();
        f168985c = zVar;
        C62942bv.registerDefaultInstance(C62592z.class, zVar);
    }

    private C62592z() {
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
                return newMessageInfo(f168985c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C62592z();
            case 4:
                return new C62591y();
            case 5:
                return f168985c;
            case 6:
                C63010eb ebVar = f168986d;
                if (ebVar == null) {
                    synchronized (C62592z.class) {
                        ebVar = f168986d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168985c);
                            f168986d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
