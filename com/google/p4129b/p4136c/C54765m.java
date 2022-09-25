package com.google.p4129b.p4136c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63037fb;

/* renamed from: com.google.b.c.m */
/* compiled from: PG */
public final class C54765m extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C54765m f143689b;

    /* renamed from: c */
    private static volatile C63010eb f143690c;

    /* renamed from: a */
    public C63037fb f143691a;

    static {
        C54765m mVar = new C54765m();
        f143689b = mVar;
        C62942bv.registerDefaultInstance(C54765m.class, mVar);
    }

    private C54765m() {
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
                return newMessageInfo(f143689b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C54765m();
            case 4:
                return new C54764l();
            case 5:
                return f143689b;
            case 6:
                C63010eb ebVar = f143690c;
                if (ebVar == null) {
                    synchronized (C54765m.class) {
                        ebVar = f143690c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143689b);
                            f143690c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
