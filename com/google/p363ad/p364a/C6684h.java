package com.google.p363ad.p364a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ad.a.h */
/* compiled from: PG */
public final class C6684h extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C6684h f19960e;

    /* renamed from: f */
    private static volatile C63010eb f19961f;

    /* renamed from: a */
    public int f19962a;

    /* renamed from: b */
    public String f19963b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C6694r f19964c;

    /* renamed from: d */
    public int f19965d;

    static {
        C6684h hVar = new C6684h();
        f19960e = hVar;
        C62942bv.registerDefaultInstance(C6684h.class, hVar);
    }

    private C6684h() {
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
                return newMessageInfo(f19960e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဋ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C6684h();
            case 4:
                return new C6683g();
            case 5:
                return f19960e;
            case 6:
                C63010eb ebVar = f19961f;
                if (ebVar == null) {
                    synchronized (C6684h.class) {
                        ebVar = f19961f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f19960e);
                            f19961f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
