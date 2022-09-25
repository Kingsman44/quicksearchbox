package com.google.android.apps.search.googleapp.incognito.p10329g;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.incognito.g.s */
/* compiled from: PG */
public final class C136330s extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C136330s f371189d;

    /* renamed from: e */
    private static volatile C63010eb f371190e;

    /* renamed from: a */
    public int f371191a;

    /* renamed from: b */
    public boolean f371192b;

    /* renamed from: c */
    public boolean f371193c;

    static {
        C136330s sVar = new C136330s();
        f371189d = sVar;
        C62942bv.registerDefaultInstance(C136330s.class, sVar);
    }

    private C136330s() {
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
                return newMessageInfo(f371189d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C136330s();
            case 4:
                return new C136329r();
            case 5:
                return f371189d;
            case 6:
                C63010eb ebVar = f371190e;
                if (ebVar == null) {
                    synchronized (C136330s.class) {
                        ebVar = f371190e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f371189d);
                            f371190e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
