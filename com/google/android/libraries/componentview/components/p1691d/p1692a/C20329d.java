package com.google.android.libraries.componentview.components.p1691d.p1692a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.componentview.components.d.a.d */
/* compiled from: PG */
public final class C20329d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C20329d f57130d;

    /* renamed from: e */
    private static volatile C63010eb f57131e;

    /* renamed from: a */
    public int f57132a;

    /* renamed from: b */
    public String f57133b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f57134c;

    static {
        C20329d dVar = new C20329d();
        f57130d = dVar;
        C62942bv.registerDefaultInstance(C20329d.class, dVar);
    }

    private C20329d() {
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
                return newMessageInfo(f57130d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C20329d();
            case 4:
                return new C20328c();
            case 5:
                return f57130d;
            case 6:
                C63010eb ebVar = f57131e;
                if (ebVar == null) {
                    synchronized (C20329d.class) {
                        ebVar = f57131e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f57130d);
                            f57131e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
