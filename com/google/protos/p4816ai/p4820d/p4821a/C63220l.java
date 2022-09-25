package com.google.protos.p4816ai.p4820d.p4821a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ai.d.a.l */
/* compiled from: PG */
public final class C63220l extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C63220l f170798b;

    /* renamed from: c */
    private static volatile C63010eb f170799c;

    /* renamed from: a */
    public C62971cq f170800a = emptyProtobufList();

    static {
        C63220l lVar = new C63220l();
        f170798b = lVar;
        C62942bv.registerDefaultInstance(C63220l.class, lVar);
    }

    private C63220l() {
    }

    /* renamed from: a */
    public final void mo59197a() {
        C62971cq cqVar = this.f170800a;
        if (!cqVar.mo58948c()) {
            this.f170800a = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f170798b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C63218j.class});
            case 3:
                return new C63220l();
            case 4:
                return new C63219k();
            case 5:
                return f170798b;
            case 6:
                C63010eb ebVar = f170799c;
                if (ebVar == null) {
                    synchronized (C63220l.class) {
                        ebVar = f170799c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f170798b);
                            f170799c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
