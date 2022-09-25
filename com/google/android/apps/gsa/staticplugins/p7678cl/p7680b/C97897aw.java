package com.google.android.apps.gsa.staticplugins.p7678cl.p7680b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.cl.b.aw */
/* compiled from: PG */
public final class C97897aw extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C97897aw f273341c;

    /* renamed from: d */
    private static volatile C63010eb f273342d;

    /* renamed from: a */
    public int f273343a = 0;

    /* renamed from: b */
    public Object f273344b;

    static {
        C97897aw awVar = new C97897aw();
        f273341c = awVar;
        C62942bv.registerDefaultInstance(C97897aw.class, awVar);
    }

    private C97897aw() {
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
                return newMessageInfo(f273341c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"b", "a", C97892ar.class, C97896av.class});
            case 3:
                return new C97897aw();
            case 4:
                return new C97890ap();
            case 5:
                return f273341c;
            case 6:
                C63010eb ebVar = f273342d;
                if (ebVar == null) {
                    synchronized (C97897aw.class) {
                        ebVar = f273342d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f273341c);
                            f273342d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
