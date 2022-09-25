package com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.ondevice.f.a.a.t */
/* compiled from: PG */
public final class C24465t extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C24465t f66964f;

    /* renamed from: g */
    private static volatile C63010eb f66965g;

    /* renamed from: a */
    public int f66966a;

    /* renamed from: b */
    public String f66967b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f66968c;

    /* renamed from: d */
    public String f66969d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f66970e = BuildConfig.FLAVOR;

    static {
        C24465t tVar = new C24465t();
        f66964f = tVar;
        C62942bv.registerDefaultInstance(C24465t.class, tVar);
    }

    private C24465t() {
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
                return newMessageInfo(f66964f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C24465t();
            case 4:
                return new C24464s();
            case 5:
                return f66964f;
            case 6:
                C63010eb ebVar = f66965g;
                if (ebVar == null) {
                    synchronized (C24465t.class) {
                        ebVar = f66965g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f66964f);
                            f66965g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
