package com.google.assistant.p3745ab;

import com.google.p5277z.p5281b.C67983d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.al */
/* compiled from: PG */
public final class C48226al extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C48226al f124770b;

    /* renamed from: d */
    private static volatile C63010eb f124771d;

    /* renamed from: a */
    public C67983d f124772a;

    /* renamed from: c */
    private byte f124773c = 2;

    static {
        C48226al alVar = new C48226al();
        f124770b = alVar;
        C62942bv.registerDefaultInstance(C48226al.class, alVar);
    }

    private C48226al() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 0;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f124773c);
            case 1:
                if (obj != null) {
                    b = 1;
                }
                this.f124773c = b;
                return null;
            case 2:
                return newMessageInfo(f124770b, "\u0000\u0001\u0000\u0000\u0006\u0006\u0001\u0000\u0000\u0001\u0006Љ", new Object[]{"a"});
            case 3:
                return new C48226al();
            case 4:
                return new C48225ak();
            case 5:
                return f124770b;
            case 6:
                C63010eb ebVar = f124771d;
                if (ebVar == null) {
                    synchronized (C48226al.class) {
                        ebVar = f124771d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124770b);
                            f124771d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
