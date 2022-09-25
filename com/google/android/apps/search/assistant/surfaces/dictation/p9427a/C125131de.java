package com.google.android.apps.search.assistant.surfaces.dictation.p9427a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.a.de */
/* compiled from: PG */
public final class C125131de extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C125131de f345199c;

    /* renamed from: d */
    private static volatile C63010eb f345200d;

    /* renamed from: a */
    public int f345201a = 0;

    /* renamed from: b */
    public Object f345202b;

    static {
        C125131de deVar = new C125131de();
        f345199c = deVar;
        C62942bv.registerDefaultInstance(C125131de.class, deVar);
    }

    private C125131de() {
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
                return newMessageInfo(f345199c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u00015\u0000\u00025\u0000", new Object[]{"b", "a"});
            case 3:
                return new C125131de();
            case 4:
                return new C125130dd();
            case 5:
                return f345199c;
            case 6:
                C63010eb ebVar = f345200d;
                if (ebVar == null) {
                    synchronized (C125131de.class) {
                        ebVar = f345200d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f345199c);
                            f345200d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
