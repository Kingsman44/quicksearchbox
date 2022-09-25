package com.google.p4152bb.p4153a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.b */
/* compiled from: PG */
public final class C54969b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C54969b f144589b;

    /* renamed from: d */
    private static volatile C63010eb f144590d;

    /* renamed from: a */
    public C62971cq f144591a = emptyProtobufList();

    /* renamed from: c */
    private byte f144592c = 2;

    static {
        C54969b bVar = new C54969b();
        f144589b = bVar;
        C62942bv.registerDefaultInstance(C54969b.class, bVar);
    }

    private C54969b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f144592c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f144592c = b;
                return null;
            case 2:
                return newMessageInfo(f144589b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C55077f.class});
            case 3:
                return new C54969b();
            case 4:
                return new C54942a();
            case 5:
                return f144589b;
            case 6:
                C63010eb ebVar = f144590d;
                if (ebVar == null) {
                    synchronized (C54969b.class) {
                        ebVar = f144590d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144589b);
                            f144590d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
