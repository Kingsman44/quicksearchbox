package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.assistant.p3897e.p3910e.p3911a.C51195j;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.wa */
/* compiled from: PG */
public final class C88286wa extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C88286wa f238774c;

    /* renamed from: e */
    private static volatile C63010eb f238775e;

    /* renamed from: a */
    public int f238776a;

    /* renamed from: b */
    public C51195j f238777b;

    /* renamed from: d */
    private byte f238778d = 2;

    static {
        C88286wa waVar = new C88286wa();
        f238774c = waVar;
        C62942bv.registerDefaultInstance(C88286wa.class, waVar);
    }

    private C88286wa() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f238778d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f238778d = b;
                return null;
            case 2:
                return newMessageInfo(f238774c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C88286wa();
            case 4:
                return new C88284vz();
            case 5:
                return f238774c;
            case 6:
                C63010eb ebVar = f238775e;
                if (ebVar == null) {
                    synchronized (C88286wa.class) {
                        ebVar = f238775e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238774c);
                            f238775e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
