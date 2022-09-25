package com.google.frameworks.client.p4624a.p4629b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.frameworks.client.a.b.f */
/* compiled from: PG */
public final class C61309f extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C61309f f165809e;

    /* renamed from: f */
    private static volatile C63010eb f165810f;

    /* renamed from: a */
    public int f165811a;

    /* renamed from: b */
    public int f165812b;

    /* renamed from: c */
    public String f165813c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f165814d = BuildConfig.FLAVOR;

    static {
        C61309f fVar = new C61309f();
        f165809e = fVar;
        C62942bv.registerDefaultInstance(C61309f.class, fVar);
    }

    private C61309f() {
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
                return newMessageInfo(f165809e, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0000\u0002င\u0000\u0004ဈ\u0001\u0005ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C61309f();
            case 4:
                return new C61308e();
            case 5:
                return f165809e;
            case 6:
                C63010eb ebVar = f165810f;
                if (ebVar == null) {
                    synchronized (C61309f.class) {
                        ebVar = f165810f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f165809e);
                            f165810f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
