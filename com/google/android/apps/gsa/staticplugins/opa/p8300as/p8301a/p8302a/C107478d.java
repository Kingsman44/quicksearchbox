package com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.as.a.a.d */
/* compiled from: PG */
public final class C107478d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C107478d f299062c;

    /* renamed from: d */
    private static volatile C63010eb f299063d;

    /* renamed from: a */
    public int f299064a;

    /* renamed from: b */
    public boolean f299065b;

    static {
        C107478d dVar = new C107478d();
        f299062c = dVar;
        C62942bv.registerDefaultInstance(C107478d.class, dVar);
    }

    private C107478d() {
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
                return newMessageInfo(f299062c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C107478d();
            case 4:
                return new C107477c();
            case 5:
                return f299062c;
            case 6:
                C63010eb ebVar = f299063d;
                if (ebVar == null) {
                    synchronized (C107478d.class) {
                        ebVar = f299063d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f299062c);
                            f299063d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
