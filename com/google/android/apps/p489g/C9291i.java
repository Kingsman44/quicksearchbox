package com.google.android.apps.p489g;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.g.i */
/* compiled from: PG */
public final class C9291i extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C9291i f32254d;

    /* renamed from: e */
    private static volatile C63010eb f32255e;

    /* renamed from: a */
    public int f32256a;

    /* renamed from: b */
    public String f32257b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f32258c;

    static {
        C9291i iVar = new C9291i();
        f32254d = iVar;
        C62942bv.registerDefaultInstance(C9291i.class, iVar);
    }

    private C9291i() {
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
                return newMessageInfo(f32254d, "\u0001\u0002\u0000\u0001\u0005\u0007\u0002\u0000\u0000\u0000\u0005ဈ\u0000\u0007င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C9291i();
            case 4:
                return new C9290h();
            case 5:
                return f32254d;
            case 6:
                C63010eb ebVar = f32255e;
                if (ebVar == null) {
                    synchronized (C9291i.class) {
                        ebVar = f32255e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f32254d);
                            f32255e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
