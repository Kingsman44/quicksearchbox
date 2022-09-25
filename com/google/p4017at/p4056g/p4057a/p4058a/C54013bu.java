package com.google.p4017at.p4056g.p4057a.p4058a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.g.a.a.bu */
/* compiled from: PG */
public final class C54013bu extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C54013bu f141724a;

    /* renamed from: b */
    private static volatile C63010eb f141725b;

    static {
        C54013bu buVar = new C54013bu();
        f141724a = buVar;
        C62942bv.registerDefaultInstance(C54013bu.class, buVar);
    }

    private C54013bu() {
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
                return newMessageInfo(f141724a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C54013bu();
            case 4:
                return new C54012bt();
            case 5:
                return f141724a;
            case 6:
                C63010eb ebVar = f141725b;
                if (ebVar == null) {
                    synchronized (C54013bu.class) {
                        ebVar = f141725b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141724a);
                            f141725b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
