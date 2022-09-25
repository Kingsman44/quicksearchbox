package com.google.android.libraries.search.silk.web.core;

import com.google.common.p4552o.apk;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.silk.web.core.k */
/* compiled from: PG */
public final class C40757k extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C40757k f106857c;

    /* renamed from: d */
    private static volatile C63010eb f106858d;

    /* renamed from: a */
    public int f106859a;

    /* renamed from: b */
    public int f106860b;

    static {
        C40757k kVar = new C40757k();
        f106857c = kVar;
        C62942bv.registerDefaultInstance(C40757k.class, kVar);
    }

    private C40757k() {
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
                return newMessageInfo(f106857c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", apk.m92454b()});
            case 3:
                return new C40757k();
            case 4:
                return new C40756j();
            case 5:
                return f106857c;
            case 6:
                C63010eb ebVar = f106858d;
                if (ebVar == null) {
                    synchronized (C40757k.class) {
                        ebVar = f106858d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f106857c);
                            f106858d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
