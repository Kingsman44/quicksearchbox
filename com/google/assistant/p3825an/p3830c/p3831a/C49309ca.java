package com.google.assistant.p3825an.p3830c.p3831a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.an.c.a.ca */
/* compiled from: PG */
public final class C49309ca extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C49309ca f127447b;

    /* renamed from: c */
    private static volatile C63010eb f127448c;

    /* renamed from: a */
    public C62971cq f127449a = emptyProtobufList();

    static {
        C49309ca caVar = new C49309ca();
        f127447b = caVar;
        C62942bv.registerDefaultInstance(C49309ca.class, caVar);
    }

    private C49309ca() {
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
                return newMessageInfo(f127447b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", C49306by.class});
            case 3:
                return new C49309ca();
            case 4:
                return new C49307bz();
            case 5:
                return f127447b;
            case 6:
                C63010eb ebVar = f127448c;
                if (ebVar == null) {
                    synchronized (C49309ca.class) {
                        ebVar = f127448c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127447b);
                            f127448c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
