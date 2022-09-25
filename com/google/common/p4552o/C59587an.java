package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.an */
/* compiled from: PG */
public final class C59587an extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C59587an f159262c;

    /* renamed from: d */
    private static volatile C63010eb f159263d;

    /* renamed from: a */
    public int f159264a;

    /* renamed from: b */
    public String f159265b = BuildConfig.FLAVOR;

    static {
        C59587an anVar = new C59587an();
        f159262c = anVar;
        C62942bv.registerDefaultInstance(C59587an.class, anVar);
    }

    private C59587an() {
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
                return newMessageInfo(f159262c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C59587an();
            case 4:
                return new C59585am();
            case 5:
                return f159262c;
            case 6:
                C63010eb ebVar = f159263d;
                if (ebVar == null) {
                    synchronized (C59587an.class) {
                        ebVar = f159263d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159262c);
                            f159263d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
