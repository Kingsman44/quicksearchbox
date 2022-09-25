package com.google.android.apps.gsa.search.shared.service.p6936c.p6938b;

import com.google.android.apps.gsa.search.shared.service.p6935b.aaj;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.c.b.bq */
/* compiled from: PG */
public final class C88446bq extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C88446bq f239115d;

    /* renamed from: e */
    private static volatile C63010eb f239116e;

    /* renamed from: a */
    public int f239117a;

    /* renamed from: b */
    public boolean f239118b;

    /* renamed from: c */
    public aaj f239119c;

    static {
        C88446bq bqVar = new C88446bq();
        f239115d = bqVar;
        C62942bv.registerDefaultInstance(C88446bq.class, bqVar);
    }

    private C88446bq() {
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
                return newMessageInfo(f239115d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C88446bq();
            case 4:
                return new C88445bp();
            case 5:
                return f239115d;
            case 6:
                C63010eb ebVar = f239116e;
                if (ebVar == null) {
                    synchronized (C88446bq.class) {
                        ebVar = f239116e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f239115d);
                            f239116e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
