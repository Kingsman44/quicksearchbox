package com.google.android.apps.p8919h.p8920a.p8921a.p8922a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.h.a.a.a.ap */
/* compiled from: PG */
public final class C119107ap extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C119107ap f332237e;

    /* renamed from: f */
    private static volatile C63010eb f332238f;

    /* renamed from: a */
    public int f332239a;

    /* renamed from: b */
    public int f332240b;

    /* renamed from: c */
    public C119106ao f332241c;

    /* renamed from: d */
    public C119106ao f332242d;

    static {
        C119107ap apVar = new C119107ap();
        f332237e = apVar;
        C62942bv.registerDefaultInstance(C119107ap.class, apVar);
    }

    private C119107ap() {
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
                return newMessageInfo(f332237e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\t\u0004\t", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C119107ap();
            case 4:
                return new C119104am();
            case 5:
                return f332237e;
            case 6:
                C63010eb ebVar = f332238f;
                if (ebVar == null) {
                    synchronized (C119107ap.class) {
                        ebVar = f332238f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f332237e);
                            f332238f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
