package com.google.android.libraries.search.p3090o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4184bj.p4204d.p4205a.p4209d.C56016b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.search.o.b */
/* compiled from: PG */
public final class C39824b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C39824b f104719e;

    /* renamed from: f */
    private static volatile C63010eb f104720f;

    /* renamed from: a */
    public int f104721a;

    /* renamed from: b */
    public C63088z f104722b = C63088z.f170246b;

    /* renamed from: c */
    public int f104723c;

    /* renamed from: d */
    public C63042fg f104724d;

    static {
        C39824b bVar = new C39824b();
        f104719e = bVar;
        C62942bv.registerDefaultInstance(C39824b.class, bVar);
    }

    private C39824b() {
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
                return newMessageInfo(f104719e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ဌ\u0001\u0004ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, C56016b.m87884b(), "d"});
            case 3:
                return new C39824b();
            case 4:
                return new C39823a();
            case 5:
                return f104719e;
            case 6:
                C63010eb ebVar = f104720f;
                if (ebVar == null) {
                    synchronized (C39824b.class) {
                        ebVar = f104720f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f104719e);
                            f104720f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
