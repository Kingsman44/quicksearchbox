package com.google.android.apps.search.googleapp.search.voicesearch.p10468b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.b.f */
/* compiled from: PG */
public final class C138720f extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C138720f f377293d;

    /* renamed from: e */
    private static volatile C63010eb f377294e;

    /* renamed from: a */
    public int f377295a;

    /* renamed from: b */
    public boolean f377296b;

    /* renamed from: c */
    public boolean f377297c;

    static {
        C138720f fVar = new C138720f();
        f377293d = fVar;
        C62942bv.registerDefaultInstance(C138720f.class, fVar);
    }

    private C138720f() {
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
                return newMessageInfo(f377293d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C138720f();
            case 4:
                return new C138719e();
            case 5:
                return f377293d;
            case 6:
                C63010eb ebVar = f377294e;
                if (ebVar == null) {
                    synchronized (C138720f.class) {
                        ebVar = f377294e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f377293d);
                            f377294e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
