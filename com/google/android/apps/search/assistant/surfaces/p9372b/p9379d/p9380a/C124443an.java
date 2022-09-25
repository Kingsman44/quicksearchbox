package com.google.android.apps.search.assistant.surfaces.p9372b.p9379d.p9380a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.b.d.a.an */
/* compiled from: PG */
public final class C124443an extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C124443an f343443a;

    /* renamed from: b */
    private static volatile C63010eb f343444b;

    static {
        C124443an anVar = new C124443an();
        f343443a = anVar;
        C62942bv.registerDefaultInstance(C124443an.class, anVar);
    }

    private C124443an() {
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
                return newMessageInfo(f343443a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C124443an();
            case 4:
                return new C124442am();
            case 5:
                return f343443a;
            case 6:
                C63010eb ebVar = f343444b;
                if (ebVar == null) {
                    synchronized (C124443an.class) {
                        ebVar = f343444b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f343443a);
                            f343444b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
