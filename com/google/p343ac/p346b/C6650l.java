package com.google.p343ac.p346b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ac.b.l */
/* compiled from: PG */
public final class C6650l extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C6650l f19886b;

    /* renamed from: c */
    private static volatile C63010eb f19887c;

    /* renamed from: a */
    public C62971cq f19888a = emptyProtobufList();

    static {
        C6650l lVar = new C6650l();
        f19886b = lVar;
        C62942bv.registerDefaultInstance(C6650l.class, lVar);
    }

    private C6650l() {
    }

    /* renamed from: a */
    public final void mo13719a() {
        C62971cq cqVar = this.f19888a;
        if (!cqVar.mo58948c()) {
            this.f19888a = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f19886b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001c", new Object[]{"a"});
            case 3:
                return new C6650l();
            case 4:
                return new C6649k();
            case 5:
                return f19886b;
            case 6:
                C63010eb ebVar = f19887c;
                if (ebVar == null) {
                    synchronized (C6650l.class) {
                        ebVar = f19887c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f19886b);
                            f19887c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
