package com.google.android.apps.search.googleapp.discover.p10214s;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.discover.s.be */
/* compiled from: PG */
public final class C134567be extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C134567be f366470c;

    /* renamed from: d */
    private static volatile C63010eb f366471d;

    /* renamed from: a */
    public int f366472a;

    /* renamed from: b */
    public int f366473b;

    static {
        C134567be beVar = new C134567be();
        f366470c = beVar;
        C62942bv.registerDefaultInstance(C134567be.class, beVar);
    }

    private C134567be() {
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
                return newMessageInfo(f366470c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C134569bg.m218289b()});
            case 3:
                return new C134567be();
            case 4:
                return new C134566bd();
            case 5:
                return f366470c;
            case 6:
                C63010eb ebVar = f366471d;
                if (ebVar == null) {
                    synchronized (C134567be.class) {
                        ebVar = f366471d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f366470c);
                            f366471d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
