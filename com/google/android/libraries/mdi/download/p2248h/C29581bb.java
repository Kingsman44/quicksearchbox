package com.google.android.libraries.mdi.download.p2248h;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.mdi.download.h.bb */
/* compiled from: PG */
public final class C29581bb extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C29581bb f80146e;

    /* renamed from: f */
    private static volatile C63010eb f80147f;

    /* renamed from: a */
    public int f80148a;

    /* renamed from: b */
    public String f80149b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f80150c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f80151d;

    static {
        C29581bb bbVar = new C29581bb();
        f80146e = bbVar;
        C62942bv.registerDefaultInstance(C29581bb.class, bbVar);
    }

    private C29581bb() {
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
                return newMessageInfo(f80146e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0001\u0002ဌ\u0002\u0003ဈ\u0000", new Object[]{"a", C45240c.f118157a, "d", C29516az.f79992a, "b"});
            case 3:
                return new C29581bb();
            case 4:
                return new C29515ay();
            case 5:
                return f80146e;
            case 6:
                C63010eb ebVar = f80147f;
                if (ebVar == null) {
                    synchronized (C29581bb.class) {
                        ebVar = f80147f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f80146e);
                            f80147f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
