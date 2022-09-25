package com.google.protos.p4985f.p5038s.p5039a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.s.a.b */
/* compiled from: PG */
public final class C65333b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65333b f176683a;

    /* renamed from: b */
    private static volatile C63010eb f176684b;

    static {
        C65333b bVar = new C65333b();
        f176683a = bVar;
        C62942bv.registerDefaultInstance(C65333b.class, bVar);
    }

    private C65333b() {
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(f176683a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C65333b();
            case 4:
                return new C65332a();
            case 5:
                return f176683a;
            case 6:
                C63010eb ebVar = f176684b;
                if (ebVar == null) {
                    synchronized (C65333b.class) {
                        ebVar = f176684b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176683a);
                            f176684b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
