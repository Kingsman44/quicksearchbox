package com.google.p4017at.p4056g.p4057a.p4058a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.lens.p4707j.C62584r;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.g.a.a.co */
/* compiled from: PG */
public final class C54034co extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C54034co f141767d;

    /* renamed from: e */
    private static volatile C63010eb f141768e;

    /* renamed from: a */
    public C62584r f141769a;

    /* renamed from: b */
    public int f141770b;

    /* renamed from: c */
    public int f141771c;

    static {
        C54034co coVar = new C54034co();
        f141767d = coVar;
        C62942bv.registerDefaultInstance(C54034co.class, coVar);
    }

    private C54034co() {
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
                return newMessageInfo(f141767d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\f\u0003\f", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C54034co();
            case 4:
                return new C54033cn();
            case 5:
                return f141767d;
            case 6:
                C63010eb ebVar = f141768e;
                if (ebVar == null) {
                    synchronized (C54034co.class) {
                        ebVar = f141768e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141767d);
                            f141768e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
