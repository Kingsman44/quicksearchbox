package com.google.p375ai.p378b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.sh */
/* compiled from: PG */
public final class C8013sh extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C8013sh f28135e;

    /* renamed from: f */
    private static volatile C63010eb f28136f;

    /* renamed from: a */
    public int f28137a;

    /* renamed from: b */
    public int f28138b;

    /* renamed from: c */
    public int f28139c;

    /* renamed from: d */
    public int f28140d;

    static {
        C8013sh shVar = new C8013sh();
        f28135e = shVar;
        C62942bv.registerDefaultInstance(C8013sh.class, shVar);
    }

    private C8013sh() {
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
                return newMessageInfo(f28135e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဆ\u0000\u0002င\u0003\u0004ဆ\u0001", new Object[]{"a", "b", "d", C45240c.f118157a});
            case 3:
                return new C8013sh();
            case 4:
                return new C8012sg();
            case 5:
                return f28135e;
            case 6:
                C63010eb ebVar = f28136f;
                if (ebVar == null) {
                    synchronized (C8013sh.class) {
                        ebVar = f28136f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28135e);
                            f28136f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
