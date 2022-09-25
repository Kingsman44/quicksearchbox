package com.google.p4129b.p4130a.p4131a.p4132a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.b.a.a.a.w */
/* compiled from: PG */
public final class C54737w extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54737w f143639c;

    /* renamed from: d */
    private static volatile C63010eb f143640d;

    /* renamed from: a */
    public int f143641a = 0;

    /* renamed from: b */
    public Object f143642b;

    static {
        C54737w wVar = new C54737w();
        f143639c = wVar;
        C62942bv.registerDefaultInstance(C54737w.class, wVar);
    }

    private C54737w() {
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
                return newMessageInfo(f143639c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȼ\u0000\u0002=\u0000", new Object[]{"b", "a"});
            case 3:
                return new C54737w();
            case 4:
                return new C54736v();
            case 5:
                return f143639c;
            case 6:
                C63010eb ebVar = f143640d;
                if (ebVar == null) {
                    synchronized (C54737w.class) {
                        ebVar = f143640d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143639c);
                            f143640d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
