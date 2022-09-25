package com.google.android.libraries.phenotype.client.stable;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.phenotype.client.stable.h */
/* compiled from: PG */
public final class C31741h extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C31741h f85325b;

    /* renamed from: c */
    private static volatile C63010eb f85326c;

    /* renamed from: a */
    public C62995dn f85327a = C62995dn.f170057a;

    static {
        C31741h hVar = new C31741h();
        f85325b = hVar;
        C62942bv.registerDefaultInstance(C31741h.class, hVar);
    }

    private C31741h() {
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
                return newMessageInfo(f85325b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"a", C31739f.f85324a});
            case 3:
                return new C31741h();
            case 4:
                return new C31740g();
            case 5:
                return f85325b;
            case 6:
                C63010eb ebVar = f85326c;
                if (ebVar == null) {
                    synchronized (C31741h.class) {
                        ebVar = f85326c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f85325b);
                            f85326c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
