package com.google.p4154bc.p4155a.p4156a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bc.a.a.d */
/* compiled from: PG */
public final class C55427d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C55427d f146241c;

    /* renamed from: d */
    private static volatile C63010eb f146242d;

    /* renamed from: a */
    public int f146243a;

    /* renamed from: b */
    public int f146244b;

    static {
        C55427d dVar = new C55427d();
        f146241c = dVar;
        C62942bv.registerDefaultInstance(C55427d.class, dVar);
    }

    private C55427d() {
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
                return newMessageInfo(f146241c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C55426c.f146240a});
            case 3:
                return new C55427d();
            case 4:
                return new C55425b();
            case 5:
                return f146241c;
            case 6:
                C63010eb ebVar = f146242d;
                if (ebVar == null) {
                    synchronized (C55427d.class) {
                        ebVar = f146242d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146241c);
                            f146242d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
