package com.google.p4017at.p4056g.p4057a.p4058a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.g.a.a.be */
/* compiled from: PG */
public final class C53997be extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53997be f141662a;

    /* renamed from: b */
    private static volatile C63010eb f141663b;

    static {
        C53997be beVar = new C53997be();
        f141662a = beVar;
        C62942bv.registerDefaultInstance(C53997be.class, beVar);
    }

    private C53997be() {
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
                return newMessageInfo(f141662a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C53997be();
            case 4:
                return new C53996bd();
            case 5:
                return f141662a;
            case 6:
                C63010eb ebVar = f141663b;
                if (ebVar == null) {
                    synchronized (C53997be.class) {
                        ebVar = f141663b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141662a);
                            f141663b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
