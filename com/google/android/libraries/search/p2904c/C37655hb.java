package com.google.android.libraries.search.p2904c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.hb */
/* compiled from: PG */
public final class C37655hb extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C37655hb f100025d;

    /* renamed from: e */
    private static volatile C63010eb f100026e;

    /* renamed from: a */
    public int f100027a;

    /* renamed from: b */
    public int f100028b;

    /* renamed from: c */
    public int f100029c;

    static {
        C37655hb hbVar = new C37655hb();
        f100025d = hbVar;
        C62942bv.registerDefaultInstance(C37655hb.class, hbVar);
    }

    private C37655hb() {
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
                return newMessageInfo(f100025d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C37655hb();
            case 4:
                return new C37654ha();
            case 5:
                return f100025d;
            case 6:
                C63010eb ebVar = f100026e;
                if (ebVar == null) {
                    synchronized (C37655hb.class) {
                        ebVar = f100026e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f100025d);
                            f100026e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
