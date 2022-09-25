package com.google.p4152bb.p4153a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.gb */
/* compiled from: PG */
public final class C55106gb extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C55106gb f145002e;

    /* renamed from: f */
    private static volatile C63010eb f145003f;

    /* renamed from: a */
    public int f145004a;

    /* renamed from: b */
    public String f145005b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f145006c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f145007d = BuildConfig.FLAVOR;

    static {
        C55106gb gbVar = new C55106gb();
        f145002e = gbVar;
        C62942bv.registerDefaultInstance(C55106gb.class, gbVar);
    }

    private C55106gb() {
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
                return newMessageInfo(f145002e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C55106gb();
            case 4:
                return new C55105ga();
            case 5:
                return f145002e;
            case 6:
                C63010eb ebVar = f145003f;
                if (ebVar == null) {
                    synchronized (C55106gb.class) {
                        ebVar = f145003f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145002e);
                            f145003f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
