package com.google.p4017at.p4056g.p4057a.p4058a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.g.a.a.dd */
/* compiled from: PG */
public final class C54050dd extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C54050dd f141808a;

    /* renamed from: b */
    private static volatile C63010eb f141809b;

    static {
        C54050dd ddVar = new C54050dd();
        f141808a = ddVar;
        C62942bv.registerDefaultInstance(C54050dd.class, ddVar);
    }

    private C54050dd() {
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
                return newMessageInfo(f141808a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C54050dd();
            case 4:
                return new C54049dc();
            case 5:
                return f141808a;
            case 6:
                C63010eb ebVar = f141809b;
                if (ebVar == null) {
                    synchronized (C54050dd.class) {
                        ebVar = f141809b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141808a);
                            f141809b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
