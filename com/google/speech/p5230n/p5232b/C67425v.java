package com.google.speech.p5230n.p5232b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.n.b.v */
/* compiled from: PG */
public final class C67425v extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C67425v f183235a;

    /* renamed from: b */
    private static volatile C63010eb f183236b;

    static {
        C67425v vVar = new C67425v();
        f183235a = vVar;
        C62942bv.registerDefaultInstance(C67425v.class, vVar);
    }

    private C67425v() {
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
                return newMessageInfo(f183235a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C67425v();
            case 4:
                return new C67424u();
            case 5:
                return f183235a;
            case 6:
                C63010eb ebVar = f183236b;
                if (ebVar == null) {
                    synchronized (C67425v.class) {
                        ebVar = f183236b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183235a);
                            f183236b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
