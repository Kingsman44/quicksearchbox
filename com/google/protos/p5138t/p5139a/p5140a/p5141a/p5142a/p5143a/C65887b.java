package com.google.protos.p5138t.p5139a.p5140a.p5141a.p5142a.p5143a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.t.a.a.a.a.a.b */
/* compiled from: PG */
public final class C65887b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65887b f179202a;

    /* renamed from: b */
    private static volatile C63010eb f179203b;

    static {
        C65887b bVar = new C65887b();
        f179202a = bVar;
        C62942bv.registerDefaultInstance(C65887b.class, bVar);
    }

    private C65887b() {
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
                return newMessageInfo(f179202a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C65887b();
            case 4:
                return new C65886a();
            case 5:
                return f179202a;
            case 6:
                C63010eb ebVar = f179203b;
                if (ebVar == null) {
                    synchronized (C65887b.class) {
                        ebVar = f179203b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179202a);
                            f179203b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
