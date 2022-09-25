package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.ar */
/* compiled from: PG */
public final class C53081ar extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53081ar f139096a;

    /* renamed from: c */
    private static volatile C63010eb f139097c;

    /* renamed from: b */
    private byte f139098b = 2;

    static {
        C53081ar arVar = new C53081ar();
        f139096a = arVar;
        C62942bv.registerDefaultInstance(C53081ar.class, arVar);
    }

    private C53081ar() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f139098b);
            case 1:
                this.f139098b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f139096a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C53081ar();
            case 4:
                return new C53080aq();
            case 5:
                return f139096a;
            case 6:
                C63010eb ebVar = f139097c;
                if (ebVar == null) {
                    synchronized (C53081ar.class) {
                        ebVar = f139097c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139096a);
                            f139097c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
