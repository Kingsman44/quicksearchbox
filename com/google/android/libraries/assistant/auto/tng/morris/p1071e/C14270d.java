package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.d */
/* compiled from: PG */
public final class C14270d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C14270d f43164c;

    /* renamed from: d */
    private static volatile C63010eb f43165d;

    /* renamed from: a */
    public int f43166a;

    /* renamed from: b */
    public int f43167b;

    static {
        C14270d dVar = new C14270d();
        f43164c = dVar;
        C62942bv.registerDefaultInstance(C14270d.class, dVar);
    }

    private C14270d() {
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
                return newMessageInfo(f43164c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\f", new Object[]{"a", "b"});
            case 3:
                return new C14270d();
            case 4:
                return new C14243c();
            case 5:
                return f43164c;
            case 6:
                C63010eb ebVar = f43165d;
                if (ebVar == null) {
                    synchronized (C14270d.class) {
                        ebVar = f43165d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43164c);
                            f43165d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
