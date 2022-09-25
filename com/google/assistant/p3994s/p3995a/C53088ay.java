package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.ay */
/* compiled from: PG */
public final class C53088ay extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53088ay f139116a;

    /* renamed from: c */
    private static volatile C63010eb f139117c;

    /* renamed from: b */
    private byte f139118b = 2;

    static {
        C53088ay ayVar = new C53088ay();
        f139116a = ayVar;
        C62942bv.registerDefaultInstance(C53088ay.class, ayVar);
    }

    private C53088ay() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f139118b);
            case 1:
                this.f139118b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f139116a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C53088ay();
            case 4:
                return new C53087ax();
            case 5:
                return f139116a;
            case 6:
                C63010eb ebVar = f139117c;
                if (ebVar == null) {
                    synchronized (C53088ay.class) {
                        ebVar = f139117c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139116a);
                            f139117c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
