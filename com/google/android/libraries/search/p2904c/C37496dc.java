package com.google.android.libraries.search.p2904c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.dc */
/* compiled from: PG */
public final class C37496dc extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C37496dc f99549c;

    /* renamed from: d */
    private static volatile C63010eb f99550d;

    /* renamed from: a */
    public int f99551a;

    /* renamed from: b */
    public C37655hb f99552b;

    static {
        C37496dc dcVar = new C37496dc();
        f99549c = dcVar;
        C62942bv.registerDefaultInstance(C37496dc.class, dcVar);
    }

    private C37496dc() {
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
                return newMessageInfo(f99549c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C37496dc();
            case 4:
                return new C37495db();
            case 5:
                return f99549c;
            case 6:
                C63010eb ebVar = f99550d;
                if (ebVar == null) {
                    synchronized (C37496dc.class) {
                        ebVar = f99550d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f99549c);
                            f99550d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
