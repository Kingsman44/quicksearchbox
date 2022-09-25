package com.google.p427am.p438d.p439a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.am.d.a.cj */
/* compiled from: PG */
public final class C8763cj extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C8763cj f30119d;

    /* renamed from: e */
    private static volatile C63010eb f30120e;

    /* renamed from: a */
    public String f30121a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public int f30122b;

    /* renamed from: c */
    public int f30123c;

    static {
        C8763cj cjVar = new C8763cj();
        f30119d = cjVar;
        C62942bv.registerDefaultInstance(C8763cj.class, cjVar);
    }

    private C8763cj() {
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
                return newMessageInfo(f30119d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\u0004", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C8763cj();
            case 4:
                return new C8762ci();
            case 5:
                return f30119d;
            case 6:
                C63010eb ebVar = f30120e;
                if (ebVar == null) {
                    synchronized (C8763cj.class) {
                        ebVar = f30120e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30119d);
                            f30120e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
