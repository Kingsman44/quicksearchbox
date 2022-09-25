package com.google.protos.p4946az;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.az.b */
/* compiled from: PG */
public final class C64354b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64354b f173954b;

    /* renamed from: c */
    private static volatile C63010eb f173955c;

    /* renamed from: a */
    public C62971cq f173956a = emptyProtobufList();

    static {
        C64354b bVar = new C64354b();
        f173954b = bVar;
        C62942bv.registerDefaultInstance(C64354b.class, bVar);
    }

    private C64354b() {
    }

    /* renamed from: a */
    public final void mo59274a() {
        C62971cq cqVar = this.f173956a;
        if (!cqVar.mo58948c()) {
            this.f173956a = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f173954b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C64356d.class});
            case 3:
                return new C64354b();
            case 4:
                return new C64353a();
            case 5:
                return f173954b;
            case 6:
                C63010eb ebVar = f173955c;
                if (ebVar == null) {
                    synchronized (C64354b.class) {
                        ebVar = f173955c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173954b);
                            f173955c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
