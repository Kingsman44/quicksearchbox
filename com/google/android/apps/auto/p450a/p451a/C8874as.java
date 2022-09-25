package com.google.android.apps.auto.p450a.p451a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.auto.a.a.as */
/* compiled from: PG */
public final class C8874as extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C8874as f30808d;

    /* renamed from: e */
    private static volatile C63010eb f30809e;

    /* renamed from: a */
    public int f30810a;

    /* renamed from: b */
    public long f30811b;

    /* renamed from: c */
    public long f30812c;

    static {
        C8874as asVar = new C8874as();
        f30808d = asVar;
        C62942bv.registerDefaultInstance(C8874as.class, asVar);
    }

    private C8874as() {
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
                return newMessageInfo(f30808d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဂ\u0002", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C8874as();
            case 4:
                return new C8873ar();
            case 5:
                return f30808d;
            case 6:
                C63010eb ebVar = f30809e;
                if (ebVar == null) {
                    synchronized (C8874as.class) {
                        ebVar = f30809e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30808d);
                            f30809e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
