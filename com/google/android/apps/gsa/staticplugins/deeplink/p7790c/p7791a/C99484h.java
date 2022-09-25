package com.google.android.apps.gsa.staticplugins.deeplink.p7790c.p7791a;

import com.google.android.libraries.search.p2998g.p2999a.p3001b.p3002a.C38348c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.apps.gsa.staticplugins.deeplink.c.a.h */
/* compiled from: PG */
public final class C99484h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C99484h f278393c;

    /* renamed from: d */
    public static final C62940bt f278394d;

    /* renamed from: e */
    private static volatile C63010eb f278395e;

    /* renamed from: a */
    public int f278396a = 0;

    /* renamed from: b */
    public Object f278397b;

    static {
        C99484h hVar = new C99484h();
        f278393c = hVar;
        C62942bv.registerDefaultInstance(C99484h.class, hVar);
        f278394d = C62942bv.newSingularGeneratedExtension(C38348c.f101533a, hVar, hVar, (C62958ce) null, 273780906, C63066gd.MESSAGE, C99484h.class);
    }

    private C99484h() {
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
                return newMessageInfo(f278393c, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001ြ\u0000", new Object[]{"b", "a", C99482f.class});
            case 3:
                return new C99484h();
            case 4:
                return new C99483g();
            case 5:
                return f278393c;
            case 6:
                C63010eb ebVar = f278395e;
                if (ebVar == null) {
                    synchronized (C99484h.class) {
                        ebVar = f278395e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f278393c);
                            f278395e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
