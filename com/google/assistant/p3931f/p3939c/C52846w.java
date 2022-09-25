package com.google.assistant.p3931f.p3939c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.f.c.w */
/* compiled from: PG */
public final class C52846w extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C52846w f138653b;

    /* renamed from: c */
    private static volatile C63010eb f138654c;

    /* renamed from: a */
    public C62971cq f138655a = emptyProtobufList();

    static {
        C52846w wVar = new C52846w();
        f138653b = wVar;
        C62942bv.registerDefaultInstance(C52846w.class, wVar);
    }

    private C52846w() {
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
                return newMessageInfo(f138653b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C52845v.class});
            case 3:
                return new C52846w();
            case 4:
                return new C52839p();
            case 5:
                return f138653b;
            case 6:
                C63010eb ebVar = f138654c;
                if (ebVar == null) {
                    synchronized (C52846w.class) {
                        ebVar = f138654c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138653b);
                            f138654c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
