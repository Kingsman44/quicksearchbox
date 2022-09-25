package com.google.frameworks.client.p4624a.p4629b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.frameworks.client.a.b.d */
/* compiled from: PG */
public final class C61307d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C61307d f165806b;

    /* renamed from: c */
    private static volatile C63010eb f165807c;

    /* renamed from: a */
    public C62971cq f165808a = C62942bv.emptyProtobufList();

    static {
        C61307d dVar = new C61307d();
        f165806b = dVar;
        C62942bv.registerDefaultInstance(C61307d.class, dVar);
    }

    private C61307d() {
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
                return newMessageInfo(f165806b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
            case 3:
                return new C61307d();
            case 4:
                return new C61306c();
            case 5:
                return f165806b;
            case 6:
                C63010eb ebVar = f165807c;
                if (ebVar == null) {
                    synchronized (C61307d.class) {
                        ebVar = f165807c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f165806b);
                            f165807c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
