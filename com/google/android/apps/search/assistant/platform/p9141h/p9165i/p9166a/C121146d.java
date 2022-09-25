package com.google.android.apps.search.assistant.platform.p9141h.p9165i.p9166a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.h.i.a.d */
/* compiled from: PG */
public final class C121146d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C121146d f336615b;

    /* renamed from: c */
    private static volatile C63010eb f336616c;

    /* renamed from: a */
    public C62995dn f336617a = C62995dn.f170057a;

    static {
        C121146d dVar = new C121146d();
        f336615b = dVar;
        C62942bv.registerDefaultInstance(C121146d.class, dVar);
    }

    private C121146d() {
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
                return newMessageInfo(f336615b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", C121145c.f336614a});
            case 3:
                return new C121146d();
            case 4:
                return new C121144b();
            case 5:
                return f336615b;
            case 6:
                C63010eb ebVar = f336616c;
                if (ebVar == null) {
                    synchronized (C121146d.class) {
                        ebVar = f336616c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f336615b);
                            f336616c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
