package com.google.android.apps.gsa.opa.smartspace.p6455d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.opa.smartspace.d.s */
/* compiled from: PG */
public final class C83776s extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C83776s f228333e;

    /* renamed from: f */
    private static volatile C63010eb f228334f;

    /* renamed from: a */
    public int f228335a;

    /* renamed from: b */
    public String f228336b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f228337c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f228338d = BuildConfig.FLAVOR;

    static {
        C83776s sVar = new C83776s();
        f228333e = sVar;
        C62942bv.registerDefaultInstance(C83776s.class, sVar);
    }

    private C83776s() {
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
                return newMessageInfo(f228333e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C83776s();
            case 4:
                return new C83775r();
            case 5:
                return f228333e;
            case 6:
                C63010eb ebVar = f228334f;
                if (ebVar == null) {
                    synchronized (C83776s.class) {
                        ebVar = f228334f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f228333e);
                            f228334f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
