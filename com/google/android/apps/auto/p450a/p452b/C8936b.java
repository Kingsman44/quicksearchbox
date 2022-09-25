package com.google.android.apps.auto.p450a.p452b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.auto.a.b.b */
/* compiled from: PG */
public final class C8936b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C8936b f30979c;

    /* renamed from: d */
    private static volatile C63010eb f30980d;

    /* renamed from: a */
    public C62971cq f30981a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f30982b = emptyProtobufList();

    static {
        C8936b bVar = new C8936b();
        f30979c = bVar;
        C62942bv.registerDefaultInstance(C8936b.class, bVar);
    }

    private C8936b() {
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
                return newMessageInfo(f30979c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"a", C8938d.class, "b", C8950p.class});
            case 3:
                return new C8936b();
            case 4:
                return new C8935a();
            case 5:
                return f30979c;
            case 6:
                C63010eb ebVar = f30980d;
                if (ebVar == null) {
                    synchronized (C8936b.class) {
                        ebVar = f30980d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30979c);
                            f30980d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
