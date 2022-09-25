package com.google.android.apps.gsa.opaonboarding.p6459a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.opaonboarding.a.t */
/* compiled from: PG */
public final class C83860t extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C83860t f228502e;

    /* renamed from: f */
    private static volatile C63010eb f228503f;

    /* renamed from: a */
    public int f228504a;

    /* renamed from: b */
    public C83859s f228505b;

    /* renamed from: c */
    public int f228506c;

    /* renamed from: d */
    public boolean f228507d;

    static {
        C83860t tVar = new C83860t();
        f228502e = tVar;
        C62942bv.registerDefaultInstance(C83860t.class, tVar);
    }

    private C83860t() {
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
                return newMessageInfo(f228502e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, C83856p.f228498a, "d"});
            case 3:
                return new C83860t();
            case 4:
                return new C83855o();
            case 5:
                return f228502e;
            case 6:
                C63010eb ebVar = f228503f;
                if (ebVar == null) {
                    synchronized (C83860t.class) {
                        ebVar = f228503f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f228502e);
                            f228503f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
