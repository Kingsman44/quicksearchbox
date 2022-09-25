package com.google.protos.p4880aq;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aq.d */
/* compiled from: PG */
public final class C63747d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C63747d f172457c;

    /* renamed from: d */
    private static volatile C63010eb f172458d;

    /* renamed from: a */
    public int f172459a;

    /* renamed from: b */
    public int f172460b;

    static {
        C63747d dVar = new C63747d();
        f172457c = dVar;
        C62942bv.registerDefaultInstance(C63747d.class, dVar);
    }

    private C63747d() {
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
                return newMessageInfo(f172457c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C63738b.f172424a});
            case 3:
                return new C63747d();
            case 4:
                return new C63711a();
            case 5:
                return f172457c;
            case 6:
                C63010eb ebVar = f172458d;
                if (ebVar == null) {
                    synchronized (C63747d.class) {
                        ebVar = f172458d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172457c);
                            f172458d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
