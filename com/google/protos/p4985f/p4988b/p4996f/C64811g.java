package com.google.protos.p4985f.p4988b.p4996f;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.b.f.g */
/* compiled from: PG */
public final class C64811g extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64811g f175626a;

    /* renamed from: b */
    private static volatile C63010eb f175627b;

    static {
        C64811g gVar = new C64811g();
        f175626a = gVar;
        C62942bv.registerDefaultInstance(C64811g.class, gVar);
    }

    private C64811g() {
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
                return newMessageInfo(f175626a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C64811g();
            case 4:
                return new C64810f();
            case 5:
                return f175626a;
            case 6:
                C63010eb ebVar = f175627b;
                if (ebVar == null) {
                    synchronized (C64811g.class) {
                        ebVar = f175627b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175626a);
                            f175627b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
