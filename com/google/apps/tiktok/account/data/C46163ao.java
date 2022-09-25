package com.google.apps.tiktok.account.data;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.apps.tiktok.account.data.ao */
/* compiled from: PG */
public final class C46163ao extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C46163ao f121082d;

    /* renamed from: e */
    private static volatile C63010eb f121083e;

    /* renamed from: a */
    public int f121084a;

    /* renamed from: b */
    public long f121085b;

    /* renamed from: c */
    public long f121086c;

    static {
        C46163ao aoVar = new C46163ao();
        f121082d = aoVar;
        C62942bv.registerDefaultInstance(C46163ao.class, aoVar);
    }

    private C46163ao() {
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
                return newMessageInfo(f121082d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C46163ao();
            case 4:
                return new C46162an();
            case 5:
                return f121082d;
            case 6:
                C63010eb ebVar = f121083e;
                if (ebVar == null) {
                    synchronized (C46163ao.class) {
                        ebVar = f121083e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f121082d);
                            f121083e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
