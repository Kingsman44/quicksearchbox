package com.google.android.apps.gsa.staticplugins.opa.tapas;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.u */
/* compiled from: PG */
public final class C113516u extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C113516u f314280b;

    /* renamed from: c */
    private static volatile C63010eb f314281c;

    /* renamed from: a */
    public long f314282a;

    static {
        C113516u uVar = new C113516u();
        f314280b = uVar;
        C62942bv.registerDefaultInstance(C113516u.class, uVar);
    }

    private C113516u() {
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
                return newMessageInfo(f314280b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"a"});
            case 3:
                return new C113516u();
            case 4:
                return new C113515t();
            case 5:
                return f314280b;
            case 6:
                C63010eb ebVar = f314281c;
                if (ebVar == null) {
                    synchronized (C113516u.class) {
                        ebVar = f314281c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f314280b);
                            f314281c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
