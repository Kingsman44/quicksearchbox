package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.ev */
/* compiled from: PG */
public final class C87821ev extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C87821ev f237624a;

    /* renamed from: b */
    private static volatile C63010eb f237625b;

    static {
        C87821ev evVar = new C87821ev();
        f237624a = evVar;
        C62942bv.registerDefaultInstance(C87821ev.class, evVar);
    }

    private C87821ev() {
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
                return newMessageInfo(f237624a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C87821ev();
            case 4:
                return new C87820eu();
            case 5:
                return f237624a;
            case 6:
                C63010eb ebVar = f237625b;
                if (ebVar == null) {
                    synchronized (C87821ev.class) {
                        ebVar = f237625b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237624a);
                            f237625b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
