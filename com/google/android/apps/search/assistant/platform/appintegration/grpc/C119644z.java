package com.google.android.apps.search.assistant.platform.appintegration.grpc;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.appintegration.grpc.z */
/* compiled from: PG */
public final class C119644z extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C119644z f333425d;

    /* renamed from: e */
    private static volatile C63010eb f333426e;

    /* renamed from: a */
    public int f333427a;

    /* renamed from: b */
    public int f333428b;

    /* renamed from: c */
    public C62971cq f333429c = C62942bv.emptyProtobufList();

    static {
        C119644z zVar = new C119644z();
        f333425d = zVar;
        C62942bv.registerDefaultInstance(C119644z.class, zVar);
    }

    private C119644z() {
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
                return newMessageInfo(f333425d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0003\u001a", new Object[]{"a", "b", C119597aq.m198501b(), C45240c.f118157a});
            case 3:
                return new C119644z();
            case 4:
                return new C119643y();
            case 5:
                return f333425d;
            case 6:
                C63010eb ebVar = f333426e;
                if (ebVar == null) {
                    synchronized (C119644z.class) {
                        ebVar = f333426e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f333425d);
                            f333426e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
