package com.google.common.p4552o.p4553a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.a.i */
/* compiled from: PG */
public final class C59553i extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C59553i f158024c;

    /* renamed from: d */
    private static volatile C63010eb f158025d;

    /* renamed from: a */
    public int f158026a;

    /* renamed from: b */
    public int f158027b;

    static {
        C59553i iVar = new C59553i();
        f158024c = iVar;
        C62942bv.registerDefaultInstance(C59553i.class, iVar);
    }

    private C59553i() {
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
                return newMessageInfo(f158024c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C59552h.f158023a});
            case 3:
                return new C59553i();
            case 4:
                return new C59551g();
            case 5:
                return f158024c;
            case 6:
                C63010eb ebVar = f158025d;
                if (ebVar == null) {
                    synchronized (C59553i.class) {
                        ebVar = f158025d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158024c);
                            f158025d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
