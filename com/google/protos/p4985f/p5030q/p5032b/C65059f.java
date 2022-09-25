package com.google.protos.p4985f.p5030q.p5032b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.b.f */
/* compiled from: PG */
public final class C65059f extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C65059f f176180d;

    /* renamed from: e */
    private static volatile C63010eb f176181e;

    /* renamed from: a */
    public int f176182a;

    /* renamed from: b */
    public long f176183b;

    /* renamed from: c */
    public String f176184c = BuildConfig.FLAVOR;

    static {
        C65059f fVar = new C65059f();
        f176180d = fVar;
        C62942bv.registerDefaultInstance(C65059f.class, fVar);
    }

    private C65059f() {
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
                return newMessageInfo(f176180d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C65059f();
            case 4:
                return new C65058e();
            case 5:
                return f176180d;
            case 6:
                C63010eb ebVar = f176181e;
                if (ebVar == null) {
                    synchronized (C65059f.class) {
                        ebVar = f176181e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176180d);
                            f176181e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
