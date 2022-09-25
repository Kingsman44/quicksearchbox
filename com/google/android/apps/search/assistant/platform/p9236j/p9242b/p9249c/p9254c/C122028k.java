package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9254c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.c.k */
/* compiled from: PG */
public final class C122028k extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C122028k f338568a;

    /* renamed from: b */
    private static volatile C63010eb f338569b;

    static {
        C122028k kVar = new C122028k();
        f338568a = kVar;
        C62942bv.registerDefaultInstance(C122028k.class, kVar);
    }

    private C122028k() {
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
                return newMessageInfo(f338568a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C122028k();
            case 4:
                return new C122027j();
            case 5:
                return f338568a;
            case 6:
                C63010eb ebVar = f338569b;
                if (ebVar == null) {
                    synchronized (C122028k.class) {
                        ebVar = f338569b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f338568a);
                            f338569b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
