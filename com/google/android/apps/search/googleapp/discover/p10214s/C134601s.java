package com.google.android.apps.search.googleapp.discover.p10214s;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.discover.s.s */
/* compiled from: PG */
public final class C134601s extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C134601s f366553c;

    /* renamed from: d */
    private static volatile C63010eb f366554d;

    /* renamed from: a */
    public int f366555a;

    /* renamed from: b */
    public long f366556b;

    static {
        C134601s sVar = new C134601s();
        f366553c = sVar;
        C62942bv.registerDefaultInstance(C134601s.class, sVar);
    }

    private C134601s() {
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
                return newMessageInfo(f366553c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C134601s();
            case 4:
                return new C134600r();
            case 5:
                return f366553c;
            case 6:
                C63010eb ebVar = f366554d;
                if (ebVar == null) {
                    synchronized (C134601s.class) {
                        ebVar = f366554d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f366553c);
                            f366554d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
