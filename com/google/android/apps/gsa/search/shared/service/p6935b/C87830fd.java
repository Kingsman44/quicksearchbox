package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.fd */
/* compiled from: PG */
public final class C87830fd extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C87830fd f237642a;

    /* renamed from: b */
    private static volatile C63010eb f237643b;

    static {
        C87830fd fdVar = new C87830fd();
        f237642a = fdVar;
        C62942bv.registerDefaultInstance(C87830fd.class, fdVar);
    }

    private C87830fd() {
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
                return newMessageInfo(f237642a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C87830fd();
            case 4:
                return new C87829fc();
            case 5:
                return f237642a;
            case 6:
                C63010eb ebVar = f237643b;
                if (ebVar == null) {
                    synchronized (C87830fd.class) {
                        ebVar = f237643b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237642a);
                            f237643b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
