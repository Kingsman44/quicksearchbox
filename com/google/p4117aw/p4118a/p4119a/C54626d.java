package com.google.p4117aw.p4118a.p4119a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.aw.a.a.d */
/* compiled from: PG */
public final class C54626d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C54626d f143428d;

    /* renamed from: e */
    private static volatile C63010eb f143429e;

    /* renamed from: a */
    public int f143430a;

    /* renamed from: b */
    public String f143431b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f143432c = BuildConfig.FLAVOR;

    static {
        C54626d dVar = new C54626d();
        f143428d = dVar;
        C62942bv.registerDefaultInstance(C54626d.class, dVar);
    }

    private C54626d() {
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
                return newMessageInfo(f143428d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C54626d();
            case 4:
                return new C54625c();
            case 5:
                return f143428d;
            case 6:
                C63010eb ebVar = f143429e;
                if (ebVar == null) {
                    synchronized (C54626d.class) {
                        ebVar = f143429e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143428d);
                            f143429e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
