package com.google.android.apps.gsa.sidekick.shared.p7254o;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.o.c */
/* compiled from: PG */
public final class C91879c extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C91879c f256200f;

    /* renamed from: g */
    private static volatile C63010eb f256201g;

    /* renamed from: a */
    public int f256202a;

    /* renamed from: b */
    public String f256203b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f256204c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f256205d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public long f256206e;

    static {
        C91879c cVar = new C91879c();
        f256200f = cVar;
        C62942bv.registerDefaultInstance(C91879c.class, cVar);
    }

    private C91879c() {
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
                return newMessageInfo(f256200f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C91879c();
            case 4:
                return new C91878b();
            case 5:
                return f256200f;
            case 6:
                C63010eb ebVar = f256201g;
                if (ebVar == null) {
                    synchronized (C91879c.class) {
                        ebVar = f256201g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f256200f);
                            f256201g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
