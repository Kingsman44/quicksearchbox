package com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4784c.p4785a.p4786a.p4787a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.protos.ad.a.a.a.c.a.a.a.f */
/* compiled from: PG */
public final class C63140f extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C63140f f170505f;

    /* renamed from: g */
    private static volatile C63010eb f170506g;

    /* renamed from: a */
    public int f170507a;

    /* renamed from: b */
    public C63088z f170508b = C63088z.f170246b;

    /* renamed from: c */
    public boolean f170509c;

    /* renamed from: d */
    public String f170510d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public boolean f170511e;

    static {
        C63140f fVar = new C63140f();
        f170505f = fVar;
        C62942bv.registerDefaultInstance(C63140f.class, fVar);
    }

    private C63140f() {
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
                return newMessageInfo(f170505f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C63140f();
            case 4:
                return new C63139e();
            case 5:
                return f170505f;
            case 6:
                C63010eb ebVar = f170506g;
                if (ebVar == null) {
                    synchronized (C63140f.class) {
                        ebVar = f170506g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f170505f);
                            f170506g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
