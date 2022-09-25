package com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8196c.p8199c;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ak.c.c.t */
/* compiled from: PG */
public final class C106292t extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C106292t f296559c;

    /* renamed from: d */
    private static volatile C63010eb f296560d;

    /* renamed from: a */
    public int f296561a;

    /* renamed from: b */
    public String f296562b = BuildConfig.FLAVOR;

    static {
        C106292t tVar = new C106292t();
        f296559c = tVar;
        C62942bv.registerDefaultInstance(C106292t.class, tVar);
    }

    private C106292t() {
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
                return newMessageInfo(f296559c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C106292t();
            case 4:
                return new C106291s();
            case 5:
                return f296559c;
            case 6:
                C63010eb ebVar = f296560d;
                if (ebVar == null) {
                    synchronized (C106292t.class) {
                        ebVar = f296560d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f296559c);
                            f296560d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
