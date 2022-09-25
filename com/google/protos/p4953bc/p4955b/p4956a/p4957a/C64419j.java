package com.google.protos.p4953bc.p4955b.p4956a.p4957a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.bc.b.a.a.j */
/* compiled from: PG */
public final class C64419j extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C64419j f174730e;

    /* renamed from: f */
    private static volatile C63010eb f174731f;

    /* renamed from: a */
    public int f174732a;

    /* renamed from: b */
    public String f174733b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f174734c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f174735d = BuildConfig.FLAVOR;

    static {
        C64419j jVar = new C64419j();
        f174730e = jVar;
        C62942bv.registerDefaultInstance(C64419j.class, jVar);
    }

    private C64419j() {
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
                return newMessageInfo(f174730e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0003\u0003ဈ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C64419j();
            case 4:
                return new C64418i();
            case 5:
                return f174730e;
            case 6:
                C63010eb ebVar = f174731f;
                if (ebVar == null) {
                    synchronized (C64419j.class) {
                        ebVar = f174731f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f174730e);
                            f174731f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
