package com.google.p395al.p408c.p414c.p416b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.al.c.c.b.u */
/* compiled from: PG */
public final class C8511u extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C8511u f29525b;

    /* renamed from: d */
    private static volatile C63010eb f29526d;

    /* renamed from: a */
    public int f29527a;

    /* renamed from: c */
    private int f29528c;

    static {
        C8511u uVar = new C8511u();
        f29525b = uVar;
        C62942bv.registerDefaultInstance(C8511u.class, uVar);
    }

    private C8511u() {
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
                return newMessageInfo(f29525b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002င\u0001", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C8511u();
            case 4:
                return new C8510t();
            case 5:
                return f29525b;
            case 6:
                C63010eb ebVar = f29526d;
                if (ebVar == null) {
                    synchronized (C8511u.class) {
                        ebVar = f29526d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29525b);
                            f29526d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
