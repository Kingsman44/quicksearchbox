package com.google.assistant.p3897e.p3921j.p3926e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.e.ay */
/* compiled from: PG */
public final class C51837ay extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C51837ay f135986b;

    /* renamed from: d */
    private static volatile C63010eb f135987d;

    /* renamed from: a */
    public C62971cq f135988a = emptyProtobufList();

    /* renamed from: c */
    private byte f135989c = 2;

    static {
        C51837ay ayVar = new C51837ay();
        f135986b = ayVar;
        C62942bv.registerDefaultInstance(C51837ay.class, ayVar);
    }

    private C51837ay() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f135989c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f135989c = b;
                return null;
            case 2:
                return newMessageInfo(f135986b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0001\u0002Л", new Object[]{"a", C51831as.class});
            case 3:
                return new C51837ay();
            case 4:
                return new C51836ax();
            case 5:
                return f135986b;
            case 6:
                C63010eb ebVar = f135987d;
                if (ebVar == null) {
                    synchronized (C51837ay.class) {
                        ebVar = f135987d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135986b);
                            f135987d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
