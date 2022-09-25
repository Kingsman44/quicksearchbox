package com.google.p381aj.p382a.p383a.p384a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p381aj.p382a.p383a.C8257l;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.aj.a.a.a.p */
/* compiled from: PG */
public final class C8236p extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C8236p f28909a;

    /* renamed from: e */
    private static volatile C63010eb f28910e;

    /* renamed from: b */
    private int f28911b;

    /* renamed from: c */
    private C8257l f28912c;

    /* renamed from: d */
    private byte f28913d = 2;

    static {
        C8236p pVar = new C8236p();
        f28909a = pVar;
        C62942bv.registerDefaultInstance(C8236p.class, pVar);
    }

    private C8236p() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f28913d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f28913d = b;
                return null;
            case 2:
                return newMessageInfo(f28909a, "\u0001\u0001\u0000\u0001\r\r\u0001\u0000\u0000\u0001\rᐉ\u0002", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C8236p();
            case 4:
                return new C8235o();
            case 5:
                return f28909a;
            case 6:
                C63010eb ebVar = f28910e;
                if (ebVar == null) {
                    synchronized (C8236p.class) {
                        ebVar = f28910e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28909a);
                            f28910e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
