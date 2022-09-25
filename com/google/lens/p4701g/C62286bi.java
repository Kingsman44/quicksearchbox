package com.google.lens.p4701g;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4172bg.p4174b.C55731t;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.g.bi */
/* compiled from: PG */
public final class C62286bi extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62286bi f168153b;

    /* renamed from: e */
    private static volatile C63010eb f168154e;

    /* renamed from: a */
    public C55731t f168155a;

    /* renamed from: c */
    private int f168156c;

    /* renamed from: d */
    private byte f168157d = 2;

    static {
        C62286bi biVar = new C62286bi();
        f168153b = biVar;
        C62942bv.registerDefaultInstance(C62286bi.class, biVar);
    }

    private C62286bi() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f168157d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f168157d = b;
                return null;
            case 2:
                return newMessageInfo(f168153b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C62286bi();
            case 4:
                return new C62285bh();
            case 5:
                return f168153b;
            case 6:
                C63010eb ebVar = f168154e;
                if (ebVar == null) {
                    synchronized (C62286bi.class) {
                        ebVar = f168154e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168153b);
                            f168154e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
