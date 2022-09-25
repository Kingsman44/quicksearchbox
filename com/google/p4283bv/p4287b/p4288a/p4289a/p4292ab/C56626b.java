package com.google.p4283bv.p4287b.p4288a.p4289a.p4292ab;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.ab.b */
/* compiled from: PG */
public final class C56626b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56626b f151187c;

    /* renamed from: d */
    private static volatile C63010eb f151188d;

    /* renamed from: a */
    public C62971cq f151189a = C62942bv.emptyProtobufList();

    /* renamed from: b */
    public C62971cq f151190b = C62942bv.emptyProtobufList();

    static {
        C56626b bVar = new C56626b();
        f151187c = bVar;
        C62942bv.registerDefaultInstance(C56626b.class, bVar);
    }

    private C56626b() {
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
                return newMessageInfo(f151187c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001a\u0002\u001a", new Object[]{"a", "b"});
            case 3:
                return new C56626b();
            case 4:
                return new C56625a();
            case 5:
                return f151187c;
            case 6:
                C63010eb ebVar = f151188d;
                if (ebVar == null) {
                    synchronized (C56626b.class) {
                        ebVar = f151188d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151187c);
                            f151188d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
