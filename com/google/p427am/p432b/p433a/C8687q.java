package com.google.p427am.p432b.p433a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.am.b.a.q */
/* compiled from: PG */
public final class C8687q extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C8687q f30013c;

    /* renamed from: d */
    private static volatile C63010eb f30014d;

    /* renamed from: a */
    public C62971cq f30015a = emptyProtobufList();

    /* renamed from: b */
    public boolean f30016b;

    static {
        C8687q qVar = new C8687q();
        f30013c = qVar;
        C62942bv.registerDefaultInstance(C8687q.class, qVar);
    }

    private C8687q() {
    }

    /* renamed from: a */
    public final void mo17213a() {
        C62971cq cqVar = this.f30015a;
        if (!cqVar.mo58948c()) {
            this.f30015a = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f30013c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0007", new Object[]{"a", C8685o.class, "b"});
            case 3:
                return new C8687q();
            case 4:
                return new C8686p();
            case 5:
                return f30013c;
            case 6:
                C63010eb ebVar = f30014d;
                if (ebVar == null) {
                    synchronized (C8687q.class) {
                        ebVar = f30014d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30013c);
                            f30014d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
