package com.google.android.apps.search.assistant.platform.p9141h.p9152d.p9153a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.h.d.a.d */
/* compiled from: PG */
public final class C121041d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C121041d f336426c;

    /* renamed from: d */
    private static volatile C63010eb f336427d;

    /* renamed from: a */
    public int f336428a;

    /* renamed from: b */
    public int f336429b;

    static {
        C121041d dVar = new C121041d();
        f336426c = dVar;
        C62942bv.registerDefaultInstance(C121041d.class, dVar);
    }

    private C121041d() {
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
                return newMessageInfo(f336426c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C121040c.m200336b()});
            case 3:
                return new C121041d();
            case 4:
                return new C121038a();
            case 5:
                return f336426c;
            case 6:
                C63010eb ebVar = f336427d;
                if (ebVar == null) {
                    synchronized (C121041d.class) {
                        ebVar = f336427d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f336426c);
                            f336427d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
