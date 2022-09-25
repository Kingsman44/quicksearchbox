package com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a;

import com.google.android.apps.gsa.nga.api.a.be;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.as.b.a.p */
/* compiled from: PG */
public final class C107537p extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C107537p f299180c;

    /* renamed from: d */
    private static volatile C63010eb f299181d;

    /* renamed from: a */
    public int f299182a;

    /* renamed from: b */
    public int f299183b;

    static {
        C107537p pVar = new C107537p();
        f299180c = pVar;
        C62942bv.registerDefaultInstance(C107537p.class, pVar);
    }

    private C107537p() {
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
                return newMessageInfo(f299180c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", be.b()});
            case 3:
                return new C107537p();
            case 4:
                return new C107536o();
            case 5:
                return f299180c;
            case 6:
                C63010eb ebVar = f299181d;
                if (ebVar == null) {
                    synchronized (C107537p.class) {
                        ebVar = f299181d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f299180c);
                            f299181d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
