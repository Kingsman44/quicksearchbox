package com.google.protos.p4959be.p4960a.p4961a.p4962a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.be.a.a.a.cv */
/* compiled from: PG */
public final class C64515cv extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C64515cv f174968f;

    /* renamed from: g */
    private static volatile C63010eb f174969g;

    /* renamed from: a */
    public C64505cl f174970a;

    /* renamed from: b */
    public C64480bn f174971b;

    /* renamed from: c */
    public String f174972c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C62961ch f174973d = emptyIntList();

    /* renamed from: e */
    public String f174974e = BuildConfig.FLAVOR;

    static {
        C64515cv cvVar = new C64515cv();
        f174968f = cvVar;
        C62942bv.registerDefaultInstance(C64515cv.class, cvVar);
    }

    private C64515cv() {
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
                return newMessageInfo(f174968f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\t\u0002\t\u0003Ȉ\u0004,\u0005Ȉ", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C64515cv();
            case 4:
                return new C64514cu();
            case 5:
                return f174968f;
            case 6:
                C63010eb ebVar = f174969g;
                if (ebVar == null) {
                    synchronized (C64515cv.class) {
                        ebVar = f174969g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f174968f);
                            f174969g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
