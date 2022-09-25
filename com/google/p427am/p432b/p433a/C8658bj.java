package com.google.p427am.p432b.p433a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.am.b.a.bj */
/* compiled from: PG */
public final class C8658bj extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C8658bj f29956d;

    /* renamed from: e */
    private static volatile C63010eb f29957e;

    /* renamed from: a */
    public C62971cq f29958a = C62942bv.emptyProtobufList();

    /* renamed from: b */
    public C8656bh f29959b;

    /* renamed from: c */
    public int f29960c;

    static {
        C8658bj bjVar = new C8658bj();
        f29956d = bjVar;
        C62942bv.registerDefaultInstance(C8658bj.class, bjVar);
    }

    private C8658bj() {
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
                return newMessageInfo(f29956d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ț\u0002\t\u0003\f", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C8658bj();
            case 4:
                return new C8657bi();
            case 5:
                return f29956d;
            case 6:
                C63010eb ebVar = f29957e;
                if (ebVar == null) {
                    synchronized (C8658bj.class) {
                        ebVar = f29957e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29956d);
                            f29957e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
