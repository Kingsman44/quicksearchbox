package com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.as.b.a.i */
/* compiled from: PG */
public final class C107530i extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C107530i f299163b;

    /* renamed from: d */
    private static volatile C63010eb f299164d;

    /* renamed from: a */
    public long f299165a;

    /* renamed from: c */
    private int f299166c;

    static {
        C107530i iVar = new C107530i();
        f299163b = iVar;
        C62942bv.registerDefaultInstance(C107530i.class, iVar);
    }

    private C107530i() {
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
                return newMessageInfo(f299163b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C107530i();
            case 4:
                return new C107529h();
            case 5:
                return f299163b;
            case 6:
                C63010eb ebVar = f299164d;
                if (ebVar == null) {
                    synchronized (C107530i.class) {
                        ebVar = f299164d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f299163b);
                            f299164d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
