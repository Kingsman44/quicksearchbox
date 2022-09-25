package com.google.android.libraries.logging.p2185ve.p2186a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.logging.ve.a.g */
/* compiled from: PG */
public final class C28303g extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C28303g f76984d;

    /* renamed from: e */
    private static volatile C63010eb f76985e;

    /* renamed from: a */
    public int f76986a;

    /* renamed from: b */
    public String f76987b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f76988c;

    static {
        C28303g gVar = new C28303g();
        f76984d = gVar;
        C62942bv.registerDefaultInstance(C28303g.class, gVar);
    }

    private C28303g() {
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
                return newMessageInfo(f76984d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C28301e.f76983a});
            case 3:
                return new C28303g();
            case 4:
                return new C28300d();
            case 5:
                return f76984d;
            case 6:
                C63010eb ebVar = f76985e;
                if (ebVar == null) {
                    synchronized (C28303g.class) {
                        ebVar = f76985e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f76984d);
                            f76985e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
