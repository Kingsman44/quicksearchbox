package com.google.android.apps.search.assistant.surfaces.dictation.p9427a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.a.ca */
/* compiled from: PG */
public final class C125100ca extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C125100ca f345099b;

    /* renamed from: c */
    private static volatile C63010eb f345100c;

    /* renamed from: a */
    public boolean f345101a;

    static {
        C125100ca caVar = new C125100ca();
        f345099b = caVar;
        C62942bv.registerDefaultInstance(C125100ca.class, caVar);
    }

    private C125100ca() {
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
                return newMessageInfo(f345099b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"a"});
            case 3:
                return new C125100ca();
            case 4:
                return new C125098bz();
            case 5:
                return f345099b;
            case 6:
                C63010eb ebVar = f345100c;
                if (ebVar == null) {
                    synchronized (C125100ca.class) {
                        ebVar = f345100c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f345099b);
                            f345100c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
