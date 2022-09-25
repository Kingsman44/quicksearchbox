package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.a.k */
/* compiled from: PG */
public final class C112144k extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C112144k f311414b;

    /* renamed from: c */
    private static volatile C63010eb f311415c;

    /* renamed from: a */
    public C62995dn f311416a = C62995dn.f170057a;

    static {
        C112144k kVar = new C112144k();
        f311414b = kVar;
        C62942bv.registerDefaultInstance(C112144k.class, kVar);
    }

    private C112144k() {
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
                return newMessageInfo(f311414b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", C112143j.f311413a});
            case 3:
                return new C112144k();
            case 4:
                return new C112141h();
            case 5:
                return f311414b;
            case 6:
                C63010eb ebVar = f311415c;
                if (ebVar == null) {
                    synchronized (C112144k.class) {
                        ebVar = f311415c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f311414b);
                            f311415c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
