package com.google.p427am.p432b.p433a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.am.b.a.bv */
/* compiled from: PG */
public final class C8670bv extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C8670bv f29981b;

    /* renamed from: c */
    private static volatile C63010eb f29982c;

    /* renamed from: a */
    public String f29983a = BuildConfig.FLAVOR;

    static {
        C8670bv bvVar = new C8670bv();
        f29981b = bvVar;
        C62942bv.registerDefaultInstance(C8670bv.class, bvVar);
    }

    private C8670bv() {
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
                return newMessageInfo(f29981b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C8670bv();
            case 4:
                return new C8669bu();
            case 5:
                return f29981b;
            case 6:
                C63010eb ebVar = f29982c;
                if (ebVar == null) {
                    synchronized (C8670bv.class) {
                        ebVar = f29982c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29981b);
                            f29982c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
