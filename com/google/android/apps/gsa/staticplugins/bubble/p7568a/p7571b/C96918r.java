package com.google.android.apps.gsa.staticplugins.bubble.p7568a.p7571b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.a.b.r */
/* compiled from: PG */
public final class C96918r extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C96918r f270908d;

    /* renamed from: f */
    private static volatile C63010eb f270909f;

    /* renamed from: a */
    public int f270910a;

    /* renamed from: b */
    public long f270911b;

    /* renamed from: c */
    public C96917q f270912c;

    /* renamed from: e */
    private byte f270913e = 2;

    static {
        C96918r rVar = new C96918r();
        f270908d = rVar;
        C62942bv.registerDefaultInstance(C96918r.class, rVar);
    }

    private C96918r() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f270913e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f270913e = b;
                return null;
            case 2:
                return newMessageInfo(f270908d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0001\u0002ဂ\u0001\u0003ᐉ\u0002", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C96918r();
            case 4:
                return new C96915o();
            case 5:
                return f270908d;
            case 6:
                C63010eb ebVar = f270909f;
                if (ebVar == null) {
                    synchronized (C96918r.class) {
                        ebVar = f270909f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f270908d);
                            f270909f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
