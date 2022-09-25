package com.google.protos.p4850an;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.bi */
/* compiled from: PG */
public final class C63391bi extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63391bi f171313a;

    /* renamed from: f */
    private static volatile C63010eb f171314f;

    /* renamed from: b */
    private int f171315b;

    /* renamed from: c */
    private C63393bk f171316c;

    /* renamed from: d */
    private C63395bm f171317d;

    /* renamed from: e */
    private byte f171318e = 2;

    static {
        C63391bi biVar = new C63391bi();
        f171313a = biVar;
        C62942bv.registerDefaultInstance(C63391bi.class, biVar);
    }

    private C63391bi() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f171318e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f171318e = b;
                return null;
            case 2:
                return newMessageInfo(f171313a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"b", C45240c.f118157a, "d"});
            case 3:
                return new C63391bi();
            case 4:
                return new C63390bh();
            case 5:
                return f171313a;
            case 6:
                C63010eb ebVar = f171314f;
                if (ebVar == null) {
                    synchronized (C63391bi.class) {
                        ebVar = f171314f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171313a);
                            f171314f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
