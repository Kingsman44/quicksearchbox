package com.google.p4152bb.p4153a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.qj */
/* compiled from: PG */
public final class C55384qj extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C55384qj f145935a;

    /* renamed from: d */
    private static volatile C63010eb f145936d;

    /* renamed from: b */
    private C62995dn f145937b = C62995dn.f170057a;

    /* renamed from: c */
    private C62995dn f145938c = C62995dn.f170057a;

    static {
        C55384qj qjVar = new C55384qj();
        f145935a = qjVar;
        C62942bv.registerDefaultInstance(C55384qj.class, qjVar);
    }

    private C55384qj() {
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
                return newMessageInfo(f145935a, "\u0001\u0002\u0000\u0000\u0001\u0004\u0002\u0002\u0000\u0000\u00012\u00042", new Object[]{"b", C55382qh.f145933a, C45240c.f118157a, C55383qi.f145934a});
            case 3:
                return new C55384qj();
            case 4:
                return new C55381qg();
            case 5:
                return f145935a;
            case 6:
                C63010eb ebVar = f145936d;
                if (ebVar == null) {
                    synchronized (C55384qj.class) {
                        ebVar = f145936d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145935a);
                            f145936d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
