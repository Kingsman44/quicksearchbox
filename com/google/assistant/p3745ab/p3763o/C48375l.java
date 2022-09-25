package com.google.assistant.p3745ab.p3763o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4836aj.p4837a.C63279b;

/* renamed from: com.google.assistant.ab.o.l */
/* compiled from: PG */
public final class C48375l extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48375l f125050a;

    /* renamed from: d */
    private static volatile C63010eb f125051d;

    /* renamed from: b */
    private C63279b f125052b;

    /* renamed from: c */
    private byte f125053c = 2;

    static {
        C48375l lVar = new C48375l();
        f125050a = lVar;
        C62942bv.registerDefaultInstance(C48375l.class, lVar);
    }

    private C48375l() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 0;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f125053c);
            case 1:
                if (obj != null) {
                    b = 1;
                }
                this.f125053c = b;
                return null;
            case 2:
                return newMessageInfo(f125050a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001Љ", new Object[]{"b"});
            case 3:
                return new C48375l();
            case 4:
                return new C48374k();
            case 5:
                return f125050a;
            case 6:
                C63010eb ebVar = f125051d;
                if (ebVar == null) {
                    synchronized (C48375l.class) {
                        ebVar = f125051d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125050a);
                            f125051d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
