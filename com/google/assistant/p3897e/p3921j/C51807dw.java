package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.dw */
/* compiled from: PG */
public final class C51807dw extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C51807dw f135930b;

    /* renamed from: c */
    private static volatile C63010eb f135931c;

    /* renamed from: a */
    public C62971cq f135932a = emptyProtobufList();

    static {
        C51807dw dwVar = new C51807dw();
        f135930b = dwVar;
        C62942bv.registerDefaultInstance(C51807dw.class, dwVar);
    }

    private C51807dw() {
    }

    /* renamed from: a */
    public final void mo53735a() {
        C62971cq cqVar = this.f135932a;
        if (!cqVar.mo58948c()) {
            this.f135932a = C62942bv.mutableCopy(cqVar);
        }
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
                return newMessageInfo(f135930b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C52232kc.class});
            case 3:
                return new C51807dw();
            case 4:
                return new C51806dv();
            case 5:
                return f135930b;
            case 6:
                C63010eb ebVar = f135931c;
                if (ebVar == null) {
                    synchronized (C51807dw.class) {
                        ebVar = f135931c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135930b);
                            f135931c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
