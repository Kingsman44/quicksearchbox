package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.ng */
/* compiled from: PG */
public final class C88049ng extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C88049ng f238086a;

    /* renamed from: b */
    private static volatile C63010eb f238087b;

    static {
        C88049ng ngVar = new C88049ng();
        f238086a = ngVar;
        C62942bv.registerDefaultInstance(C88049ng.class, ngVar);
    }

    private C88049ng() {
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
                return newMessageInfo(f238086a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C88049ng();
            case 4:
                return new C88048nf();
            case 5:
                return f238086a;
            case 6:
                C63010eb ebVar = f238087b;
                if (ebVar == null) {
                    synchronized (C88049ng.class) {
                        ebVar = f238087b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238086a);
                            f238087b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
