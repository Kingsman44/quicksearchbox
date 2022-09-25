package com.google.assistant.p3781ad.p3789d.p3791b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.b.bn */
/* compiled from: PG */
public final class C48706bn extends C62937bq implements C62938br {

    /* renamed from: f */
    public static final C48706bn f126002f;

    /* renamed from: h */
    private static volatile C63010eb f126003h;

    /* renamed from: a */
    public int f126004a;

    /* renamed from: b */
    public C48702bj f126005b;

    /* renamed from: c */
    public C48698bf f126006c;

    /* renamed from: d */
    public C48704bl f126007d;

    /* renamed from: e */
    public C48700bh f126008e;

    /* renamed from: g */
    private byte f126009g = 2;

    static {
        C48706bn bnVar = new C48706bn();
        f126002f = bnVar;
        C62942bv.registerDefaultInstance(C48706bn.class, bnVar);
    }

    private C48706bn() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f126009g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f126009g = b;
                return null;
            case 2:
                return newMessageInfo(f126002f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C48706bn();
            case 4:
                return new C48705bm();
            case 5:
                return f126002f;
            case 6:
                C63010eb ebVar = f126003h;
                if (ebVar == null) {
                    synchronized (C48706bn.class) {
                        ebVar = f126003h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126002f);
                            f126003h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
