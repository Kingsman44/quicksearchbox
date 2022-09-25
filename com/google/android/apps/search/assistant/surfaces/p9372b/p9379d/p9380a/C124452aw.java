package com.google.android.apps.search.assistant.surfaces.p9372b.p9379d.p9380a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.b.d.a.aw */
/* compiled from: PG */
public final class C124452aw extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C124452aw f343458a;

    /* renamed from: b */
    private static volatile C63010eb f343459b;

    static {
        C124452aw awVar = new C124452aw();
        f343458a = awVar;
        C62942bv.registerDefaultInstance(C124452aw.class, awVar);
    }

    private C124452aw() {
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
                return newMessageInfo(f343458a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C124452aw();
            case 4:
                return new C124451av();
            case 5:
                return f343458a;
            case 6:
                C63010eb ebVar = f343459b;
                if (ebVar == null) {
                    synchronized (C124452aw.class) {
                        ebVar = f343459b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f343458a);
                            f343459b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
