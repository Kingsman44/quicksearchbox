package com.google.assistant.p3803ag.p3807b.p3808a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.b.a.q */
/* compiled from: PG */
public final class C48915q extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C48915q f126574c;

    /* renamed from: d */
    private static volatile C63010eb f126575d;

    /* renamed from: a */
    public int f126576a;

    /* renamed from: b */
    public C48919u f126577b;

    static {
        C48915q qVar = new C48915q();
        f126574c = qVar;
        C62942bv.registerDefaultInstance(C48915q.class, qVar);
    }

    private C48915q() {
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
                return newMessageInfo(f126574c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C48915q();
            case 4:
                return new C48914p();
            case 5:
                return f126574c;
            case 6:
                C63010eb ebVar = f126575d;
                if (ebVar == null) {
                    synchronized (C48915q.class) {
                        ebVar = f126575d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126574c);
                            f126575d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
