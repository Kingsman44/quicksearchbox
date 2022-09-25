package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.oa */
/* compiled from: PG */
public final class C51609oa extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C51609oa f134502b;

    /* renamed from: c */
    private static volatile C63010eb f134503c;

    /* renamed from: a */
    public C62971cq f134504a = emptyProtobufList();

    static {
        C51609oa oaVar = new C51609oa();
        f134502b = oaVar;
        C62942bv.registerDefaultInstance(C51609oa.class, oaVar);
    }

    private C51609oa() {
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
                return newMessageInfo(f134502b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C51606ny.class});
            case 3:
                return new C51609oa();
            case 4:
                return new C51607nz();
            case 5:
                return f134502b;
            case 6:
                C63010eb ebVar = f134503c;
                if (ebVar == null) {
                    synchronized (C51609oa.class) {
                        ebVar = f134503c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134502b);
                            f134503c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
