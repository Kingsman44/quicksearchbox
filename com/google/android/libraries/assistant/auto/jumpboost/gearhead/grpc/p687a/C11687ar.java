package com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.a.ar */
/* compiled from: PG */
public final class C11687ar extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C11687ar f37682e;

    /* renamed from: f */
    private static volatile C63010eb f37683f;

    /* renamed from: a */
    public int f37684a;

    /* renamed from: b */
    public int f37685b = 0;

    /* renamed from: c */
    public Object f37686c;

    /* renamed from: d */
    public int f37687d;

    static {
        C11687ar arVar = new C11687ar();
        f37682e = arVar;
        C62942bv.registerDefaultInstance(C11687ar.class, arVar);
    }

    private C11687ar() {
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
                return newMessageInfo(f37682e, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002်\u0000\u0003့\u0000\u0004ျ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C11689at.m27358b()});
            case 3:
                return new C11687ar();
            case 4:
                return new C11686aq();
            case 5:
                return f37682e;
            case 6:
                C63010eb ebVar = f37683f;
                if (ebVar == null) {
                    synchronized (C11687ar.class) {
                        ebVar = f37683f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f37682e);
                            f37683f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
