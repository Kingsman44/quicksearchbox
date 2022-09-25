package com.google.protos.p4963bf.p4964a.p4965a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.bf.a.a.bm */
/* compiled from: PG */
public final class C64591bm extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64591bm f175122b;

    /* renamed from: d */
    private static volatile C63010eb f175123d;

    /* renamed from: a */
    public C62971cq f175124a = emptyProtobufList();

    /* renamed from: c */
    private byte f175125c = 2;

    static {
        C64591bm bmVar = new C64591bm();
        f175122b = bmVar;
        C62942bv.registerDefaultInstance(C64591bm.class, bmVar);
    }

    private C64591bm() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f175125c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f175125c = b;
                return null;
            case 2:
                return newMessageInfo(f175122b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C64589bk.class});
            case 3:
                return new C64591bm();
            case 4:
                return new C64590bl();
            case 5:
                return f175122b;
            case 6:
                C63010eb ebVar = f175123d;
                if (ebVar == null) {
                    synchronized (C64591bm.class) {
                        ebVar = f175123d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175122b);
                            f175123d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
