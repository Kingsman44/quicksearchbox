package com.google.p375ai.p378b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.xi */
/* compiled from: PG */
public final class C8149xi extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C8149xi f28652d;

    /* renamed from: e */
    private static volatile C63010eb f28653e;

    /* renamed from: a */
    public int f28654a;

    /* renamed from: b */
    public int f28655b = 1;

    /* renamed from: c */
    public long f28656c;

    static {
        C8149xi xiVar = new C8149xi();
        f28652d = xiVar;
        C62942bv.registerDefaultInstance(C8149xi.class, xiVar);
    }

    private C8149xi() {
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
                return newMessageInfo(f28652d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဌ\u0000\u0003ဂ\u0001", new Object[]{"a", "b", C8147xg.f28651a, C45240c.f118157a});
            case 3:
                return new C8149xi();
            case 4:
                return new C8146xf();
            case 5:
                return f28652d;
            case 6:
                C63010eb ebVar = f28653e;
                if (ebVar == null) {
                    synchronized (C8149xi.class) {
                        ebVar = f28653e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28652d);
                            f28653e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
