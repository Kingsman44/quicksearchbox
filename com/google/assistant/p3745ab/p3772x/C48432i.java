package com.google.assistant.p3745ab.p3772x;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.x.i */
/* compiled from: PG */
public final class C48432i extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48432i f125152a;

    /* renamed from: c */
    private static volatile C63010eb f125153c;

    /* renamed from: b */
    private C62995dn f125154b = C62995dn.f170057a;

    static {
        C48432i iVar = new C48432i();
        f125152a = iVar;
        C62942bv.registerDefaultInstance(C48432i.class, iVar);
    }

    private C48432i() {
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
                return newMessageInfo(f125152a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", C48431h.f125151a});
            case 3:
                return new C48432i();
            case 4:
                return new C48430g();
            case 5:
                return f125152a;
            case 6:
                C63010eb ebVar = f125153c;
                if (ebVar == null) {
                    synchronized (C48432i.class) {
                        ebVar = f125153c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125152a);
                            f125153c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
