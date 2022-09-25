package com.google.protos.p5146w.p5149b.p5157c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.w.b.c.j */
/* compiled from: PG */
public final class C65960j extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C65960j f179410f;

    /* renamed from: g */
    private static volatile C63010eb f179411g;

    /* renamed from: a */
    public int f179412a;

    /* renamed from: b */
    public C65958h f179413b;

    /* renamed from: c */
    public C65956f f179414c;

    /* renamed from: d */
    public C65962l f179415d;

    /* renamed from: e */
    public String f179416e = BuildConfig.FLAVOR;

    static {
        C65960j jVar = new C65960j();
        f179410f = jVar;
        C62942bv.registerDefaultInstance(C65960j.class, jVar);
    }

    private C65960j() {
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
                return newMessageInfo(f179410f, "\u0001\u0004\u0000\u0001\u0001\t\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\bဈ\r\tဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "e", "d"});
            case 3:
                return new C65960j();
            case 4:
                return new C65959i();
            case 5:
                return f179410f;
            case 6:
                C63010eb ebVar = f179411g;
                if (ebVar == null) {
                    synchronized (C65960j.class) {
                        ebVar = f179411g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179410f);
                            f179411g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
