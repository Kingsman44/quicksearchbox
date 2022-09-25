package com.google.assistant.p3861at;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.at.xe */
/* compiled from: PG */
public final class C50441xe extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C50441xe f131276e;

    /* renamed from: f */
    private static volatile C63010eb f131277f;

    /* renamed from: a */
    public int f131278a;

    /* renamed from: b */
    public C63088z f131279b = C63088z.f170246b;

    /* renamed from: c */
    public int f131280c;

    /* renamed from: d */
    public C50404vv f131281d;

    static {
        C50441xe xeVar = new C50441xe();
        f131276e = xeVar;
        C62942bv.registerDefaultInstance(C50441xe.class, xeVar);
    }

    private C50441xe() {
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
                return newMessageInfo(f131276e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ဌ\u0001\u0004ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, C50440xd.f131275a, "d"});
            case 3:
                return new C50441xe();
            case 4:
                return new C50439xc();
            case 5:
                return f131276e;
            case 6:
                C63010eb ebVar = f131277f;
                if (ebVar == null) {
                    synchronized (C50441xe.class) {
                        ebVar = f131277f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131276e);
                            f131277f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
