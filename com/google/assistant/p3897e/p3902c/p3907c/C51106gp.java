package com.google.assistant.p3897e.p3902c.p3907c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.gp */
/* compiled from: PG */
public final class C51106gp extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C51106gp f133025a;

    /* renamed from: b */
    private static volatile C63010eb f133026b;

    static {
        C51106gp gpVar = new C51106gp();
        f133025a = gpVar;
        C62942bv.registerDefaultInstance(C51106gp.class, gpVar);
    }

    private C51106gp() {
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
                return newMessageInfo(f133025a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C51106gp();
            case 4:
                return new C51105go();
            case 5:
                return f133025a;
            case 6:
                C63010eb ebVar = f133026b;
                if (ebVar == null) {
                    synchronized (C51106gp.class) {
                        ebVar = f133026b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133025a);
                            f133026b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
