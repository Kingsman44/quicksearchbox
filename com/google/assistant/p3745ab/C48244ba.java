package com.google.assistant.p3745ab;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.ba */
/* compiled from: PG */
public final class C48244ba extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48244ba f124802a;

    /* renamed from: b */
    private static volatile C63010eb f124803b;

    static {
        C48244ba baVar = new C48244ba();
        f124802a = baVar;
        C62942bv.registerDefaultInstance(C48244ba.class, baVar);
    }

    private C48244ba() {
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
                return newMessageInfo(f124802a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C48244ba();
            case 4:
                return new C48240az();
            case 5:
                return f124802a;
            case 6:
                C63010eb ebVar = f124803b;
                if (ebVar == null) {
                    synchronized (C48244ba.class) {
                        ebVar = f124803b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124802a);
                            f124803b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
