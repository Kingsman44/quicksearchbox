package com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9957d.p9959b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3886c.C50819dp;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.q.d.b.d */
/* compiled from: PG */
public final class C131214d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C131214d f358826e;

    /* renamed from: g */
    private static volatile C63010eb f358827g;

    /* renamed from: a */
    public int f358828a;

    /* renamed from: b */
    public C50819dp f358829b;

    /* renamed from: c */
    public int f358830c;

    /* renamed from: d */
    public String f358831d = BuildConfig.FLAVOR;

    /* renamed from: f */
    private byte f358832f = 2;

    static {
        C131214d dVar = new C131214d();
        f358826e = dVar;
        C62942bv.registerDefaultInstance(C131214d.class, dVar);
    }

    private C131214d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f358832f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f358832f = b;
                return null;
            case 2:
                return newMessageInfo(f358826e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0003ဌ\u0001\u0004ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, C131212b.f358825a, "d"});
            case 3:
                return new C131214d();
            case 4:
                return new C131211a();
            case 5:
                return f358826e;
            case 6:
                C63010eb ebVar = f358827g;
                if (ebVar == null) {
                    synchronized (C131214d.class) {
                        ebVar = f358827g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f358826e);
                            f358827g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
