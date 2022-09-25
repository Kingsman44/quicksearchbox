package com.google.lens.p4701g;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.g.dh */
/* compiled from: PG */
public final class C62339dh extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62339dh f168294b;

    /* renamed from: c */
    private static volatile C63010eb f168295c;

    /* renamed from: a */
    public C62971cq f168296a = emptyProtobufList();

    static {
        C62339dh dhVar = new C62339dh();
        f168294b = dhVar;
        C62942bv.registerDefaultInstance(C62339dh.class, dhVar);
    }

    private C62339dh() {
    }

    /* renamed from: a */
    public final void mo58493a() {
        C62971cq cqVar = this.f168296a;
        if (!cqVar.mo58948c()) {
            this.f168296a = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f168294b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C62337df.class});
            case 3:
                return new C62339dh();
            case 4:
                return new C62338dg();
            case 5:
                return f168294b;
            case 6:
                C63010eb ebVar = f168295c;
                if (ebVar == null) {
                    synchronized (C62339dh.class) {
                        ebVar = f168295c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168294b);
                            f168295c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
