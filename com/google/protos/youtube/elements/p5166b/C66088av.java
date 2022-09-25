package com.google.protos.youtube.elements.p5166b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.protos.youtube.elements.b.av */
/* compiled from: PG */
public final class C66088av extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C66088av f179712a;

    /* renamed from: b */
    private static volatile C63010eb f179713b;

    static {
        C66088av avVar = new C66088av();
        f179712a = avVar;
        C62942bv.registerDefaultInstance(C66088av.class, avVar);
    }

    private C66088av() {
        C63088z zVar = C63088z.f170246b;
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
                return newMessageInfo(f179712a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C66088av();
            case 4:
                return new C66087au();
            case 5:
                return f179712a;
            case 6:
                C63010eb ebVar = f179713b;
                if (ebVar == null) {
                    synchronized (C66088av.class) {
                        ebVar = f179713b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179712a);
                            f179713b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
