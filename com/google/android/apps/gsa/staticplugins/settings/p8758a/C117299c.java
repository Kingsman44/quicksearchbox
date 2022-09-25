package com.google.android.apps.gsa.staticplugins.settings.p8758a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.settings.a.c */
/* compiled from: PG */
public final class C117299c extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C117299c f325618e;

    /* renamed from: f */
    private static volatile C63010eb f325619f;

    /* renamed from: a */
    public int f325620a;

    /* renamed from: b */
    public int f325621b;

    /* renamed from: c */
    public long f325622c;

    /* renamed from: d */
    public long f325623d;

    static {
        C117299c cVar = new C117299c();
        f325618e = cVar;
        C62942bv.registerDefaultInstance(C117299c.class, cVar);
    }

    private C117299c() {
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
                return newMessageInfo(f325618e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C117299c();
            case 4:
                return new C117298b();
            case 5:
                return f325618e;
            case 6:
                C63010eb ebVar = f325619f;
                if (ebVar == null) {
                    synchronized (C117299c.class) {
                        ebVar = f325619f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f325618e);
                            f325619f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
