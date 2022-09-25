package com.google.android.apps.search.assistant.surfaces.dictation.service.p9434e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.e.am */
/* compiled from: PG */
public final class C125385am extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C125385am f345820c;

    /* renamed from: d */
    private static volatile C63010eb f345821d;

    /* renamed from: a */
    public long f345822a;

    /* renamed from: b */
    public long f345823b;

    static {
        C125385am amVar = new C125385am();
        f345820c = amVar;
        C62942bv.registerDefaultInstance(C125385am.class, amVar);
    }

    private C125385am() {
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
                return newMessageInfo(f345820c, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u0002\u0003\u0002", new Object[]{"a", "b"});
            case 3:
                return new C125385am();
            case 4:
                return new C125384al();
            case 5:
                return f345820c;
            case 6:
                C63010eb ebVar = f345821d;
                if (ebVar == null) {
                    synchronized (C125385am.class) {
                        ebVar = f345821d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f345820c);
                            f345821d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
