package com.google.android.libraries.search.assistant.p2786t.p2798c.p2799a.p2800a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.t.c.a.a.z */
/* compiled from: PG */
public final class C36554z extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C36554z f95343a;

    /* renamed from: b */
    private static volatile C63010eb f95344b;

    static {
        C36554z zVar = new C36554z();
        f95343a = zVar;
        C62942bv.registerDefaultInstance(C36554z.class, zVar);
    }

    private C36554z() {
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
                return newMessageInfo(f95343a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C36554z();
            case 4:
                return new C36553y();
            case 5:
                return f95343a;
            case 6:
                C63010eb ebVar = f95344b;
                if (ebVar == null) {
                    synchronized (C36554z.class) {
                        ebVar = f95344b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f95343a);
                            f95344b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
