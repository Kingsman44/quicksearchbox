package com.google.p4152bb.p4153a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.ln */
/* compiled from: PG */
public final class C55253ln extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C55253ln f145507e;

    /* renamed from: g */
    private static volatile C63010eb f145508g;

    /* renamed from: a */
    public int f145509a;

    /* renamed from: b */
    public C62971cq f145510b = emptyProtobufList();

    /* renamed from: c */
    public C55244le f145511c;

    /* renamed from: d */
    public C55244le f145512d;

    /* renamed from: f */
    private byte f145513f = 2;

    static {
        C55253ln lnVar = new C55253ln();
        f145507e = lnVar;
        C62942bv.registerDefaultInstance(C55253ln.class, lnVar);
    }

    private C55253ln() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f145513f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f145513f = b;
                return null;
            case 2:
                return newMessageInfo(f145507e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0003\u0001Л\u0002ᐉ\u0000\u0003ᐉ\u0001", new Object[]{"a", "b", C55240la.class, C45240c.f118157a, "d"});
            case 3:
                return new C55253ln();
            case 4:
                return new C55252lm();
            case 5:
                return f145507e;
            case 6:
                C63010eb ebVar = f145508g;
                if (ebVar == null) {
                    synchronized (C55253ln.class) {
                        ebVar = f145508g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145507e);
                            f145508g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
