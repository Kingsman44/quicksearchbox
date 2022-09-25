package com.google.protos.p4950bb.p4952b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.bb.b.d */
/* compiled from: PG */
public final class C64394d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64394d f174647a;

    /* renamed from: e */
    private static volatile C63010eb f174648e;

    /* renamed from: b */
    private int f174649b;

    /* renamed from: c */
    private C64392b f174650c;

    /* renamed from: d */
    private byte f174651d = 2;

    static {
        C64394d dVar = new C64394d();
        f174647a = dVar;
        C62942bv.registerDefaultInstance(C64394d.class, dVar);
    }

    private C64394d() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f174651d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f174651d = b;
                return null;
            case 2:
                return newMessageInfo(f174647a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C64394d();
            case 4:
                return new C64393c();
            case 5:
                return f174647a;
            case 6:
                C63010eb ebVar = f174648e;
                if (ebVar == null) {
                    synchronized (C64394d.class) {
                        ebVar = f174648e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f174647a);
                            f174648e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
