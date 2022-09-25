package com.google.android.apps.gsa.shared.p6984ai.p6985a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.shared.ai.a.l */
/* compiled from: PG */
public final class C89173l extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C89173l f241766d;

    /* renamed from: e */
    private static volatile C63010eb f241767e;

    /* renamed from: a */
    public int f241768a;

    /* renamed from: b */
    public String f241769b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f241770c = BuildConfig.FLAVOR;

    static {
        C89173l lVar = new C89173l();
        f241766d = lVar;
        C62942bv.registerDefaultInstance(C89173l.class, lVar);
    }

    private C89173l() {
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
                return newMessageInfo(f241766d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C89173l();
            case 4:
                return new C89172k();
            case 5:
                return f241766d;
            case 6:
                C63010eb ebVar = f241767e;
                if (ebVar == null) {
                    synchronized (C89173l.class) {
                        ebVar = f241767e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f241766d);
                            f241767e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
