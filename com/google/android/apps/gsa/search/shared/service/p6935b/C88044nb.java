package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.assistant.p3897e.p3910e.p3911a.C51195j;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.nb */
/* compiled from: PG */
public final class C88044nb extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C88044nb f238075c;

    /* renamed from: e */
    private static volatile C63010eb f238076e;

    /* renamed from: a */
    public int f238077a;

    /* renamed from: b */
    public C51195j f238078b;

    /* renamed from: d */
    private byte f238079d = 2;

    static {
        C88044nb nbVar = new C88044nb();
        f238075c = nbVar;
        C62942bv.registerDefaultInstance(C88044nb.class, nbVar);
    }

    private C88044nb() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f238079d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f238079d = b;
                return null;
            case 2:
                return newMessageInfo(f238075c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C88044nb();
            case 4:
                return new C88043na();
            case 5:
                return f238075c;
            case 6:
                C63010eb ebVar = f238076e;
                if (ebVar == null) {
                    synchronized (C88044nb.class) {
                        ebVar = f238076e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238075c);
                            f238076e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
