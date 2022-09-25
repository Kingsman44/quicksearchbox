package com.google.android.apps.auto.p450a.p451a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.android.apps.auto.a.a.f */
/* compiled from: PG */
public final class C8913f extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C8913f f30923e;

    /* renamed from: f */
    private static volatile C63010eb f30924f;

    /* renamed from: a */
    public int f30925a;

    /* renamed from: b */
    public C63042fg f30926b;

    /* renamed from: c */
    public String f30927c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f30928d = BuildConfig.FLAVOR;

    static {
        C8913f fVar = new C8913f();
        f30923e = fVar;
        C62942bv.registerDefaultInstance(C8913f.class, fVar);
    }

    private C8913f() {
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
                return newMessageInfo(f30923e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဉ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C8913f();
            case 4:
                return new C8912e();
            case 5:
                return f30923e;
            case 6:
                C63010eb ebVar = f30924f;
                if (ebVar == null) {
                    synchronized (C8913f.class) {
                        ebVar = f30924f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30923e);
                            f30924f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
