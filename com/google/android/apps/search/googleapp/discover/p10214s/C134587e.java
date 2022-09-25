package com.google.android.apps.search.googleapp.discover.p10214s;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.android.apps.search.googleapp.discover.s.e */
/* compiled from: PG */
public final class C134587e extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C134587e f366522e;

    /* renamed from: f */
    private static volatile C63010eb f366523f;

    /* renamed from: a */
    public int f366524a;

    /* renamed from: b */
    public C63042fg f366525b;

    /* renamed from: c */
    public C62971cq f366526c = emptyProtobufList();

    /* renamed from: d */
    public int f366527d;

    static {
        C134587e eVar = new C134587e();
        f366522e = eVar;
        C62942bv.registerDefaultInstance(C134587e.class, eVar);
    }

    private C134587e() {
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
                return newMessageInfo(f366522e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003င\u0001", new Object[]{"a", "b", C45240c.f118157a, C62910ar.class, "d"});
            case 3:
                return new C134587e();
            case 4:
                return new C134586d();
            case 5:
                return f366522e;
            case 6:
                C63010eb ebVar = f366523f;
                if (ebVar == null) {
                    synchronized (C134587e.class) {
                        ebVar = f366523f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f366522e);
                            f366523f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
