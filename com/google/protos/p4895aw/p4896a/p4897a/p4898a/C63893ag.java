package com.google.protos.p4895aw.p4896a.p4897a.p4898a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aw.a.a.a.ag */
/* compiled from: PG */
public final class C63893ag extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C63893ag f172762d;

    /* renamed from: e */
    private static volatile C63010eb f172763e;

    /* renamed from: a */
    public int f172764a;

    /* renamed from: b */
    public C63887aa f172765b;

    /* renamed from: c */
    public C62910ar f172766c;

    static {
        C63893ag agVar = new C63893ag();
        f172762d = agVar;
        C62942bv.registerDefaultInstance(C63893ag.class, agVar);
    }

    private C63893ag() {
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
                return newMessageInfo(f172762d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C63893ag();
            case 4:
                return new C63892af();
            case 5:
                return f172762d;
            case 6:
                C63010eb ebVar = f172763e;
                if (ebVar == null) {
                    synchronized (C63893ag.class) {
                        ebVar = f172763e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172762d);
                            f172763e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
