package com.google.p395al.p408c.p414c.p416b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.al.c.c.b.aa */
/* compiled from: PG */
public final class C8458aa extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C8458aa f29373e;

    /* renamed from: f */
    private static volatile C63010eb f29374f;

    /* renamed from: a */
    public int f29375a;

    /* renamed from: b */
    public String f29376b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C8466ai f29377c;

    /* renamed from: d */
    public C8482ay f29378d;

    static {
        C8458aa aaVar = new C8458aa();
        f29373e = aaVar;
        C62942bv.registerDefaultInstance(C8458aa.class, aaVar);
    }

    private C8458aa() {
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
                return newMessageInfo(f29373e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C8458aa();
            case 4:
                return new C8516z();
            case 5:
                return f29373e;
            case 6:
                C63010eb ebVar = f29374f;
                if (ebVar == null) {
                    synchronized (C8458aa.class) {
                        ebVar = f29374f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29373e);
                            f29374f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
