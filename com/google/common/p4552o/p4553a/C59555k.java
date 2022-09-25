package com.google.common.p4552o.p4553a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.a.k */
/* compiled from: PG */
public final class C59555k extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C59555k f158028c;

    /* renamed from: d */
    private static volatile C63010eb f158029d;

    /* renamed from: a */
    public int f158030a;

    /* renamed from: b */
    public boolean f158031b;

    static {
        C59555k kVar = new C59555k();
        f158028c = kVar;
        C62942bv.registerDefaultInstance(C59555k.class, kVar);
    }

    private C59555k() {
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
                return newMessageInfo(f158028c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C59555k();
            case 4:
                return new C59554j();
            case 5:
                return f158028c;
            case 6:
                C63010eb ebVar = f158029d;
                if (ebVar == null) {
                    synchronized (C59555k.class) {
                        ebVar = f158029d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158028c);
                            f158029d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
