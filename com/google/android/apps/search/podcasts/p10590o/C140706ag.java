package com.google.android.apps.search.podcasts.p10590o;

import com.google.p4017at.p4082j.p4083a.C54394ct;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.podcasts.o.ag */
/* compiled from: PG */
public final class C140706ag extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C140706ag f382121c;

    /* renamed from: d */
    private static volatile C63010eb f382122d;

    /* renamed from: a */
    public C54394ct f382123a;

    /* renamed from: b */
    public int f382124b;

    static {
        C140706ag agVar = new C140706ag();
        f382121c = agVar;
        C62942bv.registerDefaultInstance(C140706ag.class, agVar);
    }

    private C140706ag() {
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
                return newMessageInfo(f382121c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\f", new Object[]{"a", "b"});
            case 3:
                return new C140706ag();
            case 4:
                return new C140705af();
            case 5:
                return f382121c;
            case 6:
                C63010eb ebVar = f382122d;
                if (ebVar == null) {
                    synchronized (C140706ag.class) {
                        ebVar = f382122d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f382121c);
                            f382122d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
