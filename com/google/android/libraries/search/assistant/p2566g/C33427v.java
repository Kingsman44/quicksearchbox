package com.google.android.libraries.search.assistant.p2566g;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.search.assistant.g.v */
/* compiled from: PG */
public final class C33427v extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C33427v f89523e;

    /* renamed from: f */
    private static volatile C63010eb f89524f;

    /* renamed from: a */
    public int f89525a;

    /* renamed from: b */
    public int f89526b;

    /* renamed from: c */
    public C63088z f89527c = C63088z.f170246b;

    /* renamed from: d */
    public String f89528d = BuildConfig.FLAVOR;

    static {
        C33427v vVar = new C33427v();
        f89523e = vVar;
        C62942bv.registerDefaultInstance(C33427v.class, vVar);
    }

    private C33427v() {
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
                return newMessageInfo(f89523e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ည\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C33425t.m62010b(), C45240c.f118157a, "d"});
            case 3:
                return new C33427v();
            case 4:
                return new C33426u();
            case 5:
                return f89523e;
            case 6:
                C63010eb ebVar = f89524f;
                if (ebVar == null) {
                    synchronized (C33427v.class) {
                        ebVar = f89524f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f89523e);
                            f89524f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
