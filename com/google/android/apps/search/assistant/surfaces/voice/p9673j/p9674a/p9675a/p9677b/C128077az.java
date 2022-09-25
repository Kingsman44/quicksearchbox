package com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.az */
/* compiled from: PG */
public final class C128077az extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C128077az f352403a;

    /* renamed from: b */
    private static volatile C63010eb f352404b;

    static {
        C128077az azVar = new C128077az();
        f352403a = azVar;
        C62942bv.registerDefaultInstance(C128077az.class, azVar);
    }

    private C128077az() {
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
                return newMessageInfo(f352403a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C128077az();
            case 4:
                return new C128076ay();
            case 5:
                return f352403a;
            case 6:
                C63010eb ebVar = f352404b;
                if (ebVar == null) {
                    synchronized (C128077az.class) {
                        ebVar = f352404b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f352403a);
                            f352404b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
