package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.et */
/* compiled from: PG */
public final class C87819et extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C87819et f237622a;

    /* renamed from: b */
    private static volatile C63010eb f237623b;

    static {
        C87819et etVar = new C87819et();
        f237622a = etVar;
        C62942bv.registerDefaultInstance(C87819et.class, etVar);
    }

    private C87819et() {
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
                return newMessageInfo(f237622a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C87819et();
            case 4:
                return new C87818es();
            case 5:
                return f237622a;
            case 6:
                C63010eb ebVar = f237623b;
                if (ebVar == null) {
                    synchronized (C87819et.class) {
                        ebVar = f237623b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237622a);
                            f237623b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
