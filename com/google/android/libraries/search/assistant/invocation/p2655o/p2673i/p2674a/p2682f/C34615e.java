package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2682f;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.f.e */
/* compiled from: PG */
public final class C34615e extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C34615e f91933a;

    /* renamed from: b */
    private static volatile C63010eb f91934b;

    static {
        C34615e eVar = new C34615e();
        f91933a = eVar;
        C62942bv.registerDefaultInstance(C34615e.class, eVar);
    }

    private C34615e() {
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
                return newMessageInfo(f91933a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C34615e();
            case 4:
                return new C34614d();
            case 5:
                return f91933a;
            case 6:
                C63010eb ebVar = f91934b;
                if (ebVar == null) {
                    synchronized (C34615e.class) {
                        ebVar = f91934b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f91933a);
                            f91934b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
