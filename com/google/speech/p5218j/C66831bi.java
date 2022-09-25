package com.google.speech.p5218j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.bi */
/* compiled from: PG */
public final class C66831bi extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66831bi f181733c;

    /* renamed from: e */
    private static volatile C63010eb f181734e;

    /* renamed from: a */
    public C66782aw f181735a;

    /* renamed from: b */
    public C66838bp f181736b;

    /* renamed from: d */
    private int f181737d;

    static {
        C66831bi biVar = new C66831bi();
        f181733c = biVar;
        C62942bv.registerDefaultInstance(C66831bi.class, biVar);
    }

    private C66831bi() {
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
                return newMessageInfo(f181733c, "\u0001\u0002\u0000\u0001\u0001\u0006\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0006ဉ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C66831bi();
            case 4:
                return new C66830bh();
            case 5:
                return f181733c;
            case 6:
                C63010eb ebVar = f181734e;
                if (ebVar == null) {
                    synchronized (C66831bi.class) {
                        ebVar = f181734e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181733c);
                            f181734e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
