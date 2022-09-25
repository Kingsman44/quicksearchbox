package com.google.lens.p4701g;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4172bg.p4174b.C55719h;
import com.google.p4172bg.p4174b.C55731t;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.g.bk */
/* compiled from: PG */
public final class C62288bk extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C62288bk f168158e;

    /* renamed from: g */
    private static volatile C63010eb f168159g;

    /* renamed from: a */
    public int f168160a;

    /* renamed from: b */
    public C62251aa f168161b;

    /* renamed from: c */
    public C55731t f168162c;

    /* renamed from: d */
    public C55719h f168163d;

    /* renamed from: f */
    private byte f168164f = 2;

    static {
        C62288bk bkVar = new C62288bk();
        f168158e = bkVar;
        C62942bv.registerDefaultInstance(C62288bk.class, bkVar);
    }

    private C62288bk() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f168164f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f168164f = b;
                return null;
            case 2:
                return newMessageInfo(f168158e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ဉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C62288bk();
            case 4:
                return new C62287bj();
            case 5:
                return f168158e;
            case 6:
                C63010eb ebVar = f168159g;
                if (ebVar == null) {
                    synchronized (C62288bk.class) {
                        ebVar = f168159g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168158e);
                            f168159g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
