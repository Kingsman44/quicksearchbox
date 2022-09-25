package com.google.protos.p4895aw.p4902b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aw.b.ar */
/* compiled from: PG */
public final class C63981ar extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C63981ar f173032e;

    /* renamed from: f */
    private static volatile C63010eb f173033f;

    /* renamed from: a */
    public int f173034a;

    /* renamed from: b */
    public String f173035b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public long f173036c;

    /* renamed from: d */
    public long f173037d;

    static {
        C63981ar arVar = new C63981ar();
        f173032e = arVar;
        C62942bv.registerDefaultInstance(C63981ar.class, arVar);
    }

    private C63981ar() {
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
                return newMessageInfo(f173032e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C63981ar();
            case 4:
                return new C63980aq();
            case 5:
                return f173032e;
            case 6:
                C63010eb ebVar = f173033f;
                if (ebVar == null) {
                    synchronized (C63981ar.class) {
                        ebVar = f173033f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173032e);
                            f173033f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
