package com.google.common.p4552o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.fh */
/* compiled from: PG */
public final class C59780fh extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C59780fh f161525b;

    /* renamed from: c */
    private static volatile C63010eb f161526c;

    /* renamed from: a */
    public C62971cq f161527a = emptyProtobufList();

    static {
        C59780fh fhVar = new C59780fh();
        f161525b = fhVar;
        C62942bv.registerDefaultInstance(C59780fh.class, fhVar);
    }

    private C59780fh() {
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
                return newMessageInfo(f161525b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C59765ev.class});
            case 3:
                return new C59780fh();
            case 4:
                return new C59779fg();
            case 5:
                return f161525b;
            case 6:
                C63010eb ebVar = f161526c;
                if (ebVar == null) {
                    synchronized (C59780fh.class) {
                        ebVar = f161526c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161525b);
                            f161526c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
