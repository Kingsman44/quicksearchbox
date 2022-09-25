package com.google.assistant.p3897e.p3899b.p3901b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.b.b.j */
/* compiled from: PG */
public final class C50883j extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C50883j f132484b;

    /* renamed from: c */
    private static volatile C63010eb f132485c;

    /* renamed from: a */
    public C62971cq f132486a = C62942bv.emptyProtobufList();

    static {
        C50883j jVar = new C50883j();
        f132484b = jVar;
        C62942bv.registerDefaultInstance(C50883j.class, jVar);
    }

    private C50883j() {
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
                return newMessageInfo(f132484b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001a", new Object[]{"a"});
            case 3:
                return new C50883j();
            case 4:
                return new C50882i();
            case 5:
                return f132484b;
            case 6:
                C63010eb ebVar = f132485c;
                if (ebVar == null) {
                    synchronized (C50883j.class) {
                        ebVar = f132485c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132484b);
                            f132485c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
