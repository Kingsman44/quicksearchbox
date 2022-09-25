package com.google.protos.p4850an;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.knowledge.p4661a.p4662a.C61748j;
import com.google.knowledge.p4661a.p4662a.C61762x;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.ap */
/* compiled from: PG */
public final class C63345ap extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63345ap f171182a;

    /* renamed from: f */
    private static volatile C63010eb f171183f;

    /* renamed from: b */
    private int f171184b;

    /* renamed from: c */
    private C61748j f171185c;

    /* renamed from: d */
    private C61762x f171186d;

    /* renamed from: e */
    private byte f171187e = 2;

    static {
        C63345ap apVar = new C63345ap();
        f171182a = apVar;
        C62942bv.registerDefaultInstance(C63345ap.class, apVar);
    }

    private C63345ap() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f171187e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f171187e = b;
                return null;
            case 2:
                return newMessageInfo(f171182a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0002\u0002ᐉ\u0001\u0003ᐉ\u0002", new Object[]{"b", C45240c.f118157a, "d"});
            case 3:
                return new C63345ap();
            case 4:
                return new C63344ao();
            case 5:
                return f171182a;
            case 6:
                C63010eb ebVar = f171183f;
                if (ebVar == null) {
                    synchronized (C63345ap.class) {
                        ebVar = f171183f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171182a);
                            f171183f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
