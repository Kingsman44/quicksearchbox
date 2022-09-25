package com.google.common.p4552o.p4566l;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.l.ap */
/* compiled from: PG */
public final class C60124ap extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C60124ap f162605f;

    /* renamed from: g */
    private static volatile C63010eb f162606g;

    /* renamed from: a */
    public int f162607a;

    /* renamed from: b */
    public String f162608b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public long f162609c;

    /* renamed from: d */
    public long f162610d;

    /* renamed from: e */
    public int f162611e;

    static {
        C60124ap apVar = new C60124ap();
        f162605f = apVar;
        C62942bv.registerDefaultInstance(C60124ap.class, apVar);
    }

    private C60124ap() {
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
                return newMessageInfo(f162605f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004င\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C60124ap();
            case 4:
                return new C60123ao();
            case 5:
                return f162605f;
            case 6:
                C63010eb ebVar = f162606g;
                if (ebVar == null) {
                    synchronized (C60124ap.class) {
                        ebVar = f162606g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162605f);
                            f162606g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
