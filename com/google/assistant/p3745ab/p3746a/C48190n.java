package com.google.assistant.p3745ab.p3746a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.a.n */
/* compiled from: PG */
public final class C48190n extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C48190n f124701e;

    /* renamed from: f */
    private static volatile C63010eb f124702f;

    /* renamed from: a */
    public int f124703a;

    /* renamed from: b */
    public int f124704b = 0;

    /* renamed from: c */
    public Object f124705c;

    /* renamed from: d */
    public long f124706d;

    static {
        C48190n nVar = new C48190n();
        f124701e = nVar;
        C62942bv.registerDefaultInstance(C48190n.class, nVar);
    }

    private C48190n() {
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
                return newMessageInfo(f124701e, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဿ\u0000\u0003ဿ\u0000\u0004ဿ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C48188l.m85212b(), C48188l.m85212b(), C48188l.m85212b()});
            case 3:
                return new C48190n();
            case 4:
                return new C48189m();
            case 5:
                return f124701e;
            case 6:
                C63010eb ebVar = f124702f;
                if (ebVar == null) {
                    synchronized (C48190n.class) {
                        ebVar = f124702f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124701e);
                            f124702f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
