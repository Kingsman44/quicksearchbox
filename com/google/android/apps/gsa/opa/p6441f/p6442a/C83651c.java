package com.google.android.apps.gsa.opa.p6441f.p6442a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.opa.f.a.c */
/* compiled from: PG */
public final class C83651c extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C83651c f228021d;

    /* renamed from: e */
    private static volatile C63010eb f228022e;

    /* renamed from: a */
    public int f228023a;

    /* renamed from: b */
    public long f228024b;

    /* renamed from: c */
    public String f228025c = BuildConfig.FLAVOR;

    static {
        C83651c cVar = new C83651c();
        f228021d = cVar;
        C62942bv.registerDefaultInstance(C83651c.class, cVar);
    }

    private C83651c() {
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
                return newMessageInfo(f228021d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C83651c();
            case 4:
                return new C83638b();
            case 5:
                return f228021d;
            case 6:
                C63010eb ebVar = f228022e;
                if (ebVar == null) {
                    synchronized (C83651c.class) {
                        ebVar = f228022e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f228021d);
                            f228022e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
