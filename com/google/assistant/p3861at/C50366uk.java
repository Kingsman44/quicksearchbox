package com.google.assistant.p3861at;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.at.uk */
/* compiled from: PG */
public final class C50366uk extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C50366uk f131111d;

    /* renamed from: e */
    private static volatile C63010eb f131112e;

    /* renamed from: a */
    public int f131113a;

    /* renamed from: b */
    public int f131114b;

    /* renamed from: c */
    public C63088z f131115c = C63088z.f170246b;

    static {
        C50366uk ukVar = new C50366uk();
        f131111d = ukVar;
        C62942bv.registerDefaultInstance(C50366uk.class, ukVar);
    }

    private C50366uk() {
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
                return newMessageInfo(f131111d, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0000\u0001ည\u0001\u0004ဌ\u0000", new Object[]{"a", C45240c.f118157a, "b", aee.f129104a});
            case 3:
                return new C50366uk();
            case 4:
                return new C50365uj();
            case 5:
                return f131111d;
            case 6:
                C63010eb ebVar = f131112e;
                if (ebVar == null) {
                    synchronized (C50366uk.class) {
                        ebVar = f131112e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131111d);
                            f131112e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
