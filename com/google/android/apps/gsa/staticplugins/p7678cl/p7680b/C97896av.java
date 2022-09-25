package com.google.android.apps.gsa.staticplugins.p7678cl.p7680b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.cl.b.av */
/* compiled from: PG */
public final class C97896av extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C97896av f273337c;

    /* renamed from: d */
    private static volatile C63010eb f273338d;

    /* renamed from: a */
    public int f273339a;

    /* renamed from: b */
    public C97894at f273340b;

    static {
        C97896av avVar = new C97896av();
        f273337c = avVar;
        C62942bv.registerDefaultInstance(C97896av.class, avVar);
    }

    private C97896av() {
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
                return newMessageInfo(f273337c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C97896av();
            case 4:
                return new C97895au();
            case 5:
                return f273337c;
            case 6:
                C63010eb ebVar = f273338d;
                if (ebVar == null) {
                    synchronized (C97896av.class) {
                        ebVar = f273338d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f273337c);
                            f273338d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
