package com.google.p427am.p438d.p439a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.am.d.a.at */
/* compiled from: PG */
public final class C8719at extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C8719at f30050b;

    /* renamed from: c */
    private static volatile C63010eb f30051c;

    /* renamed from: a */
    public boolean f30052a;

    static {
        C8719at atVar = new C8719at();
        f30050b = atVar;
        C62942bv.registerDefaultInstance(C8719at.class, atVar);
    }

    private C8719at() {
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
                return newMessageInfo(f30050b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"a"});
            case 3:
                return new C8719at();
            case 4:
                return new C8718as();
            case 5:
                return f30050b;
            case 6:
                C63010eb ebVar = f30051c;
                if (ebVar == null) {
                    synchronized (C8719at.class) {
                        ebVar = f30051c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30050b);
                            f30051c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
