package com.google.p4242bp.p4257f.p4260b.p4261a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.f.b.a.bk */
/* compiled from: PG */
public final class C56257bk extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C56257bk f149944a;

    /* renamed from: b */
    private static volatile C63010eb f149945b;

    static {
        C56257bk bkVar = new C56257bk();
        f149944a = bkVar;
        C62942bv.registerDefaultInstance(C56257bk.class, bkVar);
    }

    private C56257bk() {
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
                return newMessageInfo(f149944a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C56257bk();
            case 4:
                return new C56256bj();
            case 5:
                return f149944a;
            case 6:
                C63010eb ebVar = f149945b;
                if (ebVar == null) {
                    synchronized (C56257bk.class) {
                        ebVar = f149945b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149944a);
                            f149945b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
