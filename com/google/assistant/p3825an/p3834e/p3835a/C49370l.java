package com.google.assistant.p3825an.p3834e.p3835a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.an.e.a.l */
/* compiled from: PG */
public final class C49370l extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C49370l f127608b;

    /* renamed from: d */
    private static volatile C63010eb f127609d;

    /* renamed from: a */
    public long f127610a;

    /* renamed from: c */
    private int f127611c;

    static {
        C49370l lVar = new C49370l();
        f127608b = lVar;
        C62942bv.registerDefaultInstance(C49370l.class, lVar);
    }

    private C49370l() {
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
                return newMessageInfo(f127608b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C49370l();
            case 4:
                return new C49369k();
            case 5:
                return f127608b;
            case 6:
                C63010eb ebVar = f127609d;
                if (ebVar == null) {
                    synchronized (C49370l.class) {
                        ebVar = f127609d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127608b);
                            f127609d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
