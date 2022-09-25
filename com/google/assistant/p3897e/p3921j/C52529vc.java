package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.vc */
/* compiled from: PG */
public final class C52529vc extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C52529vc f137883b;

    /* renamed from: c */
    private static volatile C63010eb f137884c;

    /* renamed from: a */
    public C62971cq f137885a = emptyProtobufList();

    static {
        C52529vc vcVar = new C52529vc();
        f137883b = vcVar;
        C62942bv.registerDefaultInstance(C52529vc.class, vcVar);
    }

    private C52529vc() {
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
                return newMessageInfo(f137883b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C52528vb.class});
            case 3:
                return new C52529vc();
            case 4:
                return new C52525uz();
            case 5:
                return f137883b;
            case 6:
                C63010eb ebVar = f137884c;
                if (ebVar == null) {
                    synchronized (C52529vc.class) {
                        ebVar = f137884c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137883b);
                            f137884c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
