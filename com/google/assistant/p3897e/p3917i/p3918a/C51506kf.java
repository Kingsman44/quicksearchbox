package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.kf */
/* compiled from: PG */
public final class C51506kf extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C51506kf f134185a;

    /* renamed from: b */
    private static volatile C63010eb f134186b;

    static {
        C51506kf kfVar = new C51506kf();
        f134185a = kfVar;
        C62942bv.registerDefaultInstance(C51506kf.class, kfVar);
    }

    private C51506kf() {
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
                return newMessageInfo(f134185a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C51506kf();
            case 4:
                return new C51505ke();
            case 5:
                return f134185a;
            case 6:
                C63010eb ebVar = f134186b;
                if (ebVar == null) {
                    synchronized (C51506kf.class) {
                        ebVar = f134186b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134185a);
                            f134186b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
