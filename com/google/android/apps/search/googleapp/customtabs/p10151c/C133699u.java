package com.google.android.apps.search.googleapp.customtabs.p10151c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.c.u */
/* compiled from: PG */
public final class C133699u extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C133699u f364172d;

    /* renamed from: e */
    private static volatile C63010eb f364173e;

    /* renamed from: a */
    public int f364174a;

    /* renamed from: b */
    public int f364175b;

    /* renamed from: c */
    public C133693o f364176c;

    static {
        C133699u uVar = new C133699u();
        f364172d = uVar;
        C62942bv.registerDefaultInstance(C133699u.class, uVar);
    }

    private C133699u() {
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
                return newMessageInfo(f364172d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C133697s.m216930b(), C45240c.f118157a});
            case 3:
                return new C133699u();
            case 4:
                return new C133698t();
            case 5:
                return f364172d;
            case 6:
                C63010eb ebVar = f364173e;
                if (ebVar == null) {
                    synchronized (C133699u.class) {
                        ebVar = f364173e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f364172d);
                            f364173e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
