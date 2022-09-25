package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.e.ao */
/* compiled from: PG */
public final class C129906ao extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C129906ao f356351b;

    /* renamed from: c */
    private static volatile C63010eb f356352c;

    /* renamed from: a */
    public boolean f356353a;

    static {
        C129906ao aoVar = new C129906ao();
        f356351b = aoVar;
        C62942bv.registerDefaultInstance(C129906ao.class, aoVar);
    }

    private C129906ao() {
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
                return newMessageInfo(f356351b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"a"});
            case 3:
                return new C129906ao();
            case 4:
                return new C129905an();
            case 5:
                return f356351b;
            case 6:
                C63010eb ebVar = f356352c;
                if (ebVar == null) {
                    synchronized (C129906ao.class) {
                        ebVar = f356352c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f356351b);
                            f356352c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
