package com.google.protos.p4874ap.p4875a.p4876a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ap.a.a.j */
/* compiled from: PG */
public final class C63671j extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63671j f172165a;

    /* renamed from: b */
    private static volatile C63010eb f172166b;

    static {
        C63671j jVar = new C63671j();
        f172165a = jVar;
        C62942bv.registerDefaultInstance(C63671j.class, jVar);
    }

    private C63671j() {
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
                return newMessageInfo(f172165a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C63671j();
            case 4:
                return new C63670i();
            case 5:
                return f172165a;
            case 6:
                C63010eb ebVar = f172166b;
                if (ebVar == null) {
                    synchronized (C63671j.class) {
                        ebVar = f172166b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172165a);
                            f172166b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
