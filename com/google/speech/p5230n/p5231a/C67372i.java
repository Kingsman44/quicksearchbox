package com.google.speech.p5230n.p5231a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.n.a.i */
/* compiled from: PG */
public final class C67372i extends C62937bq implements C62938br {

    /* renamed from: b */
    public static final C67372i f183129b;

    /* renamed from: d */
    private static volatile C63010eb f183130d;

    /* renamed from: a */
    public C62971cq f183131a = emptyProtobufList();

    /* renamed from: c */
    private byte f183132c = 2;

    static {
        C67372i iVar = new C67372i();
        f183129b = iVar;
        C62942bv.registerDefaultInstance(C67372i.class, iVar);
    }

    private C67372i() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f183132c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f183132c = b;
                return null;
            case 2:
                return newMessageInfo(f183129b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C67371h.class});
            case 3:
                return new C67372i();
            case 4:
                return new C67369f();
            case 5:
                return f183129b;
            case 6:
                C63010eb ebVar = f183130d;
                if (ebVar == null) {
                    synchronized (C67372i.class) {
                        ebVar = f183130d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183129b);
                            f183130d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
