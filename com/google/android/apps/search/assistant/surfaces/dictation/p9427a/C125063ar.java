package com.google.android.apps.search.assistant.surfaces.dictation.p9427a;

import com.google.android.apps.gsa.nga.api.a.at;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.a.ar */
/* compiled from: PG */
public final class C125063ar extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C125063ar f345037b;

    /* renamed from: c */
    private static volatile C63010eb f345038c;

    /* renamed from: a */
    public at f345039a;

    static {
        C125063ar arVar = new C125063ar();
        f345037b = arVar;
        C62942bv.registerDefaultInstance(C125063ar.class, arVar);
    }

    private C125063ar() {
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
                return newMessageInfo(f345037b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C125063ar();
            case 4:
                return new C125062aq();
            case 5:
                return f345037b;
            case 6:
                C63010eb ebVar = f345038c;
                if (ebVar == null) {
                    synchronized (C125063ar.class) {
                        ebVar = f345038c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f345037b);
                            f345038c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
