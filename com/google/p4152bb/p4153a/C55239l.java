package com.google.p4152bb.p4153a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.l */
/* compiled from: PG */
public final class C55239l extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C55239l f145443d;

    /* renamed from: f */
    private static volatile C63010eb f145444f;

    /* renamed from: a */
    public int f145445a;

    /* renamed from: b */
    public C55158i f145446b;

    /* renamed from: c */
    public C62971cq f145447c = emptyProtobufList();

    /* renamed from: e */
    private byte f145448e = 2;

    static {
        C55239l lVar = new C55239l();
        f145443d = lVar;
        C62942bv.registerDefaultInstance(C55239l.class, lVar);
    }

    private C55239l() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f145448e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f145448e = b;
                return null;
            case 2:
                return newMessageInfo(f145443d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001ᐉ\u0000\u0002Л", new Object[]{"a", "b", C45240c.f118157a, C55212k.class});
            case 3:
                return new C55239l();
            case 4:
                return new C55104g();
            case 5:
                return f145443d;
            case 6:
                C63010eb ebVar = f145444f;
                if (ebVar == null) {
                    synchronized (C55239l.class) {
                        ebVar = f145444f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145443d);
                            f145444f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
