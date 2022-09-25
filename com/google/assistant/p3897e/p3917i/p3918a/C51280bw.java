package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.bw */
/* compiled from: PG */
public final class C51280bw extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C51280bw f133508a;

    /* renamed from: b */
    private static volatile C63010eb f133509b;

    static {
        C51280bw bwVar = new C51280bw();
        f133508a = bwVar;
        C62942bv.registerDefaultInstance(C51280bw.class, bwVar);
    }

    private C51280bw() {
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
                return newMessageInfo(f133508a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C51280bw();
            case 4:
                return new C51279bv();
            case 5:
                return f133508a;
            case 6:
                C63010eb ebVar = f133509b;
                if (ebVar == null) {
                    synchronized (C51280bw.class) {
                        ebVar = f133509b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133508a);
                            f133509b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
