package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.ok */
/* compiled from: PG */
public final class C50204ok extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C50204ok f130510a;

    /* renamed from: b */
    private static volatile C63010eb f130511b;

    static {
        C50204ok okVar = new C50204ok();
        f130510a = okVar;
        C62942bv.registerDefaultInstance(C50204ok.class, okVar);
    }

    private C50204ok() {
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
                return newMessageInfo(f130510a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C50204ok();
            case 4:
                return new C50203oj();
            case 5:
                return f130510a;
            case 6:
                C63010eb ebVar = f130511b;
                if (ebVar == null) {
                    synchronized (C50204ok.class) {
                        ebVar = f130511b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130510a);
                            f130511b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
