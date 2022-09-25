package com.google.android.apps.gsa.nga.shared.p6345h;

import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.bq */
/* compiled from: PG */
public final class C81286bq extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C81286bq f222518d;

    /* renamed from: e */
    private static volatile C63010eb f222519e;

    /* renamed from: a */
    public int f222520a;

    /* renamed from: b */
    public long f222521b;

    /* renamed from: c */
    public int f222522c;

    static {
        C81286bq bqVar = new C81286bq();
        f222518d = bqVar;
        C62942bv.registerDefaultInstance(C81286bq.class, bqVar);
    }

    private C81286bq() {
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
                return newMessageInfo(f222518d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, e.b()});
            case 3:
                return new C81286bq();
            case 4:
                return new C81285bp();
            case 5:
                return f222518d;
            case 6:
                C63010eb ebVar = f222519e;
                if (ebVar == null) {
                    synchronized (C81286bq.class) {
                        ebVar = f222519e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f222518d);
                            f222519e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
