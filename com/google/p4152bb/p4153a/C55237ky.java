package com.google.p4152bb.p4153a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bb.a.ky */
/* compiled from: PG */
public final class C55237ky extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C55237ky f145438c;

    /* renamed from: d */
    public static final C62940bt f145439d;

    /* renamed from: e */
    private static volatile C63010eb f145440e;

    /* renamed from: a */
    public int f145441a;

    /* renamed from: b */
    public int f145442b;

    static {
        C55237ky kyVar = new C55237ky();
        f145438c = kyVar;
        C62942bv.registerDefaultInstance(C55237ky.class, kyVar);
        f145439d = C62942bv.newSingularGeneratedExtension(C55240la.f145449k, kyVar, kyVar, (C62958ce) null, 68007661, C63066gd.MESSAGE, C55237ky.class);
    }

    private C55237ky() {
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
                return newMessageInfo(f145438c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C55237ky();
            case 4:
                return new C55236kx();
            case 5:
                return f145438c;
            case 6:
                C63010eb ebVar = f145440e;
                if (ebVar == null) {
                    synchronized (C55237ky.class) {
                        ebVar = f145440e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145438c);
                            f145440e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
