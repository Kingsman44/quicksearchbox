package com.google.assistant.p3897e.p3921j.p3925d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.d.f */
/* compiled from: PG */
public final class C51780f extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C51780f f135862d;

    /* renamed from: e */
    private static volatile C63010eb f135863e;

    /* renamed from: a */
    public int f135864a;

    /* renamed from: b */
    public C51782h f135865b;

    /* renamed from: c */
    public C51778d f135866c;

    static {
        C51780f fVar = new C51780f();
        f135862d = fVar;
        C62942bv.registerDefaultInstance(C51780f.class, fVar);
    }

    private C51780f() {
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
                return newMessageInfo(f135862d, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0004ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C51780f();
            case 4:
                return new C51779e();
            case 5:
                return f135862d;
            case 6:
                C63010eb ebVar = f135863e;
                if (ebVar == null) {
                    synchronized (C51780f.class) {
                        ebVar = f135863e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135862d);
                            f135863e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
