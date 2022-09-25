package com.google.common.p4552o.p4563i;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.i.an */
/* compiled from: PG */
public final class C59878an extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C59878an f161811c;

    /* renamed from: d */
    private static volatile C63010eb f161812d;

    /* renamed from: a */
    public int f161813a;

    /* renamed from: b */
    public String f161814b = BuildConfig.FLAVOR;

    static {
        C59878an anVar = new C59878an();
        f161811c = anVar;
        C62942bv.registerDefaultInstance(C59878an.class, anVar);
    }

    private C59878an() {
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
                return newMessageInfo(f161811c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C59878an();
            case 4:
                return new C59877am();
            case 5:
                return f161811c;
            case 6:
                C63010eb ebVar = f161812d;
                if (ebVar == null) {
                    synchronized (C59878an.class) {
                        ebVar = f161812d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161811c);
                            f161812d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
