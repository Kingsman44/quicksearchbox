package com.google.speech.p5218j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.ce */
/* compiled from: PG */
public final class C66859ce extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C66859ce f181780b;

    /* renamed from: c */
    private static volatile C63010eb f181781c;

    /* renamed from: a */
    public C62995dn f181782a = C62995dn.f170057a;

    static {
        C66859ce ceVar = new C66859ce();
        f181780b = ceVar;
        C62942bv.registerDefaultInstance(C66859ce.class, ceVar);
    }

    private C66859ce() {
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
                return newMessageInfo(f181780b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", C66855ca.f181778a});
            case 3:
                return new C66859ce();
            case 4:
                return new C66858cd();
            case 5:
                return f181780b;
            case 6:
                C63010eb ebVar = f181781c;
                if (ebVar == null) {
                    synchronized (C66859ce.class) {
                        ebVar = f181781c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181780b);
                            f181781c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
