package com.google.p4140ba.p4147b.p4148a.p4149a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ba.b.a.a.b */
/* compiled from: PG */
public final class C54937b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C54937b f144428b;

    /* renamed from: d */
    private static volatile C63010eb f144429d;

    /* renamed from: a */
    public C62971cq f144430a = emptyProtobufList();

    /* renamed from: c */
    private byte f144431c = 2;

    static {
        C54937b bVar = new C54937b();
        f144428b = bVar;
        C62942bv.registerDefaultInstance(C54937b.class, bVar);
    }

    private C54937b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f144431c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f144431c = b;
                return null;
            case 2:
                return newMessageInfo(f144428b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C54940e.class});
            case 3:
                return new C54937b();
            case 4:
                return new C54936a();
            case 5:
                return f144428b;
            case 6:
                C63010eb ebVar = f144429d;
                if (ebVar == null) {
                    synchronized (C54937b.class) {
                        ebVar = f144429d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144428b);
                            f144429d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
