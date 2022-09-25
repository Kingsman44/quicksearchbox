package com.google.p4160bf.p4161a.p4163b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.a.b.y */
/* compiled from: PG */
public final class C55517y extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C55517y f146498c;

    /* renamed from: d */
    private static volatile C63010eb f146499d;

    /* renamed from: a */
    public int f146500a;

    /* renamed from: b */
    public C55441ae f146501b;

    static {
        C55517y yVar = new C55517y();
        f146498c = yVar;
        C62942bv.registerDefaultInstance(C55517y.class, yVar);
    }

    private C55517y() {
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
                return newMessageInfo(f146498c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C55517y();
            case 4:
                return new C55516x();
            case 5:
                return f146498c;
            case 6:
                C63010eb ebVar = f146499d;
                if (ebVar == null) {
                    synchronized (C55517y.class) {
                        ebVar = f146499d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146498c);
                            f146499d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
