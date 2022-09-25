package com.google.android.apps.gsa.staticplugins.opa.worker.proactive.p8618a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.a.d */
/* compiled from: PG */
public final class C114375d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C114375d f317113c;

    /* renamed from: d */
    private static volatile C63010eb f317114d;

    /* renamed from: a */
    public int f317115a;

    /* renamed from: b */
    public int f317116b;

    static {
        C114375d dVar = new C114375d();
        f317113c = dVar;
        C62942bv.registerDefaultInstance(C114375d.class, dVar);
    }

    private C114375d() {
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
                return newMessageInfo(f317113c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C114373b.f317112a});
            case 3:
                return new C114375d();
            case 4:
                return new C114372a();
            case 5:
                return f317113c;
            case 6:
                C63010eb ebVar = f317114d;
                if (ebVar == null) {
                    synchronized (C114375d.class) {
                        ebVar = f317114d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f317113c);
                            f317114d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
