package com.google.p4017at.p4082j.p4083a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.j.a.l */
/* compiled from: PG */
public final class C54447l extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C54447l f142975b;

    /* renamed from: c */
    private static volatile C63010eb f142976c;

    /* renamed from: a */
    public C54297aa f142977a;

    static {
        C54447l lVar = new C54447l();
        f142975b = lVar;
        C62942bv.registerDefaultInstance(C54447l.class, lVar);
    }

    private C54447l() {
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
                return newMessageInfo(f142975b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"a"});
            case 3:
                return new C54447l();
            case 4:
                return new C54446k();
            case 5:
                return f142975b;
            case 6:
                C63010eb ebVar = f142976c;
                if (ebVar == null) {
                    synchronized (C54447l.class) {
                        ebVar = f142976c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142975b);
                            f142976c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
