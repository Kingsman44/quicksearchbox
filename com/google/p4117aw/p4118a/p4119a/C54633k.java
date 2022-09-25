package com.google.p4117aw.p4118a.p4119a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.aw.a.a.k */
/* compiled from: PG */
public final class C54633k extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54633k f143441c;

    /* renamed from: d */
    private static volatile C63010eb f143442d;

    /* renamed from: a */
    public int f143443a;

    /* renamed from: b */
    public int f143444b;

    static {
        C54633k kVar = new C54633k();
        f143441c = kVar;
        C62942bv.registerDefaultInstance(C54633k.class, kVar);
    }

    private C54633k() {
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
                return newMessageInfo(f143441c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C54633k();
            case 4:
                return new C54632j();
            case 5:
                return f143441c;
            case 6:
                C63010eb ebVar = f143442d;
                if (ebVar == null) {
                    synchronized (C54633k.class) {
                        ebVar = f143442d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143441c);
                            f143442d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
