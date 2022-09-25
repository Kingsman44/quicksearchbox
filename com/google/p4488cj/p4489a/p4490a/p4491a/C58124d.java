package com.google.p4488cj.p4489a.p4490a.p4491a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.cj.a.a.a.d */
/* compiled from: PG */
public final class C58124d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C58124d f155385b;

    /* renamed from: d */
    private static volatile C63010eb f155386d;

    /* renamed from: a */
    public C62971cq f155387a = emptyProtobufList();

    /* renamed from: c */
    private byte f155388c = 2;

    static {
        C58124d dVar = new C58124d();
        f155385b = dVar;
        C62942bv.registerDefaultInstance(C58124d.class, dVar);
    }

    private C58124d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f155388c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f155388c = b;
                return null;
            case 2:
                return newMessageInfo(f155385b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C58122b.class});
            case 3:
                return new C58124d();
            case 4:
                return new C58123c();
            case 5:
                return f155385b;
            case 6:
                C63010eb ebVar = f155386d;
                if (ebVar == null) {
                    synchronized (C58124d.class) {
                        ebVar = f155386d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f155385b);
                            f155386d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
