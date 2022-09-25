package com.google.android.libraries.performance.primes.metrics.p2409d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.performance.primes.metrics.d.aa */
/* compiled from: PG */
public final class C31372aa extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C31372aa f84469d;

    /* renamed from: f */
    private static volatile C63010eb f84470f;

    /* renamed from: a */
    public String f84471a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62971cq f84472b = emptyProtobufList();

    /* renamed from: c */
    public boolean f84473c;

    /* renamed from: e */
    private int f84474e;

    static {
        C31372aa aaVar = new C31372aa();
        f84469d = aaVar;
        C62942bv.registerDefaultInstance(C31372aa.class, aaVar);
    }

    private C31372aa() {
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
                return newMessageInfo(f84469d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"e", "a", "b", C31403x.class, C45240c.f118157a});
            case 3:
                return new C31372aa();
            case 4:
                return new C31401v();
            case 5:
                return f84469d;
            case 6:
                C63010eb ebVar = f84470f;
                if (ebVar == null) {
                    synchronized (C31372aa.class) {
                        ebVar = f84470f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f84469d);
                            f84470f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
