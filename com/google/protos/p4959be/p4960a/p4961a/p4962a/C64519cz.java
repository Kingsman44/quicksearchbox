package com.google.protos.p4959be.p4960a.p4961a.p4962a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.be.a.a.a.cz */
/* compiled from: PG */
public final class C64519cz extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C64519cz f174978d;

    /* renamed from: e */
    private static volatile C63010eb f174979e;

    /* renamed from: a */
    public int f174980a = 0;

    /* renamed from: b */
    public Object f174981b;

    /* renamed from: c */
    public String f174982c = BuildConfig.FLAVOR;

    static {
        C64519cz czVar = new C64519cz();
        f174978d = czVar;
        C62942bv.registerDefaultInstance(C64519cz.class, czVar);
    }

    private C64519cz() {
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
                return newMessageInfo(f174978d, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000", new Object[]{"b", "a", C45240c.f118157a, C64517cx.class});
            case 3:
                return new C64519cz();
            case 4:
                return new C64518cy();
            case 5:
                return f174978d;
            case 6:
                C63010eb ebVar = f174979e;
                if (ebVar == null) {
                    synchronized (C64519cz.class) {
                        ebVar = f174979e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f174978d);
                            f174979e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
