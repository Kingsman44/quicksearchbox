package com.google.p381aj.p382a.p383a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.aj.a.a.l */
/* compiled from: PG */
public final class C8257l extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C8257l f28998a;

    /* renamed from: e */
    private static volatile C63010eb f28999e;

    /* renamed from: b */
    private int f29000b;

    /* renamed from: c */
    private C8247b f29001c;

    /* renamed from: d */
    private byte f29002d = 2;

    static {
        C8257l lVar = new C8257l();
        f28998a = lVar;
        C62942bv.registerDefaultInstance(C8257l.class, lVar);
    }

    private C8257l() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f29002d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f29002d = b;
                return null;
            case 2:
                return newMessageInfo(f28998a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C8257l();
            case 4:
                return new C8256k();
            case 5:
                return f28998a;
            case 6:
                C63010eb ebVar = f28999e;
                if (ebVar == null) {
                    synchronized (C8257l.class) {
                        ebVar = f28999e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28998a);
                            f28999e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
