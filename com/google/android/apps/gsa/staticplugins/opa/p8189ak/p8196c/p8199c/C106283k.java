package com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8196c.p8199c;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ak.c.c.k */
/* compiled from: PG */
public final class C106283k extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C106283k f296519c;

    /* renamed from: d */
    private static volatile C63010eb f296520d;

    /* renamed from: a */
    public int f296521a;

    /* renamed from: b */
    public String f296522b = BuildConfig.FLAVOR;

    static {
        C106283k kVar = new C106283k();
        f296519c = kVar;
        C62942bv.registerDefaultInstance(C106283k.class, kVar);
    }

    private C106283k() {
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
                return newMessageInfo(f296519c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C106283k();
            case 4:
                return new C106282j();
            case 5:
                return f296519c;
            case 6:
                C63010eb ebVar = f296520d;
                if (ebVar == null) {
                    synchronized (C106283k.class) {
                        ebVar = f296520d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f296519c);
                            f296520d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
