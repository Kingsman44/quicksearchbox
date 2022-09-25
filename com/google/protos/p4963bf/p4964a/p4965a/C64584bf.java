package com.google.protos.p4963bf.p4964a.p4965a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62960cg;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.bf.a.a.bf */
/* compiled from: PG */
public final class C64584bf extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C64584bf f175100d;

    /* renamed from: e */
    private static volatile C63010eb f175101e;

    /* renamed from: a */
    public int f175102a;

    /* renamed from: b */
    public C64581bc f175103b;

    /* renamed from: c */
    public C62960cg f175104c = emptyFloatList();

    static {
        C64584bf bfVar = new C64584bf();
        f175100d = bfVar;
        C62942bv.registerDefaultInstance(C64584bf.class, bfVar);
    }

    private C64584bf() {
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
                return newMessageInfo(f175100d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u0013", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C64584bf();
            case 4:
                return new C64583be();
            case 5:
                return f175100d;
            case 6:
                C63010eb ebVar = f175101e;
                if (ebVar == null) {
                    synchronized (C64584bf.class) {
                        ebVar = f175101e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175100d);
                            f175101e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
