package com.google.android.apps.gsa.staticplugins.opa.setupwizard;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.setupwizard.i */
/* compiled from: PG */
public final class C110485i extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C110485i f308019c;

    /* renamed from: d */
    private static volatile C63010eb f308020d;

    /* renamed from: a */
    public int f308021a;

    /* renamed from: b */
    public int f308022b;

    static {
        C110485i iVar = new C110485i();
        f308019c = iVar;
        C62942bv.registerDefaultInstance(C110485i.class, iVar);
    }

    private C110485i() {
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
                return newMessageInfo(f308019c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C110484h.f308018a});
            case 3:
                return new C110485i();
            case 4:
                return new C110483g();
            case 5:
                return f308019c;
            case 6:
                C63010eb ebVar = f308020d;
                if (ebVar == null) {
                    synchronized (C110485i.class) {
                        ebVar = f308020d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f308019c);
                            f308020d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
