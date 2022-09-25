package com.google.android.apps.search.assistant.surfaces.common.p9419a.p9421b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.common.a.b.d */
/* compiled from: PG */
public final class C125015d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C125015d f344927a;

    /* renamed from: b */
    private static volatile C63010eb f344928b;

    static {
        C125015d dVar = new C125015d();
        f344927a = dVar;
        C62942bv.registerDefaultInstance(C125015d.class, dVar);
    }

    private C125015d() {
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
                return newMessageInfo(f344927a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C125015d();
            case 4:
                return new C125014c();
            case 5:
                return f344927a;
            case 6:
                C63010eb ebVar = f344928b;
                if (ebVar == null) {
                    synchronized (C125015d.class) {
                        ebVar = f344928b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f344927a);
                            f344928b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
