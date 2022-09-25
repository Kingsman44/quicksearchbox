package com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.ac */
/* compiled from: PG */
public final class C128054ac extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C128054ac f352359a;

    /* renamed from: b */
    private static volatile C63010eb f352360b;

    static {
        C128054ac acVar = new C128054ac();
        f352359a = acVar;
        C62942bv.registerDefaultInstance(C128054ac.class, acVar);
    }

    private C128054ac() {
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
                return newMessageInfo(f352359a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C128054ac();
            case 4:
                return new C128053ab();
            case 5:
                return f352359a;
            case 6:
                C63010eb ebVar = f352360b;
                if (ebVar == null) {
                    synchronized (C128054ac.class) {
                        ebVar = f352360b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f352359a);
                            f352360b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
