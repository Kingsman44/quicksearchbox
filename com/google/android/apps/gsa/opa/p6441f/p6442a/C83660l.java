package com.google.android.apps.gsa.opa.p6441f.p6442a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.opa.f.a.l */
/* compiled from: PG */
public final class C83660l extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C83660l f228044c;

    /* renamed from: d */
    private static volatile C63010eb f228045d;

    /* renamed from: a */
    public int f228046a;

    /* renamed from: b */
    public int f228047b;

    static {
        C83660l lVar = new C83660l();
        f228044c = lVar;
        C62942bv.registerDefaultInstance(C83660l.class, lVar);
    }

    private C83660l() {
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
                return newMessageInfo(f228044c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C83659k.m133200b()});
            case 3:
                return new C83660l();
            case 4:
                return new C83657i();
            case 5:
                return f228044c;
            case 6:
                C63010eb ebVar = f228045d;
                if (ebVar == null) {
                    synchronized (C83660l.class) {
                        ebVar = f228045d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f228044c);
                            f228045d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
