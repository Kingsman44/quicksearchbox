package com.google.protos.p4985f.p5042u;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.u.f */
/* compiled from: PG */
public final class C65344f extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C65344f f176708e;

    /* renamed from: f */
    private static volatile C63010eb f176709f;

    /* renamed from: a */
    public int f176710a;

    /* renamed from: b */
    public String f176711b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f176712c = C62942bv.emptyProtobufList();

    /* renamed from: d */
    public String f176713d = BuildConfig.FLAVOR;

    static {
        C65344f fVar = new C65344f();
        f176708e = fVar;
        C62942bv.registerDefaultInstance(C65344f.class, fVar);
    }

    private C65344f() {
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
                return newMessageInfo(f176708e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a\u0003ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C65344f();
            case 4:
                return new C65343e();
            case 5:
                return f176708e;
            case 6:
                C63010eb ebVar = f176709f;
                if (ebVar == null) {
                    synchronized (C65344f.class) {
                        ebVar = f176709f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176708e);
                            f176709f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
