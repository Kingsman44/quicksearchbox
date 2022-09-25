package com.google.android.libraries.assistant.auto.tng.p1008j.p1014c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.j.c.l */
/* compiled from: PG */
public final class C13699l extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C13699l f41789a;

    /* renamed from: b */
    private static volatile C63010eb f41790b;

    static {
        C13699l lVar = new C13699l();
        f41789a = lVar;
        C62942bv.registerDefaultInstance(C13699l.class, lVar);
    }

    private C13699l() {
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
                return newMessageInfo(f41789a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C13699l();
            case 4:
                return new C13698k();
            case 5:
                return f41789a;
            case 6:
                C63010eb ebVar = f41790b;
                if (ebVar == null) {
                    synchronized (C13699l.class) {
                        ebVar = f41790b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f41789a);
                            f41790b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
