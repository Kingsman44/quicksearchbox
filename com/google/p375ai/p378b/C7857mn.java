package com.google.p375ai.p378b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.mn */
/* compiled from: PG */
public final class C7857mn extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C7857mn f27537c;

    /* renamed from: d */
    private static volatile C63010eb f27538d;

    /* renamed from: a */
    public int f27539a = 0;

    /* renamed from: b */
    public Object f27540b;

    static {
        C7857mn mnVar = new C7857mn();
        f27537c = mnVar;
        C62942bv.registerDefaultInstance(C7857mn.class, mnVar);
    }

    private C7857mn() {
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
                return newMessageInfo(f27537c, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001ြ\u0000", new Object[]{"b", "a", C7856mm.class});
            case 3:
                return new C7857mn();
            case 4:
                return new C7854mk();
            case 5:
                return f27537c;
            case 6:
                C63010eb ebVar = f27538d;
                if (ebVar == null) {
                    synchronized (C7857mn.class) {
                        ebVar = f27538d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27537c);
                            f27538d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
