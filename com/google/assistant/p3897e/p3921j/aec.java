package com.google.assistant.p3897e.p3921j;

import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.aec */
/* compiled from: PG */
public final class aec extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final aec f134925b;

    /* renamed from: c */
    private static volatile C63010eb f134926c;

    /* renamed from: a */
    public C62971cq f134927a = emptyProtobufList();

    static {
        aec aec = new aec();
        f134925b = aec;
        C62942bv.registerDefaultInstance(aec.class, aec);
    }

    private aec() {
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
                return newMessageInfo(f134925b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C51098gh.class});
            case 3:
                return new aec();
            case 4:
                return new aeb();
            case 5:
                return f134925b;
            case 6:
                C63010eb ebVar = f134926c;
                if (ebVar == null) {
                    synchronized (aec.class) {
                        ebVar = f134926c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134925b);
                            f134926c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
