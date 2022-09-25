package com.google.apps.tiktok.tracing;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.apps.tiktok.tracing.t */
/* compiled from: PG */
public final class C47860t extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C47860t f123928d;

    /* renamed from: e */
    private static volatile C63010eb f123929e;

    /* renamed from: a */
    public int f123930a;

    /* renamed from: b */
    public C47859s f123931b;

    /* renamed from: c */
    public C47857q f123932c;

    static {
        C47860t tVar = new C47860t();
        f123928d = tVar;
        C62942bv.registerDefaultInstance(C47860t.class, tVar);
    }

    private C47860t() {
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
                return newMessageInfo(f123928d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C47860t();
            case 4:
                return new C47855o();
            case 5:
                return f123928d;
            case 6:
                C63010eb ebVar = f123929e;
                if (ebVar == null) {
                    synchronized (C47860t.class) {
                        ebVar = f123929e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f123928d);
                            f123929e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
