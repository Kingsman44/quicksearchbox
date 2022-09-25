package com.google.assistant.p3781ad.p3787c.p3788a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.c.a.ao */
/* compiled from: PG */
public final class C48496ao extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C48496ao f125274d;

    /* renamed from: e */
    private static volatile C63010eb f125275e;

    /* renamed from: a */
    public int f125276a;

    /* renamed from: b */
    public float f125277b;

    /* renamed from: c */
    public float f125278c;

    static {
        C48496ao aoVar = new C48496ao();
        f125274d = aoVar;
        C62942bv.registerDefaultInstance(C48496ao.class, aoVar);
    }

    private C48496ao() {
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
                return newMessageInfo(f125274d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C48496ao();
            case 4:
                return new C48495an();
            case 5:
                return f125274d;
            case 6:
                C63010eb ebVar = f125275e;
                if (ebVar == null) {
                    synchronized (C48496ao.class) {
                        ebVar = f125275e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125274d);
                            f125275e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
