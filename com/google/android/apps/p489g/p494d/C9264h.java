package com.google.android.apps.p489g.p494d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.g.d.h */
/* compiled from: PG */
public final class C9264h extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C9264h f32054e;

    /* renamed from: f */
    private static volatile C63010eb f32055f;

    /* renamed from: a */
    public int f32056a;

    /* renamed from: b */
    public String f32057b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f32058c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f32059d = BuildConfig.FLAVOR;

    static {
        C9264h hVar = new C9264h();
        f32054e = hVar;
        C62942bv.registerDefaultInstance(C9264h.class, hVar);
    }

    private C9264h() {
        emptyProtobufList();
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
                return newMessageInfo(f32054e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C9264h();
            case 4:
                return new C9263g();
            case 5:
                return f32054e;
            case 6:
                C63010eb ebVar = f32055f;
                if (ebVar == null) {
                    synchronized (C9264h.class) {
                        ebVar = f32055f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f32054e);
                            f32055f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
