package com.google.lens.p4708k;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.lens.p4707j.C62447bx;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.k.c */
/* compiled from: PG */
public final class C62595c extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C62595c f168989d;

    /* renamed from: e */
    private static volatile C63010eb f168990e;

    /* renamed from: a */
    public int f168991a;

    /* renamed from: b */
    public C62447bx f168992b;

    /* renamed from: c */
    public C62447bx f168993c;

    static {
        C62595c cVar = new C62595c();
        f168989d = cVar;
        C62942bv.registerDefaultInstance(C62595c.class, cVar);
    }

    private C62595c() {
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
                return newMessageInfo(f168989d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C62595c();
            case 4:
                return new C62594b();
            case 5:
                return f168989d;
            case 6:
                C63010eb ebVar = f168990e;
                if (ebVar == null) {
                    synchronized (C62595c.class) {
                        ebVar = f168990e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168989d);
                            f168990e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
