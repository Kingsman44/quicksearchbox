package com.google.p4160bf.p4161a.p4163b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.a.b.aq */
/* compiled from: PG */
public final class C55453aq extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C55453aq f146306a;

    /* renamed from: b */
    private static volatile C63010eb f146307b;

    static {
        C55453aq aqVar = new C55453aq();
        f146306a = aqVar;
        C62942bv.registerDefaultInstance(C55453aq.class, aqVar);
    }

    private C55453aq() {
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
                return newMessageInfo(f146306a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C55453aq();
            case 4:
                return new C55452ap();
            case 5:
                return f146306a;
            case 6:
                C63010eb ebVar = f146307b;
                if (ebVar == null) {
                    synchronized (C55453aq.class) {
                        ebVar = f146307b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146306a);
                            f146307b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
