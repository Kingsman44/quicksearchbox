package com.google.assistant.p3803ag.p3807b.p3808a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.b.a.ak */
/* compiled from: PG */
public final class C48896ak extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C48896ak f126523b;

    /* renamed from: c */
    private static volatile C63010eb f126524c;

    /* renamed from: a */
    public C62971cq f126525a = emptyProtobufList();

    static {
        C48896ak akVar = new C48896ak();
        f126523b = akVar;
        C62942bv.registerDefaultInstance(C48896ak.class, akVar);
    }

    private C48896ak() {
    }

    /* renamed from: a */
    public final void mo53193a() {
        C62971cq cqVar = this.f126525a;
        if (!cqVar.mo58948c()) {
            this.f126525a = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f126523b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C48897al.class});
            case 3:
                return new C48896ak();
            case 4:
                return new C48895aj();
            case 5:
                return f126523b;
            case 6:
                C63010eb ebVar = f126524c;
                if (ebVar == null) {
                    synchronized (C48896ak.class) {
                        ebVar = f126524c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126523b);
                            f126524c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
