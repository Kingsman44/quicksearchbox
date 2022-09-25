package com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.i.a.d.aa */
/* compiled from: PG */
public final class C121216aa extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C121216aa f336734a;

    /* renamed from: c */
    private static volatile C63010eb f336735c;

    /* renamed from: b */
    private C62995dn f336736b = C62995dn.f170057a;

    static {
        C121216aa aaVar = new C121216aa();
        f336734a = aaVar;
        C62942bv.registerDefaultInstance(C121216aa.class, aaVar);
    }

    private C121216aa() {
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
                return newMessageInfo(f336734a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", C121261y.f336826a});
            case 3:
                return new C121216aa();
            case 4:
                return new C121262z();
            case 5:
                return f336734a;
            case 6:
                C63010eb ebVar = f336735c;
                if (ebVar == null) {
                    synchronized (C121216aa.class) {
                        ebVar = f336735c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f336734a);
                            f336735c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
