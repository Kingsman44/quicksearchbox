package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.j.u */
/* compiled from: PG */
public final class C114889u extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C114889u f318756b;

    /* renamed from: c */
    private static volatile C63010eb f318757c;

    /* renamed from: a */
    public C62995dn f318758a = C62995dn.f170057a;

    static {
        C114889u uVar = new C114889u();
        f318756b = uVar;
        C62942bv.registerDefaultInstance(C114889u.class, uVar);
    }

    private C114889u() {
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
                return newMessageInfo(f318756b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", C114888t.f318755a});
            case 3:
                return new C114889u();
            case 4:
                return new C114887s();
            case 5:
                return f318756b;
            case 6:
                C63010eb ebVar = f318757c;
                if (ebVar == null) {
                    synchronized (C114889u.class) {
                        ebVar = f318757c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f318756b);
                            f318757c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
