package com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.f.a.v */
/* compiled from: PG */
public final class C34312v extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C34312v f91240a;

    /* renamed from: b */
    private static volatile C63010eb f91241b;

    static {
        C34312v vVar = new C34312v();
        f91240a = vVar;
        C62942bv.registerDefaultInstance(C34312v.class, vVar);
    }

    private C34312v() {
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
                return newMessageInfo(f91240a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C34312v();
            case 4:
                return new C34311u();
            case 5:
                return f91240a;
            case 6:
                C63010eb ebVar = f91241b;
                if (ebVar == null) {
                    synchronized (C34312v.class) {
                        ebVar = f91241b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f91240a);
                            f91241b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
