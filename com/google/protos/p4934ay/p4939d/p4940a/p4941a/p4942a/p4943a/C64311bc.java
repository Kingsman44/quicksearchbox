package com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4985f.p5048z.p5053c.p5055b.p5059c.C65429b;

/* renamed from: com.google.protos.ay.d.a.a.a.a.bc */
/* compiled from: PG */
public final class C64311bc extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C64311bc f173881e;

    /* renamed from: g */
    private static volatile C63010eb f173882g;

    /* renamed from: a */
    public int f173883a;

    /* renamed from: b */
    public C64330f f173884b;

    /* renamed from: c */
    public C64321bm f173885c;

    /* renamed from: d */
    public C65429b f173886d;

    /* renamed from: f */
    private byte f173887f = 2;

    static {
        C64311bc bcVar = new C64311bc();
        f173881e = bcVar;
        C62942bv.registerDefaultInstance(C64311bc.class, bcVar);
    }

    private C64311bc() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f173887f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f173887f = b;
                return null;
            case 2:
                return newMessageInfo(f173881e, "\u0001\u0003\u0000\u0001\u0002\u0006\u0003\u0000\u0000\u0001\u0002ဉ\u0001\u0005ᐉ\u0004\u0006ဉ\u0003", new Object[]{"a", "b", "d", C45240c.f118157a});
            case 3:
                return new C64311bc();
            case 4:
                return new C64310bb();
            case 5:
                return f173881e;
            case 6:
                C63010eb ebVar = f173882g;
                if (ebVar == null) {
                    synchronized (C64311bc.class) {
                        ebVar = f173882g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173881e);
                            f173882g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
