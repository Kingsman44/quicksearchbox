package com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8196c.p8199c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ak.c.c.i */
/* compiled from: PG */
public final class C106281i extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C106281i f296515c;

    /* renamed from: d */
    private static volatile C63010eb f296516d;

    /* renamed from: a */
    public int f296517a;

    /* renamed from: b */
    public boolean f296518b;

    static {
        C106281i iVar = new C106281i();
        f296515c = iVar;
        C62942bv.registerDefaultInstance(C106281i.class, iVar);
    }

    private C106281i() {
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
                return newMessageInfo(f296515c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C106281i();
            case 4:
                return new C106280h();
            case 5:
                return f296515c;
            case 6:
                C63010eb ebVar = f296516d;
                if (ebVar == null) {
                    synchronized (C106281i.class) {
                        ebVar = f296516d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f296515c);
                            f296516d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
