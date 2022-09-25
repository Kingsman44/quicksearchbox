package com.google.android.apps.p489g.p494d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.g.d.bg */
/* compiled from: PG */
public final class C9171bg extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C9171bg f31674e;

    /* renamed from: f */
    private static volatile C63010eb f31675f;

    /* renamed from: a */
    public int f31676a;

    /* renamed from: b */
    public String f31677b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f31678c;

    /* renamed from: d */
    public boolean f31679d;

    static {
        C9171bg bgVar = new C9171bg();
        f31674e = bgVar;
        C62942bv.registerDefaultInstance(C9171bg.class, bgVar);
    }

    private C9171bg() {
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
                return newMessageInfo(f31674e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C9171bg();
            case 4:
                return new C9170bf();
            case 5:
                return f31674e;
            case 6:
                C63010eb ebVar = f31675f;
                if (ebVar == null) {
                    synchronized (C9171bg.class) {
                        ebVar = f31675f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31674e);
                            f31675f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
