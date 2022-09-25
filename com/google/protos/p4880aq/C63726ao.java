package com.google.protos.p4880aq;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aq.ao */
/* compiled from: PG */
public final class C63726ao extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C63726ao f172288d;

    /* renamed from: e */
    private static volatile C63010eb f172289e;

    /* renamed from: a */
    public int f172290a;

    /* renamed from: b */
    public C63756m f172291b;

    /* renamed from: c */
    public long f172292c;

    static {
        C63726ao aoVar = new C63726ao();
        f172288d = aoVar;
        C62942bv.registerDefaultInstance(C63726ao.class, aoVar);
    }

    private C63726ao() {
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
                return newMessageInfo(f172288d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C63726ao();
            case 4:
                return new C63725an();
            case 5:
                return f172288d;
            case 6:
                C63010eb ebVar = f172289e;
                if (ebVar == null) {
                    synchronized (C63726ao.class) {
                        ebVar = f172289e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172288d);
                            f172289e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
