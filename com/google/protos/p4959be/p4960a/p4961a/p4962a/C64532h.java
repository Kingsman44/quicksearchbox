package com.google.protos.p4959be.p4960a.p4961a.p4962a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.be.a.a.a.h */
/* compiled from: PG */
public final class C64532h extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C64532h f175005g;

    /* renamed from: h */
    private static volatile C63010eb f175006h;

    /* renamed from: a */
    public String f175007a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public int f175008b;

    /* renamed from: c */
    public String f175009c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f175010d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f175011e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f175012f = BuildConfig.FLAVOR;

    static {
        C64532h hVar = new C64532h();
        f175005g = hVar;
        C62942bv.registerDefaultInstance(C64532h.class, hVar);
    }

    private C64532h() {
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
                return newMessageInfo(f175005g, "\u0000\u0006\u0000\u0000\u0001\u0007\u0006\u0000\u0000\u0000\u0001Ȉ\u0003\f\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C64532h();
            case 4:
                return new C64531g();
            case 5:
                return f175005g;
            case 6:
                C63010eb ebVar = f175006h;
                if (ebVar == null) {
                    synchronized (C64532h.class) {
                        ebVar = f175006h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175005g);
                            f175006h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
