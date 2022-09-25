package com.google.p4017at.p4060h.p4073d.p4074a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.h.d.a.z */
/* compiled from: PG */
public final class C54262z extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C54262z f142473b;

    /* renamed from: d */
    private static volatile C63010eb f142474d;

    /* renamed from: a */
    public boolean f142475a;

    /* renamed from: c */
    private int f142476c;

    static {
        C54262z zVar = new C54262z();
        f142473b = zVar;
        C62942bv.registerDefaultInstance(C54262z.class, zVar);
    }

    private C54262z() {
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
                return newMessageInfo(f142473b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C54262z();
            case 4:
                return new C54261y();
            case 5:
                return f142473b;
            case 6:
                C63010eb ebVar = f142474d;
                if (ebVar == null) {
                    synchronized (C54262z.class) {
                        ebVar = f142474d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142473b);
                            f142474d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
