package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.ro */
/* compiled from: PG */
public final class C88165ro extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C88165ro f238333f;

    /* renamed from: g */
    private static volatile C63010eb f238334g;

    /* renamed from: a */
    public int f238335a;

    /* renamed from: b */
    public String f238336b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f238337c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f238338d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f238339e = BuildConfig.FLAVOR;

    static {
        C88165ro roVar = new C88165ro();
        f238333f = roVar;
        C62942bv.registerDefaultInstance(C88165ro.class, roVar);
    }

    private C88165ro() {
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
                return newMessageInfo(f238333f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C88165ro();
            case 4:
                return new C88164rn();
            case 5:
                return f238333f;
            case 6:
                C63010eb ebVar = f238334g;
                if (ebVar == null) {
                    synchronized (C88165ro.class) {
                        ebVar = f238334g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238333f);
                            f238334g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
