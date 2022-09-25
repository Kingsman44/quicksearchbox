package com.google.android.apps.search.assistant.platform.p9141h.p9154e.p9155a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.h.e.a.f */
/* compiled from: PG */
public final class C121055f extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C121055f f336452f;

    /* renamed from: g */
    private static volatile C63010eb f336453g;

    /* renamed from: a */
    public int f336454a;

    /* renamed from: b */
    public int f336455b = 1;

    /* renamed from: c */
    public boolean f336456c;

    /* renamed from: d */
    public int f336457d;

    /* renamed from: e */
    public int f336458e;

    static {
        C121055f fVar = new C121055f();
        f336452f = fVar;
        C62942bv.registerDefaultInstance(C121055f.class, fVar);
    }

    private C121055f() {
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
                return newMessageInfo(f336452f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဌ\u0002\u0004င\u0003", new Object[]{"a", "b", C121053d.m200348b(), C45240c.f118157a, "d", C121050a.f336445a, "e"});
            case 3:
                return new C121055f();
            case 4:
                return new C121054e();
            case 5:
                return f336452f;
            case 6:
                C63010eb ebVar = f336453g;
                if (ebVar == null) {
                    synchronized (C121055f.class) {
                        ebVar = f336453g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f336452f);
                            f336453g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
