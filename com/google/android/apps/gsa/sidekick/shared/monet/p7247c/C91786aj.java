package com.google.android.apps.gsa.sidekick.shared.monet.p7247c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.monet.c.aj */
/* compiled from: PG */
public final class C91786aj extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C91786aj f255953c;

    /* renamed from: d */
    private static volatile C63010eb f255954d;

    /* renamed from: a */
    public int f255955a;

    /* renamed from: b */
    public boolean f255956b;

    static {
        C91786aj ajVar = new C91786aj();
        f255953c = ajVar;
        C62942bv.registerDefaultInstance(C91786aj.class, ajVar);
    }

    private C91786aj() {
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
                return newMessageInfo(f255953c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C91786aj();
            case 4:
                return new C91785ai();
            case 5:
                return f255953c;
            case 6:
                C63010eb ebVar = f255954d;
                if (ebVar == null) {
                    synchronized (C91786aj.class) {
                        ebVar = f255954d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f255953c);
                            f255954d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
