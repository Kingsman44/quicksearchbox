package com.google.android.libraries.assistant.auto.tng.suggestions.p1263k;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3917i.p3918a.C51417gy;
import com.google.p4184bj.p4189b.p4190a.C55876h;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.k.s */
/* compiled from: PG */
public final class C16383s extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C16383s f48219e;

    /* renamed from: f */
    private static volatile C63010eb f48220f;

    /* renamed from: a */
    public int f48221a;

    /* renamed from: b */
    public int f48222b;

    /* renamed from: c */
    public C16382r f48223c;

    /* renamed from: d */
    public C55876h f48224d;

    static {
        C16383s sVar = new C16383s();
        f48219e = sVar;
        C62942bv.registerDefaultInstance(C16383s.class, sVar);
    }

    private C16383s() {
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
                return newMessageInfo(f48219e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C51417gy.f133924a, C45240c.f118157a, "d"});
            case 3:
                return new C16383s();
            case 4:
                return new C16380p();
            case 5:
                return f48219e;
            case 6:
                C63010eb ebVar = f48220f;
                if (ebVar == null) {
                    synchronized (C16383s.class) {
                        ebVar = f48220f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f48219e);
                            f48220f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
