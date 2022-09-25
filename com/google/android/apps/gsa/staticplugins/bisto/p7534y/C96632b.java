package com.google.android.apps.gsa.staticplugins.bisto.p7534y;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.y.b */
/* compiled from: PG */
public final class C96632b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C96632b f270318e;

    /* renamed from: f */
    private static volatile C63010eb f270319f;

    /* renamed from: a */
    public int f270320a;

    /* renamed from: b */
    public long f270321b;

    /* renamed from: c */
    public int f270322c;

    /* renamed from: d */
    public boolean f270323d;

    static {
        C96632b bVar = new C96632b();
        f270318e = bVar;
        C62942bv.registerDefaultInstance(C96632b.class, bVar);
    }

    private C96632b() {
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
                return newMessageInfo(f270318e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဃ\u0000\u0002င\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C96632b();
            case 4:
                return new C96631a();
            case 5:
                return f270318e;
            case 6:
                C63010eb ebVar = f270319f;
                if (ebVar == null) {
                    synchronized (C96632b.class) {
                        ebVar = f270319f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f270318e);
                            f270319f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
