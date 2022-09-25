package com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.as.b.a.r */
/* compiled from: PG */
public final class C107539r extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C107539r f299184c;

    /* renamed from: d */
    private static volatile C63010eb f299185d;

    /* renamed from: a */
    public int f299186a;

    /* renamed from: b */
    public int f299187b;

    static {
        C107539r rVar = new C107539r();
        f299184c = rVar;
        C62942bv.registerDefaultInstance(C107539r.class, rVar);
    }

    private C107539r() {
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
                return newMessageInfo(f299184c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C107539r();
            case 4:
                return new C107538q();
            case 5:
                return f299184c;
            case 6:
                C63010eb ebVar = f299185d;
                if (ebVar == null) {
                    synchronized (C107539r.class) {
                        ebVar = f299185d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f299184c);
                            f299185d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
