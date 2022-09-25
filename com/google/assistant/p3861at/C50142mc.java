package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.mc */
/* compiled from: PG */
public final class C50142mc extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50142mc f130357c;

    /* renamed from: d */
    private static volatile C63010eb f130358d;

    /* renamed from: a */
    public int f130359a;

    /* renamed from: b */
    public boolean f130360b;

    static {
        C50142mc mcVar = new C50142mc();
        f130357c = mcVar;
        C62942bv.registerDefaultInstance(C50142mc.class, mcVar);
    }

    private C50142mc() {
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
                return newMessageInfo(f130357c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C50142mc();
            case 4:
                return new C50141mb();
            case 5:
                return f130357c;
            case 6:
                C63010eb ebVar = f130358d;
                if (ebVar == null) {
                    synchronized (C50142mc.class) {
                        ebVar = f130358d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130357c);
                            f130358d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
