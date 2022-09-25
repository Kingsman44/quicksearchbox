package com.google.android.libraries.appdoctor.p575c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.appdoctor.c.e */
/* compiled from: PG */
public final class C10473e extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C10473e f35231e;

    /* renamed from: f */
    private static volatile C63010eb f35232f;

    /* renamed from: a */
    public int f35233a;

    /* renamed from: b */
    public long f35234b;

    /* renamed from: c */
    public long f35235c;

    /* renamed from: d */
    public int f35236d;

    static {
        C10473e eVar = new C10473e();
        f35231e = eVar;
        C62942bv.registerDefaultInstance(C10473e.class, eVar);
    }

    private C10473e() {
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
                return newMessageInfo(f35231e, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C10473e();
            case 4:
                return new C10472d();
            case 5:
                return f35231e;
            case 6:
                C63010eb ebVar = f35232f;
                if (ebVar == null) {
                    synchronized (C10473e.class) {
                        ebVar = f35232f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f35231e);
                            f35232f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
