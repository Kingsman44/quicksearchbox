package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.ef */
/* compiled from: PG */
public final class C51344ef extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C51344ef f133730b;

    /* renamed from: c */
    private static volatile C63010eb f133731c;

    /* renamed from: a */
    public C62971cq f133732a = emptyProtobufList();

    static {
        C51344ef efVar = new C51344ef();
        f133730b = efVar;
        C62942bv.registerDefaultInstance(C51344ef.class, efVar);
    }

    private C51344ef() {
    }

    /* renamed from: a */
    public final void mo53588a() {
        C62971cq cqVar = this.f133732a;
        if (!cqVar.mo58948c()) {
            this.f133732a = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f133730b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C51342ed.class});
            case 3:
                return new C51344ef();
            case 4:
                return new C51343ee();
            case 5:
                return f133730b;
            case 6:
                C63010eb ebVar = f133731c;
                if (ebVar == null) {
                    synchronized (C51344ef.class) {
                        ebVar = f133731c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133730b);
                            f133731c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
