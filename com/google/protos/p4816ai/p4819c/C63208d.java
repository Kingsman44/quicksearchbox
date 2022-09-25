package com.google.protos.p4816ai.p4819c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ai.c.d */
/* compiled from: PG */
public final class C63208d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C63208d f170771e;

    /* renamed from: f */
    private static volatile C63010eb f170772f;

    /* renamed from: a */
    public int f170773a;

    /* renamed from: b */
    public String f170774b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f170775c;

    /* renamed from: d */
    public long f170776d;

    static {
        C63208d dVar = new C63208d();
        f170771e = dVar;
        C62942bv.registerDefaultInstance(C63208d.class, dVar);
    }

    private C63208d() {
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
                return newMessageInfo(f170771e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003စ\u0002", new Object[]{"a", "b", C45240c.f118157a, C63207c.m96206b(), "d"});
            case 3:
                return new C63208d();
            case 4:
                return new C63205a();
            case 5:
                return f170771e;
            case 6:
                C63010eb ebVar = f170772f;
                if (ebVar == null) {
                    synchronized (C63208d.class) {
                        ebVar = f170772f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f170771e);
                            f170772f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
