package com.google.android.libraries.assistant.p1363c.p1398g.p1436k;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.c.g.k.ac */
/* compiled from: PG */
public final class C17467ac extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C17467ac f50440e;

    /* renamed from: f */
    private static volatile C63010eb f50441f;

    /* renamed from: a */
    public int f50442a;

    /* renamed from: b */
    public int f50443b = 0;

    /* renamed from: c */
    public Object f50444c;

    /* renamed from: d */
    public long f50445d;

    static {
        C17467ac acVar = new C17467ac();
        f50440e = acVar;
        C62942bv.registerDefaultInstance(C17467ac.class, acVar);
    }

    private C17467ac() {
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
                return newMessageInfo(f50440e, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဿ\u0000\u0002ဿ\u0000\u0003ဂ\u0002", new Object[]{C45240c.f118157a, "b", "a", C17468ad.f50446a, C17465aa.m34780b(), "d"});
            case 3:
                return new C17467ac();
            case 4:
                return new C17466ab();
            case 5:
                return f50440e;
            case 6:
                C63010eb ebVar = f50441f;
                if (ebVar == null) {
                    synchronized (C17467ac.class) {
                        ebVar = f50441f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f50440e);
                            f50441f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
