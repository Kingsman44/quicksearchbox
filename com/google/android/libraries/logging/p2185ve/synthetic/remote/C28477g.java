package com.google.android.libraries.logging.p2185ve.synthetic.remote;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.logging.ve.synthetic.remote.g */
/* compiled from: PG */
public final class C28477g extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C28477g f77277c;

    /* renamed from: d */
    private static volatile C63010eb f77278d;

    /* renamed from: a */
    public int f77279a;

    /* renamed from: b */
    public int f77280b;

    static {
        C28477g gVar = new C28477g();
        f77277c = gVar;
        C62942bv.registerDefaultInstance(C28477g.class, gVar);
    }

    private C28477g() {
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
                return newMessageInfo(f77277c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C28477g();
            case 4:
                return new C28476f();
            case 5:
                return f77277c;
            case 6:
                C63010eb ebVar = f77278d;
                if (ebVar == null) {
                    synchronized (C28477g.class) {
                        ebVar = f77278d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f77277c);
                            f77278d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
