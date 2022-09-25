package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.ap */
/* compiled from: PG */
public final class C59589ap extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C59589ap f159543d;

    /* renamed from: e */
    private static volatile C63010eb f159544e;

    /* renamed from: a */
    public int f159545a;

    /* renamed from: b */
    public String f159546b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f159547c;

    static {
        C59589ap apVar = new C59589ap();
        f159543d = apVar;
        C62942bv.registerDefaultInstance(C59589ap.class, apVar);
    }

    private C59589ap() {
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
                return newMessageInfo(f159543d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C59589ap();
            case 4:
                return new C59588ao();
            case 5:
                return f159543d;
            case 6:
                C63010eb ebVar = f159544e;
                if (ebVar == null) {
                    synchronized (C59589ap.class) {
                        ebVar = f159544e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159543d);
                            f159544e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
