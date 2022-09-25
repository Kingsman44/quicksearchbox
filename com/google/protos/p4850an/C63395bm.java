package com.google.protos.p4850an;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.net.p4726a.p4728b.C62724b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.bm */
/* compiled from: PG */
public final class C63395bm extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63395bm f171324a;

    /* renamed from: e */
    private static volatile C63010eb f171325e;

    /* renamed from: b */
    private int f171326b;

    /* renamed from: c */
    private C62724b f171327c;

    /* renamed from: d */
    private byte f171328d = 2;

    static {
        C63395bm bmVar = new C63395bm();
        f171324a = bmVar;
        C62942bv.registerDefaultInstance(C63395bm.class, bmVar);
    }

    private C63395bm() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f171328d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f171328d = b;
                return null;
            case 2:
                return newMessageInfo(f171324a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C63395bm();
            case 4:
                return new C63394bl();
            case 5:
                return f171324a;
            case 6:
                C63010eb ebVar = f171325e;
                if (ebVar == null) {
                    synchronized (C63395bm.class) {
                        ebVar = f171325e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171324a);
                            f171325e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
