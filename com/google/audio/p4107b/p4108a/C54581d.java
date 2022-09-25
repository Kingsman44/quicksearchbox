package com.google.audio.p4107b.p4108a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.audio.b.a.d */
/* compiled from: PG */
public final class C54581d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C54581d f143303b;

    /* renamed from: c */
    private static volatile C63010eb f143304c;

    /* renamed from: a */
    public C62971cq f143305a = emptyProtobufList();

    static {
        C54581d dVar = new C54581d();
        f143303b = dVar;
        C62942bv.registerDefaultInstance(C54581d.class, dVar);
    }

    private C54581d() {
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
                return newMessageInfo(f143303b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C54579b.class});
            case 3:
                return new C54581d();
            case 4:
                return new C54580c();
            case 5:
                return f143303b;
            case 6:
                C63010eb ebVar = f143304c;
                if (ebVar == null) {
                    synchronized (C54581d.class) {
                        ebVar = f143304c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143303b);
                            f143304c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
