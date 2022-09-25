package com.google.assistant.p3860as;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p381aj.p382a.p383a.p384a.C8242v;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.as.bv */
/* compiled from: PG */
public final class C49786bv extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C49786bv f128562a;

    /* renamed from: e */
    private static volatile C63010eb f128563e;

    /* renamed from: b */
    private int f128564b;

    /* renamed from: c */
    private C8242v f128565c;

    /* renamed from: d */
    private byte f128566d = 2;

    static {
        C49786bv bvVar = new C49786bv();
        f128562a = bvVar;
        C62942bv.registerDefaultInstance(C49786bv.class, bvVar);
    }

    private C49786bv() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f128566d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f128566d = b;
                return null;
            case 2:
                return newMessageInfo(f128562a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003ᐉ\u0001", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C49786bv();
            case 4:
                return new C49785bu();
            case 5:
                return f128562a;
            case 6:
                C63010eb ebVar = f128563e;
                if (ebVar == null) {
                    synchronized (C49786bv.class) {
                        ebVar = f128563e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128562a);
                            f128563e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
