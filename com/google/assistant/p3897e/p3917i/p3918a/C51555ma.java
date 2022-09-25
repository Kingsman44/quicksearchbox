package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52460so;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.ma */
/* compiled from: PG */
public final class C51555ma extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C51555ma f134368c;

    /* renamed from: e */
    private static volatile C63010eb f134369e;

    /* renamed from: a */
    public C52460so f134370a;

    /* renamed from: b */
    public C51809dy f134371b;

    /* renamed from: d */
    private int f134372d;

    static {
        C51555ma maVar = new C51555ma();
        f134368c = maVar;
        C62942bv.registerDefaultInstance(C51555ma.class, maVar);
    }

    private C51555ma() {
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
                return newMessageInfo(f134368c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C51555ma();
            case 4:
                return new C51553lz();
            case 5:
                return f134368c;
            case 6:
                C63010eb ebVar = f134369e;
                if (ebVar == null) {
                    synchronized (C51555ma.class) {
                        ebVar = f134369e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134368c);
                            f134369e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
