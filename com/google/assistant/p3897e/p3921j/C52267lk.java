package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.lk */
/* compiled from: PG */
public final class C52267lk extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52267lk f137203c;

    /* renamed from: d */
    private static volatile C63010eb f137204d;

    /* renamed from: a */
    public int f137205a;

    /* renamed from: b */
    public boolean f137206b;

    static {
        C52267lk lkVar = new C52267lk();
        f137203c = lkVar;
        C62942bv.registerDefaultInstance(C52267lk.class, lkVar);
    }

    private C52267lk() {
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
                return newMessageInfo(f137203c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C52267lk();
            case 4:
                return new C52266lj();
            case 5:
                return f137203c;
            case 6:
                C63010eb ebVar = f137204d;
                if (ebVar == null) {
                    synchronized (C52267lk.class) {
                        ebVar = f137204d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137203c);
                            f137204d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
