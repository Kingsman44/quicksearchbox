package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.p */
/* compiled from: PG */
public final class C51626p extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C51626p f134543e;

    /* renamed from: f */
    private static volatile C63010eb f134544f;

    /* renamed from: a */
    public int f134545a;

    /* renamed from: b */
    public C51630t f134546b;

    /* renamed from: c */
    public C51628r f134547c;

    /* renamed from: d */
    public C51633w f134548d;

    static {
        C51626p pVar = new C51626p();
        f134543e = pVar;
        C62942bv.registerDefaultInstance(C51626p.class, pVar);
    }

    private C51626p() {
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
                return newMessageInfo(f134543e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C51626p();
            case 4:
                return new C51608o();
            case 5:
                return f134543e;
            case 6:
                C63010eb ebVar = f134544f;
                if (ebVar == null) {
                    synchronized (C51626p.class) {
                        ebVar = f134544f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134543e);
                            f134544f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
