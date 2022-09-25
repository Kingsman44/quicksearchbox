package com.google.android.apps.gsa.staticplugins.opa.p8173aa;

import com.google.android.apps.gsa.assistant.shared.l.g;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.aa.af */
/* compiled from: PG */
public final class C105925af extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C105925af f295741c;

    /* renamed from: d */
    private static volatile C63010eb f295742d;

    /* renamed from: a */
    public int f295743a;

    /* renamed from: b */
    public g f295744b;

    static {
        C105925af afVar = new C105925af();
        f295741c = afVar;
        C62942bv.registerDefaultInstance(C105925af.class, afVar);
    }

    private C105925af() {
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
                return newMessageInfo(f295741c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C105925af();
            case 4:
                return new C105924ae();
            case 5:
                return f295741c;
            case 6:
                C63010eb ebVar = f295742d;
                if (ebVar == null) {
                    synchronized (C105925af.class) {
                        ebVar = f295742d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f295741c);
                            f295742d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
