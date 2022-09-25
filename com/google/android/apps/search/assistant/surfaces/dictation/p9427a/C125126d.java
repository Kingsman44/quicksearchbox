package com.google.android.apps.search.assistant.surfaces.dictation.p9427a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.a.d */
/* compiled from: PG */
public final class C125126d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C125126d f345189b;

    /* renamed from: c */
    private static volatile C63010eb f345190c;

    /* renamed from: a */
    public boolean f345191a;

    static {
        C125126d dVar = new C125126d();
        f345189b = dVar;
        C62942bv.registerDefaultInstance(C125126d.class, dVar);
    }

    private C125126d() {
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
                return newMessageInfo(f345189b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"a"});
            case 3:
                return new C125126d();
            case 4:
                return new C125099c();
            case 5:
                return f345189b;
            case 6:
                C63010eb ebVar = f345190c;
                if (ebVar == null) {
                    synchronized (C125126d.class) {
                        ebVar = f345190c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f345189b);
                            f345190c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
