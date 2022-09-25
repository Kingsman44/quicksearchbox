package com.google.p4656j.p4657a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.j.a.f */
/* compiled from: PG */
public final class C61722f extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C61722f f166748d;

    /* renamed from: f */
    private static volatile C63010eb f166749f;

    /* renamed from: a */
    public C63088z f166750a = C63088z.f170246b;

    /* renamed from: b */
    public long f166751b;

    /* renamed from: c */
    public long f166752c;

    /* renamed from: e */
    private int f166753e;

    static {
        C61722f fVar = new C61722f();
        f166748d = fVar;
        C62942bv.registerDefaultInstance(C61722f.class, fVar);
    }

    private C61722f() {
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
                return newMessageInfo(f166748d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ဃ\u0001\u0003ဃ\u0002", new Object[]{"e", "a", "b", C45240c.f118157a});
            case 3:
                return new C61722f();
            case 4:
                return new C61721e();
            case 5:
                return f166748d;
            case 6:
                C63010eb ebVar = f166749f;
                if (ebVar == null) {
                    synchronized (C61722f.class) {
                        ebVar = f166749f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f166748d);
                            f166749f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
