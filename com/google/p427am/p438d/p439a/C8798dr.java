package com.google.p427am.p438d.p439a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.am.d.a.dr */
/* compiled from: PG */
public final class C8798dr extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C8798dr f30173c;

    /* renamed from: d */
    private static volatile C63010eb f30174d;

    /* renamed from: a */
    public C62995dn f30175a = C62995dn.f170057a;

    /* renamed from: b */
    public C62995dn f30176b = C62995dn.f170057a;

    static {
        C8798dr drVar = new C8798dr();
        f30173c = drVar;
        C62942bv.registerDefaultInstance(C8798dr.class, drVar);
    }

    private C8798dr() {
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
                return newMessageInfo(f30173c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0002\u0000\u0000\u00012\u00022", new Object[]{"a", C8797dq.f30172a, "b", C8796dp.f30171a});
            case 3:
                return new C8798dr();
            case 4:
                return new C8795do();
            case 5:
                return f30173c;
            case 6:
                C63010eb ebVar = f30174d;
                if (ebVar == null) {
                    synchronized (C8798dr.class) {
                        ebVar = f30174d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30173c);
                            f30174d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
