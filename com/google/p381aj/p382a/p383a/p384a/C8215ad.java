package com.google.p381aj.p382a.p383a.p384a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.aj.a.a.a.ad */
/* compiled from: PG */
public final class C8215ad extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C8215ad f28844a;

    /* renamed from: e */
    private static volatile C63010eb f28845e;

    /* renamed from: b */
    private int f28846b;

    /* renamed from: c */
    private C8242v f28847c;

    /* renamed from: d */
    private byte f28848d = 2;

    static {
        C8215ad adVar = new C8215ad();
        f28844a = adVar;
        C62942bv.registerDefaultInstance(C8215ad.class, adVar);
    }

    private C8215ad() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f28848d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f28848d = b;
                return null;
            case 2:
                return newMessageInfo(f28844a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0001", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C8215ad();
            case 4:
                return new C8214ac();
            case 5:
                return f28844a;
            case 6:
                C63010eb ebVar = f28845e;
                if (ebVar == null) {
                    synchronized (C8215ad.class) {
                        ebVar = f28845e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28844a);
                            f28845e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
