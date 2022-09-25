package com.google.p4242bp.p4257f.p4260b.p4261a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.f.b.a.cg */
/* compiled from: PG */
public final class C56280cg extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C56280cg f149992b;

    /* renamed from: c */
    private static volatile C63010eb f149993c;

    /* renamed from: a */
    public C62971cq f149994a = emptyProtobufList();

    static {
        C56280cg cgVar = new C56280cg();
        f149992b = cgVar;
        C62942bv.registerDefaultInstance(C56280cg.class, cgVar);
    }

    private C56280cg() {
    }

    /* renamed from: a */
    public final void mo54347a() {
        C62971cq cqVar = this.f149994a;
        if (!cqVar.mo58948c()) {
            this.f149994a = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f149992b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C56278ce.class});
            case 3:
                return new C56280cg();
            case 4:
                return new C56279cf();
            case 5:
                return f149992b;
            case 6:
                C63010eb ebVar = f149993c;
                if (ebVar == null) {
                    synchronized (C56280cg.class) {
                        ebVar = f149993c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149992b);
                            f149993c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
