package com.google.assistant.p3897e.p3921j;

import com.google.assistant.p3897e.p3902c.p3907c.C51083ft;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.ado */
/* compiled from: PG */
public final class ado extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final ado f134898b;

    /* renamed from: c */
    private static volatile C63010eb f134899c;

    /* renamed from: a */
    public C62961ch f134900a = emptyIntList();

    static {
        ado ado = new ado();
        f134898b = ado;
        C62942bv.registerDefaultInstance(ado.class, ado);
    }

    private ado() {
        emptyIntList();
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
                return newMessageInfo(f134898b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"a", C51083ft.f132994a});
            case 3:
                return new ado();
            case 4:
                return new adn();
            case 5:
                return f134898b;
            case 6:
                C63010eb ebVar = f134899c;
                if (ebVar == null) {
                    synchronized (ado.class) {
                        ebVar = f134899c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134898b);
                            f134899c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
