package com.google.p4017at.p4060h.p4071c.p4072a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.at.h.c.a.d */
/* compiled from: PG */
public final class C54208d extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C54208d f142268f;

    /* renamed from: g */
    private static volatile C63010eb f142269g;

    /* renamed from: a */
    public int f142270a;

    /* renamed from: b */
    public C63088z f142271b = C63088z.f170246b;

    /* renamed from: c */
    public String f142272c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f142273d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f142274e = BuildConfig.FLAVOR;

    static {
        C54208d dVar = new C54208d();
        f142268f = dVar;
        C62942bv.registerDefaultInstance(C54208d.class, dVar);
    }

    private C54208d() {
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
                return newMessageInfo(f142268f, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0000\u0001ည\u0000\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဈ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C54208d();
            case 4:
                return new C54205a();
            case 5:
                return f142268f;
            case 6:
                C63010eb ebVar = f142269g;
                if (ebVar == null) {
                    synchronized (C54208d.class) {
                        ebVar = f142269g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142268f);
                            f142269g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
