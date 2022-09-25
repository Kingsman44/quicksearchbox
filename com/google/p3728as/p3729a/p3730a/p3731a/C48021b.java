package com.google.p3728as.p3729a.p3730a.p3731a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.as.a.a.a.b */
/* compiled from: PG */
public final class C48021b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C48021b f124266d;

    /* renamed from: e */
    private static volatile C63010eb f124267e;

    /* renamed from: a */
    public String f124268a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public long f124269b;

    /* renamed from: c */
    public long f124270c;

    static {
        C48021b bVar = new C48021b();
        f124266d = bVar;
        C62942bv.registerDefaultInstance(C48021b.class, bVar);
    }

    private C48021b() {
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
                return newMessageInfo(f124266d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0002", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C48021b();
            case 4:
                return new C48020a();
            case 5:
                return f124266d;
            case 6:
                C63010eb ebVar = f124267e;
                if (ebVar == null) {
                    synchronized (C48021b.class) {
                        ebVar = f124267e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124266d);
                            f124267e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
