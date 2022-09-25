package com.google.protos.p4985f.p5045w;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.w.k */
/* compiled from: PG */
public final class C65375k extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65375k f177769a;

    /* renamed from: c */
    private static volatile C63010eb f177770c;

    /* renamed from: b */
    private C62995dn f177771b = C62995dn.f170057a;

    static {
        C65375k kVar = new C65375k();
        f177769a = kVar;
        C62942bv.registerDefaultInstance(C65375k.class, kVar);
    }

    private C65375k() {
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
                return newMessageInfo(f177769a, "\u0001\u0001\u0000\u0000\u0003\u0003\u0001\u0001\u0000\u0000\u00032", new Object[]{"b", C65374j.f177768a});
            case 3:
                return new C65375k();
            case 4:
                return new C65373i();
            case 5:
                return f177769a;
            case 6:
                C63010eb ebVar = f177770c;
                if (ebVar == null) {
                    synchronized (C65375k.class) {
                        ebVar = f177770c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f177769a);
                            f177770c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
