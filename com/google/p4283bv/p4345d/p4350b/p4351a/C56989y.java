package com.google.p4283bv.p4345d.p4350b.p4351a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.d.b.a.y */
/* compiled from: PG */
public final class C56989y extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C56989y f152126d;

    /* renamed from: e */
    private static volatile C63010eb f152127e;

    /* renamed from: a */
    public int f152128a;

    /* renamed from: b */
    public String f152129b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f152130c = BuildConfig.FLAVOR;

    static {
        C56989y yVar = new C56989y();
        f152126d = yVar;
        C62942bv.registerDefaultInstance(C56989y.class, yVar);
    }

    private C56989y() {
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
                return newMessageInfo(f152126d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C56989y();
            case 4:
                return new C56988x();
            case 5:
                return f152126d;
            case 6:
                C63010eb ebVar = f152127e;
                if (ebVar == null) {
                    synchronized (C56989y.class) {
                        ebVar = f152127e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152126d);
                            f152127e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
