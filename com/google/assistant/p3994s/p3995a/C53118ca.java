package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.ca */
/* compiled from: PG */
public final class C53118ca extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C53118ca f139194b;

    /* renamed from: d */
    private static volatile C63010eb f139195d;

    /* renamed from: a */
    public C62971cq f139196a = emptyProtobufList();

    /* renamed from: c */
    private byte f139197c = 2;

    static {
        C53118ca caVar = new C53118ca();
        f139194b = caVar;
        C62942bv.registerDefaultInstance(C53118ca.class, caVar);
    }

    private C53118ca() {
        emptyProtobufList();
    }

    /* renamed from: a */
    public final void mo53960a() {
        C62971cq cqVar = this.f139196a;
        if (!cqVar.mo58948c()) {
            this.f139196a = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f139197c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f139197c = b;
                return null;
            case 2:
                return newMessageInfo(f139194b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C53115by.class});
            case 3:
                return new C53118ca();
            case 4:
                return new C53116bz();
            case 5:
                return f139194b;
            case 6:
                C63010eb ebVar = f139195d;
                if (ebVar == null) {
                    synchronized (C53118ca.class) {
                        ebVar = f139195d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139194b);
                            f139195d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
