package com.google.p4129b.p4130a.p4131a.p4132a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.b.a.a.a.i */
/* compiled from: PG */
public final class C54723i extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54723i f143617c;

    /* renamed from: d */
    private static volatile C63010eb f143618d;

    /* renamed from: a */
    public C54683b f143619a;

    /* renamed from: b */
    public C54683b f143620b;

    static {
        C54723i iVar = new C54723i();
        f143617c = iVar;
        C62942bv.registerDefaultInstance(C54723i.class, iVar);
    }

    private C54723i() {
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
                return newMessageInfo(f143617c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new C54723i();
            case 4:
                return new C54722h();
            case 5:
                return f143617c;
            case 6:
                C63010eb ebVar = f143618d;
                if (ebVar == null) {
                    synchronized (C54723i.class) {
                        ebVar = f143618d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143617c);
                            f143618d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
