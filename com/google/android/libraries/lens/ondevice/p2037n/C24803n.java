package com.google.android.libraries.lens.ondevice.p2037n;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.ondevice.n.n */
/* compiled from: PG */
public final class C24803n extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C24803n f67770c;

    /* renamed from: d */
    private static volatile C63010eb f67771d;

    /* renamed from: a */
    public int f67772a;

    /* renamed from: b */
    public C24799j f67773b;

    static {
        C24803n nVar = new C24803n();
        f67770c = nVar;
        C62942bv.registerDefaultInstance(C24803n.class, nVar);
    }

    private C24803n() {
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
                return newMessageInfo(f67770c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{"a", "b"});
            case 3:
                return new C24803n();
            case 4:
                return new C24802m();
            case 5:
                return f67770c;
            case 6:
                C63010eb ebVar = f67771d;
                if (ebVar == null) {
                    synchronized (C24803n.class) {
                        ebVar = f67771d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f67770c);
                            f67771d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
