package com.google.android.apps.p471d.p482b.p483a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.d.b.a.g */
/* compiled from: PG */
public final class C9046g extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C9046g f31252e;

    /* renamed from: f */
    private static volatile C63010eb f31253f;

    /* renamed from: a */
    public int f31254a;

    /* renamed from: b */
    public C9044e f31255b;

    /* renamed from: c */
    public String f31256c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public boolean f31257d;

    static {
        C9046g gVar = new C9046g();
        f31252e = gVar;
        C62942bv.registerDefaultInstance(C9046g.class, gVar);
    }

    private C9046g() {
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
                return newMessageInfo(f31252e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဈ\u0002\u0005ဇ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C9046g();
            case 4:
                return new C9045f();
            case 5:
                return f31252e;
            case 6:
                C63010eb ebVar = f31253f;
                if (ebVar == null) {
                    synchronized (C9046g.class) {
                        ebVar = f31253f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31252e);
                            f31253f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
