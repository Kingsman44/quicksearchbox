package com.google.android.apps.gsa.staticplugins.opa.tapas;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.j */
/* compiled from: PG */
public final class C112102j extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C112102j f311317b;

    /* renamed from: c */
    private static volatile C63010eb f311318c;

    /* renamed from: a */
    public C62971cq f311319a = emptyProtobufList();

    static {
        C112102j jVar = new C112102j();
        f311317b = jVar;
        C62942bv.registerDefaultInstance(C112102j.class, jVar);
    }

    private C112102j() {
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
                return newMessageInfo(f311317b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C112064h.class});
            case 3:
                return new C112102j();
            case 4:
                return new C112075i();
            case 5:
                return f311317b;
            case 6:
                C63010eb ebVar = f311318c;
                if (ebVar == null) {
                    synchronized (C112102j.class) {
                        ebVar = f311318c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f311317b);
                            f311318c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
