package com.google.protos.youtube.elements.p5165a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.youtube.elements.a.j */
/* compiled from: PG */
public final class C66022j extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C66022j f179546f;

    /* renamed from: g */
    private static volatile C63010eb f179547g;

    /* renamed from: a */
    public int f179548a;

    /* renamed from: b */
    public int f179549b;

    /* renamed from: c */
    public int f179550c;

    /* renamed from: d */
    public int f179551d;

    /* renamed from: e */
    public String f179552e = BuildConfig.FLAVOR;

    static {
        C66022j jVar = new C66022j();
        f179546f = jVar;
        C62942bv.registerDefaultInstance(C66022j.class, jVar);
    }

    private C66022j() {
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
                return newMessageInfo(f179546f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004ဈ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C66022j();
            case 4:
                return new C66021i();
            case 5:
                return f179546f;
            case 6:
                C63010eb ebVar = f179547g;
                if (ebVar == null) {
                    synchronized (C66022j.class) {
                        ebVar = f179547g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179546f);
                            f179547g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
