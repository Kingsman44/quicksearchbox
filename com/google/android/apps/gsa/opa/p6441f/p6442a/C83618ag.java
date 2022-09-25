package com.google.android.apps.gsa.opa.p6441f.p6442a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.opa.f.a.ag */
/* compiled from: PG */
public final class C83618ag extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C83618ag f227962c;

    /* renamed from: d */
    private static volatile C63010eb f227963d;

    /* renamed from: a */
    public int f227964a;

    /* renamed from: b */
    public int f227965b;

    static {
        C83618ag agVar = new C83618ag();
        f227962c = agVar;
        C62942bv.registerDefaultInstance(C83618ag.class, agVar);
    }

    private C83618ag() {
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
                return newMessageInfo(f227962c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C83617af.m133197b()});
            case 3:
                return new C83618ag();
            case 4:
                return new C83615ad();
            case 5:
                return f227962c;
            case 6:
                C63010eb ebVar = f227963d;
                if (ebVar == null) {
                    synchronized (C83618ag.class) {
                        ebVar = f227963d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f227962c);
                            f227963d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
