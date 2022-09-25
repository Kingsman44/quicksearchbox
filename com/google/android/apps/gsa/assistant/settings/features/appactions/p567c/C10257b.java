package com.google.android.apps.gsa.assistant.settings.features.appactions.p567c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.c.b */
/* compiled from: PG */
public final class C10257b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C10257b f34776c;

    /* renamed from: d */
    private static volatile C63010eb f34777d;

    /* renamed from: a */
    public int f34778a = 0;

    /* renamed from: b */
    public Object f34779b;

    static {
        C10257b bVar = new C10257b();
        f34776c = bVar;
        C62942bv.registerDefaultInstance(C10257b.class, bVar);
    }

    private C10257b() {
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
                return newMessageInfo(f34776c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"b", "a", C10277v.class, C10267l.class});
            case 3:
                return new C10257b();
            case 4:
                return new C10252a();
            case 5:
                return f34776c;
            case 6:
                C63010eb ebVar = f34777d;
                if (ebVar == null) {
                    synchronized (C10257b.class) {
                        ebVar = f34777d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f34776c);
                            f34777d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
