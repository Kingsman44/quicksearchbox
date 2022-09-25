package com.google.p4160bf.p4161a.p4163b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.a.b.h */
/* compiled from: PG */
public final class C55500h extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C55500h f146453e;

    /* renamed from: f */
    private static volatile C63010eb f146454f;

    /* renamed from: a */
    public int f146455a;

    /* renamed from: b */
    public String f146456b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f146457c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f146458d;

    static {
        C55500h hVar = new C55500h();
        f146453e = hVar;
        C62942bv.registerDefaultInstance(C55500h.class, hVar);
    }

    private C55500h() {
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
                return newMessageInfo(f146453e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d", C55499g.f146452a});
            case 3:
                return new C55500h();
            case 4:
                return new C55498f();
            case 5:
                return f146453e;
            case 6:
                C63010eb ebVar = f146454f;
                if (ebVar == null) {
                    synchronized (C55500h.class) {
                        ebVar = f146454f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146453e);
                            f146454f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
