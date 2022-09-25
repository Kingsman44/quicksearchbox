package com.google.p4017at.p4078i.p4079a;

import com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a.C45632al;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.i.a.f */
/* compiled from: PG */
public final class C54292f extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C54292f f142642b;

    /* renamed from: d */
    private static volatile C63010eb f142643d;

    /* renamed from: a */
    public C45632al f142644a;

    /* renamed from: c */
    private byte f142645c = 2;

    static {
        C54292f fVar = new C54292f();
        f142642b = fVar;
        C62942bv.registerDefaultInstance(C54292f.class, fVar);
    }

    private C54292f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 0;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f142645c);
            case 1:
                if (obj != null) {
                    b = 1;
                }
                this.f142645c = b;
                return null;
            case 2:
                return newMessageInfo(f142642b, "\u0000\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0000\u0001\u0003Љ", new Object[]{"a"});
            case 3:
                return new C54292f();
            case 4:
                return new C54291e();
            case 5:
                return f142642b;
            case 6:
                C63010eb ebVar = f142643d;
                if (ebVar == null) {
                    synchronized (C54292f.class) {
                        ebVar = f142643d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142642b);
                            f142643d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
