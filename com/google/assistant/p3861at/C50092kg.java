package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.kg */
/* compiled from: PG */
public final class C50092kg extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C50092kg f130227b;

    /* renamed from: c */
    private static volatile C63010eb f130228c;

    /* renamed from: a */
    public C62971cq f130229a = emptyProtobufList();

    static {
        C50092kg kgVar = new C50092kg();
        f130227b = kgVar;
        C62942bv.registerDefaultInstance(C50092kg.class, kgVar);
    }

    private C50092kg() {
    }

    /* renamed from: a */
    public final void mo53379a() {
        C62971cq cqVar = this.f130229a;
        if (!cqVar.mo58948c()) {
            this.f130229a = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f130227b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C50091kf.class});
            case 3:
                return new C50092kg();
            case 4:
                return new C50089kd();
            case 5:
                return f130227b;
            case 6:
                C63010eb ebVar = f130228c;
                if (ebVar == null) {
                    synchronized (C50092kg.class) {
                        ebVar = f130228c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130227b);
                            f130228c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
