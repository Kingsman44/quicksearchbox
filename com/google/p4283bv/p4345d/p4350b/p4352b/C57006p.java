package com.google.p4283bv.p4345d.p4350b.p4352b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.d.b.b.p */
/* compiled from: PG */
public final class C57006p extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C57006p f152176a;

    /* renamed from: e */
    private static volatile C63010eb f152177e;

    /* renamed from: b */
    private int f152178b;

    /* renamed from: c */
    private C60220t f152179c;

    /* renamed from: d */
    private byte f152180d = 2;

    static {
        C57006p pVar = new C57006p();
        f152176a = pVar;
        C62942bv.registerDefaultInstance(C57006p.class, pVar);
    }

    private C57006p() {
        emptyProtobufList();
        emptyIntList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f152180d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f152180d = b;
                return null;
            case 2:
                return newMessageInfo(f152176a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0000", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C57006p();
            case 4:
                return new C57005o();
            case 5:
                return f152176a;
            case 6:
                C63010eb ebVar = f152177e;
                if (ebVar == null) {
                    synchronized (C57006p.class) {
                        ebVar = f152177e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152176a);
                            f152177e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
