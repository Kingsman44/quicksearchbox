package com.google.lens.p4707j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.j.v */
/* compiled from: PG */
public final class C62588v extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62588v f168978c;

    /* renamed from: d */
    private static volatile C63010eb f168979d;

    /* renamed from: a */
    public int f168980a;

    /* renamed from: b */
    public C62452cb f168981b;

    static {
        C62588v vVar = new C62588v();
        f168978c = vVar;
        C62942bv.registerDefaultInstance(C62588v.class, vVar);
    }

    private C62588v() {
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
                return newMessageInfo(f168978c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C62588v();
            case 4:
                return new C62587u();
            case 5:
                return f168978c;
            case 6:
                C63010eb ebVar = f168979d;
                if (ebVar == null) {
                    synchronized (C62588v.class) {
                        ebVar = f168979d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168978c);
                            f168979d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
