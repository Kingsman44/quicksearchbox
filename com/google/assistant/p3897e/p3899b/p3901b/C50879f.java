package com.google.assistant.p3897e.p3899b.p3901b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.e.b.b.f */
/* compiled from: PG */
public final class C50879f extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C50879f f132476b;

    /* renamed from: d */
    private static volatile C63010eb f132477d;

    /* renamed from: a */
    public C63088z f132478a = C63088z.f170246b;

    /* renamed from: c */
    private int f132479c;

    static {
        C50879f fVar = new C50879f();
        f132476b = fVar;
        C62942bv.registerDefaultInstance(C50879f.class, fVar);
    }

    private C50879f() {
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
                return newMessageInfo(f132476b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C50879f();
            case 4:
                return new C50878e();
            case 5:
                return f132476b;
            case 6:
                C63010eb ebVar = f132477d;
                if (ebVar == null) {
                    synchronized (C50879f.class) {
                        ebVar = f132477d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132476b);
                            f132477d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
