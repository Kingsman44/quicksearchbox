package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.jl */
/* compiled from: PG */
public final class C87946jl extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C87946jl f237861a;

    /* renamed from: b */
    private static volatile C63010eb f237862b;

    static {
        C87946jl jlVar = new C87946jl();
        f237861a = jlVar;
        C62942bv.registerDefaultInstance(C87946jl.class, jlVar);
    }

    private C87946jl() {
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
                return newMessageInfo(f237861a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C87946jl();
            case 4:
                return new C87945jk();
            case 5:
                return f237861a;
            case 6:
                C63010eb ebVar = f237862b;
                if (ebVar == null) {
                    synchronized (C87946jl.class) {
                        ebVar = f237862b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237861a);
                            f237862b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
