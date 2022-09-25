package com.google.p381aj.p382a.p383a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.aj.a.a.n */
/* compiled from: PG */
public final class C8259n extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C8259n f29003a;

    /* renamed from: e */
    private static volatile C63010eb f29004e;

    /* renamed from: b */
    private int f29005b;

    /* renamed from: c */
    private C8257l f29006c;

    /* renamed from: d */
    private byte f29007d = 2;

    static {
        C8259n nVar = new C8259n();
        f29003a = nVar;
        C62942bv.registerDefaultInstance(C8259n.class, nVar);
    }

    private C8259n() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f29007d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f29007d = b;
                return null;
            case 2:
                return newMessageInfo(f29003a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0001", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C8259n();
            case 4:
                return new C8258m();
            case 5:
                return f29003a;
            case 6:
                C63010eb ebVar = f29004e;
                if (ebVar == null) {
                    synchronized (C8259n.class) {
                        ebVar = f29004e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29003a);
                            f29004e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
