package com.google.p4017at.p4056g.p4057a.p4058a;

import com.google.lens.p4707j.C62478da;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.g.a.a.y */
/* compiled from: PG */
public final class C54073y extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C54073y f141880b;

    /* renamed from: c */
    private static volatile C63010eb f141881c;

    /* renamed from: a */
    public C62478da f141882a;

    static {
        C54073y yVar = new C54073y();
        f141880b = yVar;
        C62942bv.registerDefaultInstance(C54073y.class, yVar);
    }

    private C54073y() {
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
                return newMessageInfo(f141880b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C54073y();
            case 4:
                return new C54072x();
            case 5:
                return f141880b;
            case 6:
                C63010eb ebVar = f141881c;
                if (ebVar == null) {
                    synchronized (C54073y.class) {
                        ebVar = f141881c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141880b);
                            f141881c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
