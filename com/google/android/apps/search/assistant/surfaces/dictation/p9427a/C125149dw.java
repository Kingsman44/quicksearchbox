package com.google.android.apps.search.assistant.surfaces.dictation.p9427a;

import com.google.android.apps.gsa.nga.api.a.af;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.a.dw */
/* compiled from: PG */
public final class C125149dw extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C125149dw f345231c;

    /* renamed from: d */
    private static volatile C63010eb f345232d;

    /* renamed from: a */
    public af f345233a;

    /* renamed from: b */
    public C125094bv f345234b;

    static {
        C125149dw dwVar = new C125149dw();
        f345231c = dwVar;
        C62942bv.registerDefaultInstance(C125149dw.class, dwVar);
    }

    private C125149dw() {
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
                return newMessageInfo(f345231c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new C125149dw();
            case 4:
                return new C125148dv();
            case 5:
                return f345231c;
            case 6:
                C63010eb ebVar = f345232d;
                if (ebVar == null) {
                    synchronized (C125149dw.class) {
                        ebVar = f345232d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f345231c);
                            f345232d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
