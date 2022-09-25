package com.google.android.libraries.assistant.auto.tng.suggestions.p1263k;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.k.o */
/* compiled from: PG */
public final class C16379o extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C16379o f48211b;

    /* renamed from: c */
    private static volatile C63010eb f48212c;

    /* renamed from: a */
    public C62995dn f48213a = C62995dn.f170057a;

    static {
        C16379o oVar = new C16379o();
        f48211b = oVar;
        C62942bv.registerDefaultInstance(C16379o.class, oVar);
    }

    private C16379o() {
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
                return newMessageInfo(f48211b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", C16376l.f48207a});
            case 3:
                return new C16379o();
            case 4:
                return new C16375k();
            case 5:
                return f48211b;
            case 6:
                C63010eb ebVar = f48212c;
                if (ebVar == null) {
                    synchronized (C16379o.class) {
                        ebVar = f48212c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f48211b);
                            f48212c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
