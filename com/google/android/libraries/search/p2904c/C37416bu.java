package com.google.android.libraries.search.p2904c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.bu */
/* compiled from: PG */
public final class C37416bu extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C37416bu f99347c;

    /* renamed from: d */
    private static volatile C63010eb f99348d;

    /* renamed from: a */
    public int f99349a;

    /* renamed from: b */
    public C37561eb f99350b;

    static {
        C37416bu buVar = new C37416bu();
        f99347c = buVar;
        C62942bv.registerDefaultInstance(C37416bu.class, buVar);
    }

    private C37416bu() {
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
                return newMessageInfo(f99347c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C37416bu();
            case 4:
                return new C37415bt();
            case 5:
                return f99347c;
            case 6:
                C63010eb ebVar = f99348d;
                if (ebVar == null) {
                    synchronized (C37416bu.class) {
                        ebVar = f99348d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f99347c);
                            f99348d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
