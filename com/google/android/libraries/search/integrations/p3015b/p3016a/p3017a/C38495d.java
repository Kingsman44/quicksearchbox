package com.google.android.libraries.search.integrations.p3015b.p3016a.p3017a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.search.integrations.b.a.a.d */
/* compiled from: PG */
public final class C38495d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C38495d f101847e;

    /* renamed from: f */
    private static volatile C63010eb f101848f;

    /* renamed from: a */
    public int f101849a;

    /* renamed from: b */
    public C63088z f101850b = C63088z.f170246b;

    /* renamed from: c */
    public String f101851c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C63042fg f101852d;

    static {
        C38495d dVar = new C38495d();
        f101847e = dVar;
        C62942bv.registerDefaultInstance(C38495d.class, dVar);
    }

    private C38495d() {
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
                return newMessageInfo(f101847e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C38495d();
            case 4:
                return new C38494c();
            case 5:
                return f101847e;
            case 6:
                C63010eb ebVar = f101848f;
                if (ebVar == null) {
                    synchronized (C38495d.class) {
                        ebVar = f101848f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f101847e);
                            f101848f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
