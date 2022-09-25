package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.afn */
/* compiled from: PG */
public final class afn extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final afn f158552e;

    /* renamed from: f */
    private static volatile C63010eb f158553f;

    /* renamed from: a */
    public int f158554a;

    /* renamed from: b */
    public String f158555b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f158556c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f158557d = BuildConfig.FLAVOR;

    static {
        afn afn = new afn();
        f158552e = afn;
        C62942bv.registerDefaultInstance(afn.class, afn);
    }

    private afn() {
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
                return newMessageInfo(f158552e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new afn();
            case 4:
                return new afm();
            case 5:
                return f158552e;
            case 6:
                C63010eb ebVar = f158553f;
                if (ebVar == null) {
                    synchronized (afn.class) {
                        ebVar = f158553f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158552e);
                            f158553f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
