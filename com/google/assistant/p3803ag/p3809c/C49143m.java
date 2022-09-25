package com.google.assistant.p3803ag.p3809c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.c.m */
/* compiled from: PG */
public final class C49143m extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C49143m f127081b;

    /* renamed from: d */
    private static volatile C63010eb f127082d;

    /* renamed from: a */
    public int f127083a;

    /* renamed from: c */
    private int f127084c;

    static {
        C49143m mVar = new C49143m();
        f127081b = mVar;
        C62942bv.registerDefaultInstance(C49143m.class, mVar);
    }

    private C49143m() {
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
                return newMessageInfo(f127081b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C49143m();
            case 4:
                return new C49142l();
            case 5:
                return f127081b;
            case 6:
                C63010eb ebVar = f127082d;
                if (ebVar == null) {
                    synchronized (C49143m.class) {
                        ebVar = f127082d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127081b);
                            f127082d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
