package com.google.android.libraries.assistant.p1594s.p1597b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3781ad.p3789d.p3791b.C48674ai;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.s.b.bc */
/* compiled from: PG */
public final class C19169bc extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C19169bc f53691g;

    /* renamed from: h */
    private static volatile C63010eb f53692h;

    /* renamed from: a */
    public int f53693a;

    /* renamed from: b */
    public String f53694b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f53695c = 5;

    /* renamed from: d */
    public int f53696d;

    /* renamed from: e */
    public C19167ba f53697e;

    /* renamed from: f */
    public long f53698f;

    static {
        C19169bc bcVar = new C19169bc();
        f53691g = bcVar;
        C62942bv.registerDefaultInstance(C19169bc.class, bcVar);
    }

    private C19169bc() {
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
                return newMessageInfo(f53691g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0004ဌ\u0003\u0005ဉ\u0004\u0006ဂ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", C48674ai.m85262b(), "e", C10662f.f35572a});
            case 3:
                return new C19169bc();
            case 4:
                return new C19168bb();
            case 5:
                return f53691g;
            case 6:
                C63010eb ebVar = f53692h;
                if (ebVar == null) {
                    synchronized (C19169bc.class) {
                        ebVar = f53692h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f53691g);
                            f53692h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
