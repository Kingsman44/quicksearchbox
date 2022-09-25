package com.google.assistant.p3781ad.p3789d.p3791b.p3792a;

import com.google.android.apps.gsa.staticplugins.opa.tapas.p8571p.C113101n;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3781ad.p3789d.p3791b.C48718bz;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.b.a.aj */
/* compiled from: PG */
public final class C48594aj extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C48594aj f125598e;

    /* renamed from: f */
    private static volatile C63010eb f125599f;

    /* renamed from: a */
    public int f125600a;

    /* renamed from: b */
    public C48718bz f125601b;

    /* renamed from: c */
    public C113101n f125602c;

    /* renamed from: d */
    public C113101n f125603d;

    static {
        C48594aj ajVar = new C48594aj();
        f125598e = ajVar;
        C62942bv.registerDefaultInstance(C48594aj.class, ajVar);
    }

    private C48594aj() {
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
                return newMessageInfo(f125598e, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C48594aj();
            case 4:
                return new C48593ai();
            case 5:
                return f125598e;
            case 6:
                C63010eb ebVar = f125599f;
                if (ebVar == null) {
                    synchronized (C48594aj.class) {
                        ebVar = f125599f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125598e);
                            f125599f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
