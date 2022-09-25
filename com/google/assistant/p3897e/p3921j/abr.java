package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.abr */
/* compiled from: PG */
public final class abr extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final abr f134750d;

    /* renamed from: f */
    private static volatile C63010eb f134751f;

    /* renamed from: a */
    public String f134752a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public long f134753b;

    /* renamed from: c */
    public String f134754c = BuildConfig.FLAVOR;

    /* renamed from: e */
    private int f134755e;

    static {
        abr abr = new abr();
        f134750d = abr;
        C62942bv.registerDefaultInstance(abr.class, abr);
    }

    private abr() {
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
                return newMessageInfo(f134750d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဂ\u0001\u0004ဈ\u0002", new Object[]{"e", "a", "b", C45240c.f118157a});
            case 3:
                return new abr();
            case 4:
                return new abq();
            case 5:
                return f134750d;
            case 6:
                C63010eb ebVar = f134751f;
                if (ebVar == null) {
                    synchronized (abr.class) {
                        ebVar = f134751f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134750d);
                            f134751f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
