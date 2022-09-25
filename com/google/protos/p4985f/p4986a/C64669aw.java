package com.google.protos.p4985f.p4986a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.a.aw */
/* compiled from: PG */
public final class C64669aw extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C64669aw f175288e;

    /* renamed from: f */
    private static volatile C63010eb f175289f;

    /* renamed from: a */
    public int f175290a;

    /* renamed from: b */
    public C64653ag f175291b;

    /* renamed from: c */
    public int f175292c;

    /* renamed from: d */
    public long f175293d;

    static {
        C64669aw awVar = new C64669aw();
        f175288e = awVar;
        C62942bv.registerDefaultInstance(C64669aw.class, awVar);
    }

    private C64669aw() {
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
                return newMessageInfo(f175288e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0003င\u0002\u0004ဂ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C64669aw();
            case 4:
                return new C64668av();
            case 5:
                return f175288e;
            case 6:
                C63010eb ebVar = f175289f;
                if (ebVar == null) {
                    synchronized (C64669aw.class) {
                        ebVar = f175289f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175288e);
                            f175289f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
