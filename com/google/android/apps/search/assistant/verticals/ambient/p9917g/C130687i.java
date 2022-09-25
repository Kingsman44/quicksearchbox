package com.google.android.apps.search.assistant.verticals.ambient.p9917g;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.g.i */
/* compiled from: PG */
public final class C130687i extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C130687i f357852a;

    /* renamed from: b */
    private static volatile C63010eb f357853b;

    static {
        C130687i iVar = new C130687i();
        f357852a = iVar;
        C62942bv.registerDefaultInstance(C130687i.class, iVar);
    }

    private C130687i() {
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
                return newMessageInfo(f357852a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C130687i();
            case 4:
                return new C130686h();
            case 5:
                return f357852a;
            case 6:
                C63010eb ebVar = f357853b;
                if (ebVar == null) {
                    synchronized (C130687i.class) {
                        ebVar = f357853b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f357852a);
                            f357853b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
