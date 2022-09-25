package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.ac */
/* compiled from: PG */
public final class C51233ac extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C51233ac f133389b;

    /* renamed from: c */
    private static volatile C63010eb f133390c;

    /* renamed from: a */
    public C62971cq f133391a = emptyProtobufList();

    static {
        C51233ac acVar = new C51233ac();
        f133389b = acVar;
        C62942bv.registerDefaultInstance(C51233ac.class, acVar);
    }

    private C51233ac() {
    }

    /* renamed from: a */
    public final void mo53559a() {
        C62971cq cqVar = this.f133391a;
        if (!cqVar.mo58948c()) {
            this.f133391a = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f133389b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C51231aa.class});
            case 3:
                return new C51233ac();
            case 4:
                return new C51232ab();
            case 5:
                return f133389b;
            case 6:
                C63010eb ebVar = f133390c;
                if (ebVar == null) {
                    synchronized (C51233ac.class) {
                        ebVar = f133390c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133389b);
                            f133390c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
