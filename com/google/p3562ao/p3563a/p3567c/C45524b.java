package com.google.p3562ao.p3563a.p3567c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ao.a.c.b */
/* compiled from: PG */
public final class C45524b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C45524b f118989e;

    /* renamed from: f */
    private static volatile C63010eb f118990f;

    /* renamed from: a */
    public int f118991a;

    /* renamed from: b */
    public String f118992b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public long f118993c;

    /* renamed from: d */
    public long f118994d;

    static {
        C45524b bVar = new C45524b();
        f118989e = bVar;
        C62942bv.registerDefaultInstance(C45524b.class, bVar);
    }

    private C45524b() {
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
                return newMessageInfo(f118989e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C45524b();
            case 4:
                return new C45523a();
            case 5:
                return f118989e;
            case 6:
                C63010eb ebVar = f118990f;
                if (ebVar == null) {
                    synchronized (C45524b.class) {
                        ebVar = f118990f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f118989e);
                            f118990f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
