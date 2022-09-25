package com.google.protos.p4985f.p5020k;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.k.az */
/* compiled from: PG */
public final class C64924az extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64924az f175845a;

    /* renamed from: c */
    private static volatile C63010eb f175846c;

    /* renamed from: b */
    private C62995dn f175847b = C62995dn.f170057a;

    static {
        C64924az azVar = new C64924az();
        f175845a = azVar;
        C62942bv.registerDefaultInstance(C64924az.class, azVar);
    }

    private C64924az() {
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
                return newMessageInfo(f175845a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", C64921aw.f175842a});
            case 3:
                return new C64924az();
            case 4:
                return new C64920av();
            case 5:
                return f175845a;
            case 6:
                C63010eb ebVar = f175846c;
                if (ebVar == null) {
                    synchronized (C64924az.class) {
                        ebVar = f175846c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175845a);
                            f175846c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
