package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.cz */
/* compiled from: PG */
public final class C87771cz extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C87771cz f237540b;

    /* renamed from: c */
    private static volatile C63010eb f237541c;

    /* renamed from: a */
    public C62961ch f237542a = emptyIntList();

    static {
        C87771cz czVar = new C87771cz();
        f237540b = czVar;
        C62942bv.registerDefaultInstance(C87771cz.class, czVar);
    }

    private C87771cz() {
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
                return newMessageInfo(f237540b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0016", new Object[]{"a"});
            case 3:
                return new C87771cz();
            case 4:
                return new C87770cy();
            case 5:
                return f237540b;
            case 6:
                C63010eb ebVar = f237541c;
                if (ebVar == null) {
                    synchronized (C87771cz.class) {
                        ebVar = f237541c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237540b);
                            f237541c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
