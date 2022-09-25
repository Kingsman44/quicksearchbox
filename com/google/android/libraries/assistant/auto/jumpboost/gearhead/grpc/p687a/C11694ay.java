package com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.a.ay */
/* compiled from: PG */
public final class C11694ay extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62962ci f37703b = new C11692aw();

    /* renamed from: c */
    public static final C11694ay f37704c;

    /* renamed from: d */
    private static volatile C63010eb f37705d;

    /* renamed from: a */
    public C62961ch f37706a = emptyIntList();

    static {
        C11694ay ayVar = new C11694ay();
        f37704c = ayVar;
        C62942bv.registerDefaultInstance(C11694ay.class, ayVar);
    }

    private C11694ay() {
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
                return newMessageInfo(f37704c, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001,", new Object[]{"a", C11689at.m27358b()});
            case 3:
                return new C11694ay();
            case 4:
                return new C11693ax();
            case 5:
                return f37704c;
            case 6:
                C63010eb ebVar = f37705d;
                if (ebVar == null) {
                    synchronized (C11694ay.class) {
                        ebVar = f37705d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f37704c);
                            f37705d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
