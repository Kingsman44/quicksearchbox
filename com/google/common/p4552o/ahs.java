package com.google.common.p4552o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.ahs */
/* compiled from: PG */
public final class ahs extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final ahs f158779c;

    /* renamed from: d */
    private static volatile C63010eb f158780d;

    /* renamed from: a */
    public int f158781a = 0;

    /* renamed from: b */
    public Object f158782b;

    static {
        ahs ahs = new ahs();
        f158779c = ahs;
        C62942bv.registerDefaultInstance(ahs.class, ahs);
    }

    private ahs() {
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
                return newMessageInfo(f158779c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"b", "a", ahr.class, ahp.class});
            case 3:
                return new ahs();
            case 4:
                return new ahn();
            case 5:
                return f158779c;
            case 6:
                C63010eb ebVar = f158780d;
                if (ebVar == null) {
                    synchronized (ahs.class) {
                        ebVar = f158780d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158779c);
                            f158780d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
