package com.google.android.apps.p489g.p494d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.g.d.d */
/* compiled from: PG */
public final class C9218d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C9218d f31864e;

    /* renamed from: g */
    private static volatile C63010eb f31865g;

    /* renamed from: a */
    public int f31866a;

    /* renamed from: b */
    public String f31867b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C9141ad f31868c;

    /* renamed from: d */
    public boolean f31869d;

    /* renamed from: f */
    private byte f31870f = 2;

    static {
        C9218d dVar = new C9218d();
        f31864e = dVar;
        C62942bv.registerDefaultInstance(C9218d.class, dVar);
    }

    private C9218d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f31870f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f31870f = b;
                return null;
            case 2:
                return newMessageInfo(f31864e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C9218d();
            case 4:
                return new C9191c();
            case 5:
                return f31864e;
            case 6:
                C63010eb ebVar = f31865g;
                if (ebVar == null) {
                    synchronized (C9218d.class) {
                        ebVar = f31865g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31864e);
                            f31865g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
