package com.google.p375ai.p378b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.jt */
/* compiled from: PG */
public final class C7782jt extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C7782jt f27238b;

    /* renamed from: c */
    private static volatile C63010eb f27239c;

    /* renamed from: a */
    public C62971cq f27240a = emptyProtobufList();

    static {
        C7782jt jtVar = new C7782jt();
        f27238b = jtVar;
        C62942bv.registerDefaultInstance(C7782jt.class, jtVar);
    }

    private C7782jt() {
    }

    /* renamed from: a */
    public final void mo16964a() {
        C62971cq cqVar = this.f27240a;
        if (!cqVar.mo58948c()) {
            this.f27240a = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f27238b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", C8156xp.class});
            case 3:
                return new C7782jt();
            case 4:
                return new C7781js();
            case 5:
                return f27238b;
            case 6:
                C63010eb ebVar = f27239c;
                if (ebVar == null) {
                    synchronized (C7782jt.class) {
                        ebVar = f27239c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27238b);
                            f27239c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
