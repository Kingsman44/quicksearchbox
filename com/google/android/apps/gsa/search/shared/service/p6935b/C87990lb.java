package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.lb */
/* compiled from: PG */
public final class C87990lb extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C87990lb f237959a;

    /* renamed from: b */
    private static volatile C63010eb f237960b;

    static {
        C87990lb lbVar = new C87990lb();
        f237959a = lbVar;
        C62942bv.registerDefaultInstance(C87990lb.class, lbVar);
    }

    private C87990lb() {
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
                return newMessageInfo(f237959a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C87990lb();
            case 4:
                return new C87989la();
            case 5:
                return f237959a;
            case 6:
                C63010eb ebVar = f237960b;
                if (ebVar == null) {
                    synchronized (C87990lb.class) {
                        ebVar = f237960b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237959a);
                            f237960b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
