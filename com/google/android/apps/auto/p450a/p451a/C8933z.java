package com.google.android.apps.auto.p450a.p451a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.auto.a.a.z */
/* compiled from: PG */
public final class C8933z extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C8933z f30971e;

    /* renamed from: f */
    private static volatile C63010eb f30972f;

    /* renamed from: a */
    public int f30973a;

    /* renamed from: b */
    public String f30974b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f30975c;

    /* renamed from: d */
    public boolean f30976d;

    static {
        C8933z zVar = new C8933z();
        f30971e = zVar;
        C62942bv.registerDefaultInstance(C8933z.class, zVar);
    }

    private C8933z() {
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
                return newMessageInfo(f30971e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004ဇ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C8933z();
            case 4:
                return new C8932y();
            case 5:
                return f30971e;
            case 6:
                C63010eb ebVar = f30972f;
                if (ebVar == null) {
                    synchronized (C8933z.class) {
                        ebVar = f30972f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30971e);
                            f30972f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
