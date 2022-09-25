package com.google.protos.p4985f.p4986a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.a.bg */
/* compiled from: PG */
public final class C64680bg extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64680bg f175329c;

    /* renamed from: d */
    private static volatile C63010eb f175330d;

    /* renamed from: a */
    public int f175331a = 0;

    /* renamed from: b */
    public Object f175332b;

    static {
        C64680bg bgVar = new C64680bg();
        f175329c = bgVar;
        C62942bv.registerDefaultInstance(C64680bg.class, bgVar);
    }

    private C64680bg() {
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
                return newMessageInfo(f175329c, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001ြ\u0000", new Object[]{"b", "a", C64687bn.class});
            case 3:
                return new C64680bg();
            case 4:
                return new C64679bf();
            case 5:
                return f175329c;
            case 6:
                C63010eb ebVar = f175330d;
                if (ebVar == null) {
                    synchronized (C64680bg.class) {
                        ebVar = f175330d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175329c);
                            f175330d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
