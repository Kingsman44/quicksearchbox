package com.google.p4017at.p4060h.p4061a.p4062a.p4066d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.h.a.a.d.k */
/* compiled from: PG */
public final class C54159k extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C54159k f142128f;

    /* renamed from: g */
    private static volatile C63010eb f142129g;

    /* renamed from: a */
    public int f142130a;

    /* renamed from: b */
    public String f142131b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f142132c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f142133d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public boolean f142134e;

    static {
        C54159k kVar = new C54159k();
        f142128f = kVar;
        C62942bv.registerDefaultInstance(C54159k.class, kVar);
    }

    private C54159k() {
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
                return newMessageInfo(f142128f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0005ဇ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C54159k();
            case 4:
                return new C54158j();
            case 5:
                return f142128f;
            case 6:
                C63010eb ebVar = f142129g;
                if (ebVar == null) {
                    synchronized (C54159k.class) {
                        ebVar = f142129g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142128f);
                            f142129g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
