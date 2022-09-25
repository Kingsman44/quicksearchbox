package com.google.assistant.p3994s.p3995a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.ij */
/* compiled from: PG */
public final class C53289ij extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C53289ij f139707e;

    /* renamed from: f */
    private static volatile C63010eb f139708f;

    /* renamed from: a */
    public int f139709a;

    /* renamed from: b */
    public String f139710b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f139711c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f139712d = BuildConfig.FLAVOR;

    static {
        C53289ij ijVar = new C53289ij();
        f139707e = ijVar;
        C62942bv.registerDefaultInstance(C53289ij.class, ijVar);
    }

    private C53289ij() {
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
                return newMessageInfo(f139707e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C53289ij();
            case 4:
                return new C53288ii();
            case 5:
                return f139707e;
            case 6:
                C63010eb ebVar = f139708f;
                if (ebVar == null) {
                    synchronized (C53289ij.class) {
                        ebVar = f139708f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139707e);
                            f139708f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
