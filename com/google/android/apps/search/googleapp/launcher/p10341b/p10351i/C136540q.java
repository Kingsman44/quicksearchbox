package com.google.android.apps.search.googleapp.launcher.p10341b.p10351i;

import com.google.android.apps.search.googleapp.launcher.p10341b.p10344c.C136451d;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.launcher.b.i.q */
/* compiled from: PG */
public final class C136540q extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C136540q f371751d;

    /* renamed from: e */
    private static volatile C63010eb f371752e;

    /* renamed from: a */
    public int f371753a;

    /* renamed from: b */
    public boolean f371754b;

    /* renamed from: c */
    public C136451d f371755c;

    static {
        C136540q qVar = new C136540q();
        f371751d = qVar;
        C62942bv.registerDefaultInstance(C136540q.class, qVar);
    }

    private C136540q() {
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
                return newMessageInfo(f371751d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C136540q();
            case 4:
                return new C136539p();
            case 5:
                return f371751d;
            case 6:
                C63010eb ebVar = f371752e;
                if (ebVar == null) {
                    synchronized (C136540q.class) {
                        ebVar = f371752e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f371751d);
                            f371752e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
