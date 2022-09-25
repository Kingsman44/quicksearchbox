package com.google.protos.p4959be.p4960a.p4961a.p4962a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.be.a.a.a.bg */
/* compiled from: PG */
public final class C64473bg extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C64473bg f174875d;

    /* renamed from: e */
    private static volatile C63010eb f174876e;

    /* renamed from: a */
    public String f174877a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public boolean f174878b;

    /* renamed from: c */
    public boolean f174879c;

    static {
        C64473bg bgVar = new C64473bg();
        f174875d = bgVar;
        C62942bv.registerDefaultInstance(C64473bg.class, bgVar);
    }

    private C64473bg() {
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
                return newMessageInfo(f174875d, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001Ȉ\u0003\u0007\u0004\u0007", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C64473bg();
            case 4:
                return new C64472bf();
            case 5:
                return f174875d;
            case 6:
                C63010eb ebVar = f174876e;
                if (ebVar == null) {
                    synchronized (C64473bg.class) {
                        ebVar = f174876e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f174875d);
                            f174876e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
