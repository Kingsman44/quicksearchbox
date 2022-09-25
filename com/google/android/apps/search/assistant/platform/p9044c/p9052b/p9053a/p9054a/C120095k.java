package com.google.android.apps.search.assistant.platform.p9044c.p9052b.p9053a.p9054a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.c.b.a.a.k */
/* compiled from: PG */
public final class C120095k extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C120095k f334312b;

    /* renamed from: c */
    private static volatile C63010eb f334313c;

    /* renamed from: a */
    public int f334314a;

    static {
        C120095k kVar = new C120095k();
        f334312b = kVar;
        C62942bv.registerDefaultInstance(C120095k.class, kVar);
    }

    private C120095k() {
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
                return newMessageInfo(f334312b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
            case 3:
                return new C120095k();
            case 4:
                return new C120094j();
            case 5:
                return f334312b;
            case 6:
                C63010eb ebVar = f334313c;
                if (ebVar == null) {
                    synchronized (C120095k.class) {
                        ebVar = f334313c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f334312b);
                            f334313c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
