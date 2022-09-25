package com.google.assistant.p3781ad.p3789d.p3791b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.p1594s.p1597b.C19141ab;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.b.au */
/* compiled from: PG */
public final class C48686au extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C48686au f125957d;

    /* renamed from: e */
    private static volatile C63010eb f125958e;

    /* renamed from: a */
    public int f125959a;

    /* renamed from: b */
    public C19141ab f125960b;

    /* renamed from: c */
    public String f125961c = BuildConfig.FLAVOR;

    static {
        C48686au auVar = new C48686au();
        f125957d = auVar;
        C62942bv.registerDefaultInstance(C48686au.class, auVar);
    }

    private C48686au() {
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
                return newMessageInfo(f125957d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C48686au();
            case 4:
                return new C48685at();
            case 5:
                return f125957d;
            case 6:
                C63010eb ebVar = f125958e;
                if (ebVar == null) {
                    synchronized (C48686au.class) {
                        ebVar = f125958e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125957d);
                            f125958e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
