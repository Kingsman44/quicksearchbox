package com.google.android.apps.search.assistant.surfaces.dictation.p9427a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63070h;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.a.by */
/* compiled from: PG */
public final class C125097by extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C125097by f345096b;

    /* renamed from: c */
    private static volatile C63010eb f345097c;

    /* renamed from: a */
    public C63070h f345098a;

    static {
        C125097by byVar = new C125097by();
        f345096b = byVar;
        C62942bv.registerDefaultInstance(C125097by.class, byVar);
    }

    private C125097by() {
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
                return newMessageInfo(f345096b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"a"});
            case 3:
                return new C125097by();
            case 4:
                return new C125096bx();
            case 5:
                return f345096b;
            case 6:
                C63010eb ebVar = f345097c;
                if (ebVar == null) {
                    synchronized (C125097by.class) {
                        ebVar = f345097c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f345096b);
                            f345097c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
