package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9254c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.c.d */
/* compiled from: PG */
public final class C122021d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C122021d f338555a;

    /* renamed from: b */
    private static volatile C63010eb f338556b;

    static {
        C122021d dVar = new C122021d();
        f338555a = dVar;
        C62942bv.registerDefaultInstance(C122021d.class, dVar);
    }

    private C122021d() {
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
                return newMessageInfo(f338555a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C122021d();
            case 4:
                return new C122020c();
            case 5:
                return f338555a;
            case 6:
                C63010eb ebVar = f338556b;
                if (ebVar == null) {
                    synchronized (C122021d.class) {
                        ebVar = f338556b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f338555a);
                            f338556b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
