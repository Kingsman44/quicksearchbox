package com.google.assistant.p3897e.p3929l.p3930a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.l.a.cu */
/* compiled from: PG */
public final class C52742cu extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52742cu f138412c;

    /* renamed from: d */
    private static volatile C63010eb f138413d;

    /* renamed from: a */
    public int f138414a = 0;

    /* renamed from: b */
    public Object f138415b;

    static {
        C52742cu cuVar = new C52742cu();
        f138412c = cuVar;
        C62942bv.registerDefaultInstance(C52742cu.class, cuVar);
    }

    private C52742cu() {
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
                return newMessageInfo(f138412c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"b", "a", C52740cs.class, C52746cy.class});
            case 3:
                return new C52742cu();
            case 4:
                return new C52741ct();
            case 5:
                return f138412c;
            case 6:
                C63010eb ebVar = f138413d;
                if (ebVar == null) {
                    synchronized (C52742cu.class) {
                        ebVar = f138413d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138412c);
                            f138413d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
