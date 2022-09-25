package com.google.lens.p4701g;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.g.df */
/* compiled from: PG */
public final class C62337df extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C62337df f168289d;

    /* renamed from: e */
    private static volatile C63010eb f168290e;

    /* renamed from: a */
    public int f168291a;

    /* renamed from: b */
    public String f168292b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f168293c = BuildConfig.FLAVOR;

    static {
        C62337df dfVar = new C62337df();
        f168289d = dfVar;
        C62942bv.registerDefaultInstance(C62337df.class, dfVar);
    }

    private C62337df() {
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
                return newMessageInfo(f168289d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C62337df();
            case 4:
                return new C62336de();
            case 5:
                return f168289d;
            case 6:
                C63010eb ebVar = f168290e;
                if (ebVar == null) {
                    synchronized (C62337df.class) {
                        ebVar = f168290e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168289d);
                            f168290e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
