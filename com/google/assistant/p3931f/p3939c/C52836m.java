package com.google.assistant.p3931f.p3939c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.f.c.m */
/* compiled from: PG */
public final class C52836m extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C52836m f138630b;

    /* renamed from: c */
    private static volatile C63010eb f138631c;

    /* renamed from: a */
    public C62971cq f138632a = emptyProtobufList();

    static {
        C52836m mVar = new C52836m();
        f138630b = mVar;
        C62942bv.registerDefaultInstance(C52836m.class, mVar);
    }

    private C52836m() {
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
                return newMessageInfo(f138630b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C52838o.class});
            case 3:
                return new C52836m();
            case 4:
                return new C52835l();
            case 5:
                return f138630b;
            case 6:
                C63010eb ebVar = f138631c;
                if (ebVar == null) {
                    synchronized (C52836m.class) {
                        ebVar = f138631c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138630b);
                            f138631c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
