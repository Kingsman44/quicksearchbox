package com.google.android.libraries.search.assistant.performer.p2729b.p2730a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.search.assistant.performer.b.a.j */
/* compiled from: PG */
public final class C35483j extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C35483j f93186d;

    /* renamed from: e */
    private static volatile C63010eb f93187e;

    /* renamed from: a */
    public int f93188a;

    /* renamed from: b */
    public C62971cq f93189b = emptyProtobufList();

    /* renamed from: c */
    public C63088z f93190c = C63088z.f170246b;

    static {
        C35483j jVar = new C35483j();
        f93186d = jVar;
        C62942bv.registerDefaultInstance(C35483j.class, jVar);
    }

    private C35483j() {
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
                return newMessageInfo(f93186d, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0000\u0002\u001b\u0003ည\u0000", new Object[]{"a", "b", C35482i.class, C45240c.f118157a});
            case 3:
                return new C35483j();
            case 4:
                return new C35478e();
            case 5:
                return f93186d;
            case 6:
                C63010eb ebVar = f93187e;
                if (ebVar == null) {
                    synchronized (C35483j.class) {
                        ebVar = f93187e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f93186d);
                            f93187e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
