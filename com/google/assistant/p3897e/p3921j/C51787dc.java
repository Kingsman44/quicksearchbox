package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.dc */
/* compiled from: PG */
public final class C51787dc extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C51787dc f135881c;

    /* renamed from: d */
    private static volatile C63010eb f135882d;

    /* renamed from: a */
    public int f135883a;

    /* renamed from: b */
    public int f135884b;

    static {
        C51787dc dcVar = new C51787dc();
        f135881c = dcVar;
        C62942bv.registerDefaultInstance(C51787dc.class, dcVar);
    }

    private C51787dc() {
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
                return newMessageInfo(f135881c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C51787dc();
            case 4:
                return new C51786db();
            case 5:
                return f135881c;
            case 6:
                C63010eb ebVar = f135882d;
                if (ebVar == null) {
                    synchronized (C51787dc.class) {
                        ebVar = f135882d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135881c);
                            f135882d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
