package com.google.p4281bu.p4282a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bu.a.w */
/* compiled from: PG */
public final class C56597w extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C56597w f151104d;

    /* renamed from: e */
    private static volatile C63010eb f151105e;

    /* renamed from: a */
    public C56593s f151106a;

    /* renamed from: b */
    public C56596v f151107b;

    /* renamed from: c */
    public C62910ar f151108c;

    static {
        C56597w wVar = new C56597w();
        f151104d = wVar;
        C62942bv.registerDefaultInstance(C56597w.class, wVar);
    }

    private C56597w() {
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
                return newMessageInfo(f151104d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C56597w();
            case 4:
                return new C56594t();
            case 5:
                return f151104d;
            case 6:
                C63010eb ebVar = f151105e;
                if (ebVar == null) {
                    synchronized (C56597w.class) {
                        ebVar = f151105e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151104d);
                            f151105e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
