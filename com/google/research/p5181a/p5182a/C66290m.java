package com.google.research.p5181a.p5182a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.research.a.a.m */
/* compiled from: PG */
public final class C66290m extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C66290m f180281d;

    /* renamed from: e */
    private static volatile C63010eb f180282e;

    /* renamed from: a */
    public int f180283a;

    /* renamed from: b */
    public String f180284b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f180285c = emptyProtobufList();

    static {
        C66290m mVar = new C66290m();
        f180281d = mVar;
        C62942bv.registerDefaultInstance(C66290m.class, mVar);
    }

    private C66290m() {
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
                return newMessageInfo(f180281d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"a", "b", C45240c.f118157a, C66283f.class});
            case 3:
                return new C66290m();
            case 4:
                return new C66289l();
            case 5:
                return f180281d;
            case 6:
                C63010eb ebVar = f180282e;
                if (ebVar == null) {
                    synchronized (C66290m.class) {
                        ebVar = f180282e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180281d);
                            f180282e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
