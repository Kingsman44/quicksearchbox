package com.google.nlp.p4730a.p4734b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.nlp.a.b.n */
/* compiled from: PG */
public final class C62777n extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62777n f169527a;

    /* renamed from: d */
    private static volatile C63010eb f169528d;

    /* renamed from: b */
    private C62995dn f169529b = C62995dn.f170057a;

    /* renamed from: c */
    private byte f169530c = 2;

    static {
        C62777n nVar = new C62777n();
        f169527a = nVar;
        C62942bv.registerDefaultInstance(C62777n.class, nVar);
    }

    private C62777n() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f169530c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f169530c = b;
                return null;
            case 2:
                return newMessageInfo(f169527a, "\u0001\u0001\u0000\u0000\u0003\u0003\u0001\u0001\u0000\u0001\u0003в", new Object[]{"b", C62776m.f169526a});
            case 3:
                return new C62777n();
            case 4:
                return new C62775l();
            case 5:
                return f169527a;
            case 6:
                C63010eb ebVar = f169528d;
                if (ebVar == null) {
                    synchronized (C62777n.class) {
                        ebVar = f169528d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169527a);
                            f169528d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
