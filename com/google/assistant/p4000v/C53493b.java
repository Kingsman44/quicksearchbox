package com.google.assistant.p4000v;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.v.b */
/* compiled from: PG */
public final class C53493b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C53493b f140383b;

    /* renamed from: c */
    private static volatile C63010eb f140384c;

    /* renamed from: a */
    public C62971cq f140385a = C62942bv.emptyProtobufList();

    static {
        C53493b bVar = new C53493b();
        f140383b = bVar;
        C62942bv.registerDefaultInstance(C53493b.class, bVar);
    }

    private C53493b() {
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
                return newMessageInfo(f140383b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
            case 3:
                return new C53493b();
            case 4:
                return new C53492a();
            case 5:
                return f140383b;
            case 6:
                C63010eb ebVar = f140384c;
                if (ebVar == null) {
                    synchronized (C53493b.class) {
                        ebVar = f140384c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140383b);
                            f140384c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
