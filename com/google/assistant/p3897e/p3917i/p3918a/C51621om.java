package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.om */
/* compiled from: PG */
public final class C51621om extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C51621om f134534a;

    /* renamed from: b */
    private static volatile C63010eb f134535b;

    static {
        C51621om omVar = new C51621om();
        f134534a = omVar;
        C62942bv.registerDefaultInstance(C51621om.class, omVar);
    }

    private C51621om() {
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
                return newMessageInfo(f134534a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C51621om();
            case 4:
                return new C51620ol();
            case 5:
                return f134534a;
            case 6:
                C63010eb ebVar = f134535b;
                if (ebVar == null) {
                    synchronized (C51621om.class) {
                        ebVar = f134535b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134534a);
                            f134535b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
