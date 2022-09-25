package com.google.speech.p5218j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.gm */
/* compiled from: PG */
public final class C66977gm extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66977gm f182052c;

    /* renamed from: d */
    private static volatile C63010eb f182053d;

    /* renamed from: a */
    public int f182054a;

    /* renamed from: b */
    public float f182055b = 1.0f;

    static {
        C66977gm gmVar = new C66977gm();
        f182052c = gmVar;
        C62942bv.registerDefaultInstance(C66977gm.class, gmVar);
    }

    private C66977gm() {
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
                return newMessageInfo(f182052c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ခ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C66977gm();
            case 4:
                return new C66976gl();
            case 5:
                return f182052c;
            case 6:
                C63010eb ebVar = f182053d;
                if (ebVar == null) {
                    synchronized (C66977gm.class) {
                        ebVar = f182053d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182052c);
                            f182053d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
