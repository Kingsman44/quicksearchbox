package com.google.speech.p5218j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.cu */
/* compiled from: PG */
public final class C66875cu extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C66875cu f181814b;

    /* renamed from: c */
    private static volatile C63010eb f181815c;

    /* renamed from: a */
    public C62995dn f181816a = C62995dn.f170057a;

    static {
        C66875cu cuVar = new C66875cu();
        f181814b = cuVar;
        C62942bv.registerDefaultInstance(C66875cu.class, cuVar);
    }

    private C66875cu() {
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
                return newMessageInfo(f181814b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", C66874ct.f181813a});
            case 3:
                return new C66875cu();
            case 4:
                return new C66873cs();
            case 5:
                return f181814b;
            case 6:
                C63010eb ebVar = f181815c;
                if (ebVar == null) {
                    synchronized (C66875cu.class) {
                        ebVar = f181815c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181814b);
                            f181815c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
