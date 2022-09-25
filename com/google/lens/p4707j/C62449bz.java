package com.google.lens.p4707j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.j.bz */
/* compiled from: PG */
public final class C62449bz extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C62449bz f168627f;

    /* renamed from: g */
    private static volatile C63010eb f168628g;

    /* renamed from: a */
    public int f168629a;

    /* renamed from: b */
    public float f168630b;

    /* renamed from: c */
    public float f168631c;

    /* renamed from: d */
    public float f168632d;

    /* renamed from: e */
    public float f168633e;

    static {
        C62449bz bzVar = new C62449bz();
        f168627f = bzVar;
        C62942bv.registerDefaultInstance(C62449bz.class, bzVar);
    }

    private C62449bz() {
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
                return newMessageInfo(f168627f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C62449bz();
            case 4:
                return new C62448by();
            case 5:
                return f168627f;
            case 6:
                C63010eb ebVar = f168628g;
                if (ebVar == null) {
                    synchronized (C62449bz.class) {
                        ebVar = f168628g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168627f);
                            f168628g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
