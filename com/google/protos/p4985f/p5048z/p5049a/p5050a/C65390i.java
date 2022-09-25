package com.google.protos.p4985f.p5048z.p5049a.p5050a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.z.a.a.i */
/* compiled from: PG */
public final class C65390i extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C65390i f177803b;

    /* renamed from: c */
    private static volatile C63010eb f177804c;

    /* renamed from: a */
    public C62995dn f177805a = C62995dn.f170057a;

    static {
        C65390i iVar = new C65390i();
        f177803b = iVar;
        C62942bv.registerDefaultInstance(C65390i.class, iVar);
    }

    private C65390i() {
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
                return newMessageInfo(f177803b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", C65388g.f177802a});
            case 3:
                return new C65390i();
            case 4:
                return new C65389h();
            case 5:
                return f177803b;
            case 6:
                C63010eb ebVar = f177804c;
                if (ebVar == null) {
                    synchronized (C65390i.class) {
                        ebVar = f177804c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f177803b);
                            f177804c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
