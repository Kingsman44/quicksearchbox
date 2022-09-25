package com.google.protos.p4985f.p5030q;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.ie */
/* compiled from: PG */
public final class C65279ie extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65279ie f176589a;

    /* renamed from: b */
    private static volatile C63010eb f176590b;

    static {
        C65279ie ieVar = new C65279ie();
        f176589a = ieVar;
        C62942bv.registerDefaultInstance(C65279ie.class, ieVar);
    }

    private C65279ie() {
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f176589a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C65279ie();
            case 4:
                return new C65278id();
            case 5:
                return f176589a;
            case 6:
                C63010eb ebVar = f176590b;
                if (ebVar == null) {
                    synchronized (C65279ie.class) {
                        ebVar = f176590b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176589a);
                            f176590b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
