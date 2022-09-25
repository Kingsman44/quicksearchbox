package com.google.lens.p4707j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.j.cg */
/* compiled from: PG */
public final class C62457cg extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62457cg f168651c;

    /* renamed from: d */
    private static volatile C63010eb f168652d;

    /* renamed from: a */
    public int f168653a;

    /* renamed from: b */
    public C62485dh f168654b;

    static {
        C62457cg cgVar = new C62457cg();
        f168651c = cgVar;
        C62942bv.registerDefaultInstance(C62457cg.class, cgVar);
    }

    private C62457cg() {
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
                return newMessageInfo(f168651c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C62457cg();
            case 4:
                return new C62456cf();
            case 5:
                return f168651c;
            case 6:
                C63010eb ebVar = f168652d;
                if (ebVar == null) {
                    synchronized (C62457cg.class) {
                        ebVar = f168652d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168651c);
                            f168652d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
