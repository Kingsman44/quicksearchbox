package com.google.android.apps.gsa.staticplugins.opa.tapas;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.o */
/* compiled from: PG */
public final class C112988o extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C112988o f313113c;

    /* renamed from: d */
    private static volatile C63010eb f313114d;

    /* renamed from: a */
    public String f313115a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public double f313116b;

    static {
        C112988o oVar = new C112988o();
        f313113c = oVar;
        C62942bv.registerDefaultInstance(C112988o.class, oVar);
    }

    private C112988o() {
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
                return newMessageInfo(f313113c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0000", new Object[]{"a", "b"});
            case 3:
                return new C112988o();
            case 4:
                return new C112984n();
            case 5:
                return f313113c;
            case 6:
                C63010eb ebVar = f313114d;
                if (ebVar == null) {
                    synchronized (C112988o.class) {
                        ebVar = f313114d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f313113c);
                            f313114d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
