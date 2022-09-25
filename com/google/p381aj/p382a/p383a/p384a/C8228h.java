package com.google.p381aj.p382a.p383a.p384a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.aj.a.a.a.h */
/* compiled from: PG */
public final class C8228h extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C8228h f28887a;

    /* renamed from: e */
    private static volatile C63010eb f28888e;

    /* renamed from: b */
    private int f28889b;

    /* renamed from: c */
    private C8242v f28890c;

    /* renamed from: d */
    private byte f28891d = 2;

    static {
        C8228h hVar = new C8228h();
        f28887a = hVar;
        C62942bv.registerDefaultInstance(C8228h.class, hVar);
    }

    private C8228h() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f28891d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f28891d = b;
                return null;
            case 2:
                return newMessageInfo(f28887a, "\u0001\u0001\u0000\u0001\u0007\u0007\u0001\u0000\u0000\u0001\u0007ᐉ\u0006", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C8228h();
            case 4:
                return new C8227g();
            case 5:
                return f28887a;
            case 6:
                C63010eb ebVar = f28888e;
                if (ebVar == null) {
                    synchronized (C8228h.class) {
                        ebVar = f28888e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28887a);
                            f28888e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
