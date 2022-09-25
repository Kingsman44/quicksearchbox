package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.up */
/* compiled from: PG */
public final class C60565up extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C60565up f164290e;

    /* renamed from: f */
    private static volatile C63010eb f164291f;

    /* renamed from: a */
    public int f164292a;

    /* renamed from: b */
    public long f164293b;

    /* renamed from: c */
    public long f164294c;

    /* renamed from: d */
    public long f164295d;

    static {
        C60565up upVar = new C60565up();
        f164290e = upVar;
        C62942bv.registerDefaultInstance(C60565up.class, upVar);
    }

    private C60565up() {
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
                return newMessageInfo(f164290e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C60565up();
            case 4:
                return new C60564uo();
            case 5:
                return f164290e;
            case 6:
                C63010eb ebVar = f164291f;
                if (ebVar == null) {
                    synchronized (C60565up.class) {
                        ebVar = f164291f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f164290e);
                            f164291f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
