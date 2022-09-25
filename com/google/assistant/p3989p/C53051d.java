package com.google.assistant.p3989p;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.p.d */
/* compiled from: PG */
public final class C53051d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C53051d f139040d;

    /* renamed from: e */
    private static volatile C63010eb f139041e;

    /* renamed from: a */
    public int f139042a;

    /* renamed from: b */
    public String f139043b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f139044c;

    static {
        C53051d dVar = new C53051d();
        f139040d = dVar;
        C62942bv.registerDefaultInstance(C53051d.class, dVar);
    }

    private C53051d() {
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
                return newMessageInfo(f139040d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C53050c.f139039a});
            case 3:
                return new C53051d();
            case 4:
                return new C53049b();
            case 5:
                return f139040d;
            case 6:
                C63010eb ebVar = f139041e;
                if (ebVar == null) {
                    synchronized (C53051d.class) {
                        ebVar = f139041e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139040d);
                            f139041e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
