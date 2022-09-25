package com.google.android.libraries.search.p2904c.p2982x;

import com.google.android.libraries.search.p2904c.C37397bb;
import com.google.android.libraries.search.p2904c.C37666hm;
import com.google.android.libraries.search.p2904c.C37819l;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.x.ar */
/* compiled from: PG */
public final class C38235ar extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C38235ar f101329c;

    /* renamed from: d */
    private static volatile C63010eb f101330d;

    /* renamed from: a */
    public int f101331a = 0;

    /* renamed from: b */
    public Object f101332b;

    static {
        C38235ar arVar = new C38235ar();
        f101329c = arVar;
        C62942bv.registerDefaultInstance(C38235ar.class, arVar);
    }

    private C38235ar() {
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
                return newMessageInfo(f101329c, "\u0001\u0004\u0001\u0000\u0001\u0006\u0004\u0000\u0000\u0000\u0001ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000", new Object[]{"b", "a", C38267z.class, C37666hm.class, C37397bb.class, C37819l.class});
            case 3:
                return new C38235ar();
            case 4:
                return new C38234aq();
            case 5:
                return f101329c;
            case 6:
                C63010eb ebVar = f101330d;
                if (ebVar == null) {
                    synchronized (C38235ar.class) {
                        ebVar = f101330d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f101329c);
                            f101330d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
