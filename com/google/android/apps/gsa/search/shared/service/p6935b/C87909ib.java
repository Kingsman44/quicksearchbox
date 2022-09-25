package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.libraries.lens.view.flags.C26241ab;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.ib */
/* compiled from: PG */
public final class C87909ib extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C87909ib f237798c;

    /* renamed from: d */
    private static volatile C63010eb f237799d;

    /* renamed from: a */
    public int f237800a = 0;

    /* renamed from: b */
    public Object f237801b;

    static {
        C87909ib ibVar = new C87909ib();
        f237798c = ibVar;
        C62942bv.registerDefaultInstance(C87909ib.class, ibVar);
    }

    private C87909ib() {
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
                return newMessageInfo(f237798c, "\u0001\u0001\u0001\u0000\u0004\u0004\u0001\u0000\u0000\u0000\u0004ြ\u0000", new Object[]{"b", "a", C26241ab.class});
            case 3:
                return new C87909ib();
            case 4:
                return new C87908ia();
            case 5:
                return f237798c;
            case 6:
                C63010eb ebVar = f237799d;
                if (ebVar == null) {
                    synchronized (C87909ib.class) {
                        ebVar = f237799d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237798c);
                            f237799d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
