package com.google.p5277z.p5282c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.z.c.as */
/* compiled from: PG */
public final class C68009as extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C68009as f184267b;

    /* renamed from: d */
    private static volatile C63010eb f184268d;

    /* renamed from: a */
    public C62971cq f184269a = emptyProtobufList();

    /* renamed from: c */
    private byte f184270c = 2;

    static {
        C68009as asVar = new C68009as();
        f184267b = asVar;
        C62942bv.registerDefaultInstance(C68009as.class, asVar);
    }

    private C68009as() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f184270c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f184270c = b;
                return null;
            case 2:
                return newMessageInfo(f184267b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C68007aq.class});
            case 3:
                return new C68009as();
            case 4:
                return new C68008ar();
            case 5:
                return f184267b;
            case 6:
                C63010eb ebVar = f184268d;
                if (ebVar == null) {
                    synchronized (C68009as.class) {
                        ebVar = f184268d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184267b);
                            f184268d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
