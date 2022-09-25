package com.google.protos.p5145v;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.v.m */
/* compiled from: PG */
public final class C65909m extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C65909m f179244b;

    /* renamed from: c */
    private static volatile C63010eb f179245c;

    /* renamed from: a */
    public C62995dn f179246a = C62995dn.f170057a;

    static {
        C65909m mVar = new C65909m();
        f179244b = mVar;
        C62942bv.registerDefaultInstance(C65909m.class, mVar);
    }

    private C65909m() {
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
                return newMessageInfo(f179244b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", C65908l.f179243a});
            case 3:
                return new C65909m();
            case 4:
                return new C65907k();
            case 5:
                return f179244b;
            case 6:
                C63010eb ebVar = f179245c;
                if (ebVar == null) {
                    synchronized (C65909m.class) {
                        ebVar = f179245c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179244b);
                            f179245c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
