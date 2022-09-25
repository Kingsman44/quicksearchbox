package com.google.common.p4552o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.ame */
/* compiled from: PG */
public final class ame extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final ame f159134c;

    /* renamed from: f */
    private static volatile C63010eb f159135f;

    /* renamed from: a */
    public C62961ch f159136a;

    /* renamed from: b */
    public int f159137b;

    /* renamed from: d */
    private int f159138d;

    /* renamed from: e */
    private byte f159139e = 2;

    static {
        ame ame = new ame();
        f159134c = ame;
        C62942bv.registerDefaultInstance(ame.class, ame);
    }

    private ame() {
        emptyIntList();
        this.f159136a = emptyIntList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f159139e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f159139e = b;
                return null;
            case 2:
                return newMessageInfo(f159134c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0016\u0002င\u0000", new Object[]{"d", "a", "b"});
            case 3:
                return new ame();
            case 4:
                return new amd();
            case 5:
                return f159134c;
            case 6:
                C63010eb ebVar = f159135f;
                if (ebVar == null) {
                    synchronized (ame.class) {
                        ebVar = f159135f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159134c);
                            f159135f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
