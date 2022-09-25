package com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.f.a.d.be */
/* compiled from: PG */
public final class C32810be extends C62937bq implements C62938br {

    /* renamed from: c */
    public static final C32810be f87993c;

    /* renamed from: e */
    private static volatile C63010eb f87994e;

    /* renamed from: a */
    public int f87995a;

    /* renamed from: b */
    public C32796ar f87996b;

    /* renamed from: d */
    private byte f87997d = 2;

    static {
        C32810be beVar = new C32810be();
        f87993c = beVar;
        C62942bv.registerDefaultInstance(C32810be.class, beVar);
    }

    private C32810be() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f87997d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f87997d = b;
                return null;
            case 2:
                return newMessageInfo(f87993c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C32810be();
            case 4:
                return new C32809bd();
            case 5:
                return f87993c;
            case 6:
                C63010eb ebVar = f87994e;
                if (ebVar == null) {
                    synchronized (C32810be.class) {
                        ebVar = f87994e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f87993c);
                            f87994e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
