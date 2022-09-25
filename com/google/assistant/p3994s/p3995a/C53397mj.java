package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.mj */
/* compiled from: PG */
public final class C53397mj extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53397mj f140117c;

    /* renamed from: e */
    private static volatile C63010eb f140118e;

    /* renamed from: a */
    public C62971cq f140119a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f140120b = emptyProtobufList();

    /* renamed from: d */
    private byte f140121d = 2;

    static {
        C53397mj mjVar = new C53397mj();
        f140117c = mjVar;
        C62942bv.registerDefaultInstance(C53397mj.class, mjVar);
    }

    private C53397mj() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f140121d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f140121d = b;
                return null;
            case 2:
                return newMessageInfo(f140117c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0002\u0001Л\u0002Л", new Object[]{"a", C53396mi.class, "b", C53396mi.class});
            case 3:
                return new C53397mj();
            case 4:
                return new C53394mg();
            case 5:
                return f140117c;
            case 6:
                C63010eb ebVar = f140118e;
                if (ebVar == null) {
                    synchronized (C53397mj.class) {
                        ebVar = f140118e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140117c);
                            f140118e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
