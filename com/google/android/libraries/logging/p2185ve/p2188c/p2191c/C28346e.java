package com.google.android.libraries.logging.p2185ve.p2188c.p2191c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.logging.ve.c.c.e */
/* compiled from: PG */
public final class C28346e extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C28346e f77058c;

    /* renamed from: d */
    private static volatile C63010eb f77059d;

    /* renamed from: a */
    public int f77060a;

    /* renamed from: b */
    public int f77061b;

    static {
        C28346e eVar = new C28346e();
        f77058c = eVar;
        C62942bv.registerDefaultInstance(C28346e.class, eVar);
    }

    private C28346e() {
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
                return newMessageInfo(f77058c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C28346e();
            case 4:
                return new C28345d();
            case 5:
                return f77058c;
            case 6:
                C63010eb ebVar = f77059d;
                if (ebVar == null) {
                    synchronized (C28346e.class) {
                        ebVar = f77059d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f77058c);
                            f77059d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
