package com.google.protos.p4963bf.p4964a.p4965a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.bf.a.a.av */
/* compiled from: PG */
public final class C64573av extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64573av f175078c;

    /* renamed from: d */
    private static volatile C63010eb f175079d;

    /* renamed from: a */
    public int f175080a;

    /* renamed from: b */
    public C64575ax f175081b;

    static {
        C64573av avVar = new C64573av();
        f175078c = avVar;
        C62942bv.registerDefaultInstance(C64573av.class, avVar);
    }

    private C64573av() {
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
                return newMessageInfo(f175078c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C64573av();
            case 4:
                return new C64572au();
            case 5:
                return f175078c;
            case 6:
                C63010eb ebVar = f175079d;
                if (ebVar == null) {
                    synchronized (C64573av.class) {
                        ebVar = f175079d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175078c);
                            f175079d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
