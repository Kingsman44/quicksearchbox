package com.google.common.p4552o.p4553a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.a.o */
/* compiled from: PG */
public final class C59559o extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C59559o f158039c;

    /* renamed from: d */
    private static volatile C63010eb f158040d;

    /* renamed from: a */
    public int f158041a;

    /* renamed from: b */
    public int f158042b;

    static {
        C59559o oVar = new C59559o();
        f158039c = oVar;
        C62942bv.registerDefaultInstance(C59559o.class, oVar);
    }

    private C59559o() {
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
                return newMessageInfo(f158039c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C59558n.f158038a});
            case 3:
                return new C59559o();
            case 4:
                return new C59557m();
            case 5:
                return f158039c;
            case 6:
                C63010eb ebVar = f158040d;
                if (ebVar == null) {
                    synchronized (C59559o.class) {
                        ebVar = f158040d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158039c);
                            f158040d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
