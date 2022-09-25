package com.google.protos.p4850an.p4866f;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.f.u */
/* compiled from: PG */
public final class C63616u extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63616u f172057a;

    /* renamed from: b */
    private static volatile C63010eb f172058b;

    static {
        C63616u uVar = new C63616u();
        f172057a = uVar;
        C62942bv.registerDefaultInstance(C63616u.class, uVar);
    }

    private C63616u() {
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
                return newMessageInfo(f172057a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C63616u();
            case 4:
                return new C63615t();
            case 5:
                return f172057a;
            case 6:
                C63010eb ebVar = f172058b;
                if (ebVar == null) {
                    synchronized (C63616u.class) {
                        ebVar = f172058b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172057a);
                            f172058b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
