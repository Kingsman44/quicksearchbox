package com.google.android.apps.gsa.nga.shared.p6275aa.p6293m;

import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.m.e */
/* compiled from: PG */
public final class C80502e extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C80502e f220990d;

    /* renamed from: e */
    private static volatile C63010eb f220991e;

    /* renamed from: a */
    public int f220992a;

    /* renamed from: b */
    public int f220993b;

    /* renamed from: c */
    public int f220994c;

    static {
        C80502e eVar = new C80502e();
        f220990d = eVar;
        C62942bv.registerDefaultInstance(C80502e.class, eVar);
    }

    private C80502e() {
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
                return newMessageInfo(f220990d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဌ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", e.b(), C45240c.f118157a, C80501d.m128183b()});
            case 3:
                return new C80502e();
            case 4:
                return new C80499b();
            case 5:
                return f220990d;
            case 6:
                C63010eb ebVar = f220991e;
                if (ebVar == null) {
                    synchronized (C80502e.class) {
                        ebVar = f220991e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220990d);
                            f220991e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
