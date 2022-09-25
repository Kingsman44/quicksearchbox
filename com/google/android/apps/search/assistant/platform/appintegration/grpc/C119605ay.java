package com.google.android.apps.search.assistant.platform.appintegration.grpc;

import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.appintegration.grpc.ay */
/* compiled from: PG */
public final class C119605ay extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C119605ay f333343c;

    /* renamed from: d */
    private static volatile C63010eb f333344d;

    /* renamed from: a */
    public int f333345a;

    /* renamed from: b */
    public C51805du f333346b;

    static {
        C119605ay ayVar = new C119605ay();
        f333343c = ayVar;
        C62942bv.registerDefaultInstance(C119605ay.class, ayVar);
    }

    private C119605ay() {
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
                return newMessageInfo(f333343c, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဉ\u0002", new Object[]{"a", "b"});
            case 3:
                return new C119605ay();
            case 4:
                return new C119604ax();
            case 5:
                return f333343c;
            case 6:
                C63010eb ebVar = f333344d;
                if (ebVar == null) {
                    synchronized (C119605ay.class) {
                        ebVar = f333344d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f333343c);
                            f333344d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
