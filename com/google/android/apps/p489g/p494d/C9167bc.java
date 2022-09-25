package com.google.android.apps.p489g.p494d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.g.d.bc */
/* compiled from: PG */
public final class C9167bc extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C9167bc f31658e;

    /* renamed from: f */
    private static volatile C63010eb f31659f;

    /* renamed from: a */
    public int f31660a;

    /* renamed from: b */
    public String f31661b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f31662c;

    /* renamed from: d */
    public int f31663d;

    static {
        C9167bc bcVar = new C9167bc();
        f31658e = bcVar;
        C62942bv.registerDefaultInstance(C9167bc.class, bcVar);
    }

    private C9167bc() {
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
                return newMessageInfo(f31658e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C9167bc();
            case 4:
                return new C9166bb();
            case 5:
                return f31658e;
            case 6:
                C63010eb ebVar = f31659f;
                if (ebVar == null) {
                    synchronized (C9167bc.class) {
                        ebVar = f31659f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31658e);
                            f31659f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
