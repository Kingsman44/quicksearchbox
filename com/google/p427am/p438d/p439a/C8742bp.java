package com.google.p427am.p438d.p439a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.am.d.a.bp */
/* compiled from: PG */
public final class C8742bp extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C8742bp f30082a;

    /* renamed from: b */
    private static volatile C63010eb f30083b;

    static {
        C8742bp bpVar = new C8742bp();
        f30082a = bpVar;
        C62942bv.registerDefaultInstance(C8742bp.class, bpVar);
    }

    private C8742bp() {
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
                return newMessageInfo(f30082a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C8742bp();
            case 4:
                return new C8741bo();
            case 5:
                return f30082a;
            case 6:
                C63010eb ebVar = f30083b;
                if (ebVar == null) {
                    synchronized (C8742bp.class) {
                        ebVar = f30083b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30082a);
                            f30083b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
