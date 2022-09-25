package com.google.lens.p4707j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.j.er */
/* compiled from: PG */
public final class C62522er extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C62522er f168810d;

    /* renamed from: e */
    private static volatile C63010eb f168811e;

    /* renamed from: a */
    public int f168812a;

    /* renamed from: b */
    public float f168813b = 1.0f;

    /* renamed from: c */
    public C62405ai f168814c;

    static {
        C62522er erVar = new C62522er();
        f168810d = erVar;
        C62942bv.registerDefaultInstance(C62522er.class, erVar);
    }

    private C62522er() {
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
                return newMessageInfo(f168810d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C62522er();
            case 4:
                return new C62521eq();
            case 5:
                return f168810d;
            case 6:
                C63010eb ebVar = f168811e;
                if (ebVar == null) {
                    synchronized (C62522er.class) {
                        ebVar = f168811e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168810d);
                            f168811e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
