package com.google.assistant.p3994s.p3995a;

import com.google.assistant.p3897e.p3921j.alf;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.ny */
/* compiled from: PG */
public final class C53439ny extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53439ny f140260c;

    /* renamed from: d */
    private static volatile C63010eb f140261d;

    /* renamed from: a */
    public int f140262a = 0;

    /* renamed from: b */
    public Object f140263b;

    static {
        C53439ny nyVar = new C53439ny();
        f140260c = nyVar;
        C62942bv.registerDefaultInstance(C53439ny.class, nyVar);
    }

    private C53439ny() {
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
                return newMessageInfo(f140260c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ျ\u0000\u0002ြ\u0000", new Object[]{"b", "a", alf.class});
            case 3:
                return new C53439ny();
            case 4:
                return new C53438nx();
            case 5:
                return f140260c;
            case 6:
                C63010eb ebVar = f140261d;
                if (ebVar == null) {
                    synchronized (C53439ny.class) {
                        ebVar = f140261d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140260c);
                            f140261d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
