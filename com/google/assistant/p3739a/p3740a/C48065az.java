package com.google.assistant.p3739a.p3740a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.a.a.az */
/* compiled from: PG */
public final class C48065az extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C48065az f124397c;

    /* renamed from: d */
    private static volatile C63010eb f124398d;

    /* renamed from: a */
    public int f124399a = 0;

    /* renamed from: b */
    public Object f124400b;

    static {
        C48065az azVar = new C48065az();
        f124397c = azVar;
        C62942bv.registerDefaultInstance(C48065az.class, azVar);
    }

    private C48065az() {
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
                return newMessageInfo(f124397c, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"b", "a", C48051al.class, C48100cg.class, C48129z.class, C48106cm.class, C48063ax.class, C48109f.class, C48068bb.class});
            case 3:
                return new C48065az();
            case 4:
                return new C48064ay();
            case 5:
                return f124397c;
            case 6:
                C63010eb ebVar = f124398d;
                if (ebVar == null) {
                    synchronized (C48065az.class) {
                        ebVar = f124398d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124397c);
                            f124398d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
