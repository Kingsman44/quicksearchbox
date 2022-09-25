package com.google.assistant.p3825an.p3834e.p3835a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.an.e.a.d */
/* compiled from: PG */
public final class C49362d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C49362d f127591d;

    /* renamed from: f */
    private static volatile C63010eb f127592f;

    /* renamed from: a */
    public C49370l f127593a;

    /* renamed from: b */
    public C49372n f127594b;

    /* renamed from: c */
    public C49368j f127595c;

    /* renamed from: e */
    private int f127596e;

    static {
        C49362d dVar = new C49362d();
        f127591d = dVar;
        C62942bv.registerDefaultInstance(C49362d.class, dVar);
    }

    private C49362d() {
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
                return newMessageInfo(f127591d, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0000\u0002ဉ\u0002\u0004ဉ\u0001\u0005ဉ\u0003", new Object[]{"e", "b", "a", C45240c.f118157a});
            case 3:
                return new C49362d();
            case 4:
                return new C49361c();
            case 5:
                return f127591d;
            case 6:
                C63010eb ebVar = f127592f;
                if (ebVar == null) {
                    synchronized (C49362d.class) {
                        ebVar = f127592f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127591d);
                            f127592f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
