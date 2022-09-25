package com.google.p4017at.p4082j.p4083a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.at.j.a.eh */
/* compiled from: PG */
public final class C54436eh extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54436eh f142953c;

    /* renamed from: d */
    private static volatile C63010eb f142954d;

    /* renamed from: a */
    public int f142955a;

    /* renamed from: b */
    public C63042fg f142956b;

    static {
        C54436eh ehVar = new C54436eh();
        f142953c = ehVar;
        C62942bv.registerDefaultInstance(C54436eh.class, ehVar);
    }

    private C54436eh() {
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
                return newMessageInfo(f142953c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new C54436eh();
            case 4:
                return new C54435eg();
            case 5:
                return f142953c;
            case 6:
                C63010eb ebVar = f142954d;
                if (ebVar == null) {
                    synchronized (C54436eh.class) {
                        ebVar = f142954d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142953c);
                            f142954d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
