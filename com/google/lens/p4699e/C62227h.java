package com.google.lens.p4699e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.e.h */
/* compiled from: PG */
public final class C62227h extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C62227h f168014f;

    /* renamed from: g */
    private static volatile C63010eb f168015g;

    /* renamed from: a */
    public int f168016a;

    /* renamed from: b */
    public String f168017b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f168018c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f168019d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f168020e;

    static {
        C62227h hVar = new C62227h();
        f168014f = hVar;
        C62942bv.registerDefaultInstance(C62227h.class, hVar);
    }

    private C62227h() {
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
                return newMessageInfo(f168014f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C62187a.f167913a});
            case 3:
                return new C62227h();
            case 4:
                return new C62226g();
            case 5:
                return f168014f;
            case 6:
                C63010eb ebVar = f168015g;
                if (ebVar == null) {
                    synchronized (C62227h.class) {
                        ebVar = f168015g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168014f);
                            f168015g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
