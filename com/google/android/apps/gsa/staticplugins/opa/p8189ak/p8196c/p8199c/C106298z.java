package com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8196c.p8199c;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ak.c.c.z */
/* compiled from: PG */
public final class C106298z extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C106298z f296567c;

    /* renamed from: d */
    private static volatile C63010eb f296568d;

    /* renamed from: a */
    public int f296569a;

    /* renamed from: b */
    public String f296570b = BuildConfig.FLAVOR;

    static {
        C106298z zVar = new C106298z();
        f296567c = zVar;
        C62942bv.registerDefaultInstance(C106298z.class, zVar);
    }

    private C106298z() {
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
                return newMessageInfo(f296567c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C106298z();
            case 4:
                return new C106297y();
            case 5:
                return f296567c;
            case 6:
                C63010eb ebVar = f296568d;
                if (ebVar == null) {
                    synchronized (C106298z.class) {
                        ebVar = f296568d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f296567c);
                            f296568d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
