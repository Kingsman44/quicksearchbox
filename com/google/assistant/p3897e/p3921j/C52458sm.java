package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.sm */
/* compiled from: PG */
public final class C52458sm extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C52458sm f137709d;

    /* renamed from: e */
    private static volatile C63010eb f137710e;

    /* renamed from: a */
    public int f137711a;

    /* renamed from: b */
    public boolean f137712b;

    /* renamed from: c */
    public boolean f137713c;

    static {
        C52458sm smVar = new C52458sm();
        f137709d = smVar;
        C62942bv.registerDefaultInstance(C52458sm.class, smVar);
    }

    private C52458sm() {
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
                return newMessageInfo(f137709d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C52458sm();
            case 4:
                return new C52457sl();
            case 5:
                return f137709d;
            case 6:
                C63010eb ebVar = f137710e;
                if (ebVar == null) {
                    synchronized (C52458sm.class) {
                        ebVar = f137710e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137709d);
                            f137710e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
