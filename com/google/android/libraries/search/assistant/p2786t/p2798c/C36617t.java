package com.google.android.libraries.search.assistant.p2786t.p2798c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.t.c.t */
/* compiled from: PG */
public final class C36617t extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C36617t f95460c;

    /* renamed from: d */
    private static volatile C63010eb f95461d;

    /* renamed from: a */
    public int f95462a;

    /* renamed from: b */
    public int f95463b;

    static {
        C36617t tVar = new C36617t();
        f95460c = tVar;
        C62942bv.registerDefaultInstance(C36617t.class, tVar);
    }

    private C36617t() {
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
                return newMessageInfo(f95460c, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C36617t();
            case 4:
                return new C36616s();
            case 5:
                return f95460c;
            case 6:
                C63010eb ebVar = f95461d;
                if (ebVar == null) {
                    synchronized (C36617t.class) {
                        ebVar = f95461d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f95460c);
                            f95461d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
