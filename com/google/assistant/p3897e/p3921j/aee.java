package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.aee */
/* compiled from: PG */
public final class aee extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final aee f134928c;

    /* renamed from: d */
    private static volatile C63010eb f134929d;

    /* renamed from: a */
    public int f134930a;

    /* renamed from: b */
    public boolean f134931b;

    static {
        aee aee = new aee();
        f134928c = aee;
        C62942bv.registerDefaultInstance(aee.class, aee);
    }

    private aee() {
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
                return newMessageInfo(f134928c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new aee();
            case 4:
                return new aed();
            case 5:
                return f134928c;
            case 6:
                C63010eb ebVar = f134929d;
                if (ebVar == null) {
                    synchronized (aee.class) {
                        ebVar = f134929d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134928c);
                            f134929d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
