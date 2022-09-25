package com.google.lens.p4699e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.e.bd */
/* compiled from: PG */
public final class C62218bd extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C62218bd f167980e;

    /* renamed from: f */
    private static volatile C63010eb f167981f;

    /* renamed from: a */
    public int f167982a;

    /* renamed from: b */
    public int f167983b = -16777216;

    /* renamed from: c */
    public int f167984c = -1;

    /* renamed from: d */
    public int f167985d;

    static {
        C62218bd bdVar = new C62218bd();
        f167980e = bdVar;
        C62942bv.registerDefaultInstance(C62218bd.class, bdVar);
    }

    private C62218bd() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f167980e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0004ဋ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C62218bd();
            case 4:
                return new C62217bc();
            case 5:
                return f167980e;
            case 6:
                C63010eb ebVar = f167981f;
                if (ebVar == null) {
                    synchronized (C62218bd.class) {
                        ebVar = f167981f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167980e);
                            f167981f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
