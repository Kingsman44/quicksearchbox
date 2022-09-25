package com.google.protos.p4850an;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4881ar.p4882a.C63771b;

/* renamed from: com.google.protos.an.bk */
/* compiled from: PG */
public final class C63393bk extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63393bk f171319a;

    /* renamed from: e */
    private static volatile C63010eb f171320e;

    /* renamed from: b */
    private int f171321b;

    /* renamed from: c */
    private C63771b f171322c;

    /* renamed from: d */
    private byte f171323d = 2;

    static {
        C63393bk bkVar = new C63393bk();
        f171319a = bkVar;
        C62942bv.registerDefaultInstance(C63393bk.class, bkVar);
    }

    private C63393bk() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f171323d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f171323d = b;
                return null;
            case 2:
                return newMessageInfo(f171319a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0004ᐉ\u0003", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C63393bk();
            case 4:
                return new C63392bj();
            case 5:
                return f171319a;
            case 6:
                C63010eb ebVar = f171320e;
                if (ebVar == null) {
                    synchronized (C63393bk.class) {
                        ebVar = f171320e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171319a);
                            f171320e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
