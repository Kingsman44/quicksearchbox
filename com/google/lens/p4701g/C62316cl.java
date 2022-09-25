package com.google.lens.p4701g;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4492ck.p4493a.p4494a.C58127b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.g.cl */
/* compiled from: PG */
public final class C62316cl extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62316cl f168225b;

    /* renamed from: d */
    private static volatile C63010eb f168226d;

    /* renamed from: a */
    public C58127b f168227a;

    /* renamed from: c */
    private int f168228c;

    static {
        C62316cl clVar = new C62316cl();
        f168225b = clVar;
        C62942bv.registerDefaultInstance(C62316cl.class, clVar);
    }

    private C62316cl() {
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
                return newMessageInfo(f168225b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C62316cl();
            case 4:
                return new C62315ck();
            case 5:
                return f168225b;
            case 6:
                C63010eb ebVar = f168226d;
                if (ebVar == null) {
                    synchronized (C62316cl.class) {
                        ebVar = f168226d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168225b);
                            f168226d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
