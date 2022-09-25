package com.google.p4017at.p4086k.p4087a.p4096d.p4097a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.k.a.d.a.d */
/* compiled from: PG */
public final class C54534d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C54534d f143186b;

    /* renamed from: c */
    private static volatile C63010eb f143187c;

    /* renamed from: a */
    public C62971cq f143188a = emptyProtobufList();

    static {
        C54534d dVar = new C54534d();
        f143186b = dVar;
        C62942bv.registerDefaultInstance(C54534d.class, dVar);
    }

    private C54534d() {
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
                return newMessageInfo(f143186b, "\u0000\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0001\u0000\u0003\u001b", new Object[]{"a", C54547q.class});
            case 3:
                return new C54534d();
            case 4:
                return new C54533c();
            case 5:
                return f143186b;
            case 6:
                C63010eb ebVar = f143187c;
                if (ebVar == null) {
                    synchronized (C54534d.class) {
                        ebVar = f143187c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143186b);
                            f143187c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
