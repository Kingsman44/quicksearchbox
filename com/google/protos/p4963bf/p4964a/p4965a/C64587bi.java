package com.google.protos.p4963bf.p4964a.p4965a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4172bg.p4175c.C55742d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p5132q.C65876s;

/* renamed from: com.google.protos.bf.a.a.bi */
/* compiled from: PG */
public final class C64587bi extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64587bi f175108a;

    /* renamed from: f */
    private static volatile C63010eb f175109f;

    /* renamed from: b */
    private int f175110b;

    /* renamed from: c */
    private C55742d f175111c;

    /* renamed from: d */
    private C65876s f175112d;

    /* renamed from: e */
    private byte f175113e = 2;

    static {
        C64587bi biVar = new C64587bi();
        f175108a = biVar;
        C62942bv.registerDefaultInstance(C64587bi.class, biVar);
    }

    private C64587bi() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f175113e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f175113e = b;
                return null;
            case 2:
                return newMessageInfo(f175108a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"b", C45240c.f118157a, "d"});
            case 3:
                return new C64587bi();
            case 4:
                return new C64586bh();
            case 5:
                return f175108a;
            case 6:
                C63010eb ebVar = f175109f;
                if (ebVar == null) {
                    synchronized (C64587bi.class) {
                        ebVar = f175109f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175108a);
                            f175109f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
