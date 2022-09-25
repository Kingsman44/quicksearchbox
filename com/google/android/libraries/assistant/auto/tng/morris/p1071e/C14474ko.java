package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.ko */
/* compiled from: PG */
public final class C14474ko extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C14474ko f43749c;

    /* renamed from: d */
    private static volatile C63010eb f43750d;

    /* renamed from: a */
    public int f43751a;

    /* renamed from: b */
    public boolean f43752b;

    static {
        C14474ko koVar = new C14474ko();
        f43749c = koVar;
        C62942bv.registerDefaultInstance(C14474ko.class, koVar);
    }

    private C14474ko() {
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
                return newMessageInfo(f43749c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0007", new Object[]{"a", "b"});
            case 3:
                return new C14474ko();
            case 4:
                return new C14473kn();
            case 5:
                return f43749c;
            case 6:
                C63010eb ebVar = f43750d;
                if (ebVar == null) {
                    synchronized (C14474ko.class) {
                        ebVar = f43750d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43749c);
                            f43750d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
