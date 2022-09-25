package com.google.p4283bv.p4287b.p4288a.p4289a.p4316u;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.u.b */
/* compiled from: PG */
public final class C56823b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C56823b f151614b;

    /* renamed from: c */
    private static volatile C63010eb f151615c;

    /* renamed from: a */
    public C62971cq f151616a = C62942bv.emptyProtobufList();

    static {
        C56823b bVar = new C56823b();
        f151614b = bVar;
        C62942bv.registerDefaultInstance(C56823b.class, bVar);
    }

    private C56823b() {
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
                return newMessageInfo(f151614b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
            case 3:
                return new C56823b();
            case 4:
                return new C56822a();
            case 5:
                return f151614b;
            case 6:
                C63010eb ebVar = f151615c;
                if (ebVar == null) {
                    synchronized (C56823b.class) {
                        ebVar = f151615c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151614b);
                            f151615c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
