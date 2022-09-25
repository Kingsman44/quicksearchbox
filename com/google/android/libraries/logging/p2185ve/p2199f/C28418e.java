package com.google.android.libraries.logging.p2185ve.p2199f;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.logging.ve.f.e */
/* compiled from: PG */
public final class C28418e extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C28418e f77183d;

    /* renamed from: e */
    private static volatile C63010eb f77184e;

    /* renamed from: a */
    public int f77185a;

    /* renamed from: b */
    public String f77186b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f77187c;

    static {
        C28418e eVar = new C28418e();
        f77183d = eVar;
        C62942bv.registerDefaultInstance(C28418e.class, eVar);
    }

    private C28418e() {
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
                return newMessageInfo(f77183d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C28418e();
            case 4:
                return new C28417d();
            case 5:
                return f77183d;
            case 6:
                C63010eb ebVar = f77184e;
                if (ebVar == null) {
                    synchronized (C28418e.class) {
                        ebVar = f77184e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f77183d);
                            f77184e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
