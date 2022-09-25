package com.google.p4152bb.p4153a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bb.a.nh */
/* compiled from: PG */
public final class C55301nh extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C55301nh f145683b;

    /* renamed from: c */
    public static final C62940bt f145684c;

    /* renamed from: e */
    private static volatile C63010eb f145685e;

    /* renamed from: a */
    public C62971cq f145686a = emptyProtobufList();

    /* renamed from: d */
    private byte f145687d = 2;

    static {
        C55301nh nhVar = new C55301nh();
        f145683b = nhVar;
        C62942bv.registerDefaultInstance(C55301nh.class, nhVar);
        f145684c = C62942bv.newSingularGeneratedExtension(C55215kc.f145365c, nhVar, nhVar, (C62958ce) null, 1000, C63066gd.MESSAGE, C55301nh.class);
    }

    private C55301nh() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f145687d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f145687d = b;
                return null;
            case 2:
                return newMessageInfo(f145683b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C55365pr.class});
            case 3:
                return new C55301nh();
            case 4:
                return new C55300ng();
            case 5:
                return f145683b;
            case 6:
                C63010eb ebVar = f145685e;
                if (ebVar == null) {
                    synchronized (C55301nh.class) {
                        ebVar = f145685e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145683b);
                            f145685e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
