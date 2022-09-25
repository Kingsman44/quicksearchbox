package com.google.common.p4552o.p4566l;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.l.d */
/* compiled from: PG */
public final class C60189d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C60189d f162816d;

    /* renamed from: e */
    private static volatile C63010eb f162817e;

    /* renamed from: a */
    public int f162818a;

    /* renamed from: b */
    public String f162819b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f162820c = BuildConfig.FLAVOR;

    static {
        C60189d dVar = new C60189d();
        f162816d = dVar;
        C62942bv.registerDefaultInstance(C60189d.class, dVar);
    }

    private C60189d() {
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
                return newMessageInfo(f162816d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C60189d();
            case 4:
                return new C60162c();
            case 5:
                return f162816d;
            case 6:
                C63010eb ebVar = f162817e;
                if (ebVar == null) {
                    synchronized (C60189d.class) {
                        ebVar = f162817e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162816d);
                            f162817e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
