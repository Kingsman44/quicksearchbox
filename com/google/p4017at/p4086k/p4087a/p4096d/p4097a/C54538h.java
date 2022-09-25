package com.google.p4017at.p4086k.p4087a.p4096d.p4097a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.k.a.d.a.h */
/* compiled from: PG */
public final class C54538h extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C54538h f143192b;

    /* renamed from: c */
    private static volatile C63010eb f143193c;

    /* renamed from: a */
    public C62971cq f143194a = C62942bv.emptyProtobufList();

    static {
        C54538h hVar = new C54538h();
        f143192b = hVar;
        C62942bv.registerDefaultInstance(C54538h.class, hVar);
    }

    private C54538h() {
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
                return newMessageInfo(f143192b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"a"});
            case 3:
                return new C54538h();
            case 4:
                return new C54537g();
            case 5:
                return f143192b;
            case 6:
                C63010eb ebVar = f143193c;
                if (ebVar == null) {
                    synchronized (C54538h.class) {
                        ebVar = f143193c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143192b);
                            f143193c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
