package com.google.android.apps.gsa.opa.smartspace;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.opa.smartspace.ah */
/* compiled from: PG */
public final class C83736ah extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C83736ah f228222c;

    /* renamed from: d */
    private static volatile C63010eb f228223d;

    /* renamed from: a */
    public int f228224a = 0;

    /* renamed from: b */
    public Object f228225b;

    static {
        C83736ah ahVar = new C83736ah();
        f228222c = ahVar;
        C62942bv.registerDefaultInstance(C83736ah.class, ahVar);
    }

    private C83736ah() {
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
                return newMessageInfo(f228222c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001ျ\u0000\u0002ျ\u0000\u0003ွ\u0000", new Object[]{"b", "a"});
            case 3:
                return new C83736ah();
            case 4:
                return new C83735ag();
            case 5:
                return f228222c;
            case 6:
                C63010eb ebVar = f228223d;
                if (ebVar == null) {
                    synchronized (C83736ah.class) {
                        ebVar = f228223d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f228222c);
                            f228223d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
