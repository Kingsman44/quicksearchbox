package com.google.p4017at.p4056g.p4057a.p4058a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.g.a.a.aj */
/* compiled from: PG */
public final class C53975aj extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C53975aj f141616b;

    /* renamed from: c */
    private static volatile C63010eb f141617c;

    /* renamed from: a */
    public int f141618a;

    static {
        C53975aj ajVar = new C53975aj();
        f141616b = ajVar;
        C62942bv.registerDefaultInstance(C53975aj.class, ajVar);
    }

    private C53975aj() {
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
                return newMessageInfo(f141616b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
            case 3:
                return new C53975aj();
            case 4:
                return new C53974ai();
            case 5:
                return f141616b;
            case 6:
                C63010eb ebVar = f141617c;
                if (ebVar == null) {
                    synchronized (C53975aj.class) {
                        ebVar = f141617c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141616b);
                            f141617c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
