package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.ep */
/* compiled from: PG */
public final class C87815ep extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C87815ep f237618a;

    /* renamed from: b */
    private static volatile C63010eb f237619b;

    static {
        C87815ep epVar = new C87815ep();
        f237618a = epVar;
        C62942bv.registerDefaultInstance(C87815ep.class, epVar);
    }

    private C87815ep() {
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
                return newMessageInfo(f237618a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C87815ep();
            case 4:
                return new C87814eo();
            case 5:
                return f237618a;
            case 6:
                C63010eb ebVar = f237619b;
                if (ebVar == null) {
                    synchronized (C87815ep.class) {
                        ebVar = f237619b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237618a);
                            f237619b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
