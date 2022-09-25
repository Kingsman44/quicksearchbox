package com.google.assistant.p3745ab.p3771w;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.ahi;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.w.g */
/* compiled from: PG */
public final class C48420g extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C48420g f125128f;

    /* renamed from: g */
    private static volatile C63010eb f125129g;

    /* renamed from: a */
    public int f125130a;

    /* renamed from: b */
    public int f125131b;

    /* renamed from: c */
    public int f125132c;

    /* renamed from: d */
    public int f125133d;

    /* renamed from: e */
    public int f125134e;

    static {
        C48420g gVar = new C48420g();
        f125128f = gVar;
        C62942bv.registerDefaultInstance(C48420g.class, gVar);
    }

    private C48420g() {
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
                return newMessageInfo(f125128f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", ahi.m92402b(), C45240c.f118157a, C48418e.m85226b(), "d", C48416c.m85224b(), "e", C48419f.f125127a});
            case 3:
                return new C48420g();
            case 4:
                return new C48414a();
            case 5:
                return f125128f;
            case 6:
                C63010eb ebVar = f125129g;
                if (ebVar == null) {
                    synchronized (C48420g.class) {
                        ebVar = f125129g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125128f);
                            f125129g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
