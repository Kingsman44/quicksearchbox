package com.google.android.libraries.search.assistant.p2786t.p2798c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63070h;

/* renamed from: com.google.android.libraries.search.assistant.t.c.k */
/* compiled from: PG */
public final class C36608k extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C36608k f95440d;

    /* renamed from: e */
    private static volatile C63010eb f95441e;

    /* renamed from: a */
    public int f95442a;

    /* renamed from: b */
    public int f95443b;

    /* renamed from: c */
    public C63070h f95444c;

    static {
        C36608k kVar = new C36608k();
        f95440d = kVar;
        C62942bv.registerDefaultInstance(C36608k.class, kVar);
    }

    private C36608k() {
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
                return newMessageInfo(f95440d, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002\t", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C36608k();
            case 4:
                return new C36607j();
            case 5:
                return f95440d;
            case 6:
                C63010eb ebVar = f95441e;
                if (ebVar == null) {
                    synchronized (C36608k.class) {
                        ebVar = f95441e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f95440d);
                            f95441e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
