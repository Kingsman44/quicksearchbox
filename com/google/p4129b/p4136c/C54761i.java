package com.google.p4129b.p4136c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.b.c.i */
/* compiled from: PG */
public final class C54761i extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54761i f143683c;

    /* renamed from: d */
    private static volatile C63010eb f143684d;

    /* renamed from: a */
    public C62971cq f143685a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f143686b = emptyProtobufList();

    static {
        C54761i iVar = new C54761i();
        f143683c = iVar;
        C62942bv.registerDefaultInstance(C54761i.class, iVar);
    }

    private C54761i() {
        emptyProtobufList();
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
                return newMessageInfo(f143683c, "\u0000\u0002\u0000\u0000\u0002\u0006\u0002\u0000\u0002\u0000\u0002\u001b\u0006\u001b", new Object[]{"a", C54759g.class, "b", C54765m.class});
            case 3:
                return new C54761i();
            case 4:
                return new C54760h();
            case 5:
                return f143683c;
            case 6:
                C63010eb ebVar = f143684d;
                if (ebVar == null) {
                    synchronized (C54761i.class) {
                        ebVar = f143684d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143683c);
                            f143684d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
