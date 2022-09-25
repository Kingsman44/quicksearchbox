package com.google.android.apps.gsa.nga.engine.warmactions.p6255g;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;
import com.google.speech.p5218j.C66964g;
import com.google.speech.p5218j.C66992ha;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.g.aa */
/* compiled from: PG */
public final class C79568aa extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C79568aa f218309f;

    /* renamed from: g */
    private static volatile C63010eb f218310g;

    /* renamed from: a */
    public int f218311a;

    /* renamed from: b */
    public int f218312b = 2;

    /* renamed from: c */
    public int f218313c = 1;

    /* renamed from: d */
    public C63088z f218314d = C63088z.f170246b;

    /* renamed from: e */
    public C62971cq f218315e = C62942bv.emptyProtobufList();

    static {
        C79568aa aaVar = new C79568aa();
        f218309f = aaVar;
        C62942bv.registerDefaultInstance(C79568aa.class, aaVar);
    }

    private C79568aa() {
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
                return newMessageInfo(f218309f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ည\u0002\u0004\u001a", new Object[]{"a", "b", C66992ha.f182092a, C45240c.f118157a, C66964g.m97397b(), "d", "e"});
            case 3:
                return new C79568aa();
            case 4:
                return new C79594z();
            case 5:
                return f218309f;
            case 6:
                C63010eb ebVar = f218310g;
                if (ebVar == null) {
                    synchronized (C79568aa.class) {
                        ebVar = f218310g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f218309f);
                            f218310g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
