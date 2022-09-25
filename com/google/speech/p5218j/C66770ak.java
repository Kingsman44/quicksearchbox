package com.google.speech.p5218j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.ak */
/* compiled from: PG */
public final class C66770ak extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C66770ak f181594a;

    /* renamed from: b */
    private static volatile C63010eb f181595b;

    static {
        C66770ak akVar = new C66770ak();
        f181594a = akVar;
        C62942bv.registerDefaultInstance(C66770ak.class, akVar);
    }

    private C66770ak() {
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
                return newMessageInfo(f181594a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C66770ak();
            case 4:
                return new C66769aj();
            case 5:
                return f181594a;
            case 6:
                C63010eb ebVar = f181595b;
                if (ebVar == null) {
                    synchronized (C66770ak.class) {
                        ebVar = f181595b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181594a);
                            f181595b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
