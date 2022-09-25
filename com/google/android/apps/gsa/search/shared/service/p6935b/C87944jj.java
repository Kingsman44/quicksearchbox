package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.jj */
/* compiled from: PG */
public final class C87944jj extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C87944jj f237859a;

    /* renamed from: b */
    private static volatile C63010eb f237860b;

    static {
        C87944jj jjVar = new C87944jj();
        f237859a = jjVar;
        C62942bv.registerDefaultInstance(C87944jj.class, jjVar);
    }

    private C87944jj() {
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
                return newMessageInfo(f237859a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C87944jj();
            case 4:
                return new C87943ji();
            case 5:
                return f237859a;
            case 6:
                C63010eb ebVar = f237860b;
                if (ebVar == null) {
                    synchronized (C87944jj.class) {
                        ebVar = f237860b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237859a);
                            f237860b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
