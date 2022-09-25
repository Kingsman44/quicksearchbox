package com.google.protos.p4985f.p5045w;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.w.b */
/* compiled from: PG */
public final class C65366b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65366b f177760a;

    /* renamed from: b */
    private static volatile C63010eb f177761b;

    static {
        C65366b bVar = new C65366b();
        f177760a = bVar;
        C62942bv.registerDefaultInstance(C65366b.class, bVar);
    }

    private C65366b() {
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
                return newMessageInfo(f177760a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C65366b();
            case 4:
                return new C65365a();
            case 5:
                return f177760a;
            case 6:
                C63010eb ebVar = f177761b;
                if (ebVar == null) {
                    synchronized (C65366b.class) {
                        ebVar = f177761b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f177760a);
                            f177761b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
