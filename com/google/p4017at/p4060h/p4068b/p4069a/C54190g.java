package com.google.p4017at.p4060h.p4068b.p4069a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.at.h.b.a.g */
/* compiled from: PG */
public final class C54190g extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C54190g f142215d;

    /* renamed from: f */
    private static volatile C63010eb f142216f;

    /* renamed from: a */
    public String f142217a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C63088z f142218b = C63088z.f170246b;

    /* renamed from: c */
    public boolean f142219c;

    /* renamed from: e */
    private int f142220e;

    static {
        C54190g gVar = new C54190g();
        f142215d = gVar;
        C62942bv.registerDefaultInstance(C54190g.class, gVar);
    }

    private C54190g() {
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
                return newMessageInfo(f142215d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဇ\u0002", new Object[]{"e", "a", "b", C45240c.f118157a});
            case 3:
                return new C54190g();
            case 4:
                return new C54189f();
            case 5:
                return f142215d;
            case 6:
                C63010eb ebVar = f142216f;
                if (ebVar == null) {
                    synchronized (C54190g.class) {
                        ebVar = f142216f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142215d);
                            f142216f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
