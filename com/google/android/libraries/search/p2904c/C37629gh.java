package com.google.android.libraries.search.p2904c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.gh */
/* compiled from: PG */
public final class C37629gh extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C37629gh f99987c;

    /* renamed from: d */
    private static volatile C63010eb f99988d;

    /* renamed from: a */
    public int f99989a;

    /* renamed from: b */
    public int f99990b;

    static {
        C37629gh ghVar = new C37629gh();
        f99987c = ghVar;
        C62942bv.registerDefaultInstance(C37629gh.class, ghVar);
    }

    private C37629gh() {
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
                return newMessageInfo(f99987c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C37628gg.m66601b()});
            case 3:
                return new C37629gh();
            case 4:
                return new C37626ge();
            case 5:
                return f99987c;
            case 6:
                C63010eb ebVar = f99988d;
                if (ebVar == null) {
                    synchronized (C37629gh.class) {
                        ebVar = f99988d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f99987c);
                            f99988d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
