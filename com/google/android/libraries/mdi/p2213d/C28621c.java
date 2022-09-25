package com.google.android.libraries.mdi.p2213d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.mdi.d.c */
/* compiled from: PG */
public final class C28621c extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C28621c f77844e;

    /* renamed from: f */
    private static volatile C63010eb f77845f;

    /* renamed from: a */
    public int f77846a;

    /* renamed from: b */
    public int f77847b;

    /* renamed from: c */
    public String f77848c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f77849d = BuildConfig.FLAVOR;

    static {
        C28621c cVar = new C28621c();
        f77844e = cVar;
        C62942bv.registerDefaultInstance(C28621c.class, cVar);
    }

    private C28621c() {
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
                return newMessageInfo(f77844e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဈ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C28621c();
            case 4:
                return new C28619b();
            case 5:
                return f77844e;
            case 6:
                C63010eb ebVar = f77845f;
                if (ebVar == null) {
                    synchronized (C28621c.class) {
                        ebVar = f77845f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f77844e);
                            f77845f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
