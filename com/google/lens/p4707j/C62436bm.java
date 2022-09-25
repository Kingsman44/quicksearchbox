package com.google.lens.p4707j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.j.bm */
/* compiled from: PG */
public final class C62436bm extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62436bm f168595b;

    /* renamed from: d */
    private static volatile C63010eb f168596d;

    /* renamed from: a */
    public C62445bv f168597a;

    /* renamed from: c */
    private int f168598c;

    static {
        C62436bm bmVar = new C62436bm();
        f168595b = bmVar;
        C62942bv.registerDefaultInstance(C62436bm.class, bmVar);
    }

    private C62436bm() {
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
                return newMessageInfo(f168595b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C62436bm();
            case 4:
                return new C62435bl();
            case 5:
                return f168595b;
            case 6:
                C63010eb ebVar = f168596d;
                if (ebVar == null) {
                    synchronized (C62436bm.class) {
                        ebVar = f168596d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168595b);
                            f168596d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
