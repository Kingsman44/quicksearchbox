package com.google.lens.p4699e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.e.av */
/* compiled from: PG */
public final class C62209av extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C62209av f167958d;

    /* renamed from: e */
    private static volatile C63010eb f167959e;

    /* renamed from: a */
    public int f167960a;

    /* renamed from: b */
    public int f167961b;

    /* renamed from: c */
    public int f167962c;

    static {
        C62209av avVar = new C62209av();
        f167958d = avVar;
        C62942bv.registerDefaultInstance(C62209av.class, avVar);
    }

    private C62209av() {
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
                return newMessageInfo(f167958d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C62209av();
            case 4:
                return new C62208au();
            case 5:
                return f167958d;
            case 6:
                C63010eb ebVar = f167959e;
                if (ebVar == null) {
                    synchronized (C62209av.class) {
                        ebVar = f167959e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167958d);
                            f167959e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
