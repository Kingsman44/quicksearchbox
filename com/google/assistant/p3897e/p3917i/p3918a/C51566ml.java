package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.ml */
/* compiled from: PG */
public final class C51566ml extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C51566ml f134401b;

    /* renamed from: c */
    private static volatile C63010eb f134402c;

    /* renamed from: a */
    public C62971cq f134403a = emptyProtobufList();

    static {
        C51566ml mlVar = new C51566ml();
        f134401b = mlVar;
        C62942bv.registerDefaultInstance(C51566ml.class, mlVar);
    }

    private C51566ml() {
    }

    /* renamed from: a */
    public final void mo53639a() {
        C62971cq cqVar = this.f134403a;
        if (!cqVar.mo58948c()) {
            this.f134403a = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f134401b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C51560mf.class});
            case 3:
                return new C51566ml();
            case 4:
                return new C51565mk();
            case 5:
                return f134401b;
            case 6:
                C63010eb ebVar = f134402c;
                if (ebVar == null) {
                    synchronized (C51566ml.class) {
                        ebVar = f134402c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134401b);
                            f134402c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
