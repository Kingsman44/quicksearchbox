package com.google.android.apps.gsa.opaonboarding.p6459a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.opaonboarding.a.ad */
/* compiled from: PG */
public final class C83823ad extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C83823ad f228441e;

    /* renamed from: f */
    private static volatile C63010eb f228442f;

    /* renamed from: a */
    public int f228443a;

    /* renamed from: b */
    public C62971cq f228444b = C62942bv.emptyProtobufList();

    /* renamed from: c */
    public int f228445c;

    /* renamed from: d */
    public int f228446d;

    static {
        C83823ad adVar = new C83823ad();
        f228441e = adVar;
        C62942bv.registerDefaultInstance(C83823ad.class, adVar);
    }

    private C83823ad() {
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
                return newMessageInfo(f228441e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002ဌ\u0000\u0003ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C83866z.f228516a, "d", C83821ab.f228440a});
            case 3:
                return new C83823ad();
            case 4:
                return new C83865y();
            case 5:
                return f228441e;
            case 6:
                C63010eb ebVar = f228442f;
                if (ebVar == null) {
                    synchronized (C83823ad.class) {
                        ebVar = f228442f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f228441e);
                            f228442f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
