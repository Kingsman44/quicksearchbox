package com.google.protos.p4895aw.p4896a.p4897a.p4898a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aw.a.a.a.s */
/* compiled from: PG */
public final class C63955s extends C62937bq implements C62938br {

    /* renamed from: b */
    public static final C63955s f172966b;

    /* renamed from: e */
    private static volatile C63010eb f172967e;

    /* renamed from: a */
    public int f172968a;

    /* renamed from: c */
    private int f172969c;

    /* renamed from: d */
    private byte f172970d = 2;

    static {
        C63955s sVar = new C63955s();
        f172966b = sVar;
        C62942bv.registerDefaultInstance(C63955s.class, sVar);
    }

    private C63955s() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f172970d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f172970d = b;
                return null;
            case 2:
                return newMessageInfo(f172966b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{C45240c.f118157a, "a", C63954r.m96326b()});
            case 3:
                return new C63955s();
            case 4:
                return new C63952p();
            case 5:
                return f172966b;
            case 6:
                C63010eb ebVar = f172967e;
                if (ebVar == null) {
                    synchronized (C63955s.class) {
                        ebVar = f172967e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172966b);
                            f172967e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
