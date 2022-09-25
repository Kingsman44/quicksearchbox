package com.google.android.apps.gsa.shared.p6983ah;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.shared.ah.k */
/* compiled from: PG */
public final class C89154k extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C89154k f241700e;

    /* renamed from: f */
    private static volatile C63010eb f241701f;

    /* renamed from: a */
    public int f241702a;

    /* renamed from: b */
    public long f241703b;

    /* renamed from: c */
    public int f241704c;

    /* renamed from: d */
    public boolean f241705d;

    static {
        C89154k kVar = new C89154k();
        f241700e = kVar;
        C62942bv.registerDefaultInstance(C89154k.class, kVar);
    }

    private C89154k() {
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
                return newMessageInfo(f241700e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, C89152i.f241699a, "d"});
            case 3:
                return new C89154k();
            case 4:
                return new C89151h();
            case 5:
                return f241700e;
            case 6:
                C63010eb ebVar = f241701f;
                if (ebVar == null) {
                    synchronized (C89154k.class) {
                        ebVar = f241701f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f241700e);
                            f241701f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
