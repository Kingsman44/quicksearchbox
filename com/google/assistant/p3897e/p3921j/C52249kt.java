package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.kt */
/* compiled from: PG */
public final class C52249kt extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52249kt f137121c;

    /* renamed from: d */
    private static volatile C63010eb f137122d;

    /* renamed from: a */
    public int f137123a;

    /* renamed from: b */
    public boolean f137124b;

    static {
        C52249kt ktVar = new C52249kt();
        f137121c = ktVar;
        C62942bv.registerDefaultInstance(C52249kt.class, ktVar);
    }

    private C52249kt() {
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
                return newMessageInfo(f137121c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C52249kt();
            case 4:
                return new C52248ks();
            case 5:
                return f137121c;
            case 6:
                C63010eb ebVar = f137122d;
                if (ebVar == null) {
                    synchronized (C52249kt.class) {
                        ebVar = f137122d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137121c);
                            f137122d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
